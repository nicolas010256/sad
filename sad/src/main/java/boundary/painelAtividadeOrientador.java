package boundary;

import java.awt.Color;

public class painelAtividadeOrientador {


    public painelAtividadeOrientador() {
        initComponents();
    }
                     
    private void initComponents() {

        painelAtividadeOrientador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDataAtividadeOrientador_TelaAtividadeOrientador = new javax.swing.JLabel();
        scrollAtividadeOrientador_TelaAtividadeOrientador = new javax.swing.JScrollPane();
        txtAtividadeOrientador_TelaAtividadeOrientador = new javax.swing.JTextArea();

        painelAtividadeOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelAtividadeOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("ATIVIDADES:");

        lblDataAtividadeOrientador_TelaAtividadeOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        lblDataAtividadeOrientador_TelaAtividadeOrientador.setText("Data: DD / MM / AA");

        txtAtividadeOrientador_TelaAtividadeOrientador.setColumns(20);
        txtAtividadeOrientador_TelaAtividadeOrientador.setFont(new java.awt.Font("Arial", 0, 14)); 
        txtAtividadeOrientador_TelaAtividadeOrientador.setRows(5);
        txtAtividadeOrientador_TelaAtividadeOrientador.setText("Título - Descrição xxxxxx");
        scrollAtividadeOrientador_TelaAtividadeOrientador.setViewportView(txtAtividadeOrientador_TelaAtividadeOrientador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelAtividadeOrientador);
        painelAtividadeOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataAtividadeOrientador_TelaAtividadeOrientador))
                    .addComponent(scrollAtividadeOrientador_TelaAtividadeOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDataAtividadeOrientador_TelaAtividadeOrientador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAtividadeOrientador_TelaAtividadeOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelAtividadeOrientador.setBackground(new Color(215, 215, 250));
    }             

    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scrollAtividadeOrientador_TelaAtividadeOrientador;
    private javax.swing.JLabel lblDataAtividadeOrientador_TelaAtividadeOrientador;
    private javax.swing.JTextArea txtAtividadeOrientador_TelaAtividadeOrientador;
    public javax.swing.JPanel painelAtividadeOrientador;
                  
}
