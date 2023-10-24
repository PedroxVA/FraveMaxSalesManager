
package fravemaxsalesmanager.clasesExtra;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

/* @author PedroxVA */
public class MyEditor  extends AbstractCellEditor implements TableCellEditor, ActionListener{


    private JTextField jTFSubTotal;
    Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable jTable1;
    
    public MyEditor(JTable jTable1, JTextField subTotal){
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.jTable1 = jTable1;
        this.jTFSubTotal = subTotal;
    }
    
    public void actionPerformed(ActionEvent e){
        int fila = jTable1.getSelectedRow();

        int cantidadActual = (int) jTable1.getModel().getValueAt(fila, 3);
        if (cantidadActual > 0) {
            jTable1.getModel().setValueAt(cantidadActual - 1, fila, 3);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede comprar en negativo");
        }
//-----
        double subTotal = 0;
        int filas = jTable1.getRowCount();
        for (int i = 0; i < filas; i++) {
            double precio = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 1)));
            double cantidad = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 3)));
            subTotal+= precio*cantidad;
        }
        jTFSubTotal.setText(String.valueOf(subTotal));
 
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
