import java.io.IOException;
import java.util.Scanner;
/*
entrada

10,0 20,1 5,1
0,0 20,0 5,0
10,3 203,0 5,0
10,0 3,0 5,0

 */
public class FormulaDeBaskara {
	/**
	 * R1= -b+raiz b*b-4a*c/2*a
	 *
	 * R2= -b-raiz b*b-4a*c/2*a
	 *
	 *
	 * Entrada Três valores ponto flutuante double A,B e C.
	   10,0
       20,1
       5,1
	 * imprimir o resultado da raiz com 5 digitos após o ponto flutuante
	 * conforme o exemplo
	 *
	 * Saida
	 * R1 = -0.29788
       R2 = -1.71212

	 * caso não seja possivel calcular as raízes
	 * mostrar um mensagem : Impossivel calcular
	 **
	 * */
	public static void main(String[] args)throws IOException {
		Scanner entrada = new Scanner(System.in);
		double R1,R2,R1_imag,R2_imag  ;
		double A,B,C;
		double delta;
		double raiz;

		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		delta = (Math.pow(B,2)) - (4 * A * C);
		raiz= Math.sqrt(delta);

		//caso haja uma divisão por 0 ou raiz de numero negativo.
		if (A==0 || delta <0){
			System.out.println("Impossivel calcular");
		}else{

			R1= (-B + raiz)/(2*A);
			R2= (-B - raiz)/(2*A);

			String resultado1 = String.format("%.5f", R1);
			String resultado2 = String.format("%.5f", R2);

			System.out.println("R1 = "+resultado1);
			System.out.println("R2 = "+resultado2);

		}


	}

}