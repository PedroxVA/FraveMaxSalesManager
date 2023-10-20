
package fravemaxsalesmanager.clasesExtra;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/* @author PedroxVA */
public class MyRendererSuma extends JLabel implements TableCellRenderer{

    boolean isBordered = true;
    
    public MyRendererSuma(boolean isBordered){
        this.isBordered = isBordered;
        setOpaque(true);
    }
    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column){
        if(row==table.getModel().getRowCount()-1){
            return new JButton("+");
        }else{
            setBackground(new Color(0xffffff));
            return this;
        }
    }

}
