/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;
/**
 *
 * @author samara
 */

public abstract class Conta implements OperacaoBancaria {
    private int numero;
    private double saldo = 0;
    private Agencia agencia;
    
    public Conta(int num, Agencia agencia){
        this.numero = num;
        this.agencia = agencia;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    
    @Override
    public double sacar(double valor){
        if (valor <= 0) {
            return -1;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return this.saldo;
        }
        return -1;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public Agencia getAgencia(){
        return this.agencia;
    }
    
    public void setAgencia(Agencia agencia){
        this.agencia = agencia;
    }
    
    @Override
    public String toString(){
        return "Conta: " + this.numero + " Agência: " + this.agencia.getNumero();
    }
}