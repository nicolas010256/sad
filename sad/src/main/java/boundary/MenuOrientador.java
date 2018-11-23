package boundary;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import entity.Orientador;


public class MenuOrientador extends javax.swing.JFrame implements ActionListener {
    private javax.swing.JButton btnNotificacoesMenuOrientador;
    private javax.swing.JButton btnPerfilMenuOrientador;
    private javax.swing.JButton btnSairMenuOrientador;
    private javax.swing.JButton btnTGMenuOrientador;
    private javax.swing.JLabel lblFotoOrientadorMenu;
    private javax.swing.JLabel lblNomeOrientadorMenu;
    private javax.swing.JLabel lblPerfilOrientadorMenu;
    private javax.swing.JPanel painelOrientadorMenu;
    public javax.swing.JPanel painelPrincipalOrientador;

    private Orientador orientador;

   
    public MenuOrientador(Orientador orientador) {
        this.orientador = orientador;       
        initComponents();
        this.setLocationRelativeTo(null);
        lblNomeOrientadorMenu.setText(orientador.getNome());
    }
                         
    private void initComponents() {

        painelOrientadorMenu = new javax.swing.JPanel();
        lblFotoOrientadorMenu = new javax.swing.JLabel();
        lblPerfilOrientadorMenu = new javax.swing.JLabel();
        lblNomeOrientadorMenu = new javax.swing.JLabel();
        btnPerfilMenuOrientador = new javax.swing.JButton();
        btnNotificacoesMenuOrientador = new javax.swing.JButton();
        btnTGMenuOrientador = new javax.swing.JButton();
        btnSairMenuOrientador = new javax.swing.JButton();
        painelPrincipalOrientador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA ACADEMICO DE DESENVOLVIMENTO DE TRABALHOS DE GRADUAÇÃO - SAD");
        setPreferredSize(new java.awt.Dimension(1260, 600));

        painelOrientadorMenu.setBackground(new java.awt.Color(102, 102, 102));

        lblFotoOrientadorMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotoOrientador.png")));

        lblPerfilOrientadorMenu.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        lblPerfilOrientadorMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfilOrientadorMenu.setText("Orientador");

        lblNomeOrientadorMenu.setFont(new java.awt.Font("Arial", 0, 14));
        lblNomeOrientadorMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeOrientadorMenu.setText("Nome do Orientador");

        btnPerfilMenuOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnPerfilMenuOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        btnPerfilMenuOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfilMenuOrientador.setText("Perfil");
        btnPerfilMenuOrientador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnPerfilMenuOrientador.setFocusPainted(false);
        btnPerfilMenuOrientador.setFocusable(false);
        btnPerfilMenuOrientador.addActionListener(this);

        btnNotificacoesMenuOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnNotificacoesMenuOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        btnNotificacoesMenuOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnNotificacoesMenuOrientador.setText("Notificações");
        btnNotificacoesMenuOrientador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnNotificacoesMenuOrientador.setFocusPainted(false);
        btnNotificacoesMenuOrientador.setFocusable(false);
        btnNotificacoesMenuOrientador.addActionListener(this);

        btnTGMenuOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnTGMenuOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        btnTGMenuOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnTGMenuOrientador.setText("Trabalho de Graduação");
        btnTGMenuOrientador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnTGMenuOrientador.setFocusPainted(false);
        btnTGMenuOrientador.setFocusable(false);
        btnTGMenuOrientador.addActionListener(this);

        btnSairMenuOrientador.setBackground(new java.awt.Color(102, 102, 102));
        btnSairMenuOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        btnSairMenuOrientador.setForeground(new java.awt.Color(255, 255, 255));
        btnSairMenuOrientador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btnSairMenuOrientador.setFocusPainted(false);
        btnSairMenuOrientador.setFocusable(false);
        btnSairMenuOrientador.setText("Sair");
        btnSairMenuOrientador.addActionListener(this);

        javax.swing.GroupLayout painelOrientadorMenuLayout = new javax.swing.GroupLayout(painelOrientadorMenu);
        painelOrientadorMenu.setLayout(painelOrientadorMenuLayout);
        painelOrientadorMenuLayout.setHorizontalGroup(
            painelOrientadorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOrientadorMenuLayout.createSequentialGroup()
                .addGroup(painelOrientadorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOrientadorMenuLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblFotoOrientadorMenu))
                    .addGroup(painelOrientadorMenuLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblPerfilOrientadorMenu))
                    .addGroup(painelOrientadorMenuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNomeOrientadorMenu)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(btnPerfilMenuOrientador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNotificacoesMenuOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTGMenuOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSairMenuOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelOrientadorMenuLayout.setVerticalGroup(
            painelOrientadorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOrientadorMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblFotoOrientadorMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPerfilOrientadorMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeOrientadorMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPerfilMenuOrientador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotificacoesMenuOrientador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTGMenuOrientador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                .addComponent(btnSairMenuOrientador)
                .addContainerGap())
        );

        painelPrincipalOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipalOrientador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        painelPrincipalOrientador.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout painelPrincipalOrientadorLayout = new javax.swing.GroupLayout(painelPrincipalOrientador);
        painelPrincipalOrientador.setLayout(painelPrincipalOrientadorLayout);
        painelPrincipalOrientadorLayout.setHorizontalGroup(
            painelPrincipalOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 923, Short.MAX_VALUE)
        );
        painelPrincipalOrientadorLayout.setVerticalGroup(
            painelPrincipalOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelOrientadorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(painelPrincipalOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelOrientadorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(painelPrincipalOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }               

      
    public void telaVisualizarTGOrientador(){
        painelPrincipalOrientador.removeAll();
        painelVisualizarTGOrientador visualizarTGOrientador =  new painelVisualizarTGOrientador();
        painelPrincipalOrientador.setLayout(new BorderLayout());
        painelPrincipalOrientador.add(visualizarTGOrientador.painelVisualizarTGOrientador, BorderLayout.CENTER);
        painelPrincipalOrientador.validate();
    }
    
    public void telaCriarPerfilOrientador(){
        painelPrincipalOrientador.removeAll();
        painelCriarPerfilOrientador criarPerfilOrientador =  new painelCriarPerfilOrientador(orientador);
        painelPrincipalOrientador.setLayout(new BorderLayout());
        painelPrincipalOrientador.add(criarPerfilOrientador.painelCriarPerfilOrientador, BorderLayout.CENTER);
        painelPrincipalOrientador.validate();
    }
    
    public void telaNotificacaoAluno(){
        painelPrincipalOrientador.removeAll();
        painelNotificacaoAluno notificacaoAluno =  new painelNotificacaoAluno();
        painelPrincipalOrientador.setLayout(new BorderLayout());
        painelPrincipalOrientador.add(notificacaoAluno.painelNotificacaoAluno, BorderLayout.CENTER);
        painelPrincipalOrientador.validate();
    }
                     

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Trabalho de Graduação".equals(e.getActionCommand()))
            telaVisualizarTGOrientador();
        else if ("Perfil".equals(e.getActionCommand()))
            telaCriarPerfilOrientador();
        else if ("Notificações".equals(e.getActionCommand()))
            telaNotificacaoAluno();
        else if ("Sair".equals(e.getActionCommand())){
            if((int)JOptionPane.showConfirmDialog( null,"Deseja realmente sair?", "Sair",JOptionPane.YES_NO_OPTION) == 0){
                    System.exit(0);
            }
        }
    }
}