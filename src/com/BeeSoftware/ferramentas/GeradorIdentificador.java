/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.ferramentas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author balta
 */
public class GeradorIdentificador {


    public static void criarArquivoDeID() throws FileNotFoundException, IOException {
        String nomeDoArquivo = "./src/com/BeeSoftware/arquivosdedados/idGerado.txt";
        //String nomeDoArquivo ="idGerado.txt";
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = 1 + "";
        bw.write(saida);
        //fecha o arquivo
        bw.close();
    }

    public static int getID() throws FileNotFoundException, IOException {
        String nomeDoArquivo = "./src/com/BeeSoftware/arquivosdedados/idGerado.txt";
        File arq = new File("./src/com/BeeSoftware/arquivosdedados/idGerado.txt");
        if (!arq.exists()) {
            arq.createNewFile();
            FileWriter fw = new FileWriter("./src/com/BeeSoftware/arquivosdedados/idGerado.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("0");
            bw.close();
            nomeDoArquivo = "./src/com/BeeSoftware/arquivosdedados/idGerado.txt";

        }
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();
        int id = Integer.parseInt(linha);
        br.close();
        id++;
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = id + "";
        bw.write(saida);
        //fecha o arquivo
        bw.close();
        return id;
    }

}
