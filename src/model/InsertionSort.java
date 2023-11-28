package model;

public class InsertionSort extends ModeloMetodo{
    
    private Integer[] numeros;
    
    public InsertionSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
    
    @Override
    public Integer realizarOperacao(){
        return insertionSort(numeros, numeros.length);
    }
    
    private Integer insertionSort(Integer[] numeros, int quantidadeElementos) {
        Integer trocas = 0;

        for (int posicaoAtual = 1; posicaoAtual < quantidadeElementos; posicaoAtual++) {
            Integer posicaoAnalise = posicaoAtual;

            while (posicaoAnalise > 0 && numeros[posicaoAnalise] < numeros[posicaoAnalise - 1]) {
                troca(numeros, posicaoAnalise, posicaoAnalise - 1);
                posicaoAnalise--;
                trocas++;
            }
        }
        
        return trocas;
    }
    
    private void troca(Integer[] numeros, Integer de, Integer para) {
        
        Integer primeiroNumero = numeros[de];
        Integer segundoNumero =  numeros[para];
        numeros[para] = primeiroNumero;
        numeros[de] = segundoNumero;
    }
}
