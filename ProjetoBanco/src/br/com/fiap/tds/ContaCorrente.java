package br.com.fiap.tds;

import br.com.fiap.banco.Conta;

public class ContaCorrente extends Conta{
	//subclasse da classe Conta(superclasse)
	private String tipo;
	private double chequeEspecial;
	
	public ContaCorrente(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	@Override //identifica q o metodo est� sobreescrevendo sua superclass
	public void retirar(double valor) {
		valor = valor + 10;
		//chamando o metodo retirar
		super.retirar(valor);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getSaldoDisponivel() {
		return getSaldo() + this.chequeEspecial;
	}
	
	

}
