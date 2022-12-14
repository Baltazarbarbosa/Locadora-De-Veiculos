/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

import com.BeeSoftware.enumeradores.SituacaoDaLocacao;
import java.util.Date;

/**
 *
 * @author balta
 */
public class Locacao {

    private int id;
    private Date dataInicio;
    private Date dataFinal;
    private float valorDaLocacao;
    SituacaoDaLocacao situacaoDaLocacao;
    Motorista motorista;
    Cliente cliente;
    Acessorios acssorios;
    Veiculo veiculo;

    public Locacao() {
    }

    public Locacao(int id, Date dataInicio, Date dataFinal, float valorDaLocacao, SituacaoDaLocacao situacaoDaLocacao, Motorista motorista, Cliente cliente, Acessorios acssorios, Veiculo veiculo) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.valorDaLocacao = valorDaLocacao;
        this.situacaoDaLocacao = situacaoDaLocacao;
        this.motorista = motorista;
        this.cliente = cliente;
        this.acssorios = acssorios;
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public float getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(float valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }

    public SituacaoDaLocacao getSituacaoDaLocacao() {
        return situacaoDaLocacao;
    }

    public void setSituacaoDaLocacao(SituacaoDaLocacao situacaoDaLocacao) {
        this.situacaoDaLocacao = situacaoDaLocacao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Acessorios getAcssorios() {
        return acssorios;
    }

    public void setAcssorios(Acessorios acssorios) {
        this.acssorios = acssorios;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String toString() {
        return id + ";"
                + dataInicio + ";"
                + dataFinal + ";"
                + valorDaLocacao + ";"
                + situacaoDaLocacao + ";"
                + motorista + ";"
                + cliente + ";"
                + acssorios + ";"
                + veiculo;

    }

}
