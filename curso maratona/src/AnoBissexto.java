import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class AnoBissexto {
	/*
	Entrada
	2000
	3600
	4515
	2001

	saida

	This is leap year.

	This is leap year.
	This is huluculu festival year.

	This is huluculu festival year.

	This is an ordinary year.
	 */

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		BigInteger ano;
		BigInteger b4 = new BigInteger("4");
		BigInteger b15 = new BigInteger("15");
		BigInteger b100 = new BigInteger("100");
		BigInteger b400 = new BigInteger("400");
		BigInteger b0 = new BigInteger("0");
		BigInteger b55 = new BigInteger("55");

		boolean isBisxeto  = false;
		boolean isHuluculu  = false;
		boolean isBulukulu  = false;

		while(entrada.hasNext()){
			ano = entrada.nextBigInteger();
			//Verifica ano se e Bissexto
			if((ano.mod(b4).equals(b0)) && !(ano.mod(b100).equals(b0))|| (ano.mod(b400).equals(b0))){
				//ano e divisivel por 4 mas não e divisivel por 100 ou divisivel por 400
				isBisxeto = true;

				//Verifica se e Buluculu
				if(ano.mod(b55).equals(b0)){
					isBulukulu = true;
				}else{
					isBulukulu = false;
				}

			}else{

				isBisxeto = false;
				isBulukulu = false;
			}

			//Verifica ana se e Huluculu

			if(ano.mod(b15).equals(b0)){
				//ano e divisivel por 4 mas não e divisivel por 100 ou divisivel por 400
				isHuluculu = true;
			}else{
				isHuluculu = false;
			}

			//Mostrar a resposta
			if(isBisxeto){
				System.out.println("This is leap year.");
			}
			if(isHuluculu){
				System.out.println("This is huluculu festival year.");
			}

			if(isBulukulu){
				System.out.println("This is bulukulu festival year.");
			}
			if(!(isBisxeto || isBulukulu || isHuluculu)){
				System.out.println("This is an ordinary year.");
			}
			if(entrada.hasNext()){
				System.out.println();
			}

		}

	}

}