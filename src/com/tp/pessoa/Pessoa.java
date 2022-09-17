/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.pessoa;

/**
 *
 * @author balta
 */
public class Pessoa {

    protected String nome;
    protected String endereco;
    protected int telefone;
    protected int CNH;
    protected String sexo;
    protected int idade;
    protected int CPF;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, int telefone, int CNH, String sexo, int idade, int CPF) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.CNH = CNH;
        this.sexo = sexo;
        this.idade = idade;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if (idade < 21) {
            throw new Exception("Idade minima para locacao 21 anos!");
        }
        this.idade = idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String toString() {
        return "Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "Telefone: " + telefone + "\n"
                + "Sexo: " + sexo + "\n"
                + "CPF: " + CPF + "\n"
                + "CNH: " + CNH + "\n"
                + "Endereco: " + endereco + "\n"
                + "----------------------------------------------------------";
    }

}
