package boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aquario
 */
public class painelVisualizarTGAluno implements ActionListener{

    /**
     * Creates new form painelCriarTGAluno
     */
    public painelVisualizarTGAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        painelVisualizarTGAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelFormVisualizarTGAluno_TelaVisualizarTGAluno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTituloTGOrientador_TelaTGOrientador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTituloTGAluno_TelaVisualizarTGAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        scrollTxtObjetivoTGAluno_TelaVisualizarTGAluno = new javax.swing.JScrollPane();
        txtObjetivoTGAluno_TelaVisualizarTGAluno = new javax.swing.JTextArea();
        scrollTxtReferenciaTGAluno_TelaVisualizarTGAluno = new javax.swing.JScrollPane();
        txtReferenciaTGAluno_TelaVisualizarTGAluno = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        scrollTbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno = new javax.swing.JScrollPane();
        tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno = new javax.swing.JTable();
        btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno = new javax.swing.JButton();
        btnSairTrabalhoTGAluno_TelaVisualizarTGAluno = new javax.swing.JButton();
        btnConsultarBancaTGAluno_TelaVisualizarTGAluno = new javax.swing.JButton();
        btnEnviarPDFTGAluno_TelaVisualizarTGAluno = new javax.swing.JButton();
        btnAlterarOrientador_TelaVisualizarTGAluno = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTemaTGAluno_TelaVisualizarTGAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPalavraChaveTGAluno_TelaVisualizarTGAluno = new javax.swing.JTextField();
        btnEditarDescricaoTG_TelaVisualizarTGAluno = new javax.swing.JButton();
        btnSairGrupoTGAluno_TelaVisualizarTGAluno = new javax.swing.JButton();

        painelVisualizarTGAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelVisualizarTGAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("TRABALHO DE GRADUAÇÃO");

        painelFormVisualizarTGAluno_TelaVisualizarTGAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Orientador:");
        jLabel2.setName(""); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        txtTituloTGOrientador_TelaTGOrientador.setEditable(false);
        txtTituloTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTituloTGOrientador_TelaTGOrientador.setText("Nome do Orientador");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Título:");

        txtTituloTGAluno_TelaVisualizarTGAluno.setEditable(false);
        txtTituloTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTituloTGAluno_TelaVisualizarTGAluno.setText("Título do Trabalho");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Objetivo do Trabalho de Graduação:");

        txtObjetivoTGAluno_TelaVisualizarTGAluno.setEditable(false);
        txtObjetivoTGAluno_TelaVisualizarTGAluno.setColumns(20);
        txtObjetivoTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtObjetivoTGAluno_TelaVisualizarTGAluno.setRows(5);
        txtObjetivoTGAluno_TelaVisualizarTGAluno.setText("Texto escrito pelo aluno");
        scrollTxtObjetivoTGAluno_TelaVisualizarTGAluno.setViewportView(txtObjetivoTGAluno_TelaVisualizarTGAluno);
        txtObjetivoTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("txtObjetivoTGAluno_TelaVisualizarTGAluno");

        txtReferenciaTGAluno_TelaVisualizarTGAluno.setEditable(false);
        txtReferenciaTGAluno_TelaVisualizarTGAluno.setColumns(20);
        txtReferenciaTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtReferenciaTGAluno_TelaVisualizarTGAluno.setRows(5);
        txtReferenciaTGAluno_TelaVisualizarTGAluno.setText("Texto escrito pelo aluno");
        scrollTxtReferenciaTGAluno_TelaVisualizarTGAluno.setViewportView(txtReferenciaTGAluno_TelaVisualizarTGAluno);
        txtReferenciaTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("txtReferenciaTGAluno_TelaVisualizarTGAluno");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Referências:");

        tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nome do Integrante 01"},
                {"Nome do Integrante 02"},
                {"Nome do Integrante 03"},
                {"Nome do Integrante 04"}
            },
            new String [] {
                "Integrantes"
            }
        ));
        tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14));
        tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno.setRowHeight(20);
        tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno.setEnabled(false);
        scrollTbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno.setViewportView(tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno);
        tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno");

        btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno.setText("Adicionar Integrante");
        btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno.addActionListener(this);

        btnSairTrabalhoTGAluno_TelaVisualizarTGAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnSairTrabalhoTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSairTrabalhoTGAluno_TelaVisualizarTGAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnSairTrabalhoTGAluno_TelaVisualizarTGAluno.setText("Sair do Trabalho");
        btnSairTrabalhoTGAluno_TelaVisualizarTGAluno.addActionListener(this);

        btnConsultarBancaTGAluno_TelaVisualizarTGAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultarBancaTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConsultarBancaTGAluno_TelaVisualizarTGAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarBancaTGAluno_TelaVisualizarTGAluno.setText("Consultar Banca");
        btnConsultarBancaTGAluno_TelaVisualizarTGAluno.addActionListener(this);

        btnEnviarPDFTGAluno_TelaVisualizarTGAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnEnviarPDFTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEnviarPDFTGAluno_TelaVisualizarTGAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarPDFTGAluno_TelaVisualizarTGAluno.setText("Enviar PDF");

        btnAlterarOrientador_TelaVisualizarTGAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnAlterarOrientador_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterarOrientador_TelaVisualizarTGAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarOrientador_TelaVisualizarTGAluno.setText("Alterar Orientador");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Tema:");

        txtTemaTGAluno_TelaVisualizarTGAluno.setEditable(false);
        txtTemaTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTemaTGAluno_TelaVisualizarTGAluno.setText("Tema do Trabalho");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Palavras Chaves:");

        txtPalavraChaveTGAluno_TelaVisualizarTGAluno.setEditable(false);
        txtPalavraChaveTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPalavraChaveTGAluno_TelaVisualizarTGAluno.setText("Texto escrito pelo aluno");

        btnEditarDescricaoTG_TelaVisualizarTGAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarDescricaoTG_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEditarDescricaoTG_TelaVisualizarTGAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarDescricaoTG_TelaVisualizarTGAluno.setText("Editar Descrição");

        btnSairGrupoTGAluno_TelaVisualizarTGAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnSairGrupoTGAluno_TelaVisualizarTGAluno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSairGrupoTGAluno_TelaVisualizarTGAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnSairGrupoTGAluno_TelaVisualizarTGAluno.setText("Sair do Grupo");
        btnSairGrupoTGAluno_TelaVisualizarTGAluno.setActionCommand("");

        javax.swing.GroupLayout painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout = new javax.swing.GroupLayout(painelFormVisualizarTGAluno_TelaVisualizarTGAluno);
        painelFormVisualizarTGAluno_TelaVisualizarTGAluno.setLayout(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout);
        painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.setHorizontalGroup(
            painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                //.addGap(15, 15, 15)
                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)
                        .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemaTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPalavraChaveTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(scrollTxtReferenciaTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollTxtObjetivoTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(btnEditarDescricaoTG_TelaVisualizarTGAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTituloTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterarOrientador_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollTbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSairTrabalhoTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarBancaTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnviarPDFTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                        .addComponent(btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSairGrupoTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.setVerticalGroup(
            painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                        .addComponent(scrollTbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno)
                            .addComponent(btnSairGrupoTGAluno_TelaVisualizarTGAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviarPDFTGAluno_TelaVisualizarTGAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSairTrabalhoTGAluno_TelaVisualizarTGAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultarBancaTGAluno_TelaVisualizarTGAluno)
                        .addGap(10, 10, 10))
                    .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                        .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createSequentialGroup()
                                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTituloTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAlterarOrientador_TelaVisualizarTGAluno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTituloTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTemaTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollTxtObjetivoTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollTxtReferenciaTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(painelFormVisualizarTGAluno_TelaVisualizarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtPalavraChaveTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditarDescricaoTG_TelaVisualizarTGAluno))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(5, Short.MAX_VALUE))))
        );

        txtTituloTGOrientador_TelaTGOrientador.getAccessibleContext().setAccessibleName("txtTituloTGOrientador_TelaTGOrientador");
        txtTituloTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("txtTituloTGAluno_TelaVisualizarTGAluno");
        btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno");
        btnSairTrabalhoTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("btnSairTrabalhoTGAluno_TelaVisualizarTGAluno");
        btnConsultarBancaTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("btnConsultarBancaTGAluno_TelaVisualizarTGAluno");
        btnEnviarPDFTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("btnEnviarPDFTGAluno_TelaVisualizarTGAluno");
        btnAlterarOrientador_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("btnAlterarOrientador_TelaVisualizarTGAluno");
        txtTemaTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("txtTemaTGAluno_TelaVisualizarTGAluno");
        txtPalavraChaveTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("txtPalavraChaveTGAluno_TelaVisualizarTGAluno");
        btnEditarDescricaoTG_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("btnEditarDescricaoTG_TelaVisualizarTGAluno");
        btnSairGrupoTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("btnSairGrupoTGAluno_TelaVisualizarTGAluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelVisualizarTGAluno);
        painelVisualizarTGAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFormVisualizarTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormVisualizarTGAluno_TelaVisualizarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblCriarTG");
        painelFormVisualizarTGAluno_TelaVisualizarTGAluno.getAccessibleContext().setAccessibleName("painelFormVisualizarTGAluno_TelaVisualizarTGAluno");

        painelVisualizarTGAluno.getAccessibleContext().setAccessibleName("painelVisualizarTGAluno");
    }// </editor-fold>                        

    public void telaConsultarBancaAluno(){
        JOptionPane.showOptionDialog(null, // parent
				new painelConsultarBancaAluno().painelConsultarBancaAluno,                                                    // object
				"Banca",                                                         // title
				JOptionPane.DEFAULT_OPTION,                 // option type
				JOptionPane.QUESTION_MESSAGE,           // message type
				new ImageIcon(),                                                           // icon
				new String[] {"OK"},			          // options[]
				"Cancel");
    }
    
    public void telaSairTrabalhoAluno(){
        JOptionPane.showOptionDialog(null, // parent
				new painelSairTrabalhoAluno().painelSairTrabalhoAluno,                                                    // object
				"Sair do Trabalho",                                                         // title
				JOptionPane.DEFAULT_OPTION,                 // option type
				JOptionPane.ERROR_MESSAGE,           // message type
				null,                                                           // icon
				new String[] {"Confirmar", "Cancelar"},			          // options[]
				"Cancel");
    }
    
    public void telaAdicionarIntegranteAluno(){
        JOptionPane.showOptionDialog(null, // parent
				new painelAdicionarIntegranteAluno().painelAdicionarIntegranteAluno,                                                    // object
				"CONVIDAR ALUNO",                                                         // title
				JOptionPane.DEFAULT_OPTION,                 // option type
				JOptionPane.QUESTION_MESSAGE,           // message type
				new ImageIcon(),                                                           // icon
				new String[] {"Convidar", "Cancelar"},			          // options[]
				"Cancel");
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdicionarIntegranteTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JButton btnAlterarOrientador_TelaVisualizarTGAluno;
    private javax.swing.JButton btnConsultarBancaTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JButton btnEditarDescricaoTG_TelaVisualizarTGAluno;
    private javax.swing.JButton btnEnviarPDFTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JButton btnSairGrupoTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JButton btnSairTrabalhoTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollTxtObjetivoTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JScrollPane scrollTxtReferenciaTGAluno_TelaVisualizarTGAluno;
    public javax.swing.JPanel painelVisualizarTGAluno;
    private javax.swing.JPanel painelFormVisualizarTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JScrollPane scrollTbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JTable tbIntegrantesVisualizarTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JTextArea txtObjetivoTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JTextField txtPalavraChaveTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JTextArea txtReferenciaTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JTextField txtTemaTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JTextField txtTituloTGAluno_TelaVisualizarTGAluno;
    private javax.swing.JTextField txtTituloTGOrientador_TelaTGOrientador;
    // End of variables declaration                   

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Consultar Banca".equals(e.getActionCommand()))
            telaConsultarBancaAluno();
        
        if ("Sair do Trabalho".equals(e.getActionCommand()))
            telaSairTrabalhoAluno();
        
        if ("Adicionar Integrante".equals(e.getActionCommand()))
            telaAdicionarIntegranteAluno();
    }
}