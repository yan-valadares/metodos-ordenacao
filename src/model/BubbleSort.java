package model;

public class BubbleSort extends ModeloMetodo{
	
    private Integer[] numeros;
    
    public BubbleSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
    
    @Override
    public Integer realizarOperacao(){
        return bubbleSort(numeros);
    }
    
    public Integer bubbleSort(Integer[] vetor) {
        Integer tamanhoVetor = vetor.length;
        boolean trocou;
        Integer trocas = 0;
        
        for (int i = 0; i < tamanhoVetor - 1; i++) {
            trocou = false;
            
            for (int j = 0; j < tamanhoVetor - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int auxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar;
                    trocou = true;
                    trocas++;
                }
            }
            
            if (!trocou) {
                break;
            }
        }
        
        return trocas;
    }

}
