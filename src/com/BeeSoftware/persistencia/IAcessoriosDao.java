/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BeeSoftware.persistencia;

import com.BeeSoftware.enumeradores.SituacaoDeLocacao;
import com.BeeSoftware.modelos.Acessorios;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public interface IAcessoriosDao {
    
    void incluir(Acessorios objeto,SituacaoDeLocacao situacaoLocacao) throws Exception;
    void alterar(Acessorios objeto,SituacaoDeLocacao situacaoLocacao) throws Exception;
    ArrayList<Acessorios> listagem() throws Exception;
    Acessorios buscar (int id) throws Exception;
    void verTxt() throws Exception;
    
}
