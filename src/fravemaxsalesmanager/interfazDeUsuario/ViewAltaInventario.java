/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemaxsalesmanager.interfazDeUsuario;

import fravemaxsalesmanager.accesoADatos.ProductoData;
import fravemaxsalesmanager.entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author jfneg
 */
public class ViewAltaInventario extends javax.swing.JInternalFrame {

    private ProductoData proData = null;
   
    public ViewAltaInventario() {
        proData = new ProductoData();
        
            
        initComponents();
        cargarCombo();
        cargarComboMarca();
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTnombreProducto = new javax.swing.JTextField();
        jTmodelo = new javax.swing.JTextField();
        jTdescripcion = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTstock = new javax.swing.JTextField();
        jBaltaProducto = new javax.swing.JButton();
        jCcategoria = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();
        jCcomboMarca = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jLabel1.setText("Categoría: ");

        jLabel2.setText("Nombre Producto:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Descripción:");

        jLabel6.setText("Precio:");

        jLabel7.setText("Stock:");

        jTdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdescripcionActionPerformed(evt);
            }
        });

        jBaltaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/iconoGuardar.png"))); // NOI18N
        jBaltaProducto.setText("Grabar");
        jBaltaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaltaProductoActionPerformed(evt);
            }
        });

        jCcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcategoriaActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/cerrar.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCcomboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCcomboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcomboMarcaActionPerformed(evt);
            }
        });

        jMenu1.setText("Alta");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(57, 57, 57)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTmodelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTnombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTstock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTprecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdescripcion)
                    .addComponent(jCcategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCcomboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBaltaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jCcomboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jBaltaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdescripcionActionPerformed

    private void jBaltaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaltaProductoActionPerformed
        String categoria = (String)jCcategoria.getSelectedItem();
        String nombreProducto = jTnombreProducto.getText();
        String marca = (String)jCcomboMarca.getSelectedItem();
        String modelo = jTmodelo.getText();
        String descripcion =jTdescripcion.getText();
       
        //****************************************************************************//   
        
        try {
        Double precioActual = Double.parseDouble(jTprecio.getText());
        int stock = Integer.parseInt(jTstock.getText()); 
        Producto producto = new Producto(categoria, nombreProducto, marca, modelo, descripcion, precioActual, stock, true);
        
        proData.altaProducto(producto);
        
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El campo de precio y stock  solo debe contener números");
        }
       
                
        
    }//GEN-LAST:event_jBaltaProductoActionPerformed

    private void jCcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCcategoriaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCcomboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcomboMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCcomboMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBaltaProducto;
    private javax.swing.JComboBox<String> jCcategoria;
    private javax.swing.JComboBox<String> jCcomboMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTextField jTnombreProducto;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTstock;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo ()
    {
        List<String> categ = new ArrayList<>();
        categ.add("Electrodomésticos");
        categ.add("Celulares y accesorios");
        categ.add("Tecnología");
        categ.add("Pequeño Electro");
        
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(categ.toArray(new String[0]));    
        jCcategoria.setModel(comboBoxModel);
    }
    
        private void cargarComboMarca ()
    {
        List<String> marca = new ArrayList<>();
        marca.add("Whirpool");
        marca.add("Siam");
        marca.add("LG");
        marca.add("Samsung");
        marca.add("Motorola");
        marca.add("Nokia");
        
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(marca.toArray(new String[0]));    
        jCcomboMarca.setModel(comboBoxModel);
    }
}
