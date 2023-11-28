package view;

import controller.ControladorTabela;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.dto.InformacoesResultadoDto;

public class TabelaRelatorio extends javax.swing.JFrame {

    private DefaultTableModel tabelaRelatorio;
    private ControladorTabela controladorTabela;
    private String cenario;
    private Integer quantidadeElementos;
    private ArrayList<InformacoesResultadoDto> resultados;    
    
    
    public TabelaRelatorio() {
        initComponents();
        tabelaRelatorio = new DefaultTableModel();
        criarColunasTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTamanhoEntrada = new javax.swing.ButtonGroup();
        bgTipoCenario = new javax.swing.ButtonGroup();
        lbTamanhoEntrada = new javax.swing.JLabel();
        rbDez = new javax.swing.JRadioButton();
        rbCinquenta = new javax.swing.JRadioButton();
        rbVinteMil = new javax.swing.JRadioButton();
        lbCenario = new javax.swing.JLabel();
        rbAleatorio = new javax.swing.JRadioButton();
        rbCrescente = new javax.swing.JRadioButton();
        rbDecrescente = new javax.swing.JRadioButton();
        btExecutar = new javax.swing.JButton();
        btLimparRelatorio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRelatorio = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTamanhoEntrada.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTamanhoEntrada.setText("Tamanho entrada");

        bgTamanhoEntrada.add(rbDez);
        rbDez.setText("10 Elementos");
        rbDez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDezActionPerformed(evt);
            }
        });

        bgTamanhoEntrada.add(rbCinquenta);
        rbCinquenta.setText("50 Elementos");
        rbCinquenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCinquentaActionPerformed(evt);
            }
        });

        bgTamanhoEntrada.add(rbVinteMil);
        rbVinteMil.setText("20 000 Elementos");
        rbVinteMil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVinteMilActionPerformed(evt);
            }
        });

        lbCenario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbCenario.setText("Cenário");

        bgTipoCenario.add(rbAleatorio);
        rbAleatorio.setText("Aleatório");
        rbAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAleatorioActionPerformed(evt);
            }
        });

        bgTipoCenario.add(rbCrescente);
        rbCrescente.setText("Crescente");

        bgTipoCenario.add(rbDecrescente);
        rbDecrescente.setText("Decrescente");
        rbDecrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDecrescenteActionPerformed(evt);
            }
        });

        btExecutar.setText("Executar");
        btExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExecutarActionPerformed(evt);
            }
        });

        btLimparRelatorio.setText("Limpar relatório");
        btLimparRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparRelatorioActionPerformed(evt);
            }
        });

        tbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCenario)
                            .addComponent(rbVinteMil)
                            .addComponent(rbCinquenta)
                            .addComponent(rbDez)
                            .addComponent(lbTamanhoEntrada)
                            .addComponent(rbCrescente)
                            .addComponent(rbAleatorio)
                            .addComponent(rbDecrescente))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimparRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExecutar)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTamanhoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(rbDez)
                        .addGap(7, 7, 7)
                        .addComponent(rbCinquenta)
                        .addGap(7, 7, 7)
                        .addComponent(rbVinteMil)
                        .addGap(20, 20, 20)
                        .addComponent(lbCenario)
                        .addGap(18, 18, 18)
                        .addComponent(rbAleatorio)
                        .addGap(7, 7, 7)
                        .addComponent(rbCrescente)
                        .addGap(7, 7, 7)
                        .addComponent(rbDecrescente))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExecutar)
                    .addComponent(btLimparRelatorio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbDezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDezActionPerformed

    private void rbCinquentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCinquentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCinquentaActionPerformed

    private void rbAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAleatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAleatorioActionPerformed

    private void rbDecrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDecrescenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDecrescenteActionPerformed

    private void rbVinteMilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVinteMilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVinteMilActionPerformed

    private void btExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExecutarActionPerformed
        definirQuantidadeElementos();
        definirCenario();
        
        controladorTabela = new ControladorTabela(cenario, quantidadeElementos);
        resultados = controladorTabela.realizarOperacoes();
        
        atualizarTabela();
    }//GEN-LAST:event_btExecutarActionPerformed

    private void atualizarTabela(){
        tabelaRelatorio.setNumRows(0);
        
        for(InformacoesResultadoDto resultado : resultados){
            Object informacoesResultado[] = new Object[3];
            informacoesResultado[0] = resultado.getNomeAlgoritmo();
            informacoesResultado[1] = resultado.getTempoExecucao() != -1 ? resultado.getTempoExecucao() : "Não suporta";
            informacoesResultado[2] = resultado.getTrocas() != -1 ? resultado.getTrocas() : "Não suporta";
            tabelaRelatorio.addRow(informacoesResultado);
        }
        
        tbRelatorio.setModel(tabelaRelatorio); 
    }
    
    private void btLimparRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparRelatorioActionPerformed
        limparCamposTabela();
    }//GEN-LAST:event_btLimparRelatorioActionPerformed
    
    private void definirCenario(){
        
        if(rbCrescente.isSelected()) {
            this.cenario = "crescente";
        } else if (rbDecrescente.isSelected()){
            this.cenario = "decrescente";
        } else  if (rbAleatorio.isSelected()) {
            this.cenario = "aleatorio";
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    private void definirQuantidadeElementos(){

        if (rbDez.isSelected()) {
            this.quantidadeElementos = 10;
        } else if (rbCinquenta.isSelected()) {
            this.quantidadeElementos = 50;
        } else if(rbVinteMil.isSelected()) {
            this.quantidadeElementos = 20000;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    private void limparCamposTabela(){
        tabelaRelatorio.setNumRows(0);
        
        tbRelatorio.setModel(tabelaRelatorio); 
    }
    
    private void criarColunasTabela(){
        tabelaRelatorio.addColumn("Algoritmo");
        tabelaRelatorio.addColumn("Tempo execução Ms");
        tabelaRelatorio.addColumn("Quantidade de trocas");
        
        tbRelatorio.setModel(tabelaRelatorio);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTamanhoEntrada;
    private javax.swing.ButtonGroup bgTipoCenario;
    private javax.swing.JButton btExecutar;
    private javax.swing.JButton btLimparRelatorio;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCenario;
    private javax.swing.JLabel lbTamanhoEntrada;
    private javax.swing.JRadioButton rbAleatorio;
    private javax.swing.JRadioButton rbCinquenta;
    private javax.swing.JRadioButton rbCrescente;
    private javax.swing.JRadioButton rbDecrescente;
    private javax.swing.JRadioButton rbDez;
    private javax.swing.JRadioButton rbVinteMil;
    private javax.swing.JTable tbRelatorio;
    // End of variables declaration//GEN-END:variables
}
