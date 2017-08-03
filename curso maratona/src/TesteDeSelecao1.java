import java.util.Scanner;
public class TesteDeSelecao1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int A,B,C,D,S1,S2;

		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();

		S1=C+D;
		S2=A+B;

		if(B > C && D>A && S1 > S2 && D>A && C > 1 && D > 1 && A %2 ==0){
			System.out.println("Valores aceitos");
		}else{

			System.out.println("Valores nao aceitos");
		}

	}

}
