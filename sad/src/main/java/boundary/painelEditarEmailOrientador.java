package boundary;

import java.awt.Color;

public class painelEditarEmailOrientador {

    public painelEditarEmailOrientador() {
        initComponents();
    }
                     
    private void initComponents() {

        painelEditarEmailOrientador = new javax.swing.JPanel();
        lblSenha_TelaEditarEmailOrientador = new javax.swing.JLabel();
        txtSenha_TelaEditarEmailOrientador = new javax.swing.JTextField();
        lblNovoEmail_TelaEditarEmailOrientador = new javax.swing.JLabel();
        txtNovoEmail_TelaEditarEmailOrientador = new javax.swing.JTextField();
        lblNovoEmail_TelaEditarEmailOrientador1 = new javax.swing.JLabel();
        txtConfirmeNovoEmail_TelaEditarEmailOrientador = new javax.swing.JTextField();

        painelEditarEmailOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelEditarEmailOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSenha_TelaEditarEmailOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblSenha_TelaEditarEmailOrientador.setText("Senha:");

        txtSenha_TelaEditarEmailOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        txtSenha_TelaEditarEmailOrientador.setText("****************");

        lblNovoEmail_TelaEditarEmailOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblNovoEmail_TelaEditarEmailOrientador.setText("Novo E-mail:");

        txtNovoEmail_TelaEditarEmailOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtNovoEmail_TelaEditarEmailOrientador.setText("email@email.com");

        lblNovoEmail_TelaEditarEmailOrientador1.setFont(new java.awt.Font("Arial", 0, 14));
        lblNovoEmail_TelaEditarEmailOrientador1.setText("Confirme Novo E-mail:");

        txtConfirmeNovoEmail_TelaEditarEmailOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtConfirmeNovoEmail_TelaEditarEmailOrientador.setText("email@email.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelEditarEmailOrientador);
        painelEditarEmailOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovoEmail_TelaEditarEmailOrientador)
                            .addComponent(lblSenha_TelaEditarEmailOrientador))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha_TelaEditarEmailOrientador)
                            .addComponent(txtNovoEmail_TelaEditarEmailOrientador)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNovoEmail_TelaEditarEmailOrientador1)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmeNovoEmail_TelaEditarEmailOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha_TelaEditarEmailOrientador)
                    .addComponent(txtSenha_TelaEditarEmailOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovoEmail_TelaEditarEmailOrientador)
                    .addComponent(txtNovoEmail_TelaEditarEmailOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovoEmail_TelaEditarEmailOrientador1)
                    .addComponent(txtConfirmeNovoEmail_TelaEditarEmailOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        painelEditarEmailOrientador.setBackground(new Color(215, 215, 250));
    }                      
                  
    private javax.swing.JLabel lblNovoEmail_TelaEditarEmailOrientador;
    private javax.swing.JLabel lblNovoEmail_TelaEditarEmailOrientador1;
    private javax.swing.JLabel lblSenha_TelaEditarEmailOrientador;
    private javax.swing.JTextField txtConfirmeNovoEmail_TelaEditarEmailOrientador;
    private javax.swing.JTextField txtNovoEmail_TelaEditarEmailOrientador;
    private javax.swing.JTextField txtSenha_TelaEditarEmailOrientador;
    public javax.swing.JPanel painelEditarEmailOrientador;                 
}
