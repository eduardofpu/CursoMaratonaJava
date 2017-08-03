import java.util.Arrays;
import java.util.Scanner;

public class bolha {

	static int i,j,aux = 0;
	static Scanner entrada = new Scanner(System.in);
	static int[] numero = new int[5];



	//Recebe os numeros digitados
	public static void receberNumeros(){

		System.out.println("Digite 5 numeros desodenados : ");

		for( i=0 ;i < 5 ;i++){

			numero[i] = entrada.nextInt();


		}
	}
	// Ordena os numeros
	public static void bolha(){
		for( i=0 ; i < 5 ; i++){
			for(j=i+1;j<5;j++){
				if(numero[j]< numero[i]){
					aux = numero[i];
					numero[i]=numero[j];
					numero[j]=aux;
				}
			}

		}

	}

	public static void imprimirComBolhaImplementada(){
		receberNumeros();
		bolha();

		for(i=0 ;i < 5 ;i++){
			System.out.print(" "+numero[i]);
		}
	}

	public static void imprimirComSort(){

		receberNumeros();
		Arrays.sort(numero);

		for(i=0 ;i < 5 ;i++){

			System.out.print(" "+numero[i]);

		}
	}

	public static void NumerosOrdenados(){


		imprimirComSort();

		// Para testar : comente a linha acima e use linha de baixo.

		//imprimirComBolhaImplementada();

	}


	public static void main(String[] args) {

		NumerosOrdenados();

	}



}
