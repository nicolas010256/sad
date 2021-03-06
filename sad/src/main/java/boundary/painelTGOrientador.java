package boundary;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class painelTGOrientador implements ActionListener {

    public painelTGOrientador() {
        initComponents();
    }
                    
    private void initComponents() {

        painelTGOrientador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFecharTGOrientador_TelaTGOrientador = new javax.swing.JButton();
        painelFormTGOrientador_TelaTGOrientador = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTituloTGOrientador_TelaTGOrientador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTemaTGOrientador_TelaTGOrientador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        scrollTxtObjetivoTGOrientador_TelaTGOrientador = new javax.swing.JScrollPane();
        txtObjetivoTGOrientador_TelaTGOrientador = new javax.swing.JTextArea();
        scrollTxtReferenciasTGOrientador_TelaTGOrientador = new javax.swing.JScrollPane();
        txtReferenciasTGOrientador_TelaTGOrientador = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        scrollTbIntegrantesTGOrientador_TelaTGOrientador = new javax.swing.JScrollPane();
        tbIntegrantesTGOrientador_TelaTGOrientador = new javax.swing.JTable();
        scrollTbNotasTGOrientador_TelaTGOrientador = new javax.swing.JScrollPane();
        tbNotasTGOrientador_TelaTGOrientador = new javax.swing.JTable();
        btnAvaliarTGOrientador_TelaTGOrientador = new javax.swing.JButton();
        scrollTbDataBancaTGOrientador_TelaTGOrientador = new javax.swing.JScrollPane();
        tbDataBancaTGOrientador_TelaTGOrientador = new javax.swing.JTable();
        btnMarcarBancaTGOrientador_TelaTGOrientador = new javax.swing.JButton();
        btnAtividadesTGOrientador_TelaTGOrientador = new javax.swing.JButton();
        btnBaixarPDFTGOrientador_TelaTGOrientador = new javax.swing.JButton();

        painelTGOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelTGOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("TRABALHO DE GRADUAÇÃO ORIENTADOR");

        btnFecharTGOrientador_TelaTGOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnFecharTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnFecharTGOrientador_TelaTGOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnFecharTGOrientador_TelaTGOrientador.setText("Fechar");
        btnFecharTGOrientador_TelaTGOrientador.addActionListener(this);

        painelFormTGOrientador_TelaTGOrientador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("Título:");

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
        txtTituloTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtTituloTGOrientador_TelaTGOrientador.setText("Título do Trabalho");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Tema:");

        txtTemaTGOrientador_TelaTGOrientador.setEditable(false);
        txtTemaTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtTemaTGOrientador_TelaTGOrientador.setText("Tema do Trabalho");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setText("Objetivo do Trabalho de Graduação:");

        txtObjetivoTGOrientador_TelaTGOrientador.setEditable(false);
        txtObjetivoTGOrientador_TelaTGOrientador.setColumns(20);
        txtObjetivoTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtObjetivoTGOrientador_TelaTGOrientador.setRows(5);
        txtObjetivoTGOrientador_TelaTGOrientador.setText("Texto escrito pelo aluno");
        scrollTxtObjetivoTGOrientador_TelaTGOrientador.setViewportView(txtObjetivoTGOrientador_TelaTGOrientador);

        txtReferenciasTGOrientador_TelaTGOrientador.setEditable(false);
        txtReferenciasTGOrientador_TelaTGOrientador.setColumns(20);
        txtReferenciasTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtReferenciasTGOrientador_TelaTGOrientador.setRows(5);
        txtReferenciasTGOrientador_TelaTGOrientador.setText("Texto escrito pelo aluno");
        scrollTxtReferenciasTGOrientador_TelaTGOrientador.setViewportView(txtReferenciasTGOrientador_TelaTGOrientador);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setText("Referências:");

        tbIntegrantesTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 12));
        tbIntegrantesTGOrientador_TelaTGOrientador.setModel(new javax.swing.table.DefaultTableModel(
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
        tbIntegrantesTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        tbIntegrantesTGOrientador_TelaTGOrientador.setRowHeight(20);
        scrollTbIntegrantesTGOrientador_TelaTGOrientador.setViewportView(tbIntegrantesTGOrientador_TelaTGOrientador);

        tbNotasTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 12));
        tbNotasTGOrientador_TelaTGOrientador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Trabalho de Graduação - I", 8},
                {"Trabalho de Graduação - II", 9}
            },
            new String [] {
                "Disciplina", "Notas da Disciplina"
            }
        ));
        tbNotasTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        tbNotasTGOrientador_TelaTGOrientador.setRowHeight(20);
        scrollTbNotasTGOrientador_TelaTGOrientador.setViewportView(tbNotasTGOrientador_TelaTGOrientador);

        btnAvaliarTGOrientador_TelaTGOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnAvaliarTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnAvaliarTGOrientador_TelaTGOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnAvaliarTGOrientador_TelaTGOrientador.setText("Avaliar TG I - TG II");

        tbDataBancaTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 12));
        tbDataBancaTGOrientador_TelaTGOrientador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"DD / MM / AAAA", "HH : MM", "Sala X"}
            },
            new String [] {
                "Data da Banca", "Horário da Banca", "Local da Banca"
            }
        ));
        tbDataBancaTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        tbDataBancaTGOrientador_TelaTGOrientador.setRowHeight(28);
        scrollTbDataBancaTGOrientador_TelaTGOrientador.setViewportView(tbDataBancaTGOrientador_TelaTGOrientador);

        btnMarcarBancaTGOrientador_TelaTGOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnMarcarBancaTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnMarcarBancaTGOrientador_TelaTGOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnMarcarBancaTGOrientador_TelaTGOrientador.setText("Marcar Banca");
        btnMarcarBancaTGOrientador_TelaTGOrientador.addActionListener(this);

        btnAtividadesTGOrientador_TelaTGOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnAtividadesTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnAtividadesTGOrientador_TelaTGOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnAtividadesTGOrientador_TelaTGOrientador.setText("Atividades");
        btnAtividadesTGOrientador_TelaTGOrientador.addActionListener(this);

        btnBaixarPDFTGOrientador_TelaTGOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnBaixarPDFTGOrientador_TelaTGOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnBaixarPDFTGOrientador_TelaTGOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnBaixarPDFTGOrientador_TelaTGOrientador.setText("Baixar PDF");

        javax.swing.GroupLayout painelFormTGOrientador_TelaTGOrientadorLayout = new javax.swing.GroupLayout(painelFormTGOrientador_TelaTGOrientador);
        painelFormTGOrientador_TelaTGOrientador.setLayout(painelFormTGOrientador_TelaTGOrientadorLayout);
        painelFormTGOrientador_TelaTGOrientadorLayout.setHorizontalGroup(
            painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                                .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTemaTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                    .addComponent(txtTituloTGOrientador_TelaTGOrientador)))
                            .addComponent(scrollTxtReferenciasTGOrientador_TelaTGOrientador)
                            .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollTxtObjetivoTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollTbIntegrantesTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollTbNotasTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(btnAvaliarTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTbDataBancaTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(btnMarcarBancaTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtividadesTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaixarPDFTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        painelFormTGOrientador_TelaTGOrientadorLayout.setVerticalGroup(
            painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                        .addComponent(scrollTbIntegrantesTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollTbNotasTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvaliarTGOrientador_TelaTGOrientador)
                        .addGap(28, 28, 28)
                        .addComponent(scrollTbDataBancaTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMarcarBancaTGOrientador_TelaTGOrientador)
                        .addGap(31, 31, 31)
                        .addComponent(btnAtividadesTGOrientador_TelaTGOrientador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBaixarPDFTGOrientador_TelaTGOrientador))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createSequentialGroup()
                        .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTituloTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFormTGOrientador_TelaTGOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTemaTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollTxtObjetivoTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollTxtReferenciasTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelTGOrientador);
        painelTGOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFormTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharTGOrientador_TelaTGOrientador)))
                .addGap(20, 20, 20)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFecharTGOrientador_TelaTGOrientador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormTGOrientador_TelaTGOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(5, Short.MAX_VALUE))
        );

        tbDataBancaTGOrientador_TelaTGOrientador.setEnabled(false);
        tbIntegrantesTGOrientador_TelaTGOrientador.setEnabled(false);
        tbNotasTGOrientador_TelaTGOrientador.setEnabled(false);
    }                      

    public void telaVisualizarTGOrientador(){
        painelTGOrientador.removeAll();   
        painelTGOrientador.setLayout(new BorderLayout());
        painelTGOrientador.add(new painelVisualizarTGOrientador().painelVisualizarTGOrientador, BorderLayout.CENTER);
        painelTGOrientador.validate();
    }

    public void telaAtividadeOrientador(){
        JOptionPane.showOptionDialog(null,
				new painelAtividadeOrientador().painelAtividadeOrientador,
				"Atividade",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"OK", "Fechar Atividade"},
				"Cancel");
    }
    
    public void telaCriarAtividadeOrientador(){
        JOptionPane.showOptionDialog(null,
				new painelCriarAtividadeOrientador().painelCriarAtividadeOrientador,
				"Criar Atividade",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"OK"},
				"Cancel");
    }
    
    public void telaMarcarBancaOrientador(){
        JOptionPane.showOptionDialog(null,
				new painelMarcarBancaOrientador().painelMarcarBancaOrientador,
				"Marcar Banca",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Confirmar", "Cancelar"},
				"Cancel");
    }
                
    private javax.swing.JButton btnAtividadesTGOrientador_TelaTGOrientador;
    private javax.swing.JButton btnAvaliarTGOrientador_TelaTGOrientador;
    private javax.swing.JButton btnBaixarPDFTGOrientador_TelaTGOrientador;
    private javax.swing.JButton btnFecharTGOrientador_TelaTGOrientador;
    private javax.swing.JButton btnMarcarBancaTGOrientador_TelaTGOrientador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollTxtObjetivoTGOrientador_TelaTGOrientador;
    private javax.swing.JScrollPane scrollTxtReferenciasTGOrientador_TelaTGOrientador;
    private javax.swing.JPanel painelFormTGOrientador_TelaTGOrientador;
    public javax.swing.JPanel painelTGOrientador;
    private javax.swing.JScrollPane scrollTbIntegrantesTGOrientador_TelaTGOrientador;
    private javax.swing.JScrollPane scrollTbNotasTGOrientador_TelaTGOrientador;
    private javax.swing.JScrollPane scrollTbDataBancaTGOrientador_TelaTGOrientador;
    private javax.swing.JTable tbDataBancaTGOrientador_TelaTGOrientador;
    private javax.swing.JTable tbIntegrantesTGOrientador_TelaTGOrientador;
    private javax.swing.JTable tbNotasTGOrientador_TelaTGOrientador;
    private javax.swing.JTextArea txtObjetivoTGOrientador_TelaTGOrientador;
    private javax.swing.JTextArea txtReferenciasTGOrientador_TelaTGOrientador;
    private javax.swing.JTextField txtTemaTGOrientador_TelaTGOrientador;
    private javax.swing.JTextField txtTituloTGOrientador_TelaTGOrientador;                

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Fechar".equals(e.getActionCommand()))
            telaVisualizarTGOrientador();
        
        if ("Atividades".equals(e.getActionCommand()))
            //telaAtividadeOrientador();        //Com atividade cadastrada
            telaCriarAtividadeOrientador();     //Sem atividade cadastrada
        
        if ("Marcar Banca".equals(e.getActionCommand()))
            telaMarcarBancaOrientador();
    }
}
