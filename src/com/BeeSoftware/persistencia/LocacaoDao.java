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
    public void locar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void devolver() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void cancelar() throws Exception {
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
    public void incluir(Locacao objeto) throws Exception {
        
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
    public void alterar(Locacao objeto, TipoDeCliente tipoDoCliente) throws Exception {
        try {
            Iterator<Locacao> lista = listagem(tipoDoCliente).iterator();
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
    public ArrayList<Locacao> listagem(TipoDeCliente tipoDoCliente) throws Exception {
        try {
            ArrayList<Locacao> listaDeLocacoes = new ArrayList<Locacao>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Locacao objetoLocacao = new Locacao();
                String vetorString[] = linha.split(";");
                objetoLocacao.setId(Integer.parseInt(vetorString[0]));
                
                SimpleDateFormat formatter = new SimpleDateFormat(vetorString[1]);
                Date date = formatter.parse(vetorString[1]);
                objetoLocacao.setDataInicio(date);
                
                SimpleDateFormat formatter2 = new SimpleDateFormat(vetorString[2]);
                Date date2 = formatter2.parse(vetorString[2]);
                objetoLocacao.setDataFinal(date2);
                
                objetoLocacao.setValorDaLocacao(Float.parseFloat(vetorString[3]));
                objetoLocacao.setSituacaoDaLocacao(SituacaoDaLocacao.valueOf(vetorString[4]));
                
                int idMotorista = Integer.parseInt(vetorString[5]);
                objetoLocacao.setMotorista(motoristaControle.buscar(idMotorista));
                //Cotinuar
                int idCliente = Integer.parseInt(vetorString[6]);
                objetoLocacao.setCliente(clienteControle.buscar(idCliente, tipoDoCliente));
                //Continuar
                int idAcessorio = Integer.parseInt(vetorString[7]);
                objetoLocacao.setAcssorios(acessoriosControle.buscar(idAcessorio));
                
                int idVeiculo = Integer.parseInt(vetorString[8]);
                objetoLocacao.setVeiculo(veiculoControle.buscar(idVeiculo));
                
                listaDeLocacoes.add(objetoLocacao);
            }
            br.close();
            return listaDeLocacoes;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public Locacao buscar(int id, TipoDeCliente tipoDoCliente) throws Exception {
        
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        
        while ((linha = br.readLine()) != null) {
            
            Locacao objetoLocacao = new Locacao();
            String vetorString[] = linha.split(";");
            
            objetoLocacao.setId(Integer.parseInt(vetorString[0]));
            
            SimpleDateFormat formatter = new SimpleDateFormat(vetorString[1]);
            Date date = formatter.parse(vetorString[1]);
            objetoLocacao.setDataInicio(date);
            
            SimpleDateFormat formatter2 = new SimpleDateFormat(vetorString[2]);
            Date date2 = formatter2.parse(vetorString[2]);
            objetoLocacao.setDataFinal(date2);
            
            objetoLocacao.setValorDaLocacao(Float.parseFloat(vetorString[3]));
            objetoLocacao.setSituacaoDaLocacao(SituacaoDaLocacao.valueOf(vetorString[4]));
            
            int idMotorista = Integer.parseInt(vetorString[5]);
            objetoLocacao.setMotorista(motoristaControle.buscar(idMotorista));
            //Cotinuar
            int idCliente = Integer.parseInt(vetorString[6]);
            objetoLocacao.setCliente(clienteControle.buscar(idCliente, tipoDoCliente));
            //Continuar
            int idAcessorio = Integer.parseInt(vetorString[7]);
            objetoLocacao.setAcssorios(acessoriosControle.buscar(idAcessorio));
            
            int idVeiculo = Integer.parseInt(vetorString[8]);
            objetoLocacao.setVeiculo(veiculoControle.buscar(idVeiculo));
            
            if (objetoLocacao.getId() == id) {
                return new Locacao(Integer.parseInt(vetorString[0]), date, date2, Float.parseFloat(vetorString[3]), SituacaoDaLocacao.valueOf(vetorString[4]), motoristaControle.buscar(idMotorista), clienteControle.buscar(idCliente, tipoDoCliente), acessoriosControle.buscar(idAcessorio), veiculoControle.buscar(idVeiculo));
            }
            
        }
        return null;
        
    }
    
}
