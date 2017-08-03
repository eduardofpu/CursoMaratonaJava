import java.util.Scanner;

public class Leds {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Para parar o programa digite p");

		String numeros = entrada.nextLine();

		int soma = 0;

		while (!numeros.equals("p")) {

			for (int i = 0; i < numeros.length(); i++) {

				if (numeros.charAt(i) == '0' || numeros.charAt(i) == '6' || numeros.charAt(i) == '9') {

					soma += 6;

				} else if (numeros.charAt(i) == '2' || numeros.charAt(i) == '3' || numeros.charAt(i) == '5') {

					soma += 5;

				} else if (numeros.charAt(i) == '1') {

					soma += 2;

				} else if (numeros.charAt(i) == '4') {

					soma += 4;

				} else if (numeros.charAt(i) == '7') {

					soma += 3;

				} else if (numeros.charAt(i) == '8') {

					soma += 7;

				}else{

					System.out.println("Digite somente números inteiros");
				}

			}

			System.out.println("Leds = " + soma);

			numeros = entrada.nextLine();
			soma = 0;

		} // while

	}

}
