/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemaxsalesmanager.interfazDeUsuario;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.table.DefaultTableCellRenderer;


public class FormatoDeTablas extends DefaultTableCellRenderer {
    
        private final DecimalFormat format;
    
        public FormatoDeTablas() {
        super();
        DecimalFormatSymbols separadores = new DecimalFormatSymbols();
        separadores.setDecimalSeparator('.');
        format = new DecimalFormat("$ #,##0.00", separadores);
        setHorizontalAlignment(RIGHT);
    }

    @Override
    protected void setValue(Object value) {
        if (value != null) {
            setText(format.format(value));
        } else {
            setText("");
        }
    }


    
    
}
