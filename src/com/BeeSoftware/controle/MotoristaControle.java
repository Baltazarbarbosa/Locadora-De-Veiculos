/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Motorista;
import com.BeeSoftware.persistencia.MotoristaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author educa
 */
public class MotoristaControle implements IMotoristaControle{
    IMotoristaControle motoristaPersistencia=null;
    
    public MotoristaControle(){
        this.motoristaPersistencia = (IMotoristaControle) new MotoristaDao();
    }
    @Override
    public void incluir(Motorista objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verTxt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean buscar(String nome) throws Exception {
        try {
            ArrayList<Motorista> listagem = motoristaPersistencia.listagem();
            Iterator<Motorista> lista = listagem.iterator();
            while (lista.hasNext()) {
                Motorista aux = lista.next();
                if (aux.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void buscar(Motorista objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
