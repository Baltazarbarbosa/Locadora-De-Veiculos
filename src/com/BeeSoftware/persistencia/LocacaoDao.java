/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.persistencia;

import com.BeeSoftware.controle.AcessoriosControle;
import com.BeeSoftware.controle.ClienteControle;
import com.BeeSoftware.controle.MotoristaControle;
import com.BeeSoftware.controle.VeiculoControle;
import com.BeeSoftware.enumeradores.SituacaoDaLocacao;
import com.BeeSoftware.enumeradores.TipoDeCliente;
import com.BeeSoftware.ferramentas.GeradorIdentificador;
import com.BeeSoftware.modelos.Acessorios;
import com.BeeSoftware.modelos.Locacao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;

/**
 *
 * @author balta
 */
public class LocacaoDao implements ILocacaoDao {

    MotoristaControle motoristaControle = new MotoristaControle();
    ClienteControle clienteControle = new ClienteControle();
    AcessoriosControle acessoriosControle = new AcessoriosControle();
    VeiculoControle veiculoControle = new VeiculoControle();

    private String nomeDoArquivoNoDisco;

    public LocacaoDao() {
        nomeDoArquivoNoDisco = "./src/com/BeeSoftware/arquivosdedados/Locacao.txt";
    }

    @Override
    public void locar(Locacao objeto) throws Exception {
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
    public void devolver(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelar(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verTxt() throws Exception {

        File arquivo = new File("./src/com/BeeSoftware/arquivosdedados/Locacao.txt");
        try {
            arquivo.createNewFile();
        } catch (Exception e) {
            System.out.println("");
        }

    }

    @Override
    public void alterar(Locacao objeto) throws Exception {
        try {
            Iterator<Locacao> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {

                Locacao aux = lista.next();
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
    public ArrayList<Locacao> listagem() throws Exception {
        try {
            ArrayList<Locacao> listaDeLocacao = new ArrayList<Locacao>();
            /*File arquivo = new File("./src/com/locagyn/arquivosdedados/Locacao.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Locacao.txt";
            }*/
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                IVeiculoDao objetoVeiculo = new VeiculoDao();
                IMotoristaDao objetoMotorista = new MotoristaDao();
                IAcessoriosDao objetoAcessorio = new AcessoriosDao();
                Locacao objetoLocacao = new Locacao();
                String vetorString[] = linha.split(";");
                objetoLocacao.setId(Integer.parseInt(vetorString[0]));
                int idMotorista = Integer.parseInt(vetorString[2]);
                objetoLocacao.setMotorista(objetoMotorista.buscar(idMotorista));
                int idVeiculo = Integer.parseInt(vetorString[3]);
                objetoLocacao.setVeiculo(objetoVeiculo.buscar(idVeiculo));
                int idAcessorios = Integer.parseInt(vetorString[4]);
                objetoLocacao.setAcessorio(objetoAcessorio.buscar(idAcessorios));
                objetoLocacao.setDataInicio(vetorString[5]);
                objetoLocacao.setDataFim(vetorString[6]);
                objetoLocacao.setValorDaLocação(Float.parseFloat(vetorString[7]));
                objetoLocacao.setSituacao(vetorString[8]);
                objetoLocacao.setDiasLocados(Long.parseLong(vetorString[9]));
                
                
                listaDeLocacao.add(objetoLocacao);

            }
            br.close();
            return listaDeLocacao;
        } catch (Exception erro) {
            throw erro;
        }
    
    }

    @Override
    public Locacao buscar(int id) throws Exception {

                 FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha;
        while ((linha = br.readLine()) != null) {
            IVeiculoDao objetoVeiculo = new VeiculoDao();
            IMotoristaDao objetoMotorista = new MotoristaDao();
            IAcessoriosDao objetoAcessorio = new AcessoriosDao();
            Locacao objetoLocacao = new Locacao();
            String vetorString[] = linha.split(";");
            objetoLocacao.setId(Integer.parseInt(vetorString[0]));
            int idMotorista = Integer.parseInt(vetorString[2]);
            objetoLocacao.setMotorista(objetoMotorista.buscar(idMotorista));
            int idVeiculo = Integer.parseInt(vetorString[3]);
            objetoLocacao.setVeiculo(objetoVeiculo.buscar(idVeiculo));
            int idAcessorios = Integer.parseInt(vetorString[4]);
            objetoLocacao.setAcessorio(objetoAcessorio.buscar(idAcessorios));
            objetoLocacao.setDataInicio(vetorString[5]);
            objetoLocacao.setDataFim(vetorString[6]);
            objetoLocacao.setValorDaLocação(Float.parseFloat(vetorString[7]));
            objetoLocacao.setSituacao(vetorString[8]);
            objetoLocacao.setDiasLocados(Long.parseLong(vetorString[9]));
            objetoLocacao.setValorDia(Float.parseFloat(vetorString[10]));
            if (objetoLocacao.getId() == id) {
                br.close();
                return new Locacao(Integer.parseInt(vetorString[0]), motoristaControle.buscar(Integer.parseInt(vetorString[1])), veiculoControle.buscar(Integer.parseInt(vetorString[2])), acessoriosControle.buscar(Integer.parseInt(vetorString[3])), vetorString[4],vetorString[5],Float.parseFloat(vetorString[6]),vetorString[7],Long.parseLong(vetorString[8]));
            }
        }
        return null;
    }

}
