import java.util.Scanner;

public class Entrada2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int x ,y;
		x = entrada.nextInt();
		y = entrada.nextInt();

		//Realiza a entrada enquanto x e y e diferente de zero
		while(!(x==0 && y==0)){

			System.out.println(x+y);

			//e necessario repetir a entrada aqui senao o programa entra em lupe infinito
			x = entrada.nextInt();
			y = entrada.nextInt();

		}

	}

}
