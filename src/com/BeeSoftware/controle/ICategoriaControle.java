/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.controle;

/**
 *
 * @author educa
 */
import com.BeeSoftware.modelos.Categoria;
import java.util.ArrayList;

public interface ICategoriaControle {
    void incluir(Categoria objeto) throws Exception;
    void alterar(Categoria objeto) throws Exception;
    ArrayList<Categoria> listagem() throws Exception;
    Categoria buscar(int id) throws Exception;
    
}
