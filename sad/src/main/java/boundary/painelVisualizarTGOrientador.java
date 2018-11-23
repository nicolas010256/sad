package boundary;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class painelVisualizarTGOrientador implements ActionListener{

    public painelVisualizarTGOrientador() {
        initComponents();
    }
                        
    private void initComponents() {

        painelVisualizarTGOrientador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisaTGOrientador_TelaVisualizarTGOrientador = new javax.swing.JTextField();
        btnPesquisarTGOrientador_TelaVisualizarTGOrientador = new javax.swing.JButton();
        scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador = new javax.swing.JScrollPane();
        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador = new javax.swing.JTable();
        btnVisualizarTGOrientador_TelaVisualizarTGOrientador = new javax.swing.JButton();

        painelVisualizarTGOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelVisualizarTGOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("VISUALIZAR TRABALHOS DE GRADUAÇÃO");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setText("Pesquisa:");

        txtPesquisaTGOrientador_TelaVisualizarTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtPesquisaTGOrientador_TelaVisualizarTGOrientador.setText("Título, Tema, Palavras-chave, Integrante...");

        btnPesquisarTGOrientador_TelaVisualizarTGOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnPesquisarTGOrientador_TelaVisualizarTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnPesquisarTGOrientador_TelaVisualizarTGOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarTGOrientador_TelaVisualizarTGOrientador.setText("Pesquisar");

        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"},
                {"Título X", "Tema X", "Aluno, Aluno, Aluno"}
            },
            new String [] {
                "Título", "Tema", "Integrantes"
            }
        ));
        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setRowHeight(40);
        scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setViewportView(tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador);

        btnVisualizarTGOrientador_TelaVisualizarTGOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnVisualizarTGOrientador_TelaVisualizarTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnVisualizarTGOrientador_TelaVisualizarTGOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarTGOrientador_TelaVisualizarTGOrientador.setText("Visualizar");
        btnVisualizarTGOrientador_TelaVisualizarTGOrientador.addActionListener(this);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelVisualizarTGOrientador);
        painelVisualizarTGOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaTGOrientador_TelaVisualizarTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarTGOrientador_TelaVisualizarTGOrientador))
                    .addComponent(btnVisualizarTGOrientador_TelaVisualizarTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPesquisaTGOrientador_TelaVisualizarTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarTGOrientador_TelaVisualizarTGOrientador))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarTGOrientador_TelaVisualizarTGOrientador)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }                      

    public void telaTGOrientador(){
        painelVisualizarTGOrientador.removeAll();
        painelTGOrientador TGOrientador =  new painelTGOrientador();
        painelVisualizarTGOrientador.setLayout(new BorderLayout());
        painelVisualizarTGOrientador.add(TGOrientador.painelTGOrientador, BorderLayout.CENTER);
        painelVisualizarTGOrientador.validate();
    }
                    
    private javax.swing.JButton btnPesquisarTGOrientador_TelaVisualizarTGOrientador;
    private javax.swing.JButton btnVisualizarTGOrientador_TelaVisualizarTGOrientador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel painelVisualizarTGOrientador;
    private javax.swing.JScrollPane scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JTable tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JTextField txtPesquisaTGOrientador_TelaVisualizarTGOrientador;                 

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Visualizar".equals(e.getActionCommand()))
            telaTGOrientador();
    }
}