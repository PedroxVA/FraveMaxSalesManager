/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemaxsalesmanager.interfazDeUsuario;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author jfneg
 */
public class ViewListados extends javax.swing.JInternalFrame {

      ViewVentasPorFechas informeFrame = new ViewVentasPorFechas();
      ViewListarTodasLasVentas listarFrame =new ViewListarTodasLasVentas();
    
    public ViewListados() {
        initComponents();

        
        
        //((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).setNorthPane(null);
        MouseEvent click = new MouseEvent(jDPEscritorio, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, rootPaneCheckingEnabled);
         
        //setBorder(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/1.png"));
        Image miImagen = icono.getImage();
        jDPEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0 , getWidth(), getHeight(), this);

            }
        }
        ;
        jBVentasPorFecha = new javax.swing.JButton();
        jBListarTodasLasVentas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(null);
        setTitle("Listado de Prueba");
        setFrameIcon(null);

        jBVentasPorFecha.setText("Listado de Ventas por Fecha");
        jBVentasPorFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVentasPorFechaMouseClicked(evt);
            }
        });
        jBVentasPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVentasPorFechaActionPerformed(evt);
            }
        });

        jBListarTodasLasVentas.setText("⮚\tListar todas las ventas en una fecha.");
        jBListarTodasLasVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBListarTodasLasVentasMouseClicked(evt);
            }
        });
        jBListarTodasLasVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarTodasLasVentasActionPerformed(evt);
            }
        });

        jButton2.setText("⮚\tListar todas las ventas de un Cliente X.");

        jButton3.setText("⮚\tMostrar que clientes compraron el producto X.");

        jDPEscritorio.setLayer(jBVentasPorFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPEscritorio.setLayer(jBListarTodasLasVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPEscritorio.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPEscritorio.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDPEscritorioLayout = new javax.swing.GroupLayout(jDPEscritorio);
        jDPEscritorio.setLayout(jDPEscritorioLayout);
        jDPEscritorioLayout.setHorizontalGroup(
            jDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDPEscritorioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVentasPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBListarTodasLasVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jDPEscritorioLayout.setVerticalGroup(
            jDPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDPEscritorioLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jBVentasPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jBListarTodasLasVentas)
                .addGap(55, 55, 55)
                .addComponent(jButton2)
                .addGap(42, 42, 42)
                .addComponent(jButton3)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jDPEscritorio)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDPEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVentasPorFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVentasPorFechaMouseClicked
            if (!informeFrame.isVisible()) {
            jDPEscritorio.add(informeFrame);
            informeFrame.setVisible(true);
            try {
                informeFrame.setMaximum(true);  // Opcional: maximiza el JInternalFrame
            } catch (PropertyVetoException ex) {
                // Manejar la excepción si es necesario
            }
        }
    }//GEN-LAST:event_jBVentasPorFechaMouseClicked

    private void jBVentasPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVentasPorFechaActionPerformed
             
    }//GEN-LAST:event_jBVentasPorFechaActionPerformed

    private void jBListarTodasLasVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBListarTodasLasVentasMouseClicked
        // TODO add your handling code here:
         if (!informeFrame.isVisible()) {
            jDPEscritorio.add(informeFrame);
            informeFrame.setVisible(true);
            try {
                informeFrame.setMaximum(true);  // Opcional: maximiza el JInternalFrame
            } catch (PropertyVetoException ex) {
                // Manejar la excepción si es necesario
            }
        }
    }//GEN-LAST:event_jBListarTodasLasVentasMouseClicked

    private void jBListarTodasLasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodasLasVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBListarTodasLasVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBListarTodasLasVentas;
    private javax.swing.JButton jBVentasPorFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDPEscritorio;
    // End of variables declaration//GEN-END:variables





}
