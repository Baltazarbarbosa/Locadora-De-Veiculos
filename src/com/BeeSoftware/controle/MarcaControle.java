/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Marca;
import com.BeeSoftware.persistencia.IMarcaDao;
import com.BeeSoftware.persistencia.MarcaDao;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author balta
 */
public class MarcaControle implements IMarcaControle {

    IMarcaDao marcaPersistencia = null;

    public MarcaControle() {
        this.marcaPersistencia = new MarcaDao();
    }

    private boolean buscarMarca(String descricao) throws Exception {
        try {
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while (lista.hasNext()) {
                Marca aux = lista.next();
                if (aux.getDescicao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(Marca objeto) throws Exception {
        if (buscarMarca(objeto.getDescicao())) {
            throw new Exception("Marca já foi cadastrada");
        }
        String aux = objeto.getDescicao();
        if("".equals(objeto.getDescicao())){
            throw new Exception("Digite uma marca válida.");
        }
        marcaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Marca objeto) throws Exception {
    if (buscarMarca(objeto.getDescicao())) {
            throw new Exception("Marca já foi cadastrada");
        }
    String aux = objeto.getDescicao();
    if("".equals(objeto.getDescicao())){
        throw new Exception("Digite uma marca válida.");}
        marcaPersistencia.alterar(objeto);    
    }
    
    @Override
    public ArrayList<Marca> listagem() throws Exception {
         return marcaPersistencia.listagem();
    }

    @Override
    public Marca buscar(int id) throws Exception {
        return marcaPersistencia.buscar(id);
    }

        public void verTxt() {
            
            
        }
    

    

    

    
}
