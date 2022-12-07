/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.persistencia;

import java.util.ArrayList;
import com.BeeSoftware.modelos.Motorista;
/**
 *
 * @author educa
 */
public interface IMotoristaDao {
    void incluir(Motorista objeto) throws Exception;
    void alterar(Motorista objeto) throws Exception;
    ArrayList<Motorista> listagem() throws Exception;
    void verTxt() throws Exception;
    Motorista buscar(int id)throws Exception;
}
