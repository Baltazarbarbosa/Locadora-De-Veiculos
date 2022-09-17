/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.veiculos;

/**
 *
 * @author balta
 */
public class Utilitario extends Veiculos {

    public Utilitario() {
    }

    public Utilitario(String marca, String modelo, String placa, String anoFabricacao, String anoModelo, String categoria, Double valorDiaria) {
        super(marca, modelo, placa, anoFabricacao, anoModelo, categoria, valorDiaria);
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String getAnoModelo() {
        return anoModelo;
    }

    @Override
    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public Double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String obterDescricao() {
        return "Marca: " + getMarca() + "\n"
                + "Modelo: " + getModelo() + "\n"
                + "Placa: " + getPlaca() + "\n"
                + "Ano/Modelo: " + getAnoFabricacao() + "/" + getAnoModelo() + "\n"
                + "Categoria: Utilitario \n"
                + "Valor diaria: " + getValorDiaria() + "\n"
                + "----------------------------------------------------------";
    }

}
