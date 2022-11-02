/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MenuPrincipal;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class FrmSeccion extends javax.swing.JFrame {

    /**
     * Creates new form FrmSeccion
     */
    //Esta variable se declara y otorga valor en esta frame pero se utiliza en el frame menu principal
    public int flagSeccion;//Variable para llevar el control del color de fondo de las opciones(anime, familia, peladas, amigos)
    public FrmSeccion() {
        initComponents();
        flagSeccion = 1;//Lo inicializamos en uno para que la opcion anime en un principio sea mas oscuros que las demas opciones
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnOptions = new javax.swing.JPanel();
        pnAnime = new javax.swing.JPanel();
        lbAnime = new javax.swing.JLabel();
        pnFamilia = new javax.swing.JPanel();
        lbFamilia = new javax.swing.JLabel();
        pnPeladas = new javax.swing.JPanel();
        lbPeladas = new javax.swing.JLabel();
        pnAmigos = new javax.swing.JPanel();
        lbAmigos = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnOptions.setBackground(new java.awt.Color(51, 51, 51));
        pnOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnAnime.setBackground(new java.awt.Color(70, 70, 70));

        lbAnime.setBackground(new java.awt.Color(204, 204, 204));
        lbAnime.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbAnime.setForeground(new java.awt.Color(255, 255, 255));
        lbAnime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAnime.setText("Anime");
        lbAnime.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(22, 22, 22), null));
        lbAnime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAnime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAnimeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAnimeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAnimeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnAnimeLayout = new javax.swing.GroupLayout(pnAnime);
        pnAnime.setLayout(pnAnimeLayout);
        pnAnimeLayout.setHorizontalGroup(
            pnAnimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAnime, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        pnAnimeLayout.setVerticalGroup(
            pnAnimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAnime, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        pnOptions.add(pnAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        pnFamilia.setBackground(new java.awt.Color(51, 51, 51));

        lbFamilia.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbFamilia.setForeground(new java.awt.Color(255, 255, 255));
        lbFamilia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFamilia.setText("Familia");
        lbFamilia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFamiliaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFamiliaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFamiliaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnFamiliaLayout = new javax.swing.GroupLayout(pnFamilia);
        pnFamilia.setLayout(pnFamiliaLayout);
        pnFamiliaLayout.setHorizontalGroup(
            pnFamiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFamilia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        pnFamiliaLayout.setVerticalGroup(
            pnFamiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFamiliaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnOptions.add(pnFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 20));

        pnPeladas.setBackground(new java.awt.Color(51, 51, 51));

        lbPeladas.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbPeladas.setForeground(new java.awt.Color(255, 255, 255));
        lbPeladas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPeladas.setText("Peladas");
        lbPeladas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPeladas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPeladasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPeladasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPeladasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnPeladasLayout = new javax.swing.GroupLayout(pnPeladas);
        pnPeladas.setLayout(pnPeladasLayout);
        pnPeladasLayout.setHorizontalGroup(
            pnPeladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPeladas, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        pnPeladasLayout.setVerticalGroup(
            pnPeladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPeladas, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        pnOptions.add(pnPeladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, 20));

        pnAmigos.setBackground(new java.awt.Color(51, 51, 51));

        lbAmigos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbAmigos.setForeground(new java.awt.Color(255, 255, 255));
        lbAmigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAmigos.setText("Amigos");
        lbAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAmigosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAmigosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAmigosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnAmigosLayout = new javax.swing.GroupLayout(pnAmigos);
        pnAmigos.setLayout(pnAmigosLayout);
        pnAmigosLayout.setHorizontalGroup(
            pnAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        pnAmigosLayout.setVerticalGroup(
            pnAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        pnOptions.add(pnAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnOptions, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbAnimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAnimeMouseEntered
        pnAnime.setBackground(new Color(70,70,70));
        lbAnime.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(22,22,22), null));
        pnFamilia.setBackground(new Color(51,51,51)); lbFamilia.setBorder(null);
        pnPeladas.setBackground(new Color(51,51,51)); lbPeladas.setBorder(null);
        pnAmigos.setBackground(new Color(51,51,51));  lbAmigos.setBorder(null);     
    }//GEN-LAST:event_lbAnimeMouseEntered

    private void lbAnimeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAnimeMouseExited
        pnAnime.setBackground(new Color(51,51,51));
        lbAnime.setBorder(null);      
    }//GEN-LAST:event_lbAnimeMouseExited

    private void lbFamiliaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFamiliaMouseEntered
        pnFamilia.setBackground(new Color(70,70,70));
        lbFamilia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(22,22,22), null));
    }//GEN-LAST:event_lbFamiliaMouseEntered

    private void lbFamiliaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFamiliaMouseExited
        pnFamilia.setBackground(new Color(51,51,51));
        lbFamilia.setBorder(null);     
    }//GEN-LAST:event_lbFamiliaMouseExited

    private void lbPeladasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPeladasMouseEntered
        pnPeladas.setBackground(new Color(70,70,70));
        lbPeladas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(22,22,22), null));
    }//GEN-LAST:event_lbPeladasMouseEntered

    private void lbPeladasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPeladasMouseExited
        pnPeladas.setBackground(new Color(51,51,51));
        lbPeladas.setBorder(null);   
    }//GEN-LAST:event_lbPeladasMouseExited

    private void lbAmigosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAmigosMouseEntered
        pnAmigos.setBackground(new Color(70,70,70));
        lbAmigos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(22,22,22), null));
    }//GEN-LAST:event_lbAmigosMouseEntered

    private void lbAmigosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAmigosMouseExited
        pnAmigos.setBackground(new Color(51,51,51));
        lbAmigos.setBorder(null);    
    }//GEN-LAST:event_lbAmigosMouseExited
    
    private void lbAnimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAnimeMouseClicked
        flagSeccion = 1;
        this.setVisible(false);
    }//GEN-LAST:event_lbAnimeMouseClicked

    private void lbFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFamiliaMouseClicked
        flagSeccion = 2;      
        this.setVisible(false);
    }//GEN-LAST:event_lbFamiliaMouseClicked

    private void lbPeladasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPeladasMouseClicked
        flagSeccion = 3;
        this.setVisible(false);
    }//GEN-LAST:event_lbPeladasMouseClicked

    private void lbAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAmigosMouseClicked
        flagSeccion = 4;
        this.setVisible(false);
    }//GEN-LAST:event_lbAmigosMouseClicked

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
            java.util.logging.Logger.getLogger(FrmSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSeccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lbAmigos;
    public javax.swing.JLabel lbAnime;
    public javax.swing.JLabel lbFamilia;
    public javax.swing.JLabel lbPeladas;
    public javax.swing.JPanel pnAmigos;
    public javax.swing.JPanel pnAnime;
    public javax.swing.JPanel pnFamilia;
    public javax.swing.JPanel pnOptions;
    public javax.swing.JPanel pnPeladas;
    // End of variables declaration//GEN-END:variables
}
