/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;
import java.util.ArrayList;

/**
 *
 * @author samara
 */
public abstract class Pessoa {
    private String nome;
    private ArrayList<Conta> listacontas;

    public Pessoa(String nome, ArrayList<Conta> listacontas) {
        this.nome = nome;
        this.listacontas = listacontas;
    }

    public void addConta(Conta conta) {
        this.listacontas.add(conta);
    }

    public ArrayList<Conta> getListaContas() {
        return this.listacontas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
