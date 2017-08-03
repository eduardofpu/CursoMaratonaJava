import java.util.Scanner;

public class media {
	/*
	 * Media mediana
	 *
	 * mediana 2 8 5 >> 2 5 8
	 *
	 * (a+b+c)/3 = media media = mediana a = media a mediana tambem Então
	 * (a+b+c)/3 = a
	 *
	 * c = 3a-a-bc c = 2a -b
	 *
	 *
	 * Entrada
	 * 1 2
       6 10
       1 1000000000
       0 0
	 *
	 * saida
	 *
	 * 2
	 * -999999998
	 * *
	 */

	public static void main(String[] args) {
		int a, b, c;
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();

		while (a != 0 && b != 0) {
			c = 2 * a - b;
			System.out.println(c);

			a = entrada.nextInt();
			b = entrada.nextInt();

		}

	}

}
