package model;

public class QuickSort extends ModeloMetodo {
	
    private Integer[] numeros;
    
    public QuickSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
        
    @Override
    public Integer realizarOperacao(){
        return quickSort(numeros, 0, numeros.length -1, 0);
    }
    
    private Integer quickSort(Integer[] numeros, Integer de, Integer ate, Integer trocas) {
	Integer[] retorno = new Integer[2];
        
        while (de < ate) {
            retorno = particiona(numeros, de, ate, trocas);
            int valores = retorno[0];
            trocas += retorno[1];
            quickSort(numeros, de, valores - 1, trocas);
            de = valores + 1;
        }
        
        return trocas;
    }

    private Integer[] particiona(Integer[] numeros, Integer inicial, Integer termino, Integer trocas) {
    Integer[] valoresRetorno = new Integer[2];
        
    int valorAnteriorInicial = inicial - 1;
    int valorInicial = inicial;

    while (valorInicial < termino) {
        if (numeros[valorInicial] <= numeros[termino]) {
            troca(numeros, ++valorAnteriorInicial, valorInicial);
            trocas++;
            valoresRetorno[1] = trocas;
        }
        valorInicial++;
        valoresRetorno[0] = valorInicial;
        }

        troca(numeros, ++valorAnteriorInicial, valorInicial);
        trocas++;
        valoresRetorno[1] = trocas;
        return valoresRetorno;
    }

    private void troca(Integer[] numeros, Integer de, Integer para) {
            
        Integer primeiroNumero = numeros[de];
        Integer segundoNumero =  numeros[para];
        numeros[para] = primeiroNumero;
        numeros[de] = segundoNumero;
    }
}