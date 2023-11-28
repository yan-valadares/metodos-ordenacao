package model;

public class MergeSort extends ModeloMetodo {

    private Integer[] numeros;
    
    public MergeSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }

    @Override
    public Integer realizarOperacao(){
        return mergesort(numeros, 0, numeros.length, 0);
    }
    
    private Integer mergesort(Integer[] numeros, Integer inicial, Integer termino, Integer trocas) {
		
	int quantidade = termino - inicial;
	if (quantidade > 1) {
            int meio = (inicial + termino) / 2;
            mergesort(numeros, inicial, meio, trocas);
            mergesort(numeros, meio, termino, trocas);
            trocas++;
            trocas = intercalar(numeros, inicial, meio, termino, trocas++);
	}
        
        return trocas;
	
    }

    private Integer intercalar(Integer[] numeros, Integer inicial, Integer miolo, Integer termino, Integer trocas) {
        Integer resultado[] = new Integer[termino - inicial];

        Integer atual = 0;
        Integer atualInicio = inicial;
        Integer atualMeio = miolo;

        while (atualInicio < miolo && atualMeio < termino) {
            Integer primeiroNumero = numeros[atualInicio];
            Integer segundoNumero = numeros[atualMeio];
			
            if (primeiroNumero < segundoNumero) {
                resultado[atual] = primeiroNumero;
                trocas++;
                atualInicio++;
            } else {
                resultado[atual] = segundoNumero;
                trocas++;
                atualMeio++;
            }
            
            atual++;
        }
		
        while (atualInicio < miolo) {
            resultado[atual] = numeros[atualInicio];
            trocas++;
            atualInicio++;
            atual++;
        }
		
        while (atualMeio < termino) {
            resultado[atual] = numeros[atualMeio];
            trocas++;
            atualMeio++;
            atual++;
        }
		
        for (int i = 0; i < atual; i++) {
            numeros[inicial + i] = resultado[i];
            trocas++;
        }
        
        return trocas;
    }
    
    
}