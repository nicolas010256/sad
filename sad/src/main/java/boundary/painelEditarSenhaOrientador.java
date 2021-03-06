package boundary;

import java.awt.Color;

public class painelEditarSenhaOrientador {

    public painelEditarSenhaOrientador() {
        initComponents();
    }
                      
    private void initComponents() {

        painelEditarSenhaOrientador = new javax.swing.JPanel();
        lblSenhaAtual_TelaEditarSenhaOrientador = new javax.swing.JLabel();
        txtSenhaAtual_TelaEditarSenhaOrientador = new javax.swing.JTextField();
        lblNovaSenha_TelaEditarSenhaOrientador = new javax.swing.JLabel();
        txtNovaSenha_TelaEditarSenhaOrientador = new javax.swing.JTextField();
        lblConfirmeNovaSenha_TelaEditarSenhaOrientador1 = new javax.swing.JLabel();
        txtConfirmeNovaSenha_TelaEditarSenhaOrientador = new javax.swing.JTextField();

        painelEditarSenhaOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelEditarSenhaOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSenhaAtual_TelaEditarSenhaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblSenhaAtual_TelaEditarSenhaOrientador.setText("Senha Atual:");

        txtSenhaAtual_TelaEditarSenhaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtSenhaAtual_TelaEditarSenhaOrientador.setText("**********");

        lblNovaSenha_TelaEditarSenhaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblNovaSenha_TelaEditarSenhaOrientador.setText("Senha Nova:");

        txtNovaSenha_TelaEditarSenhaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtNovaSenha_TelaEditarSenhaOrientador.setText("**********************");

        lblConfirmeNovaSenha_TelaEditarSenhaOrientador1.setFont(new java.awt.Font("Arial", 0, 14));
        lblConfirmeNovaSenha_TelaEditarSenhaOrientador1.setText("Confirme a Nova Senha:");

        txtConfirmeNovaSenha_TelaEditarSenhaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtConfirmeNovaSenha_TelaEditarSenhaOrientador.setText("**********************");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelEditarSenhaOrientador);
        painelEditarSenhaOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovaSenha_TelaEditarSenhaOrientador)
                            .addComponent(lblSenhaAtual_TelaEditarSenhaOrientador))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaAtual_TelaEditarSenhaOrientador)
                            .addComponent(txtNovaSenha_TelaEditarSenhaOrientador)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblConfirmeNovaSenha_TelaEditarSenhaOrientador1)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmeNovaSenha_TelaEditarSenhaOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaAtual_TelaEditarSenhaOrientador)
                    .addComponent(txtSenhaAtual_TelaEditarSenhaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovaSenha_TelaEditarSenhaOrientador)
                    .addComponent(txtNovaSenha_TelaEditarSenhaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmeNovaSenha_TelaEditarSenhaOrientador1)
                    .addComponent(txtConfirmeNovaSenha_TelaEditarSenhaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        painelEditarSenhaOrientador.setBackground(new Color(215, 215, 250));
    }                        
                 
    private javax.swing.JLabel lblNovaSenha_TelaEditarSenhaOrientador;
    private javax.swing.JLabel lblConfirmeNovaSenha_TelaEditarSenhaOrientador1;
    private javax.swing.JLabel lblSenhaAtual_TelaEditarSenhaOrientador;
    private javax.swing.JTextField txtConfirmeNovaSenha_TelaEditarSenhaOrientador;
    private javax.swing.JTextField txtNovaSenha_TelaEditarSenhaOrientador;
    private javax.swing.JTextField txtSenhaAtual_TelaEditarSenhaOrientador;
    public javax.swing.JPanel painelEditarSenhaOrientador;                 
}
