import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus2 {

	public static void main(String[] args) throws IOException {

		// Define o formato dos valores como duas casas decimais após o ponto (padrão dos Estados Unidos)
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");

		Scanner ler = new Scanner(System.in);

		String nome;
		double salario, vendas;

		nome = ler.next();

		// Lê o valor, modifica para uma String no formato especificado e transforma para double de novo.
		salario = Double.parseDouble(df.format(ler.nextDouble()));
		vendas = Double.parseDouble(df.format(ler.nextDouble()));

		// Modifica o formato do double e imprime o salário já somado com a comissão.
		System.out.println("TOTAL = R$ "+ df.format(salario + vendas*0.15));
	}



}