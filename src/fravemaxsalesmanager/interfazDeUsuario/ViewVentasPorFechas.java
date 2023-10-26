/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemaxsalesmanager.interfazDeUsuario;

import fravemaxsalesmanager.accesoADatos.ClienteData;
import fravemaxsalesmanager.accesoADatos.Conexion;
import fravemaxsalesmanager.accesoADatos.ProductoData;
import fravemaxsalesmanager.accesoADatos.VentaData;
import fravemaxsalesmanager.entidades.Cliente;
import fravemaxsalesmanager.entidades.Producto;
import fravemaxsalesmanager.entidades.Venta;
import fravemaxsalesmanager.interfazDeUsuario.FormatoDeTablas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author jfneg
 */
public class ViewVentasPorFechas extends javax.swing.JInternalFrame {

    Conexion miConexion = new Conexion();
    ProductoData proData = new ProductoData();
    ClienteData clieData = new ClienteData();
    VentaData venData = new VentaData();
    
    List<Producto> listaProductos = new ArrayList<>();
    List<Venta> listaVentas = new ArrayList<>();
    private DefaultTableModel modelo = new DefaultTableModel();
    
    private Double totalVenta = 0.00;
    int idCliente = 0;
    
    

    public ViewVentasPorFechas() {
        
               
        initComponents();
        armarTitulosTabla();
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fravemaxsalesmanager.interfazDeUsuario.Backinformes();
        jLabel3 = new javax.swing.JLabel();
        jTTotalVenta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTablaInforme = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBVentas = new javax.swing.JComboBox<>();
        jBGenerarInforme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("Total Venta sin Impuestos: ");

        jTTotalVenta.setEditable(false);

        jTTablaInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTTablaInforme);

        jLabel4.setText("Nombre del Cliente:");

        jTNombreCliente.setEditable(false);
        jTNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione la venta: ");

        jBGenerarInforme.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jBGenerarInforme.setText("Generar Informe");
        jBGenerarInforme.setOpaque(false);
        jBGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenerarInformeActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la Fecha: ");

        jDCFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFechaPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Productos Vendidos en una fecha específica por operación");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/cerrar.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addComponent(jBGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(jTTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jBGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenerarInformeActionPerformed
     
               
        try {
            LocalDate fechaVenta = jDCFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String idVentaString = String.valueOf(jCBVentas.getSelectedItem());
            int idVenta = Integer.parseInt(idVentaString);
            if (fechaVenta == null){
       
           JOptionPane.showMessageDialog(null, "En esa fecha no hay ventas, ingrese una nueva");
           
       
            }else{
           Cliente cliente = clieData.obtenerClientePorIdVenta(idVenta);
           
           if (cliente != null){
               
               jTNombreCliente.setText(cliente.getNombre()+" "+cliente.getApellido());
               listaProductos = proData.buscarProductoPorFechaDeVentaYIdVenta(fechaVenta, idVenta);//++++++
               
               reiniciarTabla();
               cargarTabla();
               
           } else {
               reiniciarTabla();
               jTNombreCliente.setText("Cliente no encontrado");
               JOptionPane.showMessageDialog(null, "No existe tal registro en la fecha indicada.");
               
               
           }
           
          
           
       }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "En esa fecha no hay ventas, ingrese una nueva");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Identificador de ventas no válido, ingrese uno nuevo");
            jTNombreCliente.setText("");
            reiniciarTabla();
            jTTotalVenta.setText("");
            jTTotalVenta.setHorizontalAlignment(SwingConstants.RIGHT);
        }
       

           //calcularTotal();
    }//GEN-LAST:event_jBGenerarInformeActionPerformed

    private void jDCFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFechaPropertyChange
        // TODO add your handling code here:
        
        try {
            jCBVentas.removeAllItems();
            listaVentas = venData.buscarVentaPorFecha(jDCFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        
        for (Venta venta : listaVentas) {
            jCBVentas.addItem(String.valueOf(venta.getIdVenta()));
        }
        } catch (NullPointerException e) {
        }
        
        
    }//GEN-LAST:event_jDCFechaPropertyChange

    private void jTNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGenerarInforme;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBVentas;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTNombreCliente;
    private javax.swing.JTable jTTablaInforme;
    private javax.swing.JTextField jTTotalVenta;
    // End of variables declaration//GEN-END:variables


    private void armarTitulosTabla (){
     
        modelo.addColumn("Producto");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Precio Unitario");
        jTTablaInforme.setModel(modelo);
        
        
    
    
    }
    
    private void cargarTabla() {
        totalVenta = 0.00;
        FormatoDeTablas formato = new FormatoDeTablas();
        
        DecimalFormatSymbols separadoresTV = new DecimalFormatSymbols();
        separadoresTV.setDecimalSeparator('.');
        DecimalFormat formatoTV = new DecimalFormat("$ #,##0.00", separadoresTV);
        
        for (Producto producto : listaProductos) {
            String nombreProducto = producto.getNombreProducto();
            String marca = producto.getMarca();
            String model = producto.getModelo();
            double precio = producto.getPrecioActual();
            
            String precioFormateado = formatoTV.format(precio);  // este formatea una columna de la tabla 
            
            modelo.addRow(new Object[]{nombreProducto,marca,model,precio});
            
            int ultimaFila = modelo.getRowCount()-1;
            jTTablaInforme.getColumnModel().getColumn(3).setCellRenderer(formato);
            jTTablaInforme.setValueAt(precio, ultimaFila, 3);
            
            totalVenta +=precio;
            jTTotalVenta.setText(formatoTV.format(totalVenta));
            
            
            
            
            totalVenta += producto.getPrecioActual();
            String subTotalString = formatoTV.format(totalVenta);  //
            jTTotalVenta.setText(subTotalString);
            jTTotalVenta.setHorizontalAlignment(SwingConstants.RIGHT);
        }
    
    }
    

    
    private void reiniciarTabla(){
    
        modelo.setRowCount(0);
    
    }
    
    private Cliente obtenerClientePorId(String idVenta) {
    int idVentaInt = Integer.parseInt(idVenta);
    // Realiza la lógica para obtener el cliente por el ID de la venta
    // Puedes utilizar tu método obtenerClientePorId aquí
    return clieData.obtenerClientePorId(idVentaInt);
}
   /* 
    public void calcularTotal(){
        double total = 0;
        
        for (int i = 0; i < jTTablaInforme.getColumnCount(); i++) {

            String valor = String.valueOf(jTTablaInforme.getValueAt(i, 3));
            total += Double.parseDouble(valor);
            
        }
        
        jTTotalVenta.setText(darFormato(total));
        jTTotalVenta.setHorizontalAlignment(SwingConstants.RIGHT);
    }
    
    private String darFormato(double nro){
        DecimalFormatSymbols separadores = new DecimalFormatSymbols();
        separadores.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00", separadores);

        return formato.format(nro);
    }*/
}
