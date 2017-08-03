import java.util.Scanner;

public class Fibonaci {

	public static void Fib(int n){
		int i,aux=0,a=0,b=1;
		System.out.print("0 1 ");
		for(i=0;i<n;i++){
			aux = a+b;
			a=b;
			b=aux;
			System.out.print(" "+aux);
		}
	}

	public static void CasoDeTeste(){
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNext()){
			int n = entrada.nextInt();
			Fib(n);
		}
	}

	public static void main(String[] args) {

		CasoDeTeste();

	}

}
