/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

import com.BeeSoftware.enumeradores.TipoDeCliente;
import static com.BeeSoftware.enumeradores.TipoDeCliente.PESSOA_FISICA;
import static com.BeeSoftware.enumeradores.TipoDeCliente.PESSOA_JURIDICA;

/**
 *
 * @author balta
 */
public class Cliente {

    private int id;
    private String cpf;
    private String cnpj;
    private String nome;
    private String razaoSocial;
    private String identidade;
    private String email;
    private Telefone telefone;
    private Endereco endereco;
    private TipoDeCliente tipoDoCliente;

    public Cliente() {
    }

    public Cliente(int id, String cpf, String nome, String identidade, String email, Telefone telefone, Endereco endereco, TipoDeCliente tipoDoCliente) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.identidade = identidade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipoDoCliente = tipoDoCliente;
    }

    public Cliente(int id, String cnpj, String razaoSocial, String email, Telefone telefone, Endereco endereco, TipoDeCliente tipoDoCliente) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipoDoCliente = tipoDoCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoDeCliente getTipoDoCliente() {
        return tipoDoCliente;
    }

    public void setTipoDoCliente(TipoDeCliente tipoDoCliente) {
        this.tipoDoCliente = tipoDoCliente;
    }

    public String toString(TipoDeCliente tipoDoCliente) {

        if (tipoDoCliente == PESSOA_FISICA) {
            return id + ";"
                    + cpf + ";"
                    + nome + ";"
                    + identidade + ";"
                    + telefone + ";"
                    + email + ";"
                    + endereco;
        }
        if (tipoDoCliente == PESSOA_JURIDICA) {
            return id + ";"
                    + razaoSocial + ";"
                    + cnpj + ";"
                    + telefone + ";"
                    + email + ";"
                    + endereco;
        } else {
            return null;
        }
    }

}
