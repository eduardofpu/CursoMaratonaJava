import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {
	public static void Calc(double salarioFixo,double montante){
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");
		double total;
		total = salarioFixo + montante * 0.15;
		//String TOTAL = String.format("%.2f", total);
		//System.out.print("TOTAL = R$ "+TOTAL);
		//System.out.println("TOTAL = R$ "+ format(total));
		System.out.println("TOTAL = R$ "+ df.format(total));
	}
	public static void Saida(){
		// Define o formato dos valores como duas casas decimais após o ponto (padrão dos Estados Unidos)
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner entrada = new Scanner(System.in);
		double salarioFixo,montante;

		String nome = entrada.next();
		salarioFixo = Double.parseDouble(df.format(entrada.nextDouble()));
		montante = Double.parseDouble(df.format(entrada.nextDouble()));
		Calc(salarioFixo, montante);
	}

	public static String format(double x) {
		return String.format("%.2f", x);
	}

	public static void main(String[] args)throws IOException {
		Saida();
	}
}
