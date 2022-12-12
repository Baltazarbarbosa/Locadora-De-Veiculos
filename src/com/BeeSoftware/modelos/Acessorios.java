/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

import com.BeeSoftware.enumeradores.SituacaoDaLocacao;
import com.BeeSoftware.enumeradores.SituacaoVeiculo;

/**
 *
 * @author balta
 */
public class Acessorios {

    private int id = 0;
    private String descricao = "";
    private float valorDaLocacao = 0;
    private SituacaoVeiculo situacaoDaLocacao;

    public Acessorios() {
    }

    public Acessorios(int id, String descricao, float valorDaLocacao, SituacaoVeiculo situacaoDaLocacao) {
        this.id = id;
        this.descricao = descricao;
        this.valorDaLocacao = valorDaLocacao;
        this.situacaoDaLocacao = situacaoDaLocacao;

    }

    public SituacaoVeiculo getSituacaoDaLocacao() {
        return situacaoDaLocacao;
    }

    public void setSituacaoDaLocacao(SituacaoVeiculo situacaoDaLocacao) {
        this.situacaoDaLocacao = situacaoDaLocacao;
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
        return id + ";" + descricao + ";" + valorDaLocacao + ";" + situacaoDaLocacao;
    }

}
