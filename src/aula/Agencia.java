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
public class Agencia {
    private int numero;
    public Agencia(int numero){
        this.numero = numero;
    }
    
    
    public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	@Override
	public String toString(){
		return "Agencia: "+this.numero;
	}
}
