package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Banc?ria
 * @author Sthefany Lins
 * @version 1.0
 */
public class Conta implements Serializable {
	
	private static final long serialVersionaUID = 1L;
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//void - n?o vai ter retorno
	/** 
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor a ser depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	
	/** 
	 * Retira valor ao Saldo da Conta
	 * @param valor 
	 * @see depositar
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	//double - vai retornar um valor double
	/** 
	 * Verificar Saldo da Conta
	 * @return Valor do saldo da Conta
	 */
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	
	
}
