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
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jfneg
 */
public class ViewModificaInventario extends javax.swing.JInternalFrame {

    ProductoData proData = new ProductoData();

    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            if (row == 7 && column == 1){//stock
                return false;
            }
            return true;
        }
    };

    public ViewModificaInventario() {
      
        initComponents();
                
        setBorder(null);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new fravemaxsalesmanager.interfazDeUsuario.Backinventarios();
        jLbuscarProducto = new javax.swing.JLabel();
        jTbuscarID = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTproductoSeleccionado = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column == 0 || row == 7 || row == 0){return false;}

                return true; // 7 es el índice de la columna "stock"
            }
        };
        jBModificar = new javax.swing.JButton();
        jBBaja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel.setDoubleBuffered(false);
        jPanel.setOpaque(false);

        jLbuscarProducto.setText("Buscar producto por ID: ");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTproductoSeleccionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Id Producto", ""},
                {"Categoría", ""},
                {"Nombre", ""},
                {"Marca", null},
                {"Modelo", null},
                {"Descripción", null},
                {"Precio", null},
                {"Stock", ""}
            },
            new String [] {
                "", "Producto Seleccionado"
            }
        ));
        jScrollPane1.setViewportView(jTproductoSeleccionado);
        if (jTproductoSeleccionado.getColumnModel().getColumnCount() > 0) {
            jTproductoSeleccionado.getColumnModel().getColumn(1).setResizable(false);
        }

        jBModificar.setText("Modificar y Guardar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBaja.setText("Baja");
        jBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Modificación y Baja de Productos del Inventario");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                            .addComponent(jLbuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTbuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(jBBuscar)
                            .addGap(209, 209, 209))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jBBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        cargarDatosTabla();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
             
        try {
        // Obtener los valores de la tabla (asegúrate de que los nombres sean correctos)
        int idProducto = (int) jTproductoSeleccionado.getValueAt(0, 1);
        String categoria = (String) jTproductoSeleccionado.getValueAt(1, 1);
        String nombreProducto = (String) jTproductoSeleccionado.getValueAt(2, 1);
        String marca = (String) jTproductoSeleccionado.getValueAt(3, 1);
        String modelo = (String) jTproductoSeleccionado.getValueAt(4, 1);
        String descripcion = (String) jTproductoSeleccionado.getValueAt(5, 1);
        Double precio = Double.parseDouble(String.valueOf(jTproductoSeleccionado.getValueAt(6, 1)) );
        int stock = Integer.parseInt(String.valueOf(jTproductoSeleccionado.getValueAt(7, 1)) );
        Boolean activo = true;

        // Crear un nuevo objeto Producto con los valores modificados
        Producto productoModificado = new Producto(idProducto, categoria, nombreProducto, marca, modelo, descripcion, precio, stock, true);

        // Actualizar el producto en la base de datos
        proData.modificarProducto(productoModificado);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al procesar los datos del producto."+e.getMessage());
    }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaActionPerformed
            try {
        // Obtener el ID del producto a dar de baja (supongamos que se ingresa un ID en un campo de texto)
        int idProducto = Integer.parseInt(jTbuscarID.getText().trim());

        // Usar ProductoData para dar de baja el producto en la base de datos
        proData.bajaProductoPorID(idProducto);
        limpiarTabla();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al procesar la baja del producto.");
    }
    }//GEN-LAST:event_jBBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBaja;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbuscarProducto;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTbuscarID;
    private javax.swing.JTable jTproductoSeleccionado;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosTabla() {
        try {
    
            int id = Integer.parseInt(jTbuscarID.getText().replace(" ", ""));

            Producto producto = proData.buscarProductoPorId(id);
            if (producto.getIdProducto() == 0) {
                limpiarTabla();
                JOptionPane.showMessageDialog(null, "Error, producto no encontrado.");
            } else {
                jTproductoSeleccionado.setValueAt(producto.getIdProducto(), 0, 1);
                jTproductoSeleccionado.setValueAt(producto.getCategoria(), 1, 1);
                jTproductoSeleccionado.setValueAt(producto.getNombreProducto(), 2, 1);
                jTproductoSeleccionado.setValueAt(producto.getMarca(), 3, 1);
                jTproductoSeleccionado.setValueAt(producto.getModelo(), 4, 1);
                jTproductoSeleccionado.setValueAt(producto.getDescripcion(), 5, 1);
                jTproductoSeleccionado.setValueAt(producto.getPrecioActual(), 6, 1);
                jTproductoSeleccionado.setValueAt(producto.getStock(), 7, 1);
    
                
                
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ha ingresado una Id Inválida");
        }
        
    }
   private void limpiarTabla(){
       jTproductoSeleccionado.setValueAt(null, 0, 1);
       jTproductoSeleccionado.setValueAt(null, 1, 1);
       jTproductoSeleccionado.setValueAt(null, 2, 1);
       jTproductoSeleccionado.setValueAt(null, 3, 1);
       jTproductoSeleccionado.setValueAt(null, 4, 1);
       jTproductoSeleccionado.setValueAt(null, 5, 1);
       jTproductoSeleccionado.setValueAt(null, 6, 1);
       jTproductoSeleccionado.setValueAt(null, 7, 1);
   }

}
    

