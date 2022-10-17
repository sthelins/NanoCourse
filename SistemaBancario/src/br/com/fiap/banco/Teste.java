package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(1111);
		cc.setNumero(2222);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);
		
		Conta cc2 = new ContaCorrente();
		cc2.setAgencia(3333);
	
	}

}
