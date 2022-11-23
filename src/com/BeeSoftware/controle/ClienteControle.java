/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Cliente;
import com.BeeSoftware.persistencia.ClienteDao;
import com.BeeSoftware.persistencia.IClienteDao;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public class ClienteControle implements IClienteControle{
    
    IClienteDao clientePersistencia = new ClienteDao();
    

    @Override
    public void incluirPF(Cliente objeto) throws Exception {
       
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Cliente> listagemPF() throws Exception {
    
       return null;
    
    }

    @Override
    public Cliente buscar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verTxt() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
