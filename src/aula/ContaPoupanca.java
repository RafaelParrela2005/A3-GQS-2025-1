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
public class ContaPoupanca extends Conta{
    private double rendimento;
    public ContaPoupanca(int numero, double rendimento, Agencia agencia){
        super(numero, agencia);
        this.rendimento = rendimento;
    } 
    
    @Override
    public void imprimir() {
        System.out.println("Seu rendimento é : "+this.rendimento);
    }
    
    public double getRendimento(){
        return this.rendimento;
    }
    
    public void setRendimento(double rendimento){
        this.rendimento = rendimento;
    }    
}
