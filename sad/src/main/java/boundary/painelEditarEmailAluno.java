package boundary;

import java.awt.Color;

public class painelEditarEmailAluno {

    public painelEditarEmailAluno() {
        initComponents();
    }
                      
    private void initComponents() {

        painelEditarEmailAluno = new javax.swing.JPanel();
        lblSenha_TelaEditarEmailAluno = new javax.swing.JLabel();
        txtSenha_TelaEditarEmailAluno = new javax.swing.JTextField();
        lblNovoEmail_TelaEditarEmailAluno = new javax.swing.JLabel();
        txtNovoEmail_TelaEditarEmailAluno = new javax.swing.JTextField();
        lblNovoEmail_TelaEditarEmailAluno1 = new javax.swing.JLabel();
        txtConfirmeNovoEmail_TelaEditarEmailAluno = new javax.swing.JTextField();

        painelEditarEmailAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelEditarEmailAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSenha_TelaEditarEmailAluno.setFont(new java.awt.Font("Arial", 0, 14));
        lblSenha_TelaEditarEmailAluno.setText("Senha:");

        txtSenha_TelaEditarEmailAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtSenha_TelaEditarEmailAluno.setText("****************");

        lblNovoEmail_TelaEditarEmailAluno.setFont(new java.awt.Font("Arial", 0, 14));
        lblNovoEmail_TelaEditarEmailAluno.setText("Novo E-mail:");

        txtNovoEmail_TelaEditarEmailAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtNovoEmail_TelaEditarEmailAluno.setText("email@email.com");

        lblNovoEmail_TelaEditarEmailAluno1.setFont(new java.awt.Font("Arial", 0, 14));
        lblNovoEmail_TelaEditarEmailAluno1.setText("Confirme Novo E-mail:");

        txtConfirmeNovoEmail_TelaEditarEmailAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtConfirmeNovoEmail_TelaEditarEmailAluno.setText("email@email.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelEditarEmailAluno);
        painelEditarEmailAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovoEmail_TelaEditarEmailAluno)
                            .addComponent(lblSenha_TelaEditarEmailAluno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha_TelaEditarEmailAluno)
                            .addComponent(txtNovoEmail_TelaEditarEmailAluno)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNovoEmail_TelaEditarEmailAluno1)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmeNovoEmail_TelaEditarEmailAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha_TelaEditarEmailAluno)
                    .addComponent(txtSenha_TelaEditarEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovoEmail_TelaEditarEmailAluno)
                    .addComponent(txtNovoEmail_TelaEditarEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovoEmail_TelaEditarEmailAluno1)
                    .addComponent(txtConfirmeNovoEmail_TelaEditarEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        painelEditarEmailAluno.setBackground(new Color(215, 215, 250));
    }                   
               
    private javax.swing.JLabel lblNovoEmail_TelaEditarEmailAluno;
    private javax.swing.JLabel lblNovoEmail_TelaEditarEmailAluno1;
    private javax.swing.JLabel lblSenha_TelaEditarEmailAluno;
    private javax.swing.JTextField txtConfirmeNovoEmail_TelaEditarEmailAluno;
    private javax.swing.JTextField txtNovoEmail_TelaEditarEmailAluno;
    private javax.swing.JTextField txtSenha_TelaEditarEmailAluno;
    public javax.swing.JPanel painelEditarEmailAluno;                
}
