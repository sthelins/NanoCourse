package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;

public class Teste {

	public static void main(String[] args) {
		
		//instanciar classe conta
		Conta cc = new Conta();
		//criar objeto conta
		cc.depositar(50);
		cc.setAgencia(123);
		cc.setNumero(321);
		
		//chamar metodo
		cc.depositar(100);
		
		//chamar outro metodo e imprimir no console o valor do retorno
		System.out.println(cc.getSaldo());
		
		
		
		
		//criar objeto conta utilizando o construtor que recebe valores iniciais paara o atributo do objeto
		Conta poupanca = new Conta(111,222,1000);
		
		//chamar um metodo do objeto
		poupanca.retirar(50);
		System.out.println(poupanca.getSaldo());

	}

}
