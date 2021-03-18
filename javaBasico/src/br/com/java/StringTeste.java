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
			System.out.println("Nome e apelido s�o iguais!.");
		}
		
		String nome1 = "Carlos";
		String nome2 = "Carla";
		
		// Equals - � um m�todo da classe Object utilizado para testar a rela��o de igualdade entre dois objetos.
		if (nome1.equals(nome2)) {
			System.out.println("Os nomes s�o iguais!.");
		} else {
			System.out.println("Os nomes s�o diferentes!.");
		}
		// compareTo - Esse m�todo pode retornar 0 se as strings forem iguais, 
		// um n�mero negativo se a string que invoca o compareTo for menor que a string 
		// que � passada como um argumento e um n�mero positivo se a string que invoca o compareTo 
		// for maior que a string que � passada como argumento.
		System.out.println("nome2.compareTo(nome1) = "+nome2.compareTo(nome1));
		System.out.println("nome1.compareTo(nome2) = "+nome1.compareTo(nome2));
		
		String texto = "A API de Strings � uma das mais utilizadas na linguagem java";
		String linguagem = texto.substring(texto.indexOf("java"), texto.length());
		
		// compareToIgnoreCase- � uma fun��o que compara textos lexigraficamente, ignorando se as letras s�o mai�sculas ou min�sculas. 
		if (linguagem.compareToIgnoreCase("Java") == 0) {
			System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela � " + linguagem);
		}
		if (linguagem.compareTo("Java") == 0) {
			System.out.println("compareTo: Encontrei a linguagem! Ela � " + linguagem);
		}
		
		// Length - Retorna o comprimento do texto em uma String. No C�digo 16 � impresso o comprimento do texto.
		String nomeCurso = "JAVA";
		System.out.printf("\nTamanho da vari�vel nomeCurso: %d", nomeCurso.length());
		
		// charAt - Retorna o caractere em uma localiza��o espec�fica em uma String.
		if (nomeCurso.charAt(1) == 'A') {
			System.out.println("O caractere A est� na posi��o 1");
		}
		String nomeCursoA = "Curso Java Web";
		
		char[] numIndice = new char[7];
		
		// getChars Recupera um conjunto de caracteres de uma String. Esse m�todo possui os seguintes par�metros de entrada:
		// srcBegin � �ndice do primeiro caractere da string a ser copiada.
		// srcEnd - �ndice depois da �ltima string a ser copiada.
		// dst � O destino do array.
		// dstBegin � o in�cio do deslocamento no array de destino.
		
		nomeCursoA.getChars(2, 9, numIndice, 0);
		System.out.print("Valores Copiados \n");
		
		for (char caracter : numIndice) {
		System.out.print("["+caracter+"]");
		}
		System.out.println("\n\n Abaixo �ndice demonstrativo dos valores copiados\n");
		
		int [] b = {0,1,2,3,4,5,6};
		
		for(int i = 0; i < b.length; i++) {
			System.out.print("["+b[i]+"]");
		}
	}

}
