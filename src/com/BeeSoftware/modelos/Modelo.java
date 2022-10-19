/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

/**
 *
 * @author balta
 */
public class Modelo {
    
    Marca marca = null;
    
    //Atributos
    private int id = 0;
    private String descricao = "";
    private String url = "";
    private int idMarca = marca.getId();

    public Modelo() {
    }
    
    public Modelo(int id, String descricao, String url) {
        this.descricao = descricao;
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + url + ";" + idMarca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
<<<<<<< HEAD

=======
    
    
>>>>>>> d45c042b3925f7972e4d893a1f28977bb99ef21a
}
