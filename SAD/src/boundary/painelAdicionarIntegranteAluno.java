package boundary;

public class painelAdicionarIntegranteAluno {

 
    public painelAdicionarIntegranteAluno() {
        initComponents();
    }

                       
    private void initComponents() {

        painelAdicionarIntegranteAluno = new javax.swing.JPanel();
        lblSelecione_TelaAdicionarIntegranteAluno = new javax.swing.JLabel();
        lblPesquisa_TelaAdicionarIntegranteAluno = new javax.swing.JLabel();
        txtPesquisaAluno_TelaAdicionarIntegranteAluno = new javax.swing.JTextField();
        btnPesquisaAluno_TelaAdicionarIntegranteAluno = new javax.swing.JButton();
        painelFormAlunoIntegrante_TelaAdicionarIntegranteAluno = new javax.swing.JPanel();
        rbtnIntegranteAluno_TelaAdicionarIntegranteAluno = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRAIntegranteAluno_TelaAdicionarIntegranteAluno = new javax.swing.JTextField();
        txtCursoIntegranteAluno_TelaAdicionarIntegranteAluno1 = new javax.swing.JTextField();

        painelAdicionarIntegranteAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelAdicionarIntegranteAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSelecione_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14)); 
        lblSelecione_TelaAdicionarIntegranteAluno.setText("Selecione um Aluno:");

        lblPesquisa_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14)); 
        lblPesquisa_TelaAdicionarIntegranteAluno.setText("Pesquisa:");

        txtPesquisaAluno_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14)); 
        txtPesquisaAluno_TelaAdicionarIntegranteAluno.setText("Nome, RA");

        btnPesquisaAluno_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14)); 
        btnPesquisaAluno_TelaAdicionarIntegranteAluno.setText("Pesquisar");

        rbtnIntegranteAluno_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14));
        rbtnIntegranteAluno_TelaAdicionarIntegranteAluno.setText("Nome do Aluno");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); 
        jLabel1.setText("RA:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("Curso:");

        txtRAIntegranteAluno_TelaAdicionarIntegranteAluno.setEditable(false);
        txtRAIntegranteAluno_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtRAIntegranteAluno_TelaAdicionarIntegranteAluno.setText("0000000000000000");

        txtCursoIntegranteAluno_TelaAdicionarIntegranteAluno1.setEditable(false);
        txtCursoIntegranteAluno_TelaAdicionarIntegranteAluno1.setFont(new java.awt.Font("Arial", 0, 14));
        txtCursoIntegranteAluno_TelaAdicionarIntegranteAluno1.setText("Curso X");

        javax.swing.GroupLayout painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout = new javax.swing.GroupLayout(painelFormAlunoIntegrante_TelaAdicionarIntegranteAluno);
        painelFormAlunoIntegrante_TelaAdicionarIntegranteAluno.setLayout(painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout);
        painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.setHorizontalGroup(
            painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnIntegranteAluno_TelaAdicionarIntegranteAluno)
                    .addGroup(painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCursoIntegranteAluno_TelaAdicionarIntegranteAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRAIntegranteAluno_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.setVerticalGroup(
            painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnIntegranteAluno_TelaAdicionarIntegranteAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRAIntegranteAluno_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormAlunoIntegrante_TelaAdicionarIntegranteAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCursoIntegranteAluno_TelaAdicionarIntegranteAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelAdicionarIntegranteAluno);
        painelAdicionarIntegranteAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFormAlunoIntegrante_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelecione_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(lblPesquisa_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaAluno_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisaAluno_TelaAdicionarIntegranteAluno)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecione_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisa_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaAluno_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaAluno_TelaAdicionarIntegranteAluno))
                .addGap(18, 18, 18)
                .addComponent(painelFormAlunoIntegrante_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

    }                    


    public javax.swing.JPanel painelAdicionarIntegranteAluno;           
    private javax.swing.JButton btnPesquisaAluno_TelaAdicionarIntegranteAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painelFormAlunoIntegrante_TelaAdicionarIntegranteAluno;
    private javax.swing.JRadioButton rbtnIntegranteAluno_TelaAdicionarIntegranteAluno;
    private javax.swing.JTextField txtCursoIntegranteAluno_TelaAdicionarIntegranteAluno1;
    private javax.swing.JLabel lblSelecione_TelaAdicionarIntegranteAluno;
    private javax.swing.JLabel lblPesquisa_TelaAdicionarIntegranteAluno;
    private javax.swing.JTextField txtPesquisaAluno_TelaAdicionarIntegranteAluno;
    private javax.swing.JTextField txtRAIntegranteAluno_TelaAdicionarIntegranteAluno;
                 
}
