package br.com.fiap.tds;

import br.com.fiap.banco.Conta;

public class Program {
	public static void main(String[] args){

		Conta cc = new Conta();

		if (cc instanceof Conta){
			System.out.println("cc � do tipo Conta");
		}else{
			System.out.println("cc n�o � do tipo Conta");
		}
		
		//Conta cc2 = new ContaCorrente();
		//conta corrente tbm � uma conta

		//if (cc2 instanceof Conta){
		//	System.out.println("cc � do tipo Conta");
		//}else{
		//	System.out.println("cc n�o � do tipo Conta");
		//}
		
		Conta cc3 = new Conta();
		//uma conta n�o � necessariamente uma contacorrente

		if (cc3 instanceof ContaCorrente){
			System.out.println("cc � do tipo Conta");
		}else{
			System.out.println("cc n�o � do tipo Conta");
		}
	}
	
}
