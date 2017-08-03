import java.util.Scanner;

public class sonambulos {

	/*
	 * 1 Carlos 2 Zeca 3 Pedro 4 Mara
	 *
	 * Sera dividido o numero de sonambulo por 4 se o resto da divisão for 1
	 * sera Carlos se o resto da divisão for 2 sera Zeca se o resto da divisão
	 * for 3 sera Pedro se o resto da divisão for 0 sera Mara
	 *
	 * ex 1000000/4 resto 0 então e igual a Mara
	 *
	 * Entrada 3 24846 1000000 0
	 *
	 * Saida Pedro Zeca Mara
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int ordem = entrada.nextInt();

		String reino = "";

		while (ordem != 0) {

			int resto = ordem % 4;// retorna o resto da divisão por 4 pois os
			// reinos são dividito igualmentes Carlos,
			// Zeca ,Pedro e Mara.

			switch (resto) {
			case 1:
				reino = "Carlos";
				break;
			case 2:
				reino = "Zeca";
				break;
			case 3:
				reino = "Pedro";
				break;
			case 0:
				reino = "Mara";
				break;

			default:
				break;

			}// switch

			System.out.println();
			ordem = entrada.nextInt();

			System.out.println("Reino " + reino + " Resto " + resto);

		} // while

	}


}
