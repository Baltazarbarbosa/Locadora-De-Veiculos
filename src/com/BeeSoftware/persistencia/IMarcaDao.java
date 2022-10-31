/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.persistencia;

import com.BeeSoftware.modelos.Marca;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public interface IMarcaDao {

    void incluir(Marca objeto) throws Exception;
    void alterar(Marca objeto) throws Exception;
    ArrayList<Marca> listagem() throws Exception;
    Marca buscar (int id) throws Exception;

    public void verTxt();
}
