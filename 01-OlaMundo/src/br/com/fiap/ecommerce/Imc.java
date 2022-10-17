package br.com.fiap.ecommerce;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Informe seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc > 18.5 && imc < 25) {
			System.out.println("Seu peso está normal");
		} else {
			System.out.println("Seu peso está fora do normal");
		}
		
		entrada.close();
		
		

	}

}
