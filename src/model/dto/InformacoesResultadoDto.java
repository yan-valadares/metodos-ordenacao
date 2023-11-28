package model.dto;

public class InformacoesResultadoDto {

    private String nomeAlgoritmo;
    private Integer trocas;
    private Integer tempoExecucao;
    
    public String getNomeAlgoritmo() {
        return nomeAlgoritmo;
    }

    public void setNomeAlgoritmo(String nomeAlgoritmo) {
        this.nomeAlgoritmo = nomeAlgoritmo;
    }

    public Integer getTrocas() {
        return trocas;
    }

    public void setTrocas(Integer trocas) {
        this.trocas = trocas;
    }

    public Integer getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(Integer tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }
       
    


    
}
