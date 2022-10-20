/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.imagensNaTela;

import com.BeeSoftware.controle.MarcaControle;
import com.BeeSoftware.controle.ModeloControle;
import com.BeeSoftware.modelos.Marca;
import com.BeeSoftware.modelos.Modelo;
import com.BeeSoftware.visao.TelaDosModelos;
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
    String url="";
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        if (isSelected) {
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
        } else {
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
        }
        try {
            TelaDosModelos telamodelo = new TelaDosModelos();
        } catch (Exception e) {
        }
        

        ImageIcon logo = new ImageIcon(url);
                        
        icone.setText("");
        logo.setImage(logo.getImage().getScaledInstance(table.getRowHeight(), table.getRowHeight(), 1));
        
        icone.setIcon(logo);
        icone.setHorizontalAlignment(CENTER);
        return icone;
    }
    public void receber(String url){
        this.url=url;
        
    }

}
