package aula;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Banco {
	
	public static ContaCorrente criarContaCorrente(Scanner entrada, Agencia agencia, Random random) {
	    System.out.println("Informe o salário: ");
	    double salario = entrada.nextDouble();
	    ContaCorrente conta = new ContaCorrente(random.nextInt(100), salario, agencia);
	    System.out.println("O número da sua conta é: " + conta.getNumero());
	    System.out.println("O número da sua agência é: " + conta.getAgencia().getNumero());
	    return conta;
	}

	public static ContaPoupanca criarContaPoupanca(Scanner entrada, Agencia agencia, Random random) {
	    System.out.println("Informe o rendimento: ");
	    double rendimento = entrada.nextDouble();
	    ContaPoupanca conta = new ContaPoupanca(random.nextInt(100), rendimento, agencia);
	    System.out.println("O número da sua conta é: " + conta.getNumero());
	    System.out.println("O número da sua agência é: " + conta.getAgencia().getNumero());
	    return conta;
	}
	
	public void iniciarSistema() {
		/**
	        *   Sistem de controle bancário
	        *   Classe conta
	        */
	        Scanner entrada = new Scanner(System.in);
	        Random random = new Random();
	        String nome;
	        int cnpj, tipoConta, tipoConta2, numAgencia;
			String cpf;
	        PessoaJuridica p1;
	        PessoaFisica p2;
	        ContaCorrente c1;
	        ContaPoupanca c2;
	        double salario, rendimento, valor;
	        ArrayList<Conta> listaContas = new ArrayList();
	        
	        /**
	        *   Criando 3 Agências e escolhendo
	        */               
	        Agencia ag1 = new Agencia(1);
	        Agencia ag2 = new Agencia(2); 
	        Agencia ag3 = new Agencia(3);
	        Agencia escolhaAgencia;
	        
	        System.out.println("Informe qual a agencia você deseja criar conta. Agencias dísponíveis: 1, 2 e 3");
	        numAgencia = entrada.nextInt();
	        switch (numAgencia) {
	        case 1 -> escolhaAgencia = ag1;
	        case 2 -> escolhaAgencia = ag2;
	        case 3 -> escolhaAgencia = ag3;
	        default -> {
	            System.out.println("Agência inválida. Usando agência 1 como padrão.");
	            escolhaAgencia = ag1;
	        }
	    }
	                
	        System.out.println("Informe o nome da Pessoa: ");
	        nome = entrada.next();
	        
	        System.out.println("Deseja criar a conta para pessoa jurídica ou física: \n Digite \n 1: Juridica e \n 2: Física");
	        int opcao = entrada.nextInt();
	        
	        switch (opcao){
	            case 1:
	                System.out.println("Informe o cnpj: ");
	                cnpj = entrada.nextInt();
	                p1 = new PessoaJuridica(nome, new ArrayList<>(), cnpj);
	                
	                System.out.println("Deseja criar conta corrente? Digite 1- sim e 2- Não");
	                tipoConta = entrada.nextInt();
	                if (tipoConta == 1) {
	                    c1 = criarContaCorrente(entrada, escolhaAgencia, random);
	                    p1.addConta(c1);
	                }
	                
	                System.out.println("Deseja criar conta poupança? Digite 1- sim e 2- Não");
	                tipoConta2 = entrada.nextInt();
	                if (tipoConta2 == 1) {
	                    c2 = criarContaPoupanca(entrada, escolhaAgencia, random);
	                    p1.addConta(c2);
	                }              
	                break;
	            case 2: 
	                System.out.println("Informe o cpf: ");
	                entrada.nextLine(); // Consumir \n pendente
	                cpf = entrada.nextLine();
	                p2 = new PessoaFisica(nome, new ArrayList<>(), cpf);
	                
	                System.out.println("Deseja criar conta corrente? Digite 1- sim e 2- Não");
	                tipoConta = entrada.nextInt();
	                if (tipoConta==1){
	                    System.out.println("Informe o salario: ");
	                    salario = entrada.nextDouble();
	                    c1 = new ContaCorrente(random.nextInt(100), salario, escolhaAgencia);
	                    p2.addConta(c1);
	                    System.out.println("O numero da sua conta é: "+c1.getNumero());
	                    System.out.println("O numero da sua agencia é: "+c1.getAgencia().getNumero());
	                }
	                
	                System.out.println("Deseja criar conta poupança? Digite 1- sim e 2- Não");
	                tipoConta2 = entrada.nextInt();
	                if (tipoConta2==1){
	                    System.out.println("Informe o rendimento: ");
	                    rendimento = entrada.nextDouble();
	                    c2 = new ContaPoupanca(random.nextInt(100), rendimento, escolhaAgencia);
	                    p2.addConta(c2);
	                    System.out.println("O numero da sua conta é: "+c2.getNumero());
	                    System.out.println("O numero da sua agencia é: "+c2.getAgencia().getNumero());
	                }
	                break;
	        }  
	}
}
