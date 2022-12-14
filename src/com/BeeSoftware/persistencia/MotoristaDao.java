/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.persistencia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import com.BeeSoftware.modelos.Endereco;
import com.BeeSoftware.modelos.Telefone;
import com.BeeSoftware.ferramentas.GeradorIdentificador;
import com.BeeSoftware.modelos.Motorista;
import com.BeeSoftware.modelos.Cliente;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author educa
 */
public class MotoristaDao implements IMotoristaDao{
    private String nomeDoArquivoNoDiscoMotorista;
    private String caminho = "";
    Motorista objetoMotorista = new Motorista();
    Cliente objetoCliente = new Cliente();
    
    public MotoristaDao (){
        nomeDoArquivoNoDiscoMotorista = "./src/com/BeeSoftware/arquivosdedados/Motorista.txt";
    }
    
    @Override
    public void incluir(Motorista objeto) throws Exception {
        try {
            caminho = nomeDoArquivoNoDiscoMotorista;
                //cria o arquivo
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoMotorista, true);
                //Criar o buffer do arquivo
                BufferedWriter bw = new BufferedWriter(fw);
                // Incluindo o id no objeto ******
                objeto.setId(GeradorIdentificador.getID());
                //Escreve no arquivo
                bw.write(objeto.toString() + "\n");
                //fecha o arquivo
                bw.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
        try {
            Iterator<Motorista> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoMotorista);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Motorista aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");
                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        try {
            ArrayList<Motorista> listaDeMotorista= new ArrayList<Motorista>();
            FileReader fr = new FileReader(nomeDoArquivoNoDiscoMotorista);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista objetoMotorista = new Motorista();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1].replaceAll("_", " "));
                objetoMotorista.setCnh(vetorString[2]);
                // PEGAR TELEFONE
                long ddi = Long.parseLong(vetorString[3]);
                long ddd = Long.parseLong(vetorString[4]);
                long numero = Long.parseLong(vetorString[5]);
                Telefone telefone = new Telefone(ddi, ddd, numero);
                objetoMotorista.setTelefone(telefone);
                // PEGAR ENDERE??O
                String longradouro = vetorString[6];
                String complemento = vetorString[7];
                String bairro = vetorString[8];
                String cidade = vetorString[9];
                String estado = vetorString[10];
                long cep = Long.parseLong(vetorString[11]);
                Endereco endereco = new Endereco(longradouro, complemento, cidade, estado, bairro, cep);
                objetoMotorista.setEndereco(endereco);
                objetoMotorista.setUrl(vetorString[12]);
                objetoMotorista.setDataVencimentoCNH(vetorString[13]);    
                objetoMotorista.setTipoCNH(vetorString[14]);
                listaDeMotorista.add(objetoMotorista);
            }
            br.close();
            return listaDeMotorista;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void verTxt() throws Exception {
        File arquivo = new File("./src/com/BeeSoftware/arquivosdedados/Motorista.txt");
        try {
        arquivo.createNewFile();
    } catch (Exception e) {
            System.out.println("");
    }
    }

    @Override
    public Motorista buscar(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDiscoMotorista);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Motorista objetoMotorista = new Motorista();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1].replaceAll("_", " "));
                objetoMotorista.setCnh(vetorString[2]);
                // PEGAR TELEFONE
                long ddi = Long.parseLong(vetorString[3]);
                long ddd = Long.parseLong(vetorString[4]);
                long numero = Long.parseLong(vetorString[5]);
                Telefone telefone = new Telefone(ddi, ddd, numero);
                objetoMotorista.setTelefone(telefone);
                // PEGAR ENDERE??O
                String longradouro = vetorString[6];
                String complemento = vetorString[7];
                String bairro = vetorString[8];
                String cidade = vetorString[9];
                String estado = vetorString[10];
                long cep = Long.parseLong(vetorString[11]);
                Endereco endereco = new Endereco(longradouro, complemento, cidade, estado, bairro, cep);
                objetoMotorista.setEndereco(endereco);
                objetoMotorista.setUrl(vetorString[12]);
                objetoMotorista.setDataVencimentoCNH(vetorString[13]);    
                objetoMotorista.setTipoCNH(vetorString[14]);
                
            if(objetoMotorista.getId()==id){
                br.close();
                return new Motorista((Integer.parseInt(vetorString[0])),vetorString[1],vetorString[2],telefone,endereco,vetorString[12],vetorString[13],vetorString[14]);
            }
        }
        return null;
    }
    }
    

