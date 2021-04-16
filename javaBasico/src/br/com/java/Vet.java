package br.com.java;

import java.util.Scanner;

public class Vet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int VET[] = new int[50];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite o valor da posição " + i + ": ");
			VET[i] = entrada.nextInt();
			
			for(int j = 0; j < 5; j++) {
				if(VET[i] == VET[j] && i!=j) {
					System.out.println("O número " + VET[i] + " é repetido!");
					
					break;
				}
			}
		}
		entrada.close();
	}

}
