import java.io.IOException;
import java.util.Scanner;


public class Intervalo {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		float numero = entrada.nextFloat();
		if( 0 <= numero && numero <= 25.00){
			System.out.println("Intervalo [0,25]");
		}else if(25.01<=numero && numero <= 50.00){
			System.out.println("Intervalo (25,50]");
		}else if(50.01<=numero && numero <= 75.00){
			System.out.print("Intervalo (50,75]");
		}else if(75.01<=numero && numero <= 100.00){
			System.out.println("Intervalo (75,100]");
		}else{
			System.out.println("Fora de intervalo");
		}

	}

}