/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

/**
 *
 * @author balta
 */
public class Endereco {

    private String longradouro;
    private String complemento;
    private String cidade;
    private String estado;
    private String bairro;
    private long cep;

    public Endereco(String longradouro, String complemento, String cidade, String estado, String bairro, long cep) {
        this.longradouro = longradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.cep = cep;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String toString() {
        return longradouro
                + ";"
                + complemento
                + ";"
                + bairro
                + ";"
                + cidade
                + ";"
                + estado
                + ";"
                + cep;
    }

}
