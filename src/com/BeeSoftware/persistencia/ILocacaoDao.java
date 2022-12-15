/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.persistencia;

import com.BeeSoftware.enumeradores.TipoDeCliente;
import com.BeeSoftware.modelos.Locacao;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public interface ILocacaoDao {

    void alterar(Locacao objeto) throws Exception;
    ArrayList<Locacao> listagem() throws Exception;
    Locacao buscar(int id) throws Exception;
    void locar(Locacao objeto) throws Exception;
    void devolver(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception;
    void cancelar(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception;
    void verTxt() throws Exception;

}
