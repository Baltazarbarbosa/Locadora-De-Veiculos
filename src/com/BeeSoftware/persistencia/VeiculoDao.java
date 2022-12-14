/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.persistencia;

import com.BeeSoftware.controle.CategoriaControle;
import com.BeeSoftware.controle.ModeloControle;
import com.BeeSoftware.enumeradores.SituacaoVeiculo;
import com.BeeSoftware.enumeradores.TipoCombustivel;
import com.BeeSoftware.enumeradores.TipoVeiculo;
import com.BeeSoftware.ferramentas.GeradorIdentificador;
import com.BeeSoftware.modelos.Veiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author balta
 */
public class VeiculoDao implements IVeiculoDao {
    
    private String nomeDoArquivoNoDisco;
    
    public VeiculoDao() {
        
        this.nomeDoArquivoNoDisco = "./src/com/BeeSoftware/arquivosdedados/Veiculo.txt";
    }
    
    @Override
    public void incluir(Veiculo objeto) throws Exception {
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
    public void alterar(Veiculo objeto) throws Exception {
        
        try {
            Iterator<Veiculo> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            
            while (lista.hasNext()) {
                
                Veiculo aux = lista.next();
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
    public ArrayList<Veiculo> listagem() throws Exception {
        
        try {
            ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                ModeloControle modelocontrole = new ModeloControle();
                CategoriaControle categoriaControle = new CategoriaControle();
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavam(vetorString[2]);
                objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(Integer.parseInt(vetorString[5]));
                objetoVeiculo.setAnoModelo(Integer.parseInt(vetorString[6]));
                objetoVeiculo.setCombustivel(TipoCombustivel.valueOf(vetorString[7]));
                objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
                objetoVeiculo.setTipoVeiculo(TipoVeiculo.valueOf(vetorString[9]));
                objetoVeiculo.setSituacao(SituacaoVeiculo.valueOf(vetorString[10]));
                int idModelo = Integer.parseInt(vetorString[11]);
                objetoVeiculo.setModelo(modelocontrole.buscar(idModelo));
                int idCat = Integer.parseInt(vetorString[12]);
                objetoVeiculo.setCategoria(categoriaControle.buscar(idCat));
                
                listaDeVeiculos.add(objetoVeiculo);
            }
            br.close();
            return listaDeVeiculos;
        } catch (Exception erro) {
            throw erro;
        }
        
    }
    
    @Override
    public Veiculo buscar(int id) throws Exception {
        
        try {
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                ModeloControle modelocontrole = new ModeloControle();
                CategoriaControle categoriaControle = new CategoriaControle();
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavam(vetorString[2]);
                objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(Integer.parseInt(vetorString[5]));
                objetoVeiculo.setAnoModelo(Integer.parseInt(vetorString[6]));
                objetoVeiculo.setCombustivel(TipoCombustivel.valueOf(vetorString[7]));
                objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
                objetoVeiculo.setTipoVeiculo(TipoVeiculo.valueOf(vetorString[9]));
                objetoVeiculo.setSituacao(SituacaoVeiculo.valueOf(vetorString[10]));
                int idModelo = Integer.parseInt(vetorString[11]);
                objetoVeiculo.setModelo(modelocontrole.buscar(idModelo));
                int idCat = Integer.parseInt(vetorString[12]);
                objetoVeiculo.setCategoria(categoriaControle.buscar(idCat));
                if (objetoVeiculo.getId() == id) {
                    br.close();
                    return new Veiculo(Integer.parseInt(vetorString[0]), vetorString[1], vetorString[2], Float.parseFloat(vetorString[3]), Float.parseFloat(vetorString[4]), Integer.parseInt(vetorString[5]), Integer.parseInt(vetorString[6]), TipoCombustivel.valueOf(vetorString[7]), Integer.parseInt(vetorString[8]), TipoVeiculo.valueOf(vetorString[9]), SituacaoVeiculo.valueOf(vetorString[10]), modelocontrole.buscar(idModelo), categoriaControle.buscar(idCat));
                }
                
            }
            
            return null;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public void verTxt() {
        
        File arquivo = new File("./src/com/BeeSoftware/arquivosdedados/Veiculo.txt");
        try {
            arquivo.createNewFile();
        } catch (Exception e) {
            System.out.println("");
        }
    }
    
}
