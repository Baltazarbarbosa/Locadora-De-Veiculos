/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Acessorios;
import com.BeeSoftware.persistencia.AcessoriosDao;
import com.BeeSoftware.persistencia.IAcessoriosDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author balta
 */
public class AcessoriosControle implements IAcessoriosControle {

    IAcessoriosDao acessoriosPercistencia = null;

    public AcessoriosControle() {
        this.acessoriosPercistencia = new AcessoriosDao();
    }

    private boolean buscarAcessorios(String descricao) throws Exception {
        try {
            ArrayList<Acessorios> listagem = acessoriosPercistencia.listagem();
            Iterator<Acessorios> lista = listagem.iterator();
            while (lista.hasNext()) {
                Acessorios aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(Acessorios objeto) throws Exception {
        if (buscarAcessorios(objeto.getDescricao())) {
            throw new Exception("Acessorio já foi cadastrado");
        }
        String aux = objeto.getDescricao();
        if ("".equals(objeto.getDescricao())) {
            throw new Exception("Digite um acessorio válido.");
        }
        acessoriosPercistencia.incluir(objeto);
    }

    @Override
    public void alterar(Acessorios objeto) throws Exception {
        /*if (buscarAcessorios(objeto.getDescricao())) {
            throw new Exception("Acessorio já foi cadastrado");
        }*/
        String aux = objeto.getDescricao();
        if ("".equals(objeto.getDescricao())) {
            throw new Exception("Digite um acessorio válido.");
        }
        acessoriosPercistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Acessorios> listagem() throws Exception {
        return acessoriosPercistencia.listagem();
    }

    @Override
    public Acessorios buscar(int id) throws Exception {
        return acessoriosPercistencia.buscar(id);
    }
    @Override
    public void verTxt() {
        try {
            acessoriosPercistencia.verTxt();
        } catch (Exception e) {
        }
    }

}
