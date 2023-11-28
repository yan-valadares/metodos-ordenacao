package model;


public class HeapSort extends ModeloMetodo{
    private int trocas;
    
    private Integer[] numeros;
    
    public HeapSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
    
    @Override
    public Integer realizarOperacao(){
        heapSort(numeros);
        return trocas;
    }
    
    public void heapSort(Integer vetor[]) {
    	
    	trocas = 0;
        int tamanhoDoVetor = vetor.length;
        
        for (int i = tamanhoDoVetor / 2 - 1; i >= 0; i--)
            heapify(vetor, tamanhoDoVetor, i);

        for (int i = tamanhoDoVetor - 1; i > 0; i--) {
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            trocas++;

            heapify(vetor, i, 0);
        }
        
    }
    private void heapify(Integer vetor[], int tamanhoDoHeap, int  índiceRaizSubArvore) {
        int maior = índiceRaizSubArvore;
        int filhoEsq = 2 * índiceRaizSubArvore + 1;
        int filhoDir = 2 * índiceRaizSubArvore + 2;

        if (filhoEsq < tamanhoDoHeap && vetor[filhoEsq] > vetor[maior])
        	maior = filhoEsq;

        if (filhoDir < tamanhoDoHeap && vetor[filhoDir] > vetor[maior])
        	maior = filhoDir;
        
        if (maior != índiceRaizSubArvore) {
            int swap = vetor[índiceRaizSubArvore];
            vetor[índiceRaizSubArvore] = vetor[maior];
            vetor[maior] = swap;

            trocas++;
            
            heapify(vetor, tamanhoDoHeap, maior);
        }
        
    }

}
