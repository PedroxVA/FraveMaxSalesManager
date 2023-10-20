
package fravemaxsalesmanager.interfazDeUsuario;

import fravemaxsalesmanager.accesoADatos.ClienteData;
import fravemaxsalesmanager.accesoADatos.Conexion;
import fravemaxsalesmanager.accesoADatos.ProductoData;
import fravemaxsalesmanager.accesoADatos.VentaData;
import fravemaxsalesmanager.entidades.Cliente;
import fravemaxsalesmanager.entidades.Producto;
import fravemaxsalesmanager.entidades.Venta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Belén
 */
public class ViewListarTodasLasVentas extends javax.swing.JInternalFrame {
 Conexion miConexion = new Conexion();
    ProductoData proData = new ProductoData();
    ClienteData clieData = new ClienteData();
    VentaData venData = new VentaData();
    
     ArrayList<Venta> listaVentas = new ArrayList();
     List<Producto> listaProductos = new ArrayList<>();
     private DefaultTableModel modelo = new DefaultTableModel();
     
     
    public ViewListarTodasLasVentas() {
        initComponents();
        modelo = new DefaultTableModel();
        jTTablaLista.setModel(modelo);

         armarTitulosTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jBGenerarLista = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTablaLista = new javax.swing.JTable();

        jLabel1.setText("Ingrese una fecha:");

        jLabel2.setText("Listado de todas las ventas.");

        jBGenerarLista.setText("Generar informe ");
        jBGenerarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenerarListaActionPerformed(evt);
            }
        });

        jTTablaLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTTablaLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGenerarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBGenerarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGenerarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenerarListaActionPerformed
        LocalDate fecha = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        List<Venta> todasLasVentas = venData.buscarVentaPorFecha(fecha);

    modelo.setRowCount(0);
     
     for (Venta venta : todasLasVentas) {
        modelo.addRow(new Object[]{venta.getIdVenta(), venta.getIdCliente(), venta.getFechaVenta(), venta.getImporteBruto()});
    }
   
             
    }//GEN-LAST:event_jBGenerarListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGenerarLista;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTTablaLista;
    // End of variables declaration//GEN-END:variables

 private void armarTitulosTabla (){
     
        modelo.addColumn("ID Venta");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Fecha Venta");
        modelo.addColumn("Importe");
       
        jTTablaLista.setModel(modelo);
        
        
    
    
    }
    


}
