/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Locacao;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public interface ILocacaoControle {

    void incluir(Locacao objeto) throws Exception;
    void alterar(Locacao objeto) throws Exception;
    ArrayList<Locacao > listagem() throws Exception;
    Locacao buscar (int id) throws Exception;
    
    void locar()throws Exception;
    void devolver()throws Exception;
    void cancelar()throws Exception;
    void verTxt()throws Exception;

}
