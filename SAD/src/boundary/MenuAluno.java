package boundary;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MenuAluno extends javax.swing.JFrame implements ActionListener {
  
    public MenuAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
                    
    private void initComponents() {

        painelAlunoMenu = new javax.swing.JPanel();
        lblFotoAlunoMenu = new javax.swing.JLabel();
        lblPerfilAlunoMenu = new javax.swing.JLabel();
        lblNomeAlunoMenu = new javax.swing.JLabel();
        btnPerfilMenuAluno = new javax.swing.JButton();
        btnNotificacoesMenuAluno = new javax.swing.JButton();
        btnTGMenuAluno = new javax.swing.JButton();
        btnSairMenuAluno = new javax.swing.JButton();
        painelPrincipalAluno = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA ACADEMICO DE DESENVOLVIMENTO DE TRABALHOS DE GRADUAÇÃO - SAD");
        setPreferredSize(new java.awt.Dimension(1260, 600));

        painelAlunoMenu.setBackground(new java.awt.Color(102, 102, 102));

        lblFotoAlunoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/fotoAluno.png")));

        lblPerfilAlunoMenu.setFont(new java.awt.Font("Arial Black", 0, 14));
        lblPerfilAlunoMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfilAlunoMenu.setText("Aluno");

        lblNomeAlunoMenu.setFont(new java.awt.Font("Arial", 0, 14));
        lblNomeAlunoMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeAlunoMenu.setText("Nome do Aluno");

        btnPerfilMenuAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnPerfilMenuAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnPerfilMenuAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfilMenuAluno.setText("Perfil");
        btnPerfilMenuAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnPerfilMenuAluno.setFocusPainted(false);
        btnPerfilMenuAluno.setFocusable(false);
        btnPerfilMenuAluno.addActionListener(this);

        btnNotificacoesMenuAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnNotificacoesMenuAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnNotificacoesMenuAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnNotificacoesMenuAluno.setText("Notificações");
        btnNotificacoesMenuAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnNotificacoesMenuAluno.setFocusPainted(false);
        btnNotificacoesMenuAluno.setFocusable(false);
        btnNotificacoesMenuAluno.addActionListener(this);

        btnTGMenuAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnTGMenuAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnTGMenuAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnTGMenuAluno.setText("Trabalho de Graduação");
        btnTGMenuAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnTGMenuAluno.setFocusPainted(false);
        btnTGMenuAluno.setFocusable(false);
        btnTGMenuAluno.addActionListener(this);

        btnSairMenuAluno.setBackground(new java.awt.Color(102, 102, 102));
        btnSairMenuAluno.setFont(new java.awt.Font("Arial", 0, 14));
        btnSairMenuAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnSairMenuAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnSairMenuAluno.setFocusPainted(false);
        btnSairMenuAluno.setFocusable(false);
        btnSairMenuAluno.setText("Sair");;
        btnSairMenuAluno.addActionListener(this);

        javax.swing.GroupLayout painelAlunoMenuLayout = new javax.swing.GroupLayout(painelAlunoMenu);
        painelAlunoMenu.setLayout(painelAlunoMenuLayout);
        painelAlunoMenuLayout.setHorizontalGroup(
            painelAlunoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlunoMenuLayout.createSequentialGroup()
                .addGroup(painelAlunoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlunoMenuLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblFotoAlunoMenu))
                    .addGroup(painelAlunoMenuLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblPerfilAlunoMenu))
                    .addGroup(painelAlunoMenuLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblNomeAlunoMenu)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(btnPerfilMenuAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNotificacoesMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTGMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSairMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelAlunoMenuLayout.setVerticalGroup(
            painelAlunoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlunoMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblFotoAlunoMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPerfilAlunoMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeAlunoMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPerfilMenuAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotificacoesMenuAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTGMenuAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                .addComponent(btnSairMenuAluno)
                .addContainerGap())
        );

        lblFotoAlunoMenu.getAccessibleContext().setAccessibleName("lblFotoAlunoMenu");
        lblPerfilAlunoMenu.getAccessibleContext().setAccessibleName("lblAlunoMenu");
        lblNomeAlunoMenu.getAccessibleContext().setAccessibleName("lblNomeAlunoMenu");
        btnPerfilMenuAluno.getAccessibleContext().setAccessibleName("btnPerfilMenuAluno");
        btnNotificacoesMenuAluno.getAccessibleContext().setAccessibleName("btnNotificaçõesMenuAluno");
        btnTGMenuAluno.getAccessibleContext().setAccessibleName("btnTGMenuAluno");
        btnSairMenuAluno.getAccessibleContext().setAccessibleName("btnSairMenuAluno");

        painelPrincipalAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipalAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        painelPrincipalAluno.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout painelPrincipalAlunoLayout = new javax.swing.GroupLayout(painelPrincipalAluno);
        painelPrincipalAluno.setLayout(painelPrincipalAlunoLayout);
        painelPrincipalAlunoLayout.setHorizontalGroup(
            painelPrincipalAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 923, Short.MAX_VALUE)
        );
        painelPrincipalAlunoLayout.setVerticalGroup(
            painelPrincipalAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelAlunoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(painelPrincipalAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAlunoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(painelPrincipalAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }             

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAluno().setVisible(true);
            }
        });        
        
    }
    
    public void telaCriarTGAluno(){
        painelPrincipalAluno.removeAll();
        painelCriarTGAluno criarTGAluno =  new painelCriarTGAluno();
        painelPrincipalAluno.setLayout(new BorderLayout());
        painelPrincipalAluno.add(criarTGAluno.painelCriarTGAluno, BorderLayout.CENTER);
        painelPrincipalAluno.validate();
    }
    
    public void telaVisualizarTGAluno(){
        painelPrincipalAluno.removeAll();
        painelVisualizarTGAluno visualizarTGAluno =  new painelVisualizarTGAluno();
        painelPrincipalAluno.setLayout(new BorderLayout());
        painelPrincipalAluno.add(visualizarTGAluno.painelVisualizarTGAluno, BorderLayout.CENTER);
        painelPrincipalAluno.validate();
    }
    
    public void telaCriarPerfilAluno(){
        painelPrincipalAluno.removeAll();
        painelCriarPerfilAluno criarPerfilAluno =  new painelCriarPerfilAluno();
        painelPrincipalAluno.setLayout(new BorderLayout());
        painelPrincipalAluno.add(criarPerfilAluno.painelCriarPerfilAluno, BorderLayout.CENTER);
        painelPrincipalAluno.validate();
    }
    
    public void telaNotificacaoAluno(){
        painelPrincipalAluno.removeAll();
        painelNotificacaoAluno notificacaoAluno =  new painelNotificacaoAluno();
        painelPrincipalAluno.setLayout(new BorderLayout());
        painelPrincipalAluno.add(notificacaoAluno.painelNotificacaoAluno, BorderLayout.CENTER);
        painelPrincipalAluno.validate();
    }
               
    private javax.swing.JButton btnNotificacoesMenuAluno;
    private javax.swing.JButton btnPerfilMenuAluno;
    private javax.swing.JButton btnSairMenuAluno;
    private javax.swing.JButton btnTGMenuAluno;
    private javax.swing.JLabel lblFotoAlunoMenu;
    private javax.swing.JLabel lblNomeAlunoMenu;
    private javax.swing.JLabel lblPerfilAlunoMenu;
    private javax.swing.JPanel painelAlunoMenu;
    public javax.swing.JPanel painelPrincipalAluno;
             

    public void actionPerformed(ActionEvent e) {
        if ("Trabalho de Graduação".equals(e.getActionCommand()))
            //telaCriarTGAluno();       //Sem TG cadastrado
            telaVisualizarTGAluno();    //Com TG cadastrado
        else if ("Perfil".equals(e.getActionCommand()))
            telaCriarPerfilAluno();
        else if ("Notificações".equals(e.getActionCommand()))
            telaNotificacaoAluno();
        else if ("Sair".equals(e.getActionCommand())){
            if((int)JOptionPane.showConfirmDialog( null,"Deseja realmente sair?", "Sair",JOptionPane.YES_NO_OPTION) == 0){
                    System.exit(0);
            }
        }
        
    }
}