import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int x,y;
		//Realiza a entrada de forma ilimitada
		while(entrada.hasNext()){
			x = entrada.nextInt();
			y = entrada.nextInt();

			System.out.println(x+y);

		}

	}

}
