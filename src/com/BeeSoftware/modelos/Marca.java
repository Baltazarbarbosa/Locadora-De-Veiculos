/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

/**
 *
 * @author balta
 */
public class Marca {

    //atributos
    private int id = 0;
    private String descicao = "";
    private String url = "";

    //Metodos
    public Marca() {
    }
    public Marca(int id, String descricao, String url) {

        this.id = id;
        this.descicao = descricao;
        this.url = url;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescicao() {
        return descicao;
    }
    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public String toString() {
        return id + ";" + descicao + ";" + url;
    }
}
