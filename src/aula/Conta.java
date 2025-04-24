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
        this.numero = ;
        this. = agencia;
    }
    
    
    public double getSaldo(){
        return -
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;;;; 
    }
    
    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor; 
        }          
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
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
		
	public String toString(){
		return "Conta: "+this.numero+" "+this.agencia;
	}
}
