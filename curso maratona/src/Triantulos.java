import java.util.Locale;
import java.util.Scanner;

public class Triantulos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		float A,B,C,A2,B2,C2,soma,a2,aa2;

		while(entrada.hasNext()){

			A = entrada.nextFloat();
			B = entrada.nextFloat();
			C = entrada.nextFloat();

			if(A<B && B>C){
				//5 7 2
				//7 5 2
				A2=B;
				B2=A;
				C2=C;
				soma = B2+C2;

				a2= A2*A2;
				aa2 = B2*B+C2*C2;

				if(A2==soma){
					System.out.println("NAO FORMA TRIANGULO");
				}else
					if(a2==aa2){
						System.out.println("TRIANGULO RETANGULO");
					}else
						if(a2<aa2){
							System.out.println("TRIANGULO OCUTANGULO");
						}else
							if(a2>aa2){
								System.out.println("TRIANGULO OBTUSANGULO");

							}

			}

			if(A<B && B<C){
				//1 2 3
				//3 2 1
				A2=C;
				B2=B;
				C2=A;
				soma = B2+C2;
				if(A2==soma){
					System.out.println("NAO FORMA TRIANGULO");
				}

			}

			if(A<B && A<C){
				//5 7 8
				// 8 7 5
				A2=C;
				B2=B;
				C2=A;
				a2= A2*A2;
				aa2 = B2*B+C2*C2;


				if(a2==aa2){
					System.out.println("TRIANGULO RETANGULO");
				}else
					if(a2<aa2){
						System.out.println("TRIANGULO OCUTANGULO");
					}

			}

			if(A<B &&  A==C){
				//5 7 5
				//7 5 5
				A2=C;
				B2=B;
				C2=A;

				System.out.println("TRIANGULO ISOSCELES");

			}

			if(A==B && B==C){
				//7 7 7
				A2=A;
				B2=B;
				C2=C;

				a2= A2*A2;
				aa2 = B2*B+C2*C2;
				if(a2<aa2){
					System.out.println("TRIANGULO OCUTANGULO");
				}
				if(A==B && A==C){
					System.out.println("TRIANGULO EQUILATERO");
				}
			}

			if(A>B && B<C){
				//7 5 7
				//7 7 5
				A2=A;
				B2=C;
				C2=B;

				a2= A2*A2;
				aa2 = B2*B+C2*C2;

				if(a2<aa2){
					System.out.println("TRIANGULO OCUTANGULO");
				}
				if(A==C){
					System.out.println("TRIANGULO ISOSCELES");
				}


			}

			if(A==B &&  B<C ){
				//6 6 10
				//10 6 6
				A2=C;
				B2=B;
				C2=A;

				a2= A2*A2;
				aa2 = B2*B+C2*C2;

				if(a2>aa2){
					System.out.println("TRIANGULO OBTUSANGULO");

				}
				if(A==B){
					System.out.println("TRIANGULO ISOSCELES");
				}

			}




		}
	}

}
