package interfaceApp;

import classes.Veiculo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class JFVeiculo extends javax.swing.JFrame {
    // declara um ArrayList para armazenar a coleção de objetos da classe veículo
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    // declara variável global para armazenar a linha selecionada
    private int linha = -1;

    public JFVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtAnoFabricacao = new javax.swing.JTextField();
        txtPotenciaMotor = new javax.swing.JFormattedTextField();
        txtPlaca = new javax.swing.JTextField();
        txtTipoCombustivel = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtValorLocacao = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de veículos");

        jLabel1.setText("Modelo");

        jLabel2.setText("Marca");

        jLabel3.setText("Ano Fab.");

        jLabel4.setText("Potência M.");

        jLabel5.setText("Placa");

        jLabel6.setText("Tipo Combustível");

        jLabel7.setText("Cor");

        jLabel8.setText("Valor Locação");

        jLabel9.setText("Observações");

        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Placa", "Valor Locação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeiculoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVeiculo);
        if (tblVeiculo.getColumnModel().getColumnCount() > 0) {
            tblVeiculo.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(271, 271, 271))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPotenciaMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotenciaMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // verifica se o estado de operação do formulário é de inserção
        Veiculo veiculo = new Veiculo(
            txtModelo.getText(), txtMarca.getText(), txtAnoFabricacao.getText(), 
            Float.parseFloat( txtPotenciaMotor.getText() ), txtPlaca.getText(), txtTipoCombustivel.getText(), 
            txtCor.getText(), Float.parseFloat( txtValorLocacao.getText().replace(",", ".") ), txtObservacoes.getText()
        );

        // adiciona o objeto na coleção de objetos
        this.veiculos.add(veiculo);

        // preenche a tabela
        this.preenchaTabela();
            
        // limpa o formulário
        this.limpeFormulario();
    }//GEN-LAST:event_btnGravarActionPerformed

    
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.veiculos.get( this.linha ).setModelo( txtModelo.getText() );
        this.veiculos.get( this.linha ).setMarca( txtMarca.getText() );
        this.veiculos.get( this.linha ).setAnoFabricacao( txtAnoFabricacao.getText() );
        this.veiculos.get( this.linha ).setPotenciaMotor( Float.parseFloat(txtPotenciaMotor.getText()) );
        this.veiculos.get( this.linha ).setPlaca( txtPlaca.getText() );
        this.veiculos.get( this.linha ).setTipoCombustivel( txtTipoCombustivel.getText() );
        this.veiculos.get( this.linha ).setCor( txtCor.getText() );
        this.veiculos.get( this.linha ).setValorBaseLocacao( Float.parseFloat(txtValorLocacao.getText()) );
        this.veiculos.get( this.linha ).setObservacoes( txtObservacoes.getText() );

        // preenche a tabela novamente
        this.preenchaTabela();

        // limpa o formulário
        this.limpeFormulario();

        // controle de botões
        this.controleBotoes(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeiculoMouseClicked
        // determina o indice da linha clicada na tabela
        this.linha = tblVeiculo.rowAtPoint(evt.getPoint());

        // seta os elementos da tela com os dados do objeto selecionado
        txtModelo.setText(this.veiculos.get( this.linha ).getModelo() );
        txtMarca.setText(this.veiculos.get( this.linha ).getMarca() );
        txtAnoFabricacao.setText(this.veiculos.get( this.linha ).getAnoFabricacao() );
        txtPotenciaMotor.setText(String.valueOf(this.veiculos.get( this.linha ).getPotenciaMotor()));
        txtPlaca.setText(this.veiculos.get( this.linha ).getPlaca() );
        txtTipoCombustivel.setText(this.veiculos.get( this.linha ).getTipoCombustivel() );
        txtCor.setText(this.veiculos.get( this.linha ).getCor() );
        txtValorLocacao.setText(String.valueOf(this.veiculos.get( this.linha ).getValorBaseLocacao()) );
        txtObservacoes.setText(this.veiculos.get( this.linha ).getObservacoes() );

        // efetua o controle de botões
        this.controleBotoes(false);
    }//GEN-LAST:event_tblVeiculoMouseClicked

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked
        // remove o objeto do ArrayList na posição selecionada
        this.veiculos.remove( this.linha );

        // preenche a tabela novamente
        this.preenchaTabela();

        // limpa o formulário
        this.limpeFormulario();

        // controle de botões
        this.controleBotoes(true);
    }//GEN-LAST:event_btnRemoverMouseClicked

    private void preenchaTabela() {
        // recupera o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tblVeiculo.getModel();

        // limpa a tabela
        model.setRowCount(0);

        // percorre a coleção de objetos de veiculo
        for ( int i = 0 ; i < this.veiculos.size() ; i++) {
            // adiciona uma linha na tabela
            model.addRow(new String[] {
                this.veiculos.get(i).getModelo(),
                this.veiculos.get(i).getMarca(),
                this.veiculos.get(i).getPlaca(),
                Float.toString( this.veiculos.get(i).getValorBaseLocacao() ).replace(".", ",")
            });
        }
    }

    private void limpeFormulario() {
        // limpa o formulário após o preenchimento
        txtModelo.setText("");
        txtMarca.setText("");
        txtAnoFabricacao.setText("");
        txtPotenciaMotor.setText("");
        txtPlaca.setText("");
        txtTipoCombustivel.setText(""); 
        txtCor.setText("");
        txtValorLocacao.setText("");
        txtObservacoes.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVeiculo().setVisible(true);
            }
        });
    }

    private void controleBotoes(boolean habilita) {
        btnGravar.setEnabled(habilita);
        btnAlterar.setEnabled(!habilita);
        btnRemover.setEnabled(!habilita);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVeiculo;
    private javax.swing.JTextField txtAnoFabricacao;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JFormattedTextField txtPotenciaMotor;
    private javax.swing.JTextField txtTipoCombustivel;
    private javax.swing.JFormattedTextField txtValorLocacao;
    // End of variables declaration//GEN-END:variables
}
