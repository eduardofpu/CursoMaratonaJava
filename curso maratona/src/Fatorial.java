import java.util.Scanner;

public class Fatorial {

	public static void CalcFatorial(int numero){
		int fatorial=1;
		for(int i=1;i<=numero;i++){
			fatorial*= i;
		}
		System.out.println(fatorial);
	}

	public static void CasoDeTeste(){
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		for(int i=0 ; i<n; i++){
			int numero=entrada.nextInt();
			CalcFatorial(numero);
		}
	}

	public static void main(String[] args) {

		CasoDeTeste();

	}

}
