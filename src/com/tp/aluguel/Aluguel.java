/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aluguel;

/**
 *
 * @author balta
 */
public class Aluguel {

    protected String dataRetirada;
    protected String dataDevolucao;

    public Double obterValorTotal(){
        
        return 100.00;
    }

    public int obterPeriodo(){
        return 1;
        
    }

    public Aluguel() {
    }

    public Aluguel(String dataRetirada, String dataDevolucao) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
