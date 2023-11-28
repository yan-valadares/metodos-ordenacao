package utils;

import model.ModeloMetodo;
import model.dto.InformacoesResultadoDto;
import utils.MedidorTempo;

public class ExecutadorMetodo {
    
    private InformacoesResultadoDto resultadoMetodo;
    
    public InformacoesResultadoDto executadorMetodo(ModeloMetodo metodo){
        long tempoInicial;
        resultadoMetodo  = new InformacoesResultadoDto();
        
        String nomeMetodo = metodo.getClass().getName();
        nomeMetodo = nomeMetodo.substring(nomeMetodo.lastIndexOf('.') + 1);
        resultadoMetodo.setNomeAlgoritmo(nomeMetodo);
        
         try{
            tempoInicial = MedidorTempo.iniciarContagem();
            resultadoMetodo.setTrocas(metodo.realizarOperacao());
            resultadoMetodo.setTempoExecucao(MedidorTempo.contabilizarTempoTotal(tempoInicial));
        } catch(StackOverflowError e) {
            resultadoMetodo.setTrocas(-1);
            resultadoMetodo.setTempoExecucao(-1);
        }
         
         return resultadoMetodo;
    }
}
