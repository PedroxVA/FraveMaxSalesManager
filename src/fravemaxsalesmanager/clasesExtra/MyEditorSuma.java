
package fravemaxsalesmanager.clasesExtra;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

/* @author PedroxVA */
public class MyEditorSuma extends AbstractCellEditor implements TableCellEditor, ActionListener{

    private JTextField jTFSubTotal;
    private JTextField jTFIVA;
    private JTextField jTFTotalF;
    Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable jTable1;
    
    public MyEditorSuma(JTable jTable1, JTextField subTotal, JTextField IVA, JTextField total){
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.jTable1 = jTable1;
        this.jTFSubTotal = subTotal;
        this.jTFIVA = IVA;
        this.jTFTotalF = total;
    }
    
    public void actionPerformed(ActionEvent e){
        DecimalFormatSymbols separadores = new DecimalFormatSymbols();
        separadores.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00", separadores);
        
        
        
        int fila = jTable1.getSelectedRow();

        int cantidadActual = (int) jTable1.getModel().getValueAt(fila, 3);
        if (cantidadActual < 10) {
            jTable1.getModel().setValueAt(cantidadActual + 1, fila, 3);
        } else {
            JOptionPane.showMessageDialog(null, "Para loco, no somos la fabrica!");
        }
        //------------
        double subTotal = 0;
        int filas = jTable1.getRowCount();
        for (int i = 0; i < filas; i++) {

            double precio = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 1))) ;
            double cantidad = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 3))) ; 
            subTotal += precio * cantidad;
        }
        
        jTFSubTotal.setText(formato.format(subTotal));
        double iva = subTotal*0.21;
        jTFIVA.setText(formato.format(iva));
        double total = subTotal+iva;
        jTFTotalF.setText(formato.format(total));
    }
    public Object getCellEditorValue(){
        return currentValue;
    }
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column){
        if(row == table.getModel().getRowCount()-1){
            currentValue = (Boolean) value;
            return button;
        }
        return new JLabel();
    }
}