package boundary;

import java.awt.Color;

public class painelConsultarBancaAluno {


    public painelConsultarBancaAluno() {
        initComponents();
    }

                     
    private void initComponents() {

        painelConsultarBancaAluno = new javax.swing.JPanel();
        txtDataBanca_TelaConsultarBancaAluno = new javax.swing.JTextField();

        painelConsultarBancaAluno.setBackground(new java.awt.Color(255, 255, 255));

        txtDataBanca_TelaConsultarBancaAluno.setFont(new java.awt.Font("Arial", 0, 16)); 
        txtDataBanca_TelaConsultarBancaAluno.setText("Data da Banca: DD / MM / AA");
        txtDataBanca_TelaConsultarBancaAluno.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelConsultarBancaAluno);
        painelConsultarBancaAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(txtDataBanca_TelaConsultarBancaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(txtDataBanca_TelaConsultarBancaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        txtDataBanca_TelaConsultarBancaAluno.getAccessibleContext().setAccessibleName("txtDataBanca_TelaConsultarBancaAluno");

        painelConsultarBancaAluno.setBackground(new Color(215, 215, 250));
        painelConsultarBancaAluno.getAccessibleContext().setAccessibleName("painelConsultarBancaAluno");
    }                    


          
    private javax.swing.JTextField txtDataBanca_TelaConsultarBancaAluno;
    public javax.swing.JPanel painelConsultarBancaAluno;
                
}
