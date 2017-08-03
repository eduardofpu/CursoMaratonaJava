import java.util.Locale;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		double A,B,C;
		double trapezio,circulo,quadrado,triangulo,trianguloRetangulo,retangulo;
		A=entrada.nextDouble();
		B=entrada.nextDouble();
		C=entrada.nextDouble();

		triangulo  =(A*C)/2;
		circulo =3.14159*C*C;
		trapezio =C*(A+B)/2;
		quadrado =B*B;
		retangulo=A*B;

		//trianguloRetangulo=A*C;
		String resultado1 = String.format("%.3f", triangulo );
		String resultado2 = String.format("%.3f", circulo);
		String resultado3 = String.format("%.3f",trapezio);
		String resultado4 = String.format("%.3f", quadrado);
		String resultado5 = String.format("%.3f", retangulo);



		System.out.println("TRIANGULO: "+resultado1);
		System.out.println("CIRCULO: "+resultado2);
		System.out.println("TRAPEZIO: "+resultado3);
		System.out.println("QUADRADO: "+resultado4);
		System.out.println("RETANGULO: "+resultado5);
		//System.out.println("TRIANGULO RETANGULO: "+trianguloRetangulo);

		System.out.println();

	}




}
