package br.com.java;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C, K, F, Re, Ra;
		
		C = 2.43;
		
		F =  C * 1.8 + 32;
		
		K = C + 273.15;
		
		Ra = C * 1.8 + 32 + 459.67;
		
		Re = C * 0.8;
		
		System.out.println("A temparatura em Fahrenheit �: " + F);
		
		System.out.println("A temparatura em Kelvin �: " + K);
		
		System.out.println("A temperatura em Reamur �: " + Ra);
		
		System.out.println("A temperatura em Rankine �: " + Re);
	}

}
