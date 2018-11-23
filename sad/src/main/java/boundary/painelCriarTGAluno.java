package boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.TipoTrabalhoController;
import entity.TipoTrabalho;

public class painelCriarTGAluno implements ActionListener{
    private javax.swing.JButton btnAdicionarOrientador;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConvidarAluno;
    private JTextField txtTema;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelFormCriarTGAluno;
    public javax.swing.JPanel painelCriarTGAluno;
    private javax.swing.JScrollPane scrollObjetivoTG_TelaCriarTG;
    private javax.swing.JScrollPane scrollReferenciasTG_TelaCriarTG;
    private javax.swing.JScrollPane scrollTbIntegranteTG_TelaCriarTG;
    private javax.swing.JScrollPane scrollTbOrientadorTG_TelaCriarTG;
    private javax.swing.JTable tbIntegranteTG_TelaCriarTG;
    private javax.swing.JTable tbOrientadorTG_TelaCriarTG;
    private javax.swing.JTextArea txtObjetivoTG_TelaCriarTG;
    private javax.swing.JTextArea txtReferenciasTG_TelaCriarTG;
    private javax.swing.JTextField txtTituloTG_TelaCriarTG;

    public painelCriarTGAluno() {
        initComponents();

        TipoTrabalhoController ttController = new TipoTrabalhoController();
        List<TipoTrabalho> tipos = ttController.getAll();
        DefaultComboBoxModel model = new DefaultComboBoxModel<String>();
        for (TipoTrabalho tipo : tipos) {
            model.addElement(tipo.getNome());
        }
        cbTipo.setModel(model);
    }
                         
    public void initComponents() {
        painelCriarTGAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelFormCriarTGAluno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTema = new JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTituloTG_TelaCriarTG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        scrollObjetivoTG_TelaCriarTG = new javax.swing.JScrollPane();
        txtObjetivoTG_TelaCriarTG = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        scrollReferenciasTG_TelaCriarTG = new javax.swing.JScrollPane();
        txtReferenciasTG_TelaCriarTG = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        scrollTbIntegranteTG_TelaCriarTG = new javax.swing.JScrollPane();
        tbIntegranteTG_TelaCriarTG = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnConvidarAluno = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        scrollTbOrientadorTG_TelaCriarTG = new javax.swing.JScrollPane();
        tbOrientadorTG_TelaCriarTG = new javax.swing.JTable();
        btnAdicionarOrientador = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        painelCriarTGAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelCriarTGAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("CRIAR TRABALHO DE GRADUAÇÃO");

        painelFormCriarTGAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        painelFormCriarTGAluno.setPreferredSize(new java.awt.Dimension(943, 441));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("Tipo do Trabalho de Graduação:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Tema:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setText("Título:");

        txtTituloTG_TelaCriarTG.setFont(new java.awt.Font("Arial", 0, 14));
        txtTituloTG_TelaCriarTG.setText("Digite um título para o trabalho");
        txtTituloTG_TelaCriarTG.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setText("Objetivo do Trabalho de Graduação:");

        txtObjetivoTG_TelaCriarTG.setColumns(20);
        txtObjetivoTG_TelaCriarTG.setFont(new java.awt.Font("Arial", 0, 14)); 
        txtObjetivoTG_TelaCriarTG.setRows(5);
        scrollObjetivoTG_TelaCriarTG.setViewportView(txtObjetivoTG_TelaCriarTG);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel6.setText("Referências:");

        txtReferenciasTG_TelaCriarTG.setColumns(20);
        txtReferenciasTG_TelaCriarTG.setFont(new java.awt.Font("Arial", 0, 14));
        txtReferenciasTG_TelaCriarTG.setRows(5);
        scrollReferenciasTG_TelaCriarTG.setViewportView(txtReferenciasTG_TelaCriarTG);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel7.setText("Adicione integrantes:");

        tbIntegranteTG_TelaCriarTG.setFont(new java.awt.Font("Arial", 0, 12));
        // tbIntegranteTG_TelaCriarTG.setModel(new javax.swing.table.DefaultTableModel(
        //     new Object [][] {
        //         {"Nome do Integrante 01", "Excluir"},
        //         {"Nome do Integrante 02", "Excluir"},
        //         {"Nome do Integrante 03", "Excluir"},
        //         {"Nome do Integrante 04", "Excluir"}
        //     },
        //     new String [] {
        //         "Integrantes", ""
        //     }
        // ));
        tbIntegranteTG_TelaCriarTG.setFont(new java.awt.Font("Arial", 0, 14));
        tbIntegranteTG_TelaCriarTG.setRowHeight(20);
        scrollTbIntegranteTG_TelaCriarTG.setViewportView(tbIntegranteTG_TelaCriarTG);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnConvidarAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnConvidarAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnConvidarAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnConvidarAluno.setText("Convidar Aluno");
        btnConvidarAluno.addActionListener(this);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel8.setText("Adicione opções para orientadores:");

        tbOrientadorTG_TelaCriarTG.setFont(new java.awt.Font("Arial", 0, 12));
        // tbOrientadorTG_TelaCriarTG.setModel(new javax.swing.table.DefaultTableModel(
        //     new Object [][] {
        //         {"Nome do Orientador 01", "Excluir"},
        //         {"Nome do Orientador 02", "Excluir"},
        //         {"Nome do Orientador 03", "Excluir"}
        //     },
        //     new String [] {
        //         "Orientadores", ""
        //     }
        // ));
        tbOrientadorTG_TelaCriarTG.setFont(new java.awt.Font("Arial", 0, 14));
        tbOrientadorTG_TelaCriarTG.setRowHeight(20);
        scrollTbOrientadorTG_TelaCriarTG.setViewportView(tbOrientadorTG_TelaCriarTG);

        btnAdicionarOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnAdicionarOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnAdicionarOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarOrientador.setText("Adicionar Orientador");
        btnAdicionarOrientador.addActionListener(this);

        btnConfirmar.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 14));
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Arial", 0, 14));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout painelFormCriarTGAlunoLayout = new javax.swing.GroupLayout(painelFormCriarTGAluno);
        painelFormCriarTGAluno.setLayout(painelFormCriarTGAlunoLayout);
        painelFormCriarTGAlunoLayout.setHorizontalGroup(
            painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormCriarTGAlunoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormCriarTGAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFormCriarTGAlunoLayout.createSequentialGroup()
                        .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTituloTG_TelaCriarTG, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(txtTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel5)
                    .addComponent(scrollObjetivoTG_TelaCriarTG, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormCriarTGAlunoLayout.createSequentialGroup()
                        .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(scrollReferenciasTG_TelaCriarTG)
                                .addComponent(scrollTbIntegranteTG_TelaCriarTG, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                                .addComponent(btnConvidarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(scrollTbOrientadorTG_TelaCriarTG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnAdicionarOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormCriarTGAlunoLayout.createSequentialGroup()
                        .addComponent(btnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(25, 25, 25))))
        );
        painelFormCriarTGAlunoLayout.setVerticalGroup(
            painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormCriarTGAlunoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelFormCriarTGAlunoLayout.createSequentialGroup()
                        .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormCriarTGAlunoLayout.createSequentialGroup()
                                .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtTituloTG_TelaCriarTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollObjetivoTG_TelaCriarTG, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFormCriarTGAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollReferenciasTG_TelaCriarTG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(1, 1, 1)
                                .addComponent(scrollTbIntegranteTG_TelaCriarTG, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnConvidarAluno)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(1, 1, 1)
                                .addComponent(scrollTbOrientadorTG_TelaCriarTG, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionarOrientador)
                                .addGap(10, 10, 10)
                                .addGroup(painelFormCriarTGAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnConfirmar)
                                    .addComponent(btnCancelar))))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelCriarTGAluno);
        painelCriarTGAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(painelFormCriarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormCriarTGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }                    

    
    public void telaAdicionarIntegranteAluno(){
        JOptionPane.showOptionDialog(null,
				new painelAdicionarIntegranteAluno().painelAdicionarIntegranteAluno,
				"CONVIDAR ALUNO",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Convidar", "Cancelar"},
				"Cancel");
    }
    
    public void telaAdicionarOrientador(){
        JOptionPane.showOptionDialog(null,
				new painelAdicionarOrientador().painelAdicionarOrientador,
				"CONVIDAR ORIENTADOR",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Convidar", "Cancelar"},
				"Cancel");
    }
              
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Convidar Aluno".equals(e.getActionCommand()))
            telaAdicionarIntegranteAluno();
        
        if ("Adicionar Orientador".equals(e.getActionCommand()))
            telaAdicionarOrientador();
    }
}
