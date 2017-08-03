import java.util.Scanner;
/*
Caso de teste
 4 4 6 2
 3 5 3 5
 5 5 4 3
 0 0 0 0

 Saida
 1
 0
 2
 */

public class dama {

	static Scanner entrada = new Scanner(System.in);
	static int qtdMovimentos;


	static int x1 = entrada.nextInt();
	static int y1 = entrada.nextInt();
	static int x2 = entrada.nextInt();
	static int y2 = entrada.nextInt();


	public static void tabuleiro(){


		while(!(x1==0 && y1==0 && x2==0 && y2==0)){
			qtdMovimentos=0;


			if(x1==x2 && y1==y2){//Origem igual a Destino
				qtdMovimentos=0;

			}else if((x1==x2) || (y1==y2) || (Math.abs(x1 - x2)) == (Math.abs(y1 - y2)) ){//Mesma linha coluna ou diagonal

				qtdMovimentos=1;

			}else{ //linha ,coluna e diagonal diferente
				qtdMovimentos=2;
			}

			System.out.println(qtdMovimentos);

			x1 = entrada.nextInt();
			y1 = entrada.nextInt();
			x2 = entrada.nextInt();
			y2 = entrada.nextInt();

		}

	}

	public static void main(String[] args) {

		tabuleiro();



	}

}
