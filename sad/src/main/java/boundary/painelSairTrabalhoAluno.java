package boundary;

import java.awt.Color;

public class painelSairTrabalhoAluno {

    public painelSairTrabalhoAluno() {
        initComponents();
    }
                        
    private void initComponents() {

        painelSairTrabalhoAluno = new javax.swing.JPanel();
        lblSairTrabalho_TelaSairTrabalhoAluno = new javax.swing.JLabel();

        painelSairTrabalhoAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelSairTrabalhoAluno.setMinimumSize(new java.awt.Dimension(100, 100));

        lblSairTrabalho_TelaSairTrabalhoAluno.setFont(new java.awt.Font("Arial", 1, 18));
        lblSairTrabalho_TelaSairTrabalhoAluno.setText("Deseja realmente sair do grupo de trabalho de graduação?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelSairTrabalhoAluno);
        painelSairTrabalhoAluno.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSairTrabalho_TelaSairTrabalhoAluno)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSairTrabalho_TelaSairTrabalhoAluno)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        
        painelSairTrabalhoAluno.setBackground(new Color(215, 215, 250));
    }                    
    
    public javax.swing.JPanel painelSairTrabalhoAluno;
    private javax.swing.JLabel lblSairTrabalho_TelaSairTrabalhoAluno;                  
}
