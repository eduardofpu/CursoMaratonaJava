import java.util.Scanner;

public class Palindrome2 {

	public static int Palindrome(String nome) {

		for (int i = nome.length() - 1; i > 0; i++) {

			for (int j = 0; j < i; j++) {

				if (nome.charAt(i) != nome.charAt(j)) {

					return 0;
				} else {
					return 1;
				}
			}
		}

		return 0;
	}

	public static void VerificaNome() {

		Scanner entrada = new Scanner(System.in);

		while (entrada.hasNext()) {

			String nome = entrada.next();

			int palavra = Palindrome(nome);

			if (palavra == 0) {
				System.out.println("Não é Palindrome");

			} else {

				System.out.println("Palindrome");

			}
		}
	}

	public static void main(String[] args) {

		VerificaNome();

	}
}
