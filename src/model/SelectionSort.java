package model;

public class SelectionSort extends ModeloMetodo{

    private Integer[] numeros;
    
    public SelectionSort(Integer[] elementos) {
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
    
    @Override
    public Integer realizarOperacao(){
        return selectionSort(numeros, numeros.length);
    }
    
    private Integer selectionSort(Integer[] numeros, Integer quantidadeElementos) {
        int posicaoAtual;
        int trocas = 0;

        for (posicaoAtual = 0; posicaoAtual < quantidadeElementos - 1; posicaoAtual++) {
            Integer posicaoMenor = buscarMenorValor(numeros, posicaoAtual, quantidadeElementos);
            troca(numeros, posicaoAtual, posicaoMenor);
            trocas++;
        }
        
        return trocas;
    }

    private Integer buscarMenorValor(Integer[] numeros, Integer posicaoInicial, Integer posicaoTermino) {
        int posicaoMenorElemento = posicaoInicial;

        for (int posicaoAtual = posicaoInicial; posicaoAtual < posicaoTermino; posicaoAtual++){
            if (numeros[posicaoAtual] < numeros[posicaoMenorElemento]){
                posicaoMenorElemento = posicaoAtual;
            }    
        }
        
        return posicaoMenorElemento;
    }
    
    private void troca(Integer[] numeros, Integer de, Integer para) {
        
        Integer primeiroNumero = numeros[de];
        Integer segundoNumero =  numeros[para];
        numeros[para] = primeiroNumero;
        numeros[de] = segundoNumero;
    }
}
