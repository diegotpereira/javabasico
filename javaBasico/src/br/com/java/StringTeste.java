package br.com.java;

//class Pessoa{
//	String nome;
//}
public class StringTeste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pessoa p = new Pessoa();
//		System.out.println(p.nome);
//		String nome;
//		System.out.println(nome);
		
		String nome = "Arthur";
		String apelido = "Arthur";
		
		if (nome == apelido) {
			System.out.println("Nome e apelido são iguais!.");
		}
		
		String nome1 = "Carlos";
		String nome2 = "Carla";
		
		// Equals - é um método da classe Object utilizado para testar a relação de igualdade entre dois objetos.
		if (nome1.equals(nome2)) {
			System.out.println("Os nomes são iguais!.");
		} else {
			System.out.println("Os nomes são diferentes!.");
		}
		// compareTo - Esse método pode retornar 0 se as strings forem iguais, 
		// um número negativo se a string que invoca o compareTo for menor que a string 
		// que é passada como um argumento e um número positivo se a string que invoca o compareTo 
		// for maior que a string que é passada como argumento.
		System.out.println("nome2.compareTo(nome1) = "+nome2.compareTo(nome1));
		System.out.println("nome1.compareTo(nome2) = "+nome1.compareTo(nome2));
		
		String texto = "A API de Strings é uma das mais utilizadas na linguagem java";
		String linguagem = texto.substring(texto.indexOf("java"), texto.length());
		
		// compareToIgnoreCase- É uma função que compara textos lexigraficamente, ignorando se as letras são maiúsculas ou minúsculas. 
		if (linguagem.compareToIgnoreCase("Java") == 0) {
			System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela é " + linguagem);
		}
		if (linguagem.compareTo("Java") == 0) {
			System.out.println("compareTo: Encontrei a linguagem! Ela é " + linguagem);
		}
		
		// Length - Retorna o comprimento do texto em uma String. No Código 16 é impresso o comprimento do texto.
		String nomeCurso = "JAVA";
		System.out.printf("\nTamanho da variável nomeCurso: %d", nomeCurso.length());
		
		// charAt - Retorna o caractere em uma localização específica em uma String.
		if (nomeCurso.charAt(1) == 'A') {
			System.out.println("O caractere A está na posição 1");
		}
		String nomeCursoA = "Curso Java Web";
		
		char[] numIndice = new char[7];
		
		// getChars Recupera um conjunto de caracteres de uma String. Esse método possui os seguintes parâmetros de entrada:
		// srcBegin – Índice do primeiro caractere da string a ser copiada.
		// srcEnd - Índice depois da última string a ser copiada.
		// dst – O destino do array.
		// dstBegin – o início do deslocamento no array de destino.
		
		nomeCursoA.getChars(2, 9, numIndice, 0);
		System.out.print("Valores Copiados \n");
		
		for (char caracter : numIndice) {
		System.out.print("["+caracter+"]");
		}
		System.out.println("\n\n Abaixo Índice demonstrativo dos valores copiados\n");
		
		int [] b = {0,1,2,3,4,5,6};
		
		for(int i = 0; i < b.length; i++) {
			System.out.print("["+b[i]+"]");
		}
	}

}
