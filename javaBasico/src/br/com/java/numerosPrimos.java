package br.com.java;

import java.util.Scanner;

public class numerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicial, fim;
		int primo = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("N�mero inicial: ");
		inicial = entrada.nextInt();
		
		System.out.print("N�mero final: ");
		fim = entrada.nextInt();
		
		for(int i = inicial; i <= fim; i++) {
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					primo++;
				}
			}
			if(primo == 2) {
				System.out.println("O n�mero " + i + "� primo");
			}
			primo = 0;
		}
		entrada.close();
	}

}
