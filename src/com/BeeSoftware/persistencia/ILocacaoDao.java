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

    void incluir(Locacao objeto) throws Exception;

    void alterar(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception;

    ArrayList<Locacao> listagem(TipoDeCliente tipoDoCliente) throws Exception;

    Locacao buscar(int id, TipoDeCliente tipoDoCliente) throws Exception;

    void locar() throws Exception;

    void devolver() throws Exception;

    void cancelar() throws Exception;

    void verTxt() throws Exception;

}
