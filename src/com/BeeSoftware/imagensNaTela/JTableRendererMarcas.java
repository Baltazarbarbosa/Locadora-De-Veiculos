/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.imagensNaTela;

import com.BeeSoftware.controle.MarcaControle;
import com.BeeSoftware.controle.ModeloControle;
import com.BeeSoftware.modelos.Marca;
import com.BeeSoftware.modelos.Modelo;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author balta
 */
public class JTableRendererMarcas extends DefaultTableCellRenderer {

    public JLabel icone = new JLabel();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        if (isSelected) {
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
        } else {
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
        }

        MarcaControle marcaControle = new MarcaControle();
        try {
            String[] lista = marcaControle.buscar((int) table.getValueAt(row, 0));
            ImageIcon logo = new ImageIcon(lista[2]);
            icone.setText("");
            logo.setImage(logo.getImage().getScaledInstance(table.getRowHeight(), table.getRowHeight(), 1));

            icone.setIcon(logo);
            icone.setHorizontalAlignment(CENTER);
        } catch (Exception e) {
        }

        return icone;
    }

}
