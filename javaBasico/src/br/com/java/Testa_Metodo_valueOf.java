package br.com.java;

public class Testa_Metodo_valueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = 102939939.939;
		boolean booleano = true;
		// valueOf � um m�todo est�tico da classe String, que n�o precisa de uma inst�ncia para ser invocado. 
		// Ele converte um tipo primitivo em um objeto do tipo String.
		
		System.out.println("Retorno Valor : " + String.valueOf(numero));
		System.out.println("Retorna Valor : " + String.valueOf(booleano));
	}

}
