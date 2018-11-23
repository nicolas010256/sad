package boundary;

public class painelNotificacaoAluno {

    public painelNotificacaoAluno() {
        initComponents();
    }
                   
    private void initComponents() {

        painelNotificacaoAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelFormNotificacaoAluno = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnConfirmar_TelaNotificacaoAluno = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        lblRemet = new javax.swing.JLabel();
        lblRemetente = new javax.swing.JLabel();

        painelNotificacaoAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelNotificacaoAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("NOTIFICAÇÕES");

        painelFormNotificacaoAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        painelFormNotificacaoAluno.setPreferredSize(new java.awt.Dimension(943, 441));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnConfirmar_TelaNotificacaoAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmar_TelaNotificacaoAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnConfirmar_TelaNotificacaoAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar_TelaNotificacaoAluno.setText("Confirmar");

        lblMensagem.setFont(new java.awt.Font("Arial", 0, 14));
        lblMensagem.setText("Mensagem...");

        lblRemet.setFont(new java.awt.Font("Arial", 0, 14));
        lblRemet.setText("Remetente:");

        lblRemetente.setFont(new java.awt.Font("Arial", 0, 14));
        lblRemetente.setText("Nome remetente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRemet)
                        .addGap(29, 29, 29)
                        .addComponent(lblRemetente))
                    .addComponent(lblMensagem)
                    .addComponent(btnConfirmar_TelaNotificacaoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRemet)
                    .addComponent(lblRemetente))
                .addGap(18, 18, 18)
                .addComponent(lblMensagem)
                .addGap(105, 105, 105)
                .addComponent(btnConfirmar_TelaNotificacaoAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelFormNotificacaoAlunoLayout = new javax.swing.GroupLayout(painelFormNotificacaoAluno);
        painelFormNotificacaoAluno.setLayout(painelFormNotificacaoAlunoLayout);
        painelFormNotificacaoAlunoLayout.setHorizontalGroup(
            painelFormNotificacaoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormNotificacaoAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        painelFormNotificacaoAlunoLayout.setVerticalGroup(
            painelFormNotificacaoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormNotificacaoAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelNotificacaoAluno);
        painelNotificacaoAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(painelFormNotificacaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormNotificacaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public javax.swing.JPanel painelNotificacaoAluno;
    private javax.swing.JButton btnConfirmar_TelaNotificacaoAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblRemet;
    private javax.swing.JLabel lblRemetente;
    private javax.swing.JPanel painelFormNotificacaoAluno;        
}
