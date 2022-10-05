/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.persistencia;

import com.BeeSoftware.ferramentas.GeradorIdentificador;
import com.BeeSoftware.modelos.Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author balta
 */
public class ModeloDao implements IModeloDao {

    private String nomeDoArquivoNoDisco;

    public ModeloDao() {
        nomeDoArquivoNoDisco = "./src/com/BeeSoftware/arquivosdedados/Modelo.txt";
    }

    @Override
    public void incluir(Modelo objeto) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificador.getID());
            //Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Modelo objeto) throws Exception {

        Iterator<Modelo> lista = listagem().iterator();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
        BufferedWriter bw = new BufferedWriter(fw);

        while (lista.hasNext()) {

            Modelo aux = lista.next();
            if (aux.getId() == objeto.getId()) {
                bw.write(objeto.toString());
            } else {
                bw.write(aux.toString() + "\n");
            }

        }

        bw.close();
    }

    @Override
    public ArrayList<Modelo> listagem() throws Exception {
        try {
            ArrayList<Modelo> listaDeModelos = new ArrayList<Modelo>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Modelo objetoModelo = new Modelo();
                String vetorString[] = linha.split(";");
                objetoModelo.setId(Integer.parseInt(vetorString[0]));
                objetoModelo.setDescricao(vetorString[1]);
                objetoModelo.setUrl(vetorString[2]);
                listaDeModelos.add(objetoModelo);
            }
            br.close();
            return listaDeModelos;
        } catch (Exception erro) {
            throw erro;
        }
    }

}