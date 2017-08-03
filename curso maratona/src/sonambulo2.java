import java.util.Scanner;

/* Entrada
 *  3
 *  24846
 *  1000000
 *  0
 *
 * Saida Pedro Zeca Mara
 */
public class sonambulo2 {

	// TODO Auto-generated method stub
	static Scanner entrada = new Scanner(System.in);
	static int ordem ,resto,reino;

	public  static void Sonambulo(){
		ordem = entrada.nextInt();
		while (ordem != 0) {
			resto = ordem % 4;// retorna o resto da divisão por 4  pois os reinos são dividito igualmentes Carlos, Zeca ,Pedro e Mara.
			reino = resto; // Metodo opcional

			System.out.println();
			if(reino == 1 ){
				System.out.println("Carlos");

			}else if(reino==2){
				System.out.println("Zeca");
			}else if(reino==3){
				System.out.println("Pedro");
			}else if(reino==0){
				System.out.println("Mara");
			}
			ordem = entrada.nextInt();
		}//while
	}

	public static void main(String[] args) {

		Sonambulo();
	}

}
