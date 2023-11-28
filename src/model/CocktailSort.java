package model;

public class CocktailSort extends ModeloMetodo{
	
    private Integer[] numeros;
    
    public CocktailSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
    
    @Override
    public Integer realizarOperacao(){
        return cocktailSort(numeros);
    }
	
    public Integer cocktailSort(Integer[] array) {
    	
    boolean troca = true;
    int inicio = 0;
    int termino = array.length - 1;
    int countEsquerda = 1;
    int countDireita = 1;
    int trocas = 0;
 
    while (troca) {
        troca = false;
        for (int i = inicio; i < termino; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                troca = true;
                trocas++;
                }
        }
        countEsquerda++;

        if (!troca) {
            break;
        }
 
        termino--;
 
        troca = false;
        for (int i = termino - 1; i >= inicio; i--) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                    
                troca = true;
                trocas++;
            }
        }
        countDireita++;
 
        inicio++;
        }
    
        return trocas;
    }
}

