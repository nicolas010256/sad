package boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class painelVisualizarAreaAtuacaoOrientador implements ActionListener{

    public painelVisualizarAreaAtuacaoOrientador() {
        initComponents();
    }
                        
    private void initComponents() {

        painelVisualizarAreaAtuacaoOrientador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisaAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador = new javax.swing.JTextField();
        btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador = new javax.swing.JButton();
        scrollAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador = new javax.swing.JScrollPane();
        tbAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador = new javax.swing.JTable();
        btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador = new javax.swing.JButton();
        btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador = new javax.swing.JButton();
        btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador = new javax.swing.JButton();

        painelVisualizarAreaAtuacaoOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelVisualizarAreaAtuacaoOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("VISUALIZAR ÁREAS DE ATUAÇÃO");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setText("Pesquisa:");

        txtPesquisaAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtPesquisaAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setText("Descrição");

        btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setText("Pesquisar");

        tbAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"},
                {"Área de Atuação X"}
            },
            new String [] {
                "Descrição"
            }
        ));
        tbAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        tbAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setRowHeight(40);
        scrollAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setViewportView(tbAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador);

        btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setText("Editar");
        
        btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setText("Excluir");
        
        btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador.setText("Adicionar");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelVisualizarAreaAtuacaoOrientador);
        painelVisualizarAreaAtuacaoOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtPesquisaAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador)
                .addComponent(btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador)
                .addComponent(btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }                    
                  
    private javax.swing.JButton btnPesquisarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador;
    private javax.swing.JButton btnEditarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador;
    private javax.swing.JButton btnAdicionarAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador;
    private javax.swing.JButton btnExcluirAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel painelVisualizarAreaAtuacaoOrientador;
    private javax.swing.JScrollPane scrollAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador;
    private javax.swing.JTable tbAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador;
    private javax.swing.JTextField txtPesquisaAreaAtuacaoOrientador_TelaVisualizarAreaAtuacaoOrientador;                

    @Override
    public void actionPerformed(ActionEvent e) {
        //if ("Criar Área".equals(e.getActionCommand())){}
            
    }
}