/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemaxsalesmanager.interfazDeUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;

/**
 *
 * @author jfneg
 */
public class ViewListados extends javax.swing.JInternalFrame {

      ViewVentasPorFechas informeFrame = new ViewVentasPorFechas();
      ViewListarTodasLasVentas listarFrame =new ViewListarTodasLasVentas();
      ViewListarVentasClienteX clienteFrame = new ViewListarVentasClienteX();
      ViewListarClienteProdX productoXFrame = new  ViewListarClienteProdX();
      

    
    
public ViewListados() {
   
                      
        initComponents();
        informeFrame = new ViewVentasPorFechas();
        listarFrame = new ViewListarTodasLasVentas();
        clienteFrame = new ViewListarVentasClienteX();
        productoXFrame = new ViewListarClienteProdX();
        
    informeFrame.setClosable(false);
    informeFrame.setMaximizable(false);
    informeFrame.setIconifiable(false);
    informeFrame.setBorder(null);

    listarFrame.setClosable(false);
    listarFrame.setMaximizable(false);
    listarFrame.setIconifiable(false);

    clienteFrame.setClosable(false);
    clienteFrame.setMaximizable(false);
    clienteFrame.setIconifiable(false);

    productoXFrame.setClosable(false);
    productoXFrame.setMaximizable(false);
    productoXFrame.setIconifiable(false);
        
        
   }
        
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/3.png"));
        Image miimagen = icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(miimagen, 0, 0, getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jBListarVentasClienteX = new javax.swing.JButton();
        jBListarTodasLasVentas = new javax.swing.JButton();
        jBVentasPorFecha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setFrameIcon(null);

        jDesktopPane1.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú de Informes - Fravemax");

        jButton3.setBackground(new java.awt.Color(179, 235, 235));
        jButton3.setText("Mostrar que clientes compraron el producto X.");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jBListarVentasClienteX.setBackground(new java.awt.Color(179, 235, 235));
        jBListarVentasClienteX.setText("Listar todas las ventas de un Cliente X.");
        jBListarVentasClienteX.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jBListarVentasClienteX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBListarVentasClienteXMouseClicked(evt);
            }
        });
        jBListarVentasClienteX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarVentasClienteXActionPerformed(evt);
            }
        });

        jBListarTodasLasVentas.setBackground(new java.awt.Color(179, 235, 235));
        jBListarTodasLasVentas.setText("Listar todas las ventas en una fecha.");
        jBListarTodasLasVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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

        jBVentasPorFecha.setBackground(new java.awt.Color(179, 235, 235));
        jBVentasPorFecha.setText("Listado de Ventas por Fecha");
        jBVentasPorFecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jBVentasPorFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVentasPorFechaMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(179, 235, 235));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/cerrar.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBListarVentasClienteX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBListarTodasLasVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBVentasPorFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBListarVentasClienteX, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(239, 239, 239)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBListarTodasLasVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBVentasPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(jBListarVentasClienteX, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jBVentasPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(69, 69, 69)
                    .addComponent(jBListarTodasLasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(146, 146, 146)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVentasPorFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVentasPorFechaMouseClicked
                            
        
            if (!informeFrame.isVisible()) {
          
                jDesktopPane1.add(informeFrame);
                informeFrame.setVisible(true);
            try {
                informeFrame.setMaximum(true);  // Opcional: maximiza el JInternalFrame
            } catch (PropertyVetoException ex) {
                // Manejar la excepción si es necesario
            }
        }
    }//GEN-LAST:event_jBVentasPorFechaMouseClicked

    private void jBListarTodasLasVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBListarTodasLasVentasMouseClicked
        // TODO add your handling code here:
         if (!listarFrame.isVisible()) {
            jDesktopPane1.add(listarFrame);
            listarFrame.setVisible(true);
            try {
                listarFrame.setMaximum(true);  // Opcional: maximiza el JInternalFrame
            } catch (PropertyVetoException ex) {
                // Manejar la excepción si es necesario
            }
        }
    }//GEN-LAST:event_jBListarTodasLasVentasMouseClicked

    private void jBListarTodasLasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodasLasVentasActionPerformed
        
        
    }//GEN-LAST:event_jBListarTodasLasVentasActionPerformed

    private void jBListarVentasClienteXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarVentasClienteXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBListarVentasClienteXActionPerformed

    private void jBListarVentasClienteXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBListarVentasClienteXMouseClicked
        // TODO add your handling code here:
         if (!clienteFrame.isVisible()) {
            jDesktopPane1.add(clienteFrame);
            clienteFrame.setVisible(true);
            try {
                clienteFrame.setMaximum(true);  // Opcional: maximiza el JInternalFrame
            } catch (PropertyVetoException ex) {
                // Manejar la excepción si es necesario
            }
        }
    }//GEN-LAST:event_jBListarVentasClienteXMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        if (!productoXFrame.isVisible()) {
            jDesktopPane1.add(productoXFrame);
            productoXFrame.setVisible(true);
            try {
                productoXFrame.setMaximum(true);  // Opcional: maximiza el JInternalFrame
            } catch (PropertyVetoException ex) {
                // Manejar la excepción si es necesario
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBListarTodasLasVentas;
    private javax.swing.JButton jBListarVentasClienteX;
    private javax.swing.JButton jBVentasPorFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables





}
