package boundary;

import java.awt.Color;

public class painelEditarSenhaAluno {

    public painelEditarSenhaAluno() {
        initComponents();
    }
                          
    private void initComponents() {

        painelEditarSenhaAluno = new javax.swing.JPanel();
        lblSenhaAtual_TelaEditarSenhaAluno = new javax.swing.JLabel();
        txtSenhaAtual_TelaEditarSenhaAluno = new javax.swing.JTextField();
        lblNovaSenha_TelaEditarSenhaAluno = new javax.swing.JLabel();
        txtNovaSenha_TelaEditarSenhaAluno = new javax.swing.JTextField();
        lblConfirmeNovaSenha_TelaEditarSenhaAluno1 = new javax.swing.JLabel();
        txtConfirmeNovaSenha_TelaEditarSenhaAluno = new javax.swing.JTextField();

        painelEditarSenhaAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelEditarSenhaAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSenhaAtual_TelaEditarSenhaAluno.setFont(new java.awt.Font("Arial", 0, 14));
        lblSenhaAtual_TelaEditarSenhaAluno.setText("Senha Atual:");

        txtSenhaAtual_TelaEditarSenhaAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtSenhaAtual_TelaEditarSenhaAluno.setText("**********");

        lblNovaSenha_TelaEditarSenhaAluno.setFont(new java.awt.Font("Arial", 0, 14));
        lblNovaSenha_TelaEditarSenhaAluno.setText("Senha Nova:");

        txtNovaSenha_TelaEditarSenhaAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtNovaSenha_TelaEditarSenhaAluno.setText("**********************");

        lblConfirmeNovaSenha_TelaEditarSenhaAluno1.setFont(new java.awt.Font("Arial", 0, 14));
        lblConfirmeNovaSenha_TelaEditarSenhaAluno1.setText("Confirme a Nova Senha:");

        txtConfirmeNovaSenha_TelaEditarSenhaAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtConfirmeNovaSenha_TelaEditarSenhaAluno.setText("**********************");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelEditarSenhaAluno);
        painelEditarSenhaAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovaSenha_TelaEditarSenhaAluno)
                            .addComponent(lblSenhaAtual_TelaEditarSenhaAluno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaAtual_TelaEditarSenhaAluno)
                            .addComponent(txtNovaSenha_TelaEditarSenhaAluno)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblConfirmeNovaSenha_TelaEditarSenhaAluno1)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmeNovaSenha_TelaEditarSenhaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaAtual_TelaEditarSenhaAluno)
                    .addComponent(txtSenhaAtual_TelaEditarSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovaSenha_TelaEditarSenhaAluno)
                    .addComponent(txtNovaSenha_TelaEditarSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmeNovaSenha_TelaEditarSenhaAluno1)
                    .addComponent(txtConfirmeNovaSenha_TelaEditarSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );


        painelEditarSenhaAluno.setBackground(new Color(215, 215, 250));
    }                  
                  
    private javax.swing.JLabel lblNovaSenha_TelaEditarSenhaAluno;
    private javax.swing.JLabel lblConfirmeNovaSenha_TelaEditarSenhaAluno1;
    private javax.swing.JLabel lblSenhaAtual_TelaEditarSenhaAluno;
    private javax.swing.JTextField txtConfirmeNovaSenha_TelaEditarSenhaAluno;
    private javax.swing.JTextField txtNovaSenha_TelaEditarSenhaAluno;
    private javax.swing.JTextField txtSenhaAtual_TelaEditarSenhaAluno;
    public javax.swing.JPanel painelEditarSenhaAluno;                
}
