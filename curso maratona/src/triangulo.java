import java.util.Scanner;

public class triangulo {
	/*
    O VALOR DO COMPRIMENTO DE UM LADO DO TRIANGULO NÃO PODE SER MAIOR DO QUE A SOMA DOS DOIS LADOS OPOSTOS
	teste de entrada
	6 9 22 5
	14 40 12 60
	  saida = S
	  saida = N
	 */

	static Scanner entrada = new Scanner(System.in);

	static int n1,n2,n3,n4,valid=0;
	//ou faça assim    static boolean valid = false;

	public static void Triangulo(){

		//Entradas ilimitadas
		while(entrada.hasNext()){

			//quatro entradas
			n1=entrada.nextInt();
			n2=entrada.nextInt();
			n3=entrada.nextInt();
			n4=entrada.nextInt();

			if(n1 < n2+n3 && n2 < n1+n3 && n3 < n1+n2){

				valid = 1;

			} else if(n1 < n3+n4 && n3 < n1+n4 && n4 < n1+n3){

				valid = 1;

			}else if(n1 < n2+n4 && n2 < n1+n4 && n4 < n1+n2){

				valid = 1;

			}else if(n2 < n3+n4 && n3 < n2+n4 && n4 < n2+n3){

				valid = 1;
			}else{

				valid = 0;
			}

			System.out.println();

			if(valid == 1){

				System.out.println("S");

			}else{

				System.out.println("N");
			}


		}

	}

	public static void main(String[] args) {
		Triangulo();

	}


}
