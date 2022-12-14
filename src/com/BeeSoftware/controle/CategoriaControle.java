/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

/**
 *
 * @author educa
 */
import com.BeeSoftware.modelos.Categoria;
import com.BeeSoftware.persistencia.CategoriaDao;
import com.BeeSoftware.persistencia.ICategoriaDao;
import java.util.ArrayList;
import java.util.Iterator;

public class CategoriaControle implements ICategoriaControle {

    ICategoriaDao categoriaPercistencia = null;

    public CategoriaControle() {
        this.categoriaPercistencia = new CategoriaDao();
    }

    private boolean buscarCategoria(String descricao) throws Exception {
        try {
            ArrayList<Categoria> listagem = categoriaPercistencia.listagem();
            Iterator<Categoria> lista = listagem.iterator();
            while (lista.hasNext()) {
                Categoria aux = lista.next();
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
    public void incluir(Categoria objeto) throws Exception {
        if (buscarCategoria(objeto.getDescricao())) {
            throw new Exception("Categoria já foi cadastrada");
        }
        String aux = objeto.getDescricao();
        if ("".equals(objeto.getDescricao())) {
            throw new Exception("Digite uma categoria válida.");
        }
        categoriaPercistencia.incluir(objeto);
    }

    @Override
    public void alterar(Categoria objeto) throws Exception {
        if (buscarCategoria(objeto.getDescricao())) {
            throw new Exception("Categoria já foi cadastrada");
        }
        String aux = objeto.getDescricao();
        if ("".equals(objeto.getDescricao())) {
            throw new Exception("Digite uma categoria válida.");
        }
        categoriaPercistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Categoria> listagem() throws Exception {
        return categoriaPercistencia.listagem();
    }

    @Override
    public Categoria buscar(int id) throws Exception {
        return categoriaPercistencia.buscar(id);
    }

    @Override
    public void verTxt() throws Exception {

        categoriaPercistencia.verTxt();
    }

}
