/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcsoja;

import java.awt.TextArea;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author mayla
 */
public class Tela3 extends javax.swing.JFrame {

    /**
     * Creates new form Tela3
     */
    public Tela3() {
        initComponents();
        textArea1.setText("Area Damaged = " + Dados.areadamaged + "\n"
                + "Canker Lesion = " + Dados.canckerlesion + "\n"
                + "Crop-Hist = " + Dados.croohist + "\n"
                + "Data = " + Dados.data + "\n"
                + "External Decay = " + Dados.externaldecay + "\n"
                + "Fruiting Bodies = " + Dados.fruitingbodies + "\n"
                + "Fruiting Pods = " + Dados.fruitpods + "\n"
                + "Fruiting Spots = " + Dados.fruitspots + "\n"
                + "Germination = " + Dados.germination + "\n"
                + "Hail = " + Dados.hail + "\n"
                + "Int-Discolor = " + Dados.intdiscolor + "\n"
                + "Leaf-Malf = " + Dados.leafmalf + "\n"
                + "Leaf-Mild = " + Dados.leafmild + "\n"
                + "Leaf-Shread = " + Dados.leafshred + "\n"
                + "Leafspot-Halo = " + Dados.leafspothalo + "\n"
                + "Leafspot-Size = " + Dados.leafspotsize + "\n"
                + "Leafspot-Margin = " + Dados.leafsspotmarg + "\n"
                + "Leaves = " + Dados.leaves + "\n"
                + "Lodging = " + Dados.lodgi + "\n"
                + "Mold Growth = " + Dados.moldgrowth + "\n"
                + "Mycelium = " + Dados.mycelium + "\n"
                + "Plant Growth = " + Dados.plantgrowth + "\n"
                + "Plant-Stand = " + Dados.plantstand + "\n"
                + "Precip = " + Dados.precip + "\n"
                + "Roots = " + Dados.roots + "\n"
                + "Sclerotia = " + Dados.sclerotia + "\n"
                + "Seed = " + Dados.seed + "\n"
                + "Seed Discolor = " + Dados.seeddis + "\n"
                + "Seed Size = " + Dados.seedsize + "\n"
                + "Seed-TMT = " + Dados.seedtmt + "\n"
                + "Severity = " + Dados.severity + "\n"
                + "Shriveling = " + Dados.shriveling + "\n"
                + "Stem = " + Dados.stem + "\n"
                + "Stem Canker = " + Dados.stemcancker + "\n"
                + "Temp = " + Dados.temp);

       int casoProbIndex = Dados.aux;
         //id do caso base a ser mostrado
        for (int i = 0; i < Dados.idProblema.length; i++) {
            if (i == casoProbIndex) {
                Dados.aux1 = Dados.idProblema[i] - 1;
            }
        }
        System.out.println("aux = " + Dados.aux1);
        textArea2.setText("Area Damaged = " + Dados.areadamagedVetor[Dados.aux1] + "\n"
                + "Canker Lesion = " + Dados.canckerlesionVetor[Dados.aux1] + "\n"
                + "Crop-Hist = " + Dados.croohistVetor[Dados.aux1] + "\n"
                + "Data = " + Dados.dataVetor[Dados.aux1] + "\n"
                + "External Decay = " + Dados.externaldecayVetor[Dados.aux1] + "\n"
                + "Fruiting Bodies = " + Dados.fruitingbodiesVetor[Dados.aux1] + "\n"
                + "Fruiting Pods = " + Dados.fruitpodsVetor[Dados.aux1] + "\n"
                + "Fruiting Spots = " + Dados.fruitspotsVetor[Dados.aux1] + "\n"
                + "Germination = " + Dados.germinationVetor[Dados.aux1] + "\n"
                + "Hail = " + Dados.hailVetor[Dados.aux1] + "\n"
                + "Int-Discolor = " + Dados.intdiscolorVetor[Dados.aux1] + "\n"
                + "Leaf-Malf = " + Dados.leafmalfVetor[Dados.aux1] + "\n"
                + "Leaf-Mild = " + Dados.leafmildVetor[Dados.aux1] + "\n"
                + "Leaf-Shread = " + Dados.leafshredVetor[Dados.aux1] + "\n"
                + "Leafspot-Halo = " + Dados.leafspothaloVetor[Dados.aux1] + "\n"
                + "Leafspot-Size = " + Dados.leafspotsizeVetor[Dados.aux1] + "\n"
                + "Leafspot-Margin = " + Dados.leafsspotmargVetor[Dados.aux1] + "\n"
                + "Leaves = " + Dados.leavesVetor[Dados.aux1] + "\n"
                + "Lodging = " + Dados.lodgiVetor[Dados.aux1] + "\n"
                + "Mold Growth = " + Dados.moldgrowthVetor[Dados.aux1] + "\n"
                + "Mycelium = " + Dados.myceliumVetor[Dados.aux1] + "\n"
                + "Plant Growth = " + Dados.plantgrowthVetor[Dados.aux1] + "\n"
                + "Plant-Stand = " + Dados.plantstandVetor[Dados.aux1] + "\n"
                + "Precip = " + Dados.precipVetor[Dados.aux1] + "\n"
                + "Roots = " + Dados.rootsVetor[Dados.aux1] + "\n"
                + "Sclerotia = " + Dados.sclerotiaVetor[Dados.aux1] + "\n"
                + "Seed = " + Dados.seedVetor[Dados.aux1] + "\n"
                + "Seed Discolor = " + Dados.seeddisVetor[Dados.aux1] + "\n"
                + "Seed Size = " + Dados.seedsizeVetor[Dados.aux1] + "\n"
                + "Seed-TMT = " + Dados.seedtmtVetor[Dados.aux1] + "\n"
                + "Severity = " + Dados.severityVetor[Dados.aux1] + "\n"
                + "Shriveling = " + Dados.shrivelingVetor[Dados.aux1] + "\n"
                + "Stem = " + Dados.stemVetor[Dados.aux1] + "\n"
                + "Stem Canker = " + Dados.stemcanckerVetor[Dados.aux1] + "\n"
                + "Temp = " + Dados.tempVetor[Dados.aux1]);

        jLabel4.setText(Dados.doenca[Dados.aux1]);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textArea2 = new java.awt.TextArea();
        jLabel4 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Caso Problema");

        jLabel2.setText("Caso Base");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Doença");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(202, 202, 202)
                                .addComponent(jButton3)))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(139, 139, 139))))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textArea2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Tela2 tela2 = new Tela2();
        tela2.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: //Botao q realizará retenção
        File arquivoCSV = new File("/home/mayla/NetBeansProjects/RBCsoja/src/rbcsoja/casoBase");
        BufferedWriter bw = null;
        Integer aux1 = Dados.qtd + 1;
             try {
            bw = new BufferedWriter(new FileWriter(arquivoCSV, true));
            
           bw.write(aux1.toString());
           bw.write(',');
            bw.write(Dados.areadamaged);
            bw.write(',');
            bw.write(Dados.canckerlesion);
            bw.write(',');
            bw.write(Dados.croohist);
            bw.write(',');
            bw.write(Dados.data);
           bw.write(',');
            bw.write(Dados.externaldecay);
           bw.write(',');
            bw.write(Dados.fruitspots);
           bw.write(',');
            bw.write(Dados.fruitingbodies);
           bw.write(',');
            bw.write(Dados.fruitpods);
           bw.write(',');
            bw.write(Dados.germination);
           bw.write(',');
            bw.write(Dados.hail);
           bw.write(',');
            bw.write(Dados.intdiscolor);
           bw.write(',');
            bw.write(Dados.leafmalf);
           bw.write(',');
            bw.write(Dados.leafmild);
           bw.write(',');
            bw.write(Dados.leafshred);
           bw.write(',');
            bw.write(Dados.leafspothalo);
           bw.write(',');
            bw.write(Dados.leafspotsize);
           bw.write(',');
            bw.write(Dados.leafsspotmarg);
           bw.write(',');
            bw.write(Dados.leaves);
           bw.write(',');
            bw.write(Dados.lodgi);
           bw.write(',');
            bw.write(Dados.moldgrowth);
           bw.write(',');
            bw.write(Dados.mycelium);
           bw.write(',');
            bw.write(Dados.plantgrowth);
           bw.write(',');
            bw.write(Dados.plantstand);
           bw.write(',');
            bw.write(Dados.precip);
           bw.write(',');
            bw.write(Dados.roots);
           bw.write(',');
            bw.write(Dados.sclerotia);
           bw.write(',');
            bw.write(Dados.seed);
           bw.write(',');
            bw.write(Dados.seeddis);
           bw.write(',');
            bw.write(Dados.seedsize);
           bw.write(',');
            bw.write(Dados.seedtmt);
           bw.write(',');
            bw.write(Dados.severity);
           bw.write(',');
            bw.write(Dados.shriveling);
           bw.write(',');
            bw.write(Dados.stem);
           bw.write(',');
            bw.write(Dados.stemcancker);
            bw.write(',');
            bw.write(Dados.temp);
           bw.write(',');
            bw.write(Dados.doenca[Dados.aux1]);
            bw.newLine();
            bw.flush();
            bw.close();
            
        } catch (IOException ex) {
            //Logger.getLogger(Tela3.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro escrita arquivo");
        }
        //https://respostas.guj.com.br/6063-escrever-no-fim-do-arquivo-sem-sobrescrever
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Tela2 tela2 = new Tela2();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables

}
