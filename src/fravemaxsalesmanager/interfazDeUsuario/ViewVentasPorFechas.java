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
import javax.swing.JOptionPane;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTablaInforme = new javax.swing.JTable();
        jBGenerarInforme = new javax.swing.JButton();
        jDCFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTTotalVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTNombreCliente = new javax.swing.JTextField();
        jCBVentas = new javax.swing.JComboBox<>();

        jLabel1.setText("Ingrese la Fecha: ");

        jLabel2.setText("Seleccione la venta: ");

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

        jBGenerarInforme.setText("Generar Informe");
        jBGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenerarInformeActionPerformed(evt);
            }
        });

        jDCFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFechaPropertyChange(evt);
            }
        });

        jLabel3.setText("Total Venta sin Impuestos: ");

        jTTotalVenta.setEditable(false);

        jLabel4.setText("Nombre del Cliente:");

        jTNombreCliente.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jTTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jBGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCBVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
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
               listaProductos = proData.buscarProductoPorFechaDeVenta(fechaVenta);
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
        }
       
      
       
       
           
           
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGenerarInforme;
    private javax.swing.JComboBox<String> jCBVentas;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
        DecimalFormatSymbols separadores = new DecimalFormatSymbols();
        separadores.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00", separadores);
        
        for (Producto producto : listaProductos) {
            String nombreProducto = producto.getNombreProducto();
            String marca = producto.getMarca();
            String model = producto.getModelo();
            double precio = producto.getPrecioActual();
            
            String precioFormateado = formato.format(precio);
            
            modelo.addRow(new Object[]{nombreProducto,marca,model,precioFormateado});
            
            totalVenta += producto.getPrecioActual();
            String subTotalString = formato.format(totalVenta);
            jTTotalVenta.setText(subTotalString);
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
}
