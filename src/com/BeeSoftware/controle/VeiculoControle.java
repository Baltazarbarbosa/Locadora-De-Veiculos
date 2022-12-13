/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Veiculo;
import com.BeeSoftware.persistencia.IVeiculoDao;
import com.BeeSoftware.persistencia.VeiculoDao;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public class VeiculoControle implements IVeiculoControle {

    IVeiculoDao veiculoPersistencia = new VeiculoDao();

    @Override
    public void incluir(Veiculo objeto) throws Exception {
        veiculoPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Veiculo objeto) throws Exception {
        veiculoPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
        return veiculoPersistencia.listagem();
    }

    @Override
    public Veiculo buscar(int id) throws Exception {
        return veiculoPersistencia.buscar(id);
    }

    @Override
    public void verTxt() {

        veiculoPersistencia.verTxt();

    }

}
