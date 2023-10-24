/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemaxsalesmanager.interfazDeUsuario;

import fravemaxsalesmanager.accesoADatos.ClienteData;
import fravemaxsalesmanager.accesoADatos.DetalleVentaData;
import fravemaxsalesmanager.accesoADatos.ProductoData;
import fravemaxsalesmanager.accesoADatos.VentaData;
import fravemaxsalesmanager.clasesExtra.MyEditor;
import fravemaxsalesmanager.clasesExtra.MyEditorSuma;
import fravemaxsalesmanager.clasesExtra.MyRenderer;
import fravemaxsalesmanager.clasesExtra.MyRendererSuma;
import fravemaxsalesmanager.entidades.Cliente;
import fravemaxsalesmanager.entidades.DetalleVenta;
import fravemaxsalesmanager.entidades.Producto;
import fravemaxsalesmanager.entidades.Venta;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author jfneg
 */
public class ViewGestionDeVentas extends javax.swing.JInternalFrame {

    private ClienteData cliData = new ClienteData();
    private ProductoData proData = new ProductoData();
    private VentaData venData = new VentaData();
    private DetalleVentaData deVenData = new DetalleVentaData();
    private DefaultTableModel modeloCliente = new DefaultTableModel();
    private DefaultTableModel modeloVenta = new DefaultTableModel();
    private DefaultTableModel modeloCompras = new DefaultTableModel();
    private List<Producto> listaP = new ArrayList();
    private double subTotal = 0.00;//******************
    private Cliente cliente = new Cliente();
    private List<Producto> listaCarrito = new ArrayList();

    /**
     * Creates new form ViewGestionDeVentas
     */
    public ViewGestionDeVentas() {
        initComponents();
        armarTablaCliente();
        armarTablaVenta();
        armarTablaCompras();
        colocarBotonesTablaCompra();
        cargarComboCliente();
        cargarComboCategoria();
        cargarComboNombreProducto();
        //--------
        String tipoProducto = (String)jCTipoProducto.getSelectedItem();
        listaP = proData.buscarProductoPorNombreProducto(tipoProducto);
        modeloVenta.setRowCount(0);
        for (Producto producto : listaP) {
            cargarTablaVenta(producto);
        }
        //-------
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBuscarCliente = new javax.swing.JComboBox<>();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jCCategoriaProducto = new javax.swing.JComboBox<>();
        jCTipoProducto = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaVenta = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTFSubTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFIVA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFTotalF = new javax.swing.JTextField();
        jBFacturar = new javax.swing.JButton();
        jTFBuscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaCompras = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBAgregarAlCarrito = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDCFecha = new com.toedter.calendar.JDateChooser();

        jLabel2.setText("jLabel2");

        setBorder(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Ventas");

        jLabel3.setText("Buscar Cliente por:");

        jCBuscarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBuscarClienteActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "CUIT", "Domicilio", "Provincia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaCliente);

        jLabel5.setText("Buscar Producto por:");

        jCCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCategoriaProductoActionPerformed(evt);
            }
        });

        jCTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCTipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoProductoActionPerformed(evt);
            }
        });

        jTablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Marca", "Modelo", "Precio Unitario", "Unidades"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablaVenta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTablaVenta);

        jLabel6.setText("Sub-Total: ");

        jTFSubTotal.setEditable(false);

        jLabel7.setText("I.V.A 21 %");

        jTFIVA.setEditable(false);

        jLabel8.setText("Total Factura: ");

        jTFTotalF.setEditable(false);

        jBFacturar.setText("Aceptar y Facturar");
        jBFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFacturarActionPerformed(evt);
            }
        });

        jTablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item", "Precio Item", "+", "Cantidad", "-"
            }
        ));
        jScrollPane3.setViewportView(jTablaCompras);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/carrito.png"))); // NOI18N
        jLabel4.setText("Carrito de Compras");

        jBAgregarAlCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/carrito-de-compras2.png"))); // NOI18N
        jBAgregarAlCarrito.setText("Agregar al Carrito");
        jBAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarAlCarritoActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jTFIVA)
                                    .addComponent(jTFTotalF)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jBBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jCCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jCTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAgregarAlCarrito))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDCFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jBAgregarAlCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jTFSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTotalF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        try {
            String claveString = jTFBuscar.getText().replace(" ", "");
            int clave = Integer.parseInt(claveString);

            String metodoDeBusqueda = (String) jCBuscarCliente.getSelectedItem();
            if (metodoDeBusqueda.equals("ID Cliente")) {
                cliente = cliData.obtenerClientePorId(clave);
                cargarTablaCliente(cliente);
            } else if (metodoDeBusqueda.equals("CUIT Cliente")) {
                cliente = cliData.obtenerClientePorCuil(clave);
                cargarTablaCliente(cliente);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID no valida");
        }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jCCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCategoriaProductoActionPerformed
        // TODO add your handling code here:
        String categoriaSeleccionada = (String) jCCategoriaProducto.getSelectedItem();

        // Limpia el JComboBox jCTipoProducto
        jCTipoProducto.removeAllItems();

        // Carga los productos relacionados en jCTipoProducto basados en la categoría seleccionada
        if (categoriaSeleccionada.equals("Electrodomésticos")) {
            // Asumiendo que tngo una lista de productos para esta categoría
            List<String> productos = obtenerProductosElectrodomesticos();
            for (String producto : productos) {
                jCTipoProducto.addItem(producto);
            }
        } else if (categoriaSeleccionada.equals("Tecnología")) {
            // Asumiendo que tienes una lista de productos para esta categoría
            List<String> productos = obtenerProductosTecnologia();
            for (String producto : productos) {
                jCTipoProducto.addItem(producto);
            }
        } else if (categoriaSeleccionada.equals("Celulares y accesorios")) {
            // Asumiendo que tienes una lista de productos para esta categoría
            List<String> productos = obtenerProductosCelulares();
            for (String producto : productos) {
                jCTipoProducto.addItem(producto);
            }
        }
    }//GEN-LAST:event_jCCategoriaProductoActionPerformed

    private void jCTipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoProductoActionPerformed
        // TODO add your handling code here:
        String tipoProducto = (String)jCTipoProducto.getSelectedItem();
        listaP = proData.buscarProductoPorNombreProducto(tipoProducto);
        modeloVenta.setRowCount(0);
        for (Producto producto : listaP) {
            cargarTablaVenta(producto);
        }
    }//GEN-LAST:event_jCTipoProductoActionPerformed

    private void jBAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarAlCarritoActionPerformed
        // TODO add your handling code here:
        DecimalFormatSymbols separadores = new DecimalFormatSymbols();
        separadores.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00", separadores);
        
        
        
        try {
            int y = jTablaVenta.getSelectedRow();
            Producto producto = listaP.get(y);
            cargarTablaCompras(producto);
            
            String precioFormateado = formato.format(producto.getPrecioActual());
            
            listaCarrito.add(producto);
            //---------------------
            int cantidad = (int)jTablaCompras.getValueAt(jTablaCompras.getRowCount()-1, 3);
            Double precio = producto.getPrecioActual();
            subTotal += precio*cantidad;
            String subTotalString = formato.format(subTotal);
            jTFSubTotal.setText(subTotalString);
            
            Double IVA = subTotal*0.21;
            String IVAString = formato.format(IVA);
            jTFIVA.setText(IVAString);
            
            Double factura = subTotal+IVA;
            String facturaString = formato.format(factura);
            jTFTotalF.setText(facturaString);
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jBAgregarAlCarritoActionPerformed

    private void jBFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFacturarActionPerformed
        // TODO add your handling code here:
        List<DetalleVenta> listaDetalleVenta = new ArrayList<>();
        LocalDate fecha = null;
        try {
            int idCliente = cliente.getIdCliente();
            if (idCliente == 0) {
                JOptionPane.showMessageDialog(null, "¡idCliente no válida!");
            } else {
                fecha = jDCFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                double importeBruto = 0.00;

                Venta venta = new Venta(idCliente, fecha, importeBruto);
                
                if(!listaCarrito.isEmpty()){
                    venData.altaVenta(venta);
                  for (Producto producto : listaCarrito) {
                    int cantidad = 1;//*****************+
                    int idVenta = venta.getIdVenta();
                    Double precioVenta = producto.getPrecioActual();
                    Double descuentos = 0.0; //***********+
                    Double IVA = precioVenta * 0.21; //*******+
                    int idProducto = producto.getIdProducto();
                    importeBruto += precioVenta*cantidad;

                    DetalleVenta detalleVenta = new DetalleVenta(cantidad, idVenta, precioVenta, descuentos, IVA, idProducto);
                    listaDetalleVenta.add(detalleVenta);
                    
                }
                  venta.setImporteBruto(importeBruto);
                  venData.modificarVenta(venta);
                for (DetalleVenta detalleVenta : listaDetalleVenta) {
                    deVenData.altaDetalleVenta(detalleVenta);
                }
                //----
                    String tipoProducto = (String) jCTipoProducto.getSelectedItem();
                    listaP = proData.buscarProductoPorNombreProducto(tipoProducto);
                    modeloVenta.setRowCount(0);
                    for (Producto producto : listaP) {
                        cargarTablaVenta(producto);
                }
                //----
                }else{
                    JOptionPane.showMessageDialog(null, "Carrito vacío.");
                }
                
                
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Fecha no válida.");
        }


    }//GEN-LAST:event_jBFacturarActionPerformed

    private void jCBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBuscarClienteActionPerformed
        // TODO add your handling code here:
        jTFBuscar.setText("");
        modeloCliente.setRowCount(0);
    }//GEN-LAST:event_jCBuscarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarAlCarrito;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBFacturar;
    private javax.swing.JComboBox<String> jCBuscarCliente;
    private javax.swing.JComboBox<String> jCCategoriaProducto;
    private javax.swing.JComboBox<String> jCTipoProducto;
    private com.toedter.calendar.JDateChooser jDCFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTextField jTFIVA;
    private javax.swing.JTextField jTFSubTotal;
    private javax.swing.JTextField jTFTotalF;
    private javax.swing.JTable jTablaCliente;
    private javax.swing.JTable jTablaCompras;
    private javax.swing.JTable jTablaVenta;
    // End of variables declaration//GEN-END:variables

    private void actualizarImporteBruto(){
        subTotal=0.0;
        int filas = jTablaCompras.getRowCount();
        for (int i = 0; i < filas; i++) {
            double precio = (Double)jTablaCompras.getValueAt(i, 1);
            double cantidad = (Double)jTablaCompras.getValueAt(i, 3);;
            subTotal+= precio*cantidad;
        }
        jTFSubTotal.setText(String.valueOf(subTotal));
    }
    private void cargarComboCliente() {
        List<String> buscar = new ArrayList<>();
        buscar.add("ID Cliente");
        buscar.add("CUIT Cliente");

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(buscar.toArray(new String[0]));
        jCBuscarCliente.setModel(comboBoxModel);
    }

    private void cargarComboCategoria() {
        List<String> categ = new ArrayList<>();
        categ.add("Electrodomésticos");
        categ.add("Celulares y accesorios");
        categ.add("Tecnología");
        categ.add("Pequeño Electro");

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(categ.toArray(new String[0]));
        jCCategoriaProducto.setModel(comboBoxModel);

        jCCategoriaProducto.addActionListener(jCTipoProducto);

    }

    private void cargarComboNombreProducto() {
        String categoriaSeleccionada = (String) jCCategoriaProducto.getSelectedItem();

        List<String> nprod = new ArrayList<>();

        if (categoriaSeleccionada.equals("Electrodomésticos")) {

            nprod.add("Heladeras");
            nprod.add("Lavarropas");
            nprod.add("Televisores");
            nprod.add("Cocinas");
        } else if (categoriaSeleccionada.equals("Tecnología")) {
            nprod.add("Notebook");
            nprod.add("Tablets");
        } else if (categoriaSeleccionada.equals("Celulares y accesorios")) {
            nprod.add("Teléfonos");
        }

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(nprod.toArray(new String[0]));
        jCTipoProducto.setModel(comboBoxModel);

    }

    private void armarTablaCliente() {
        modeloCliente.addColumn("Nombre");
        modeloCliente.addColumn("Apellido");
        modeloCliente.addColumn("Cuil");
        modeloCliente.addColumn("Domicilio");
        modeloCliente.addColumn("Provincia");
        jTablaCliente.setModel(modeloCliente);
    }

    private void cargarTablaCliente(Cliente cliente) {
        
        try {
            modeloCliente.setRowCount(0);
            modeloCliente.addRow(new Object[]{cliente.getNombre(), cliente.getApellido(), cliente.getCuil(), cliente.getUbicacion().getDireccion(), cliente.getUbicacion().getProvincia()});
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
    
        }}
        
    
    private void armarTablaVenta() {
        modeloVenta.addColumn("Producto");
        modeloVenta.addColumn("Marca");
        modeloVenta.addColumn("Modelo");
        modeloVenta.addColumn("Precio Unitario");
        modeloVenta.addColumn("Unidades");
        jTablaVenta.setModel(modeloVenta);
    }
    private void cargarTablaVenta(Producto producto){
        
        DecimalFormatSymbols separadores = new DecimalFormatSymbols();
        separadores.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00", separadores);
                
        String prod = producto.getNombreProducto();
        String marca = producto.getMarca();
        String modelo = producto.getModelo();
        
        String precioFormateado = formato.format(producto.getPrecioActual());
        
        Double precioU = producto.getPrecioActual();
        int unidades = producto.getStock();
        Double total = unidades*precioU;
        
        modeloVenta.addRow(new Object[] {prod, marca, modelo, precioFormateado, unidades});
    }
    private void armarTablaCompras(){
        modeloCompras.addColumn("Item");
        modeloCompras.addColumn("Precio Item");
        modeloCompras.addColumn("+");
        modeloCompras.addColumn("Cantidad");
        modeloCompras.addColumn("-");
        jTablaCompras.setModel(modeloCompras);
    }
    private void colocarBotonesTablaCompra(){
        TableColumn agregarColumn;
        agregarColumn = jTablaCompras.getColumnModel().getColumn(4);
        agregarColumn.setCellEditor(new MyEditor(jTablaCompras, jTFSubTotal, jTFIVA, jTFTotalF));
        agregarColumn.setCellRenderer(new MyRenderer(true));
        TableColumn agregarColumnSuma;
        agregarColumnSuma = jTablaCompras.getColumnModel().getColumn(2);
        agregarColumnSuma.setCellEditor(new MyEditorSuma(jTablaCompras, jTFSubTotal, jTFIVA, jTFTotalF));
        agregarColumnSuma.setCellRenderer(new MyRendererSuma(true));
    }
    private void cargarTablaCompras(Producto producto){
        
        DecimalFormatSymbols separadores = new DecimalFormatSymbols();
        separadores.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00", separadores);
        
        
        String prod = producto.getNombreProducto();
        String marca = producto.getMarca();
        String modelo = producto.getModelo();  

        //---
        
        //String precioFormateado = formato.format(producto.getPrecioActual()); genera un error con los botones al hacer un string
        
        Double precioU = producto.getPrecioActual();
        int unidades = producto.getStock();
        //---
        Double total = precioU*unidades;
        String totalFormateado = formato.format(total);
        int cantidad = 1;
        //....
//        JButton botonMas = new JButton("+");
//        JButton botonMenos = new JButton("+");
//        botonMas.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                int fila = jTablaCompras.getSelectedRow();
//                int cantidadActual = (int) modeloCompras.getValueAt(fila, 3);
//                
//                modeloCompras.setValueAt(cantidadActual+1, fila, 3);
//            }
//        });
//        botonMenos.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                int fila = jTablaCompras.getSelectedRow();
//                
//                int cantidadActual = (int) modeloCompras.getValueAt(fila, 3);
//                if (cantidadActual>0){
//                    modeloCompras.setValueAt(cantidadActual-1, fila, 3);
//                }else{
//                    JOptionPane.showMessageDialog(null, "No hay mas stock");    
//                }
//                
//            }
//        });
        
        modeloCompras.addRow(new Object[] {prod+", "+marca+", "+modelo, producto.getPrecioActual(), null, cantidad,null});
        
    }
    

    // Métodos para obtener los productos de cada categoría
    private List<String> obtenerProductosElectrodomesticos() {
        List<String> productos = new ArrayList<>();
        productos.add("Heladeras");
        productos.add("Lavarropas");
        productos.add("Televisores");
        productos.add("Cocinas");
        return productos;
    }

    private List<String> obtenerProductosTecnologia() {
        List<String> productos = new ArrayList<>();
        productos.add("Notebook");
        productos.add("Tablets");
        return productos;
    }

    private List<String> obtenerProductosCelulares() {
        List<String> productos = new ArrayList<>();
        productos.add("Teléfonos");
        return productos;
}

}

