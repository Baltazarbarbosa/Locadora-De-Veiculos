/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.enumeradores.TipoDeCliente;
import com.BeeSoftware.modelos.Locacao;
import com.BeeSoftware.persistencia.ILocacaoDao;
import com.BeeSoftware.persistencia.LocacaoDao;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public class LocacaoControle implements ILocacaoControle {

    ILocacaoDao locacaoPersistencia = new LocacaoDao();

    @Override
    public void incluir(Locacao objeto) throws Exception {

        locacaoPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception {

        locacaoPersistencia.alterar(objeto, tipoDoCliente);
    }

    @Override
    public ArrayList<Locacao> listagem(TipoDeCliente tipoDoCliente) throws Exception {
    
      return locacaoPersistencia.listagem(tipoDoCliente);

    }

    @Override
    public Locacao buscar(int id, TipoDeCliente tipoDoCliente) throws Exception {
       
        return locacaoPersistencia.buscar(id, tipoDoCliente);
    }

    @Override
    public void locar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verTxt() throws Exception {

        locacaoPersistencia.verTxt();
    }

}
