package boundary;

public class painelAdicionarOrientador {

    public painelAdicionarOrientador() {
        initComponents();
    }

                       
    private void initComponents() {

        painelAdicionarOrientador = new javax.swing.JPanel();
        lblSelecione_TelaConsultarBancaAluno = new javax.swing.JLabel();
        lblPesquisa_TelaConsultarBancaAluno1 = new javax.swing.JLabel();
        txtPesquisaAluno_TelaAdicionarIntegranteAluno = new javax.swing.JTextField();
        btnPesquisaAluno_TelaAdicionarIntegranteAluno = new javax.swing.JButton();
        painelFormOrientadorConvidado_TelaAdicionarOrientador = new javax.swing.JPanel();
        rbtnOrientadorConvidado_TelaAdicionarOrientador = new javax.swing.JRadioButton();
        scrollTblArea_TelaAdicionarOrientador = new javax.swing.JScrollPane();
        tblArea_TelaAdicionarOrientador = new javax.swing.JTable();

        painelAdicionarOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelAdicionarOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSelecione_TelaConsultarBancaAluno.setFont(new java.awt.Font("Arial", 0, 14));
        lblSelecione_TelaConsultarBancaAluno.setText("Selecione um Orientador:");

        lblPesquisa_TelaConsultarBancaAluno1.setFont(new java.awt.Font("Arial", 0, 14)); 
        lblPesquisa_TelaConsultarBancaAluno1.setText("Pesquisa:");

        txtPesquisaAluno_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14));
        txtPesquisaAluno_TelaAdicionarIntegranteAluno.setText("Nome, Area...");

        btnPesquisaAluno_TelaAdicionarIntegranteAluno.setFont(new java.awt.Font("Arial", 0, 14)); 
        btnPesquisaAluno_TelaAdicionarIntegranteAluno.setText("Pesquisar");

        rbtnOrientadorConvidado_TelaAdicionarOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        rbtnOrientadorConvidado_TelaAdicionarOrientador.setText("Nome do Orientador");

        tblArea_TelaAdicionarOrientador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Área x"},
                {"Área x"}
            },
            new String [] {
                "Áreas de Conhecimento"
            }
        ));
        scrollTblArea_TelaAdicionarOrientador.setViewportView(tblArea_TelaAdicionarOrientador);

        javax.swing.GroupLayout painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout = new javax.swing.GroupLayout(painelFormOrientadorConvidado_TelaAdicionarOrientador);
        painelFormOrientadorConvidado_TelaAdicionarOrientador.setLayout(painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout);
        painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.setHorizontalGroup(
            painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.createSequentialGroup()
                        .addComponent(rbtnOrientadorConvidado_TelaAdicionarOrientador)
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(scrollTblArea_TelaAdicionarOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.setVerticalGroup(
            painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormOrientadorConvidado_TelaAdicionarOrientadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnOrientadorConvidado_TelaAdicionarOrientador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTblArea_TelaAdicionarOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelAdicionarOrientador);
        painelAdicionarOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFormOrientadorConvidado_TelaAdicionarOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelecione_TelaConsultarBancaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(lblPesquisa_TelaConsultarBancaAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaAluno_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisaAluno_TelaAdicionarIntegranteAluno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecione_TelaConsultarBancaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisa_TelaConsultarBancaAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaAluno_TelaAdicionarIntegranteAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaAluno_TelaAdicionarIntegranteAluno))
                .addGap(18, 18, 18)
                .addComponent(painelFormOrientadorConvidado_TelaAdicionarOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }                       

    public javax.swing.JPanel painelAdicionarOrientador;
    private javax.swing.JButton btnPesquisaAluno_TelaAdicionarIntegranteAluno;
    private javax.swing.JScrollPane scrollTblArea_TelaAdicionarOrientador;
    private javax.swing.JPanel painelFormOrientadorConvidado_TelaAdicionarOrientador;
    private javax.swing.JRadioButton rbtnOrientadorConvidado_TelaAdicionarOrientador;
    private javax.swing.JTable tblArea_TelaAdicionarOrientador;
    private javax.swing.JLabel lblSelecione_TelaConsultarBancaAluno;
    private javax.swing.JLabel lblPesquisa_TelaConsultarBancaAluno1;
    private javax.swing.JTextField txtPesquisaAluno_TelaAdicionarIntegranteAluno;
                     
}