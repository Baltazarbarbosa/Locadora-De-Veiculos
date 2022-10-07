/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Modelo;
import java.util.ArrayList;
/**
 *
 * @author educa
 */
public interface IModeloControle {
    public interface IMarcaControle {
    void incluir(Modelo objeto)throws Exception;
    void alterar(Modelo objeto)throws Exception;
    void escolherMarca(Modelo objeto)throws Exception;
    ArrayList<Modelo> listagem()throws Exception;
}
}
