import java.io.IOException;
import java.util.Scanner;

public class ConversaoDeBases {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		int qtdTeste = entrada.nextInt();
		String numeroLido, formato;
		int numeroDecimal;

		for (int i = 1; i <= qtdTeste; i++) {

			numeroLido = entrada.next();
			formato = entrada.next();

			System.out.println("Case " + i + ":");

			switch (formato) {
			case "dec":
				numeroDecimal = Integer.valueOf(numeroLido);
				System.out.println(Integer.toHexString(numeroDecimal) + " hex");
				System.out.println(Integer.toBinaryString(numeroDecimal) + " bin\n");

				break;

			case "bin":
				numeroDecimal = Integer.valueOf(numeroLido, 2);
				System.out.println(numeroDecimal+ " dec");
				System.out.println(Integer.toHexString(numeroDecimal) + " hex\n");

				break;

			case "hex":
				numeroDecimal = Integer.valueOf(numeroLido, 16);
				System.out.println(numeroDecimal+ " dec");
				System.out.println(Integer.toBinaryString(numeroDecimal) + " bin\n");

				break;

			}

		}
	}

}