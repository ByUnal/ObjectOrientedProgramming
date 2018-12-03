/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronics;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ElectronicsStore extends javax.swing.JFrame {

    ArrayList<Electronics> myList;
    public ElectronicsStore() {
        initComponents();
        myList = new ArrayList<>();
        pnPro.setVisible(false);
        pnGame.setVisible(false);
        pnTv.setVisible(false);
    }

    public void ClearAll(){
        pnPro.setVisible(false);
        pnGame.setVisible(false);
        pnTv.setVisible(false);
        tfBrand.setText("");
        tfPrice.setText("");
        tfGuarantee.setText("");
        rdTv.setSelected(false);
        rdPro.setSelected(false);
        rdGame.setSelected(false);
        TextArea.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        tfGuarantee = new javax.swing.JTextField();
        rdTv = new javax.swing.JRadioButton();
        rdPro = new javax.swing.JRadioButton();
        rdGame = new javax.swing.JRadioButton();
        pnTv = new javax.swing.JPanel();
        rdLCD = new javax.swing.JRadioButton();
        rdHD = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();
        pnPro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfAns = new javax.swing.JTextField();
        tfLamp = new javax.swing.JTextField();
        pnGame = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tfHdd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbUSB = new javax.swing.JComboBox<>();
        btAdd = new javax.swing.JButton();
        btDisp = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Brand :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Price :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Guarantee :");

        buttonGroup1.add(rdTv);
        rdTv.setText("TV");
        rdTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdTvActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdPro);
        rdPro.setText("Projector");
        rdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdProActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdGame);
        rdGame.setText("GameConsole");
        rdGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdTv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tfGuarantee, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdGame)
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfBrand)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGuarantee, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdTv)
                    .addComponent(rdPro)
                    .addComponent(rdGame))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnTv.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Tv", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        rdLCD.setText("LCD");

        rdHD.setText("HD");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("SIZE :");

        javax.swing.GroupLayout pnTvLayout = new javax.swing.GroupLayout(pnTv);
        pnTv.setLayout(pnTvLayout);
        pnTvLayout.setHorizontalGroup(
            pnTvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTvLayout.createSequentialGroup()
                        .addComponent(rdLCD)
                        .addGap(18, 18, 18)
                        .addComponent(rdHD)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnTvLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSize)))
                .addContainerGap())
        );
        pnTvLayout.setVerticalGroup(
            pnTvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdLCD)
                    .addComponent(rdHD))
                .addGap(18, 18, 18)
                .addGroup(pnTvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Projector", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Ansilumen :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Lamp Hour :");

        javax.swing.GroupLayout pnProLayout = new javax.swing.GroupLayout(pnPro);
        pnPro.setLayout(pnProLayout);
        pnProLayout.setHorizontalGroup(
            pnProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLamp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnProLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfAns, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnProLayout.setVerticalGroup(
            pnProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfLamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnGame.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "GameConsole", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("HDD :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("USB :");

        cbUSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2.0", "3.0" }));
        cbUSB.setSelectedIndex(-1);

        javax.swing.GroupLayout pnGameLayout = new javax.swing.GroupLayout(pnGame);
        pnGame.setLayout(pnGameLayout);
        pnGameLayout.setHorizontalGroup(
            pnGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnGameLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tfHdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnGameLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cbUSB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnGameLayout.setVerticalGroup(
            pnGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfHdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbUSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAdd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btAdd.setText("ADD");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDisp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btDisp.setText("DISPLAY");
        btDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDispActionPerformed(evt);
            }
        });

        btClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btClear.setText("CLEAR");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(pnGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btDisp)
                        .addGap(18, 18, 18)
                        .addComponent(btClear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdTvActionPerformed
        if(rdTv.isSelected()){
            pnPro.setVisible(false);
            pnGame.setVisible(false);
            pnTv.setVisible(true);
        }
    }//GEN-LAST:event_rdTvActionPerformed

    private void rdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdProActionPerformed
        if(rdPro.isSelected()){
            pnPro.setVisible(true);
            pnGame.setVisible(false);
            pnTv.setVisible(false);
        }
    }//GEN-LAST:event_rdProActionPerformed

    private void rdGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdGameActionPerformed
        if(rdGame.isSelected()){
            pnPro.setVisible(false);
            pnGame.setVisible(true);
            pnTv.setVisible(false);
        }
    }//GEN-LAST:event_rdGameActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if(rdTv.isSelected()){
            if(rdLCD.isSelected()){
                Tv tv = new Tv(tfBrand.getText(), Double.parseDouble(tfPrice.getText()) , Integer.parseInt(tfGuarantee.getText()), "LCD", Integer.parseInt(tfSize.getText()));
                myList.add(tv);
                ClearAll();
            }
            else if(rdHD.isSelected()){
                Tv tvhd = new Tv(tfBrand.getText(), Double.parseDouble(tfPrice.getText()) , Integer.parseInt(tfGuarantee.getText()), "HD", Integer.parseInt(tfSize.getText()));
                myList.add(tvhd);
                ClearAll();
            }
        }
        
        else if(rdPro.isSelected()){
            Projector projector =  new Projector(Integer.parseInt(tfAns.getText()), Integer.parseInt(tfLamp.getText()), tfBrand.getText(), Double.parseDouble(tfPrice.getText()) , Integer.parseInt(tfGuarantee.getText()) );
            myList.add(projector);
            ClearAll();
        }
        
        else if(rdGame.isSelected()){
            GameConsole game = new GameConsole(Integer.parseInt(tfHdd.getText()), Double.parseDouble( (String) cbUSB.getSelectedItem()) , tfBrand.getText(), Double.parseDouble(tfPrice.getText()) , Integer.parseInt(tfGuarantee.getText()));
            myList.add(game);
            ClearAll();
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        ClearAll();
    }//GEN-LAST:event_btClearActionPerformed

    private void btDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDispActionPerformed
        for (int i = 0; i < myList.size(); i++) {
            TextArea.append(myList.get(i).toString());
        }
    }//GEN-LAST:event_btDispActionPerformed

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
            java.util.logging.Logger.getLogger(ElectronicsStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectronicsStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectronicsStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectronicsStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectronicsStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDisp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbUSB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnGame;
    private javax.swing.JPanel pnPro;
    private javax.swing.JPanel pnTv;
    private javax.swing.JRadioButton rdGame;
    private javax.swing.JRadioButton rdHD;
    private javax.swing.JRadioButton rdLCD;
    private javax.swing.JRadioButton rdPro;
    private javax.swing.JRadioButton rdTv;
    private javax.swing.JTextField tfAns;
    private javax.swing.JTextField tfBrand;
    private javax.swing.JTextField tfGuarantee;
    private javax.swing.JTextField tfHdd;
    private javax.swing.JTextField tfLamp;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfSize;
    // End of variables declaration//GEN-END:variables
}
