/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BeeSoftware.controle;

import com.BeeSoftware.enumeradores.TipoDeCliente;
import static com.BeeSoftware.enumeradores.TipoDeCliente.PESSOA_FISICA;
import static com.BeeSoftware.enumeradores.TipoDeCliente.PESSOA_JURIDICA;
import com.BeeSoftware.modelos.Cliente;
import com.BeeSoftware.persistencia.ClienteDao;
import com.BeeSoftware.persistencia.IClienteDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author balta
 */
public class ClienteControle implements IClienteControle {

    IClienteDao clientePersistencia = null;

    public ClienteControle() {
        this.clientePersistencia = new ClienteDao();
    }

    private boolean buscarCliente(String cpf_cnpj, TipoDeCliente tipoDoCliente) throws Exception {
        try {
            ArrayList<Cliente> listagem = clientePersistencia.listagem(tipoDoCliente);
            Iterator<Cliente> lista = listagem.iterator();
            if (tipoDoCliente == PESSOA_FISICA) {
                while (lista.hasNext()) {
                    Cliente aux = lista.next();
                    if (aux.getCpf().equalsIgnoreCase(cpf_cnpj)) {
                        return true;
                    }
                }
            }
            if (tipoDoCliente == PESSOA_JURIDICA) {
                while (lista.hasNext()) {
                    Cliente aux = lista.next();
                    if (aux.getCnpj().equalsIgnoreCase(cpf_cnpj)) {
                        return true;
                    }
                }
            }

            return false;
        } catch (Exception error) {
            throw error;
        }
    }

    @Override
    public void incluir(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {
        /*if (tipoDoCliente.equals(TipoDeCliente.PESSOA_FISICA)) {
            if (buscarCliente(objeto.getCpf(), tipoDoCliente)) {
                throw new Exception("Cliente já foi cadastrado(a)");
            }
            String aux = objeto.getCpf();
            if ("".equals(objeto.getCpf())) {
                throw new Exception("Digite um cpf válido.");
            }
        }
        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_JURIDICA)) {
            if (buscarCliente(objeto.getCnpj(), tipoDoCliente)) {
                throw new Exception("Cliente já foi cadastrado(a)");
            }
            String aux = objeto.getCnpj();
            if ("".equals(objeto.getCnpj())) {
                throw new Exception("Digite um nome válido.");
            }
        }*/
        clientePersistencia.incluir(objeto, tipoDoCliente);

    }

    @Override
    public void alterar(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {

        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_FISICA)) {
            if (buscarCliente(objeto.getCpf(), tipoDoCliente)) {
                throw new Exception("Cliente já foi cadastrado(a)");
            }
            String aux = objeto.getCpf();
            if ("".equals(objeto.getCpf())) {
                throw new Exception("Digite um cpf válido.");
            }
        }
        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_JURIDICA)) {
            if (buscarCliente(objeto.getCnpj(), tipoDoCliente)) {
                throw new Exception("Cliente já foi cadastrado(a)");
            }
            String aux = objeto.getCnpj();
            if ("".equals(objeto.getCnpj())) {
                throw new Exception("Digite um nome válido.");
            }
        }
        clientePersistencia.alterar(objeto, tipoDoCliente);
    }

    @Override
    public ArrayList<Cliente> listagem(TipoDeCliente tipoDoCliente) throws Exception {

        return clientePersistencia.listagem(tipoDoCliente);

    }

    @Override
    public Cliente buscar(int id, TipoDeCliente tipoDoCliente) throws Exception {

        return clientePersistencia.buscar(id, tipoDoCliente);

    }

    @Override
    public void verTxt() throws Exception {
        clientePersistencia.verTxt();
    }

}
