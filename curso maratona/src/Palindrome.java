import java.util.Scanner;
/*
Entradas
Eduardo
Rodrigo
ana
ono
avava
 *

 */
public class Palindrome {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Para parar o programa digite *");


		String nome = entrada.next();

		while(!nome.equals("*")){

			for (int i = nome.length()-1; i >= 0; i--) {

				for (int j = 0; j < i; j++) {

					if (nome.charAt(i) == nome.charAt(j)) {

						System.out.println("PALINDROME");

					}else{

						System.out.println("NÃO É  PALINDROME");
					}

					break;
				}

				break;

			}
			nome = entrada.next();

		}//while
	}
}
