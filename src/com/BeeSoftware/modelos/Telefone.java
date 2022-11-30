/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.modelos;

/**
 *
 * @author balta
 */
public class Telefone {

    private long ddi;
    private long ddd;
    private long numero;

    public Telefone(long ddi, long ddd, long numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public long getDdi() {
        return ddi;
    }

    public void setDdi(long ddi) {
        this.ddi = ddi;
    }

    public long getDdd() {
        return ddd;
    }

    public void setDdd(long ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String toString() {
        return ddi + ";" + ddd + ";" + numero;
    }

}
