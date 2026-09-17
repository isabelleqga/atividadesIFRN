/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Paula
 */
public class TelaTutorial extends javax.swing.JFrame {

    /**
     * Creates new form TelaTutorial
     */
    public TelaTutorial() {

        initComponents();
        txtF.setText("\n   Bem-vindo à  experiência Informática2M \n   de arrecadação de fundos em prol da peça \n   Flor de Neem. \n   Aqui, nós vendemos docinhos.");
        this.setLocationRelativeTo(null);
        cliques = 9;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtF = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1323, 640));

        jPanel1.setBackground(new java.awt.Color(215, 194, 164));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 150)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 216, 207));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tutorial");

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Pular");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnContinuar.setBorderPainted(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        txtF.setEditable(false);
        txtF.setColumns(20);
        txtF.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtF.setLineWrap(true);
        txtF.setRows(5);
        txtF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtF);

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel2.setText("Clique na tela e aperte enter para continuar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(758, Short.MAX_VALUE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(201, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cadastro t = new Cadastro('a');
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            switch (cliques) {
                case 9:
                    txtF.setText("\n   Esse é um jogo simples,\n   com poucos mistérios.");
                    break;
                case 8:
                    txtF.setText("\n   Siga as regras. \n   Não bata muita perna.\n   Calcule suas ações.\n   Estude o perfil apresentado.");
                    break;
                case 7:
                    txtF.setText("\n   Em “Interagir”, você vê seu inimigo.\n   Em “Atacar”, você tenta derrota-lo.");
                    break;
                case 6:
                    txtF.setText("\n   Sua personalidade define suas chances.\n   Às vezes, o melhor é simplesmente desistir.");
                    break;
                case 5:
                    txtF.setText("\n   Algumas coisas você vai ter que descobrir,\n   como a gente descobriu. \n   Isso é um simulador, afinal.");
                    break;
                case 4:
                    txtF.setText("\n   Você tem que acabar com o seu estoque, \n   ao mesmo tempo que evita ser \n   pego pelas autoridades.");
                    break;
                case 3:
                    txtF.setText("\n   A vida do crime não é fácil. \n   Se fosse, eu não estaria fazendo projeto\n   pra passar em programação.");
                    break;
                case 2:
                    txtF.setText("\n   O IF é grande, \n   o recreio é curto. \n   Nem todo mundo gosta de você. ");
                    break;
                case 1:
                    txtF.setText("\n   Boa sorte, novato.");
                    break;
                default:
                    Cadastro t = new Cadastro('a');
                    t.setVisible(true);
                    dispose();
                    break;
            }
            cliques--;
        }
    }//GEN-LAST:event_txtFKeyPressed
    private int cliques;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtF;
    // End of variables declaration//GEN-END:variables
}
