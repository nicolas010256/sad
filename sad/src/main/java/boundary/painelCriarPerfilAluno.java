package boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controller.CursoController;
import entity.Aluno;
import entity.Curso;

public class painelCriarPerfilAluno implements ActionListener {
    private javax.swing.JButton btnEditarEmailAluno_TelaCriarPerfilAluno;
    private javax.swing.JButton btnEditarSenhaAluno_TelaCriarPerfilAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painelFormCriarPerfilAluno;
    public javax.swing.JPanel painelCriarPerfilAluno;
    private javax.swing.JTextField txtCursoAluno;
    private javax.swing.JTextField txtEmailAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtRAAluno_TelaCriarPerfilAluno;
    private javax.swing.JTextField txtSenhaAluno_TelaCriarPerfilAluno;      

    private Aluno aluno;

    public painelCriarPerfilAluno(Aluno aluno) {
        this.aluno = aluno;
        initComponents();

        txtNomeAluno.setText(aluno.getNome());
        txtEmailAluno.setText(aluno.getEmail());

        CursoController cursoController = new CursoController();
        Curso c = cursoController.getByAluno(aluno);
        aluno.setCurso(c);

        txtCursoAluno.setText(c != null ? c.getNome() : "");
    }
                       
    private void initComponents() {
        
        painelCriarPerfilAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelFormCriarPerfilAluno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEditarEmailAluno_TelaCriarPerfilAluno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRAAluno_TelaCriarPerfilAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCursoAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmailAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenhaAluno_TelaCriarPerfilAluno = new javax.swing.JTextField();
        btnEditarSenhaAluno_TelaCriarPerfilAluno = new javax.swing.JButton();


        painelCriarPerfilAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelCriarPerfilAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("PERFIL");

        painelFormCriarPerfilAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        painelFormCriarPerfilAluno.setPreferredSize(new java.awt.Dimension(943, 441));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel2.setText("Dados Pessoais e de Acesso");

        btnEditarEmailAluno_TelaCriarPerfilAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarEmailAluno_TelaCriarPerfilAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnEditarEmailAluno_TelaCriarPerfilAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEmailAluno_TelaCriarPerfilAluno.setText("Editar E-mail");
        btnEditarEmailAluno_TelaCriarPerfilAluno.addActionListener(this);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Nome:");

        txtNomeAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtNomeAluno.setText("Nome do aluno");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setText("R.A.:");

        txtRAAluno_TelaCriarPerfilAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtRAAluno_TelaCriarPerfilAluno.setText("0000000000000");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setText("Curso:");

        txtCursoAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtCursoAluno.setText("Nome do Curso");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel6.setText("E-mail:");

        txtEmailAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtEmailAluno.setText("email_do_aluno@email.com");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel7.setText("Senha:");

        txtSenhaAluno_TelaCriarPerfilAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtSenhaAluno_TelaCriarPerfilAluno.setText("***************");

        btnEditarSenhaAluno_TelaCriarPerfilAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarSenhaAluno_TelaCriarPerfilAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnEditarSenhaAluno_TelaCriarPerfilAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarSenhaAluno_TelaCriarPerfilAluno.setText("Editar Senha");
        btnEditarSenhaAluno_TelaCriarPerfilAluno.addActionListener(this);

        javax.swing.GroupLayout painelFormCriarPerfilAlunoLayout = new javax.swing.GroupLayout(painelFormCriarPerfilAluno);
        painelFormCriarPerfilAluno.setLayout(painelFormCriarPerfilAlunoLayout);
        painelFormCriarPerfilAlunoLayout.setHorizontalGroup(
            painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                .addGroup(painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenhaAluno_TelaCriarPerfilAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnEditarSenhaAluno_TelaCriarPerfilAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(txtEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnEditarEmailAluno_TelaCriarPerfilAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(7, 7, 7)
                                .addComponent(txtCursoAluno))
                            .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtRAAluno_TelaCriarPerfilAluno))
                            .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeAluno))
                            .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        painelFormCriarPerfilAlunoLayout.setVerticalGroup(
            painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormCriarPerfilAlunoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRAAluno_TelaCriarPerfilAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarEmailAluno_TelaCriarPerfilAluno))
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarPerfilAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSenhaAluno_TelaCriarPerfilAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarSenhaAluno_TelaCriarPerfilAluno))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelCriarPerfilAluno);
        painelCriarPerfilAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(painelFormCriarPerfilAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormCriarPerfilAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCursoAluno.setEditable(false);
        txtEmailAluno.setEditable(false);
        txtNomeAluno.setEditable(false);
        txtRAAluno_TelaCriarPerfilAluno.setEditable(false);
        txtSenhaAluno_TelaCriarPerfilAluno.setEditable(false);
    }                     

    public void telaEditarEmailAluno(){
        JOptionPane.showOptionDialog(null,
				new painelEditarEmailAluno().painelEditarEmailAluno,
				"Editar E-mail",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Confirmar", "Cancelar"},
				"Cancel");
    }
    
    public void telaEditarSenhaAluno(){
        JOptionPane.showOptionDialog(null,
				new painelEditarSenhaAluno().painelEditarSenhaAluno,
				"Editar Senha do Usuário",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Confirmar", "Cancelar"},
				"Cancel");
    }           

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Editar E-mail".equals(e.getActionCommand()))
            telaEditarEmailAluno();
         
         if ("Editar Senha".equals(e.getActionCommand()))
            telaEditarSenhaAluno();
    }
}