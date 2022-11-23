/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Cliente;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public interface IClienteControle {
    
    void incluirPF(Cliente objeto) throws Exception;
    void alterar(Cliente objeto) throws Exception;
    ArrayList<Cliente > listagemPF() throws Exception;
    Cliente buscar (int id) throws Exception;
    public void verTxt() throws Exception;
    
}
