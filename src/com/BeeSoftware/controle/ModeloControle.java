/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

/**
 *
 * @author educa
 */
import com.BeeSoftware.modelos.Modelo;
import com.BeeSoftware.persistencia.IModeloDao;
import com.BeeSoftware.persistencia.ModeloDao;
import java.util.ArrayList;
import java.util.Iterator;

public class ModeloControle implements IModeloControle{
    IModeloDao modeloPersistencia = null;
    
    public ModeloControle(){
        this.modeloPersistencia = new ModeloDao();
    }
    
    private boolean buscarModelo(String descricao) throws Exception{
        try {
            ArrayList<Modelo> listagem = modeloPersistencia.listagem();
            Iterator<Modelo> lista = listagem.iterator();
            while (lista.hasNext()) {
                Modelo aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception error) {
            throw error;
        }
    }
    
    public void incluir(Modelo objeto) throws Exception {
        if (buscarModelo(objeto.getDescricao())) {
            throw new Exception("Modelo já foi cadastrada");
        }
        String aux = objeto.getDescricao();
        if("".equals(objeto.getDescricao())){
            throw new Exception("Digite um modelo válido.");
        }
        modeloPersistencia.incluir(objeto);
    }

    public void alterar(Modelo objeto) throws Exception {
    if (buscarModelo(objeto.getDescricao())) {
            throw new Exception("Modelo já foi cadastrada");
        }
    String aux = objeto.getDescricao();
    if("".equals(objeto.getDescricao())){
        throw new Exception("Digite um modelo válido.");}
        modeloPersistencia.alterar(objeto);    
    }
    

    public ArrayList<Modelo> listagem() throws Exception {
         return modeloPersistencia.listagem();
    }

}
