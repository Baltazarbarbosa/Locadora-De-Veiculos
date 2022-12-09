/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

import com.BeeSoftware.enumeradores.SituacaoDeLocacao;

/**
 *
 * @author balta
 */
public class Acessorios {

    private int id = 0;
    private String descricao = "";
    private float valorDaLocacao = 0;
    private SituacaoDeLocacao situacaoLocacao;

    public Acessorios() {
    }

    public Acessorios(int id, String descricao, float valorDaLocacao, SituacaoDeLocacao situacaoLocacao) {
        this.id = id;
        this.descricao = descricao;
        this.valorDaLocacao = valorDaLocacao;
        this.situacaoLocacao = situacaoLocacao;
    }

    public SituacaoDeLocacao getSituacaoLocacao() {
        return situacaoLocacao;
    }

    public void setSituacaoLocacao(SituacaoDeLocacao situacaoLocacao) {
        this.situacaoLocacao = situacaoLocacao;
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

    public float getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(float valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }

    public String toString() {
        return id + ";" + descricao + ";" + valorDaLocacao + ";" + situacaoLocacao;
    }

}
