import java.util.Scanner;

public class Entrada3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroDeCasos;
		int x,y,contar=0;

		System.out.print("Digite o numero de casos: ");
		numeroDeCasos = entrada.nextInt();

		for(int i=0;i<numeroDeCasos;i++){

			x=entrada.nextInt();
			y=entrada.nextInt();

			System.out.println(x+y);
			contar++;
		}
		if(contar == numeroDeCasos){
			System.out.println("Fim");
			System.out.println("Foram  = "+contar+" Repetições para esse caso");

		}

	}
}
