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
    public void alterar(Locacao objeto) throws Exception {

        locacaoPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
    
      return locacaoPersistencia.listagem();

    }

    @Override
    public Locacao buscar(int id) throws Exception {
       
        return locacaoPersistencia.buscar(id);
    }

   

    @Override
    public void verTxt() throws Exception {

        locacaoPersistencia.verTxt();
    }

    @Override
    public void locar(Locacao objeto) throws Exception {
        locacaoPersistencia.locar(objeto);
    
    }

    @Override
    public void devolver(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception {
        locacaoPersistencia.devolver(objeto, tipoDoCliente);
    
    }

    @Override
    public void cancelar(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception {
    
        locacaoPersistencia.cancelar(objeto, tipoDoCliente);
    
    }

}
