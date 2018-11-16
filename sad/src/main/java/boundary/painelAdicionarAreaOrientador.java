package boundary;

import java.awt.Color;

public class painelAdicionarAreaOrientador {

    public painelAdicionarAreaOrientador() {
        initComponents();
    }
           
    private void initComponents() {

        painelAdicionarAreaOrientador = new javax.swing.JPanel();
        lblAreaOrientador_TelaAdicionarAreaOrientador = new javax.swing.JLabel();
        txtAreaOrientador_TelaAdicionarAreaOrientador = new javax.swing.JTextField();

        painelAdicionarAreaOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelAdicionarAreaOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        lblAreaOrientador_TelaAdicionarAreaOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        lblAreaOrientador_TelaAdicionarAreaOrientador.setText("Descrição:");

        txtAreaOrientador_TelaAdicionarAreaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtAreaOrientador_TelaAdicionarAreaOrientador.setText("Descrição da área de atuação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelAdicionarAreaOrientador);
        painelAdicionarAreaOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblAreaOrientador_TelaAdicionarAreaOrientador)
                .addGap(18, 18, 18)
                .addComponent(txtAreaOrientador_TelaAdicionarAreaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaOrientador_TelaAdicionarAreaOrientador)
                    .addComponent(txtAreaOrientador_TelaAdicionarAreaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblAreaOrientador_TelaAdicionarAreaOrientador.getAccessibleContext().setAccessibleName("lblAreaOrientador_TelaAdicionarAreaOrientador");
        txtAreaOrientador_TelaAdicionarAreaOrientador.getAccessibleContext().setAccessibleName("txtAreaOrientador_TelaAdicionarAreaOrientador");

        painelAdicionarAreaOrientador.setBackground(new Color(215, 215, 250));
        painelAdicionarAreaOrientador.getAccessibleContext().setAccessibleName("painelAdicionarAreaOrientador");
    }                      

                 
    private javax.swing.JLabel lblAreaOrientador_TelaAdicionarAreaOrientador;
    private javax.swing.JTextField txtAreaOrientador_TelaAdicionarAreaOrientador;
    public javax.swing.JPanel painelAdicionarAreaOrientador;
                
}
