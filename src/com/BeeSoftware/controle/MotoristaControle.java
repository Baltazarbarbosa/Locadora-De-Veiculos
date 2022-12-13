/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.modelos.Motorista;
import com.BeeSoftware.persistencia.MotoristaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author educa
 */
public class MotoristaControle implements IMotoristaControle{
    IMotoristaControle motoristaPersistencia=null;
    
    public MotoristaControle(){
        this.motoristaPersistencia = (IMotoristaControle) new MotoristaDao();
    }
    @Override
    public void incluir(Motorista objeto) throws Exception {
        if (buscarMotorista(objeto.getNome())) {
            throw new Exception("Motorista já foi cadastrado!");
        }
        if ("".equals(objeto.getNome())) {
            throw new Exception("Digite um motorista válido!");
        }
        if(buscarMotorista(objeto.getCnh())){
            throw new Exception("CNH já cadastrada!");
        }
        if ("".equals(objeto.getCnh())) {
            throw new Exception("Digite uma CNH válida!");
        }
        if ("".equals(objeto.getTipoCNH())) {
            throw new Exception("Digite o tipo da CNH!");
        }
        if (".\\src\\com\\BeeSoftware\\cnh\\".equals(objeto.getUrl())) {
            throw new Exception("Escolha a foto da cnh!");
        }
        motoristaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
        if (objeto.getUrl().equals("")) {
            throw new Exception("Favor selecionar uma cnh para alterar");
        }
        if (buscarMotorista(objeto.getNome())) {
            throw new Exception("Motorista já foi cadastrada");
        }
        
        if (objeto.getNome().equals("")) {
            throw new Exception("Digite um nome válido.");
        }
        if(buscarMotorista(objeto.getCnh())){
            throw new Exception("CNH já cadastrada!");
        }
        if ("".equals(objeto.getCnh())) {
            throw new Exception("Digite uma CNH válida!");
        }
        if ("".equals(objeto.getTipoCNH())) {
            throw new Exception("Digite o tipo da CNH!");
        }
        motoristaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        return motoristaPersistencia.listagem();
    }

    @Override
    public void verTxt() {
        motoristaPersistencia.verTxt();
    }

    public boolean buscarMotorista(String nome) throws Exception {
        try {
            ArrayList<Motorista> listagem = motoristaPersistencia.listagem();
            Iterator<Motorista> lista = listagem.iterator();
            while (lista.hasNext()) {
                Motorista aux = lista.next();
                if (aux.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void buscar(Motorista objeto) throws Exception {
        motoristaPersistencia.buscar(objeto);
    }
    
    
}
