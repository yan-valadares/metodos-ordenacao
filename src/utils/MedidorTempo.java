package utils;

public class MedidorTempo {
    
    public static long iniciarContagem(){
        return System.nanoTime();
    }
    
    public static int contabilizarTempoTotal(long tempoInicial){
        long tempoFinal = System.nanoTime();
        
        return (int) (tempoFinal - tempoInicial) / 1000;
    }
}
