package model;

import java.util.ArrayList;

public class BucketSort extends ModeloMetodo {
    
    private Integer[] numeros;
    
    public BucketSort(Integer[] elementos){
        this.numeros = new Integer[elementos.length];
        System.arraycopy(elementos, 0, numeros, 0, elementos.length);
    }
    
    @Override
    public Integer realizarOperacao(){
        return bucketSort(numeros);
    }
    
    public Integer bucketSort(Integer[] numeros) {
        final int tamanho = numeros.length;
        final int maior = getMaior(numeros);
        InsertionSort metodoOrdenacao;
        int trocas = 0;

        final ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();

        for (int i = 0; i < tamanho; i++)
            bucket.add(new ArrayList<>());

        for (int numero : numeros) {
            int index = numero * tamanho / (maior + 1);
            ArrayList<Integer> bucketList = bucket.get(index);

            bucketList.add(numero);
        }

        for (int i = 0; i < tamanho; i++){
            ArrayList<Integer> bucketList = bucket.get(i);
            metodoOrdenacao = new InsertionSort(bucketList.toArray(new Integer[0]));
            trocas += metodoOrdenacao.realizarOperacao();

            for (int j = 0; j < bucketList.size(); j++) {
                numeros[j] = bucketList.get(j);
            }
        }
        
        return trocas;
    }

    private static int getMaior(Integer[] numeros) {
        var maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }
}
