package boundary;

import java.awt.Color;

public class painelCriarAtividadeOrientador {

    public painelCriarAtividadeOrientador() {
        initComponents();
    }
                       
    private void initComponents() {

        painelCriarAtividadeOrientador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDataAtividadeOrientador_TelaCriarAtividadeOrientador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoAtividadeOrientador_TelaCriarAtividadeOrientador = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTituloAtividadeOrientador_TelaCriarAtividadeOrientador = new javax.swing.JTextArea();

        painelCriarAtividadeOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelCriarAtividadeOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("ATIVIDADES:");

        lblDataAtividadeOrientador_TelaCriarAtividadeOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblDataAtividadeOrientador_TelaCriarAtividadeOrientador.setText("Data: DD / MM / AA");

        txtDescricaoAtividadeOrientador_TelaCriarAtividadeOrientador.setColumns(20);
        txtDescricaoAtividadeOrientador_TelaCriarAtividadeOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtDescricaoAtividadeOrientador_TelaCriarAtividadeOrientador.setRows(5);
        txtDescricaoAtividadeOrientador_TelaCriarAtividadeOrientador.setText("Descrição");
        jScrollPane1.setViewportView(txtDescricaoAtividadeOrientador_TelaCriarAtividadeOrientador);

        txtTituloAtividadeOrientador_TelaCriarAtividadeOrientador.setColumns(20);
        txtTituloAtividadeOrientador_TelaCriarAtividadeOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtTituloAtividadeOrientador_TelaCriarAtividadeOrientador.setRows(5);
        txtTituloAtividadeOrientador_TelaCriarAtividadeOrientador.setText("Título");
        jScrollPane2.setViewportView(txtTituloAtividadeOrientador_TelaCriarAtividadeOrientador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelCriarAtividadeOrientador);
        painelCriarAtividadeOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDataAtividadeOrientador_TelaCriarAtividadeOrientador))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDataAtividadeOrientador_TelaCriarAtividadeOrientador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelCriarAtividadeOrientador.setBackground(new Color(215, 215, 250));
    }                   
                   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataAtividadeOrientador_TelaCriarAtividadeOrientador;
    private javax.swing.JTextArea txtDescricaoAtividadeOrientador_TelaCriarAtividadeOrientador;
    private javax.swing.JTextArea txtTituloAtividadeOrientador_TelaCriarAtividadeOrientador;
    public javax.swing.JPanel painelCriarAtividadeOrientador;              
}
