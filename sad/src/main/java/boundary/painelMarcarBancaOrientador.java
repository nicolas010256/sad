package boundary;

import java.awt.Color;

public class painelMarcarBancaOrientador {

    public painelMarcarBancaOrientador() {
        initComponents();
    }
                       
    private void initComponents() {

        painelMarcarBancaOrientador = new javax.swing.JPanel();
        lblData_TelaMarcarBancaOrientador = new javax.swing.JLabel();
        spinnerHora_TelaMarcarBancaOrientador = new javax.swing.JSpinner();
        txtDia_TelaMarcarBancaOrientador = new javax.swing.JTextField();
        txtMes_TelaMarcarBancaOrientador = new javax.swing.JTextField();
        txtAno_TelaMarcarBancaOrientador = new javax.swing.JTextField();
        lblHora_TelaMarcarBancaOrientador = new javax.swing.JLabel();
        spinnerMinuto_TelaMarcarBancaOrientador = new javax.swing.JSpinner();
        lblLocal_TelaMarcarBancaOrientador = new javax.swing.JLabel();
        txtLocal_TelaMarcarBancaOrientador = new javax.swing.JTextField();

        painelMarcarBancaOrientador.setBackground(new java.awt.Color(255, 255, 255));
        painelMarcarBancaOrientador.setMinimumSize(new java.awt.Dimension(100, 100));

        lblData_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblData_TelaMarcarBancaOrientador.setText("Data:");

        spinnerHora_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));

        txtDia_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtDia_TelaMarcarBancaOrientador.setText("10");

        txtMes_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtMes_TelaMarcarBancaOrientador.setText("Janeiro");

        txtAno_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtAno_TelaMarcarBancaOrientador.setText("2010");

        lblHora_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblHora_TelaMarcarBancaOrientador.setText("Horário:");

        spinnerMinuto_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));

        lblLocal_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        lblLocal_TelaMarcarBancaOrientador.setText("Local:");

        txtLocal_TelaMarcarBancaOrientador.setFont(new java.awt.Font("Arial", 0, 14));
        txtLocal_TelaMarcarBancaOrientador.setText("Descrição da sala selecionada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelMarcarBancaOrientador);
        painelMarcarBancaOrientador.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblLocal_TelaMarcarBancaOrientador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLocal_TelaMarcarBancaOrientador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblData_TelaMarcarBancaOrientador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDia_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMes_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(lblHora_TelaMarcarBancaOrientador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinnerHora_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerMinuto_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData_TelaMarcarBancaOrientador)
                    .addComponent(txtDia_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora_TelaMarcarBancaOrientador)
                    .addComponent(spinnerHora_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMinuto_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocal_TelaMarcarBancaOrientador)
                    .addComponent(txtLocal_TelaMarcarBancaOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(5, Short.MAX_VALUE))
        );

        painelMarcarBancaOrientador.setBackground(new Color(215, 215, 250));
    }
                  
    private javax.swing.JLabel lblData_TelaMarcarBancaOrientador;
    private javax.swing.JLabel lblHora_TelaMarcarBancaOrientador;
    private javax.swing.JLabel lblLocal_TelaMarcarBancaOrientador;
    private javax.swing.JSpinner spinnerHora_TelaMarcarBancaOrientador;
    private javax.swing.JSpinner spinnerMinuto_TelaMarcarBancaOrientador;
    private javax.swing.JTextField txtAno_TelaMarcarBancaOrientador;
    private javax.swing.JTextField txtDia_TelaMarcarBancaOrientador;
    private javax.swing.JTextField txtLocal_TelaMarcarBancaOrientador;
    private javax.swing.JTextField txtMes_TelaMarcarBancaOrientador;
    public javax.swing.JPanel painelMarcarBancaOrientador;
}
