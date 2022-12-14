/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.persistencia;

/**
 *
 * @author educa
 */
import com.BeeSoftware.ferramentas.GeradorIdentificador;
import com.BeeSoftware.modelos.Categoria;
import com.BeeSoftware.modelos.Marca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class CategoriaDao implements ICategoriaDao {

    private String nomeDoArquivoNoDisco;

    public CategoriaDao() {
        nomeDoArquivoNoDisco = "./src/com/BeeSoftware/arquivosdedados/Categorias.txt";
    }

    @Override
    public void incluir(Categoria objeto) throws Exception {
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
    public void alterar(Categoria objeto) throws Exception {
        try {
            Iterator<Categoria> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {

                Categoria aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");
                } else {
                    bw.write(aux.toString() + "\n");
                }

            }

            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Categoria> listagem() throws Exception {
        try {
            ArrayList<Categoria> listaDeAcessorios = new ArrayList<Categoria>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Categoria objetoAcessorios = new Categoria();
                String vetorString[] = linha.split(";");
                objetoAcessorios.setId(Integer.parseInt(vetorString[0]));
                objetoAcessorios.setDescricao(vetorString[1]);
                objetoAcessorios.setValorDaLocacao(Float.parseFloat(vetorString[2]));
                listaDeAcessorios.add(objetoAcessorios);
            }
            br.close();
            return listaDeAcessorios;
        } catch (Exception erro) {
            throw erro;
        }

    }

    @Override
    public Categoria buscar(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Categoria objetoAcessorios = new Categoria();
            String vetorString[] = linha.split(";");
            objetoAcessorios.setId(Integer.parseInt(vetorString[0]));
            objetoAcessorios.setDescricao(vetorString[1]);
            objetoAcessorios.setValorDaLocacao(Float.parseFloat(vetorString[2]));
            if (objetoAcessorios.getId() == id) {
                br.close();
                return new Categoria((Integer.parseInt(vetorString[0])), vetorString[1], (Float.parseFloat(vetorString[2])));
            }
        }
        return null;
    }

    @Override
    public void verTxt() throws Exception {
        File arquivo = new File("./src/com/BeeSoftware/arquivosdedados/Categorias.txt");
        try {
            arquivo.createNewFile();
        } catch (Exception e) {
            System.out.println("");
        }

    }
}
