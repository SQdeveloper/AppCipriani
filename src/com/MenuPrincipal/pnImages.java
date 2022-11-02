/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.MenuPrincipal;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class pnImages extends javax.swing.JPanel{

    //Cargo las imagen
    ImageIcon image2;
    //Constructor
    public pnImages() {
        initComponents();
        image2 = new ImageIcon("C://Users//PC//Documents//NetBeansProjects//App_ElCipriani//src//com//images//sanji.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImage = new javax.swing.JLabel();
        pnNext = new javax.swing.JPanel();
        lbNext = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 22, 22));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/gear five.png"))); // NOI18N
        add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pnNext.setBackground(new java.awt.Color(22, 22, 22));

        lbNext.setForeground(new java.awt.Color(255, 255, 255));
        lbNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNext.setText(">");
        lbNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbNextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnNextLayout = new javax.swing.GroupLayout(pnNext);
        pnNext.setLayout(pnNextLayout);
        pnNextLayout.setHorizontalGroup(
            pnNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNextLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnNextLayout.setVerticalGroup(
            pnNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNextLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(pnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void lbNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNextMouseClicked
        lbImage.setIcon(image2);
    }//GEN-LAST:event_lbNextMouseClicked

    private void lbNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNextMouseEntered
        pnNext.setBackground(new Color(120,120,120));
    }//GEN-LAST:event_lbNextMouseEntered

    private void lbNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNextMouseExited
        pnNext.setBackground(new Color(22,22,22));
    }//GEN-LAST:event_lbNextMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbNext;
    private javax.swing.JPanel pnNext;
    // End of variables declaration//GEN-END:variables
}
