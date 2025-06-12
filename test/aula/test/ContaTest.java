package aula.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aula.Agencia;
import aula.Conta;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    private Conta conta;
    private Agencia agencia;

    private class ContaTesteConcreta extends Conta {
        public ContaTesteConcreta(int num, Agencia agencia) {
            super(num, agencia);
        }

        @Override
        public void imprimir() {
            System.out.println("ContaTesteConcreta: impressão de teste.");
        }
    }

    @BeforeEach
    public void setUp() {
        agencia = new Agencia(1);
        conta = new ContaTesteConcreta(123, agencia);
    }

    @Test
    public void testDepositarValorPositivo() {
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testDepositarValorNegativo() {
        conta.depositar(-50.0);
        assertEquals(0.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testSacarValorValido() {
        conta.depositar(200.0);
        double novoSaldo = conta.sacar(100.0);
        assertEquals(100.0, novoSaldo, 0.001);
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testSacarValorMaiorQueSaldo() {
        conta.depositar(100.0);
        double resultado = conta.sacar(150.0);
        assertEquals(-1.0, resultado);
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testGetSetNumero() {
        conta.setNumero(999);
        assertEquals(999, conta.getNumero());
    }

    @Test
    public void testGetSetAgencia() {
        Agencia novaAgencia = new Agencia(2);
        conta.setAgencia(novaAgencia);
        assertEquals(2, conta.getAgencia().getNumero());
    }
}