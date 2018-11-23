package boundary;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class painelCriarPerfilOrientador implements ActionListener{

    public painelCriarPerfilOrientador() {
        initComponents();
    }
                        
    private void initComponents() {

        painelCriarPerfilOrientador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelFormCriarPerfilOrientador = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEditarEmailOrientador_TelaCriarPerfilOrientador = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeOrientador_TelaCriarPerfilOrientador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCPFOrientador_TelaCriarPerfilOrientador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmailOrientador_TelaCriarPerfilOrientador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenhaOrientador_TelaCriarPerfilOrientador = new javax.swing.JTextField();
        btnEditarSenhaOrientador_TelaCriarPerfilOrientador = new javax.swing.JButton();
        scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador = new javax.swing.JScrollPane();
        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador = new javax.swing.JTable();
        btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador = new javax.swing.JButton();
        btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador = new javax.swing.JButton();
        btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador = new javax.swing.JButton();

        painelCriarPerfilOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelCriarPerfilOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("VISUALIZAR PERFIL");

        painelFormCriarPerfilOrientador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        painelFormCriarPerfilOrientador.setPreferredSize(new java.awt.Dimension(943, 441));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel2.setText("Dados Pessoais e de Acesso");

        btnEditarEmailOrientador_TelaCriarPerfilOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarEmailOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnEditarEmailOrientador_TelaCriarPerfilOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEmailOrientador_TelaCriarPerfilOrientador.setText("Editar E-mail");
        btnEditarEmailOrientador_TelaCriarPerfilOrientador.addActionListener(this);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Nome:");

        txtNomeOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtNomeOrientador_TelaCriarPerfilOrientador.setText("Nome do orientador");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setText("CPF:");

        txtCPFOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtCPFOrientador_TelaCriarPerfilOrientador.setText("000.000.000./00");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel6.setText("E-mail:");

        txtEmailOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtEmailOrientador_TelaCriarPerfilOrientador.setText("email_do_orientador@email.com");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel7.setText("Senha:");

        txtSenhaOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtSenhaOrientador_TelaCriarPerfilOrientador.setText("***************");

        btnEditarSenhaOrientador_TelaCriarPerfilOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarSenhaOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnEditarSenhaOrientador_TelaCriarPerfilOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarSenhaOrientador_TelaCriarPerfilOrientador.setText("Editar Senha");
        btnEditarSenhaOrientador_TelaCriarPerfilOrientador.addActionListener(this);

        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Área de Atuação 01"},
                {"Área de Atuação 02"},
                {"Área de Atuação 03"},
                {"Área de Atuação 04"}
            },
            new String [] {
                "Área de Atuação"
            }
        ));
        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setRowHeight(25);
        scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setViewportView(tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador);

        btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setText("Excluir");

        btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setText("Adicionar");

        btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.setText("Criar Área");
        btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador.addActionListener(this);

        javax.swing.GroupLayout painelFormCriarPerfilOrientadorLayout = new javax.swing.GroupLayout(painelFormCriarPerfilOrientador);
        painelFormCriarPerfilOrientador.setLayout(painelFormCriarPerfilOrientadorLayout);
        painelFormCriarPerfilOrientadorLayout.setHorizontalGroup(
            painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(txtEmailOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnEditarEmailOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCPFOrientador_TelaCriarPerfilOrientador))
                            .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeOrientador_TelaCriarPerfilOrientador))
                            .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSenhaOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnEditarSenhaOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                                .addComponent(btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGap(25, 25, 25))
        );
        painelFormCriarPerfilOrientadorLayout.setVerticalGroup(
            painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormCriarPerfilOrientadorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCPFOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmailOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarEmailOrientador_TelaCriarPerfilOrientador))
                .addGap(18, 18, 18)
                .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSenhaOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarSenhaOrientador_TelaCriarPerfilOrientador))
                .addGap(37, 37, 37)
                .addComponent(scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormCriarPerfilOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador)
                    .addComponent(btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador)
                    .addComponent(btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelCriarPerfilOrientador);
        painelCriarPerfilOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(painelFormCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormCriarPerfilOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCPFOrientador_TelaCriarPerfilOrientador.setEditable(false);
        txtEmailOrientador_TelaCriarPerfilOrientador.setEditable(false);
        txtNomeOrientador_TelaCriarPerfilOrientador.setEditable(false);
        txtSenhaOrientador_TelaCriarPerfilOrientador.setEditable(false);
    }              

    public void telaAdicionarAreaAtuacaoOrientador(){        
        painelCriarPerfilOrientador.removeAll();
        painelCriarPerfilOrientador.setLayout(new BorderLayout());
        painelCriarPerfilOrientador.add(new painelVisualizarAreaAtuacaoOrientador().painelVisualizarAreaAtuacaoOrientador, BorderLayout.CENTER);
        painelCriarPerfilOrientador.validate();
        telaAdicionarAreaOrientador();
    }
    
    public void telaAdicionarAreaOrientador(){
        JOptionPane.showOptionDialog(null,
				new painelAdicionarAreaOrientador().painelAdicionarAreaOrientador,
				"Adicionar Área de Atuação",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Confirmar", "Cancelar"},
				"Cancel");
    }
    
    public void telaEditarEmailOrientador(){
        JOptionPane.showOptionDialog(null,
				new painelEditarEmailOrientador().painelEditarEmailOrientador,
				"Editar E-mail",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Confirmar", "Cancelar"},
				"Cancel");
    }
    
    public void telaEditarSenhaOrientador(){
        JOptionPane.showOptionDialog(null,
				new painelEditarSenhaOrientador().painelEditarSenhaOrientador,
				"Editar Senha do Usuário",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(),
				new String[] {"Confirmar", "Cancelar"},
				"Cancel");
    }
                 
    private javax.swing.JButton btnAdicionarAreaAtuacaoOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JButton btnCriarAreaAtuacaoOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JButton btnEditarEmailOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JButton btnEditarSenhaOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JButton btnExcluirAreaAtuacaoOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane scrollAreaAtuacaoOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JPanel painelFormCriarPerfilOrientador;
    public javax.swing.JPanel painelCriarPerfilOrientador;
    private javax.swing.JTable tbAreaAtuacaoOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JTextField txtCPFOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JTextField txtEmailOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JTextField txtNomeOrientador_TelaCriarPerfilOrientador;
    private javax.swing.JTextField txtSenhaOrientador_TelaCriarPerfilOrientador;               

    @Override
    public void actionPerformed(ActionEvent e) {
         if ("Criar Área".equals(e.getActionCommand()))
            telaAdicionarAreaAtuacaoOrientador();
         
         if ("Editar E-mail".equals(e.getActionCommand()))
            telaEditarEmailOrientador();
         
         if ("Editar Senha".equals(e.getActionCommand()))
            telaEditarSenhaOrientador();
    }
}
