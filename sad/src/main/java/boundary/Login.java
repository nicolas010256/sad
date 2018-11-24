package boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import controller.AlunoController;
import controller.OrientadorController;
import entity.Aluno;
import entity.Banca;
import entity.Curso;
import entity.Orientador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame implements ActionListener {

    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> jcmbTipoUsuarioLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;

    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

                      
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jcmbTipoUsuarioLogin = new javax.swing.JComboBox<>();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel1.setText("Bem-vindo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("E-mail:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Senha:");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14));
        txtEmail.setText("email@email.com");

        txtSenha.setFont(new java.awt.Font("Arial", 0, 14));
        txtSenha.setText("************");

        jcmbTipoUsuarioLogin.setFont(new java.awt.Font("Arial", 0, 14));
        jcmbTipoUsuarioLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Usuário", "Aluno", "Orientador" }));

        btnEntrar.setFont(new java.awt.Font("Arial", 0, 14));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(this);

        btnSair.setFont(new java.awt.Font("Arial", 0, 14));
        btnSair.setText("Sair");
        btnSair.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtSenha)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jcmbTipoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcmbTipoUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                     

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Entrar".equals(e.getActionCommand())){
            if ("Aluno".equals(jcmbTipoUsuarioLogin.getSelectedItem())){
                AlunoController aController = new AlunoController();
                Aluno aluno = aController.getByEmailAndSenha(txtEmail.getText(), txtSenha.getText());
                if (aluno != null) {
                    new MenuAluno(aluno).setVisible(true);
                    this.setVisible(false); 
                } else {
                    JOptionPane.showMessageDialog(this, "Email ou Senha inválidos");
                }
            }
            else if ("Orientador".equals(jcmbTipoUsuarioLogin.getSelectedItem())){
                OrientadorController oController = new OrientadorController();
                Orientador orientador = oController.getByEmailAndSenha(txtEmail.getText(), txtSenha.getText());
                if (orientador != null) {
                    new MenuOrientador(orientador).setVisible(true);
                    this.setVisible(false); 
                } else {
                    JOptionPane.showMessageDialog(this, "Email ou Senha inválidos");
                }
            }
            else 
                JOptionPane.showMessageDialog(null, "Selecione Aluno ou Orientador");
        }
        else if ("Sair".equals(e.getActionCommand())){
            if((int)JOptionPane.showConfirmDialog( null,"Deseja realmente sair?", "Sair",JOptionPane.YES_NO_OPTION) == 0){
                    System.exit(0);
            }
        }
    }
        
}