package utils;

import java.util.Random;

public class GeradorVetor {
    
    public static Integer[] vetorCrescente(int quantidadeElementos){
        Integer[] elementos = new Integer[quantidadeElementos];
        
        for(int i = 0; i < quantidadeElementos; i++){
            elementos[i] = i + 1;
        }
        
        return elementos;
    }
    
    public static Integer[] vetorDecrescente(int quantidadeElementos){
        Integer[] elementos = new Integer[quantidadeElementos];
        
        for(int i = 0; i < quantidadeElementos; i++){
            elementos[i] = quantidadeElementos - i;
        }
        
        return elementos;
    }
    
    public static Integer[] aleatorizaNumeros(int quantidadeElementos) {
		
        Integer[] numeros = new Integer[quantidadeElementos];
	Random geradorAleatorio = new Random();
		
	for (int i = 0; i < quantidadeElementos; i ++) {	
            numeros[i] = geradorAleatorio.nextInt(quantidadeElementos);
	}
		
	return numeros;
    }
}
