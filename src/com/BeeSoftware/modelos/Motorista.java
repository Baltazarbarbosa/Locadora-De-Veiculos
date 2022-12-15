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
    private String cnh;
    private String dataVencimentoCNH;
    private Cliente cliente;
    private String tipoCNH;

        public Motorista() {
    }

    public Motorista(int id, String nome,String cnh, Telefone telefone, Endereco endereco,String url, String dataVencimentoCNH,String tipoCNH) {
        this.nome = nome;
        this.id = id;
        this.url = url;
        this.cnh=cnh;
        this.telefone = telefone;
        this.endereco=endereco;
        this.dataVencimentoCNH=dataVencimentoCNH;
        this.tipoCNH=tipoCNH;
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
    
    public String getCnh(){
        return cnh;
    }
    public void setCnh(String cnh){
        this.cnh=cnh;
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

    public String getDataVencimentoCNH(){
        return dataVencimentoCNH;
    }
    public void setDataVencimentoCNH(String dataVencimentoCNH){
        this.dataVencimentoCNH=dataVencimentoCNH;
    }
    
    public String getTipoCNH(){
        return tipoCNH;
    }
    public void setTipoCNH(String tipoCNH){
        this.tipoCNH=tipoCNH;
    }
    @Override
    public String toString() {
        return id + ";" + nome + ";" + cnh + ";" +telefone+";"+endereco+";"+url+";"+dataVencimentoCNH+";"+tipoCNH;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}