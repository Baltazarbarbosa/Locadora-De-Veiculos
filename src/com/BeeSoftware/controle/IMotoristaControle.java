/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Motorista;
import java.util.ArrayList;

/**
 *
 * @author educa
 */
public interface IMotoristaControle {
    void incluir(Motorista objeto)throws Exception;
    void alterar(Motorista objeto)throws Exception;
    void buscar(Motorista objeto)throws Exception;
    ArrayList<Motorista> listagem()throws Exception;
    void verTxt();
}
