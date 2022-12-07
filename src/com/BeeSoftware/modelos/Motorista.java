/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

import java.util.Date;

/**
 *
 * @author educa
 */
public class Motorista {
    private int id;
    private String nome;
    private Telefone telefone;
    private Endereco endereco;
    private String url;
    private Date dataVencimentoCNH;
    private Cliente cliente;

        public Motorista() {
    }

    public Motorista(int id, String nome, Telefone telefone, Endereco endereco,String url, Date dataVencimentoCNH) {
        this.nome = nome;
        this.id = id;
        this.url = url;
        this.telefone = telefone;
        this.endereco=endereco;
        this.dataVencimentoCNH=dataVencimentoCNH;
    }

    public Motorista(int id, String nome, String url, Telefone telefone, Endereco endereco, int idCliente) {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public Telefone getTelefone(){
        return telefone;
    }
    public void setTelefone(Telefone telefone){
        this.telefone=telefone;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }

    public Date getDataVencimentoCNH(){
        return dataVencimentoCNH;
    }
    public void setDataVencimentoCNH(Date dataVencimentoCNH){
        this.dataVencimentoCNH=dataVencimentoCNH;
    }
    @Override
    public String toString() {
        return id + ";" + nome + ";" + url + ";" +telefone+";"+endereco+";"+cliente.getId();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}