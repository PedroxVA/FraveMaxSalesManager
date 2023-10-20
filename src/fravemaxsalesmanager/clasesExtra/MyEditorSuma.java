
package fravemaxsalesmanager.clasesExtra;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/* @author PedroxVA */
public class MyEditorSuma extends AbstractCellEditor implements TableCellEditor, ActionListener{

    Boolean currentValue;
    JButton button;
    protected static final String EDIT = "edit";
    private JTable jTable1;
    
    public MyEditorSuma(JTable jTable1){
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);
        this.jTable1 = jTable1;
    }
    
    public void actionPerformed(ActionEvent e){
        int fila = jTable1.getSelectedRow();
                
                int cantidadActual = (int) jTable1.getModel().getValueAt(fila, 3);
                if (cantidadActual<10){
                    jTable1.getModel().setValueAt(cantidadActual+1, fila, 3);
                }else{
                    JOptionPane.showMessageDialog(null, "Para loco, no somos la fabrica!");    
                }
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