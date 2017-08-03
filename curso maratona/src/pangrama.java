import java.util.Scanner;

// O exercicio pagrama deve conter todas as letras do alfabeto pelo menos uma unica vez se não houver todas esta incorreto

/*Exemplo de entrada

jackdawf loves my big quartz sphinx
abcdefghijklmnopqrstuvwxyz
ola mundo
 *

 */

public class pangrama {


	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);

		char [] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		String frase = entrada.nextLine();// ler a linha inteira com espaço
		//int  tamanhoFrase = frase.length();// retorna o tamanho da frase
		int qtdAchadas = 0;


		while(!frase.equals("*")){
			//Todo o codigo vai ser escrito aqui
			//o codigo ira parar quando encontrar o *

			for(int i =0 ;i < alfabeto.length; i++){

				for (int j = 0; j < frase.length(); j++) {

					if(alfabeto[i] ==  frase.charAt(j)){
						qtdAchadas++;
						break; // o comando break sempre incerra o laço mais interno
					}

				}

				if(qtdAchadas!=i+1){
					break;
				}
			}

			if(qtdAchadas==26){
				System.out.println("Y");
			}else{
				System.out.println("N");
			}

			// para ler mais linhas
			frase = entrada.nextLine();
			//tamanhoFrase = frase.length();
			qtdAchadas = 0;

		}

	}
}
