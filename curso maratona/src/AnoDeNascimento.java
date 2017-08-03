import java.util.Scanner;
/*
 * Entrada
  3
 Eduardo
 2017 37
 Eduardo Filho
 2010  2
 Gian Carlos
 1999  21
 *
 * saida

 Ano em que você nasceu : 1980
 Ano em que você nasceu : 2008
 Ano em que você nasceu : 1979
 * */



public class AnoDeNascimento {

	static Scanner frase = new Scanner(System.in);
	static Scanner entrada = new Scanner(System.in);
	static int anoAtual,idade,casosTeste;
	static String nome ;

	public static void Ano(){


		casosTeste = entrada.nextInt();

		for(int i=0 ; i < casosTeste ; i++){

			nome = frase.nextLine();

			anoAtual = entrada.nextInt();
			idade = entrada.nextInt();
			System.out.println();

			System.out.println("Nome: " + (nome) );
			System.out.println(" Nasceu em: "+ (anoAtual - idade));

		}

	}

	public static void main(String[] args) {
		Ano();
	}

}
