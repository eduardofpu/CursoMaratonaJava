import java.util.Arrays;
import java.util.Scanner;

public class ele {

	public static void main(String[] args) {
		int qtdAtacante , qtdDefensor;

		Scanner entrada = new Scanner(System.in);

		qtdAtacante = entrada.nextInt();
		qtdDefensor = entrada.nextInt();

		int[] distanciaAtacante = new int[qtdAtacante];
		int[] distanciaDefensor = new int[qtdDefensor];

		while(qtdAtacante!=0 && qtdDefensor!=0){
			//for(int i=0;i < distanciaAtacante.length;i++){
			for(int i=0;i < qtdAtacante;i++){
				distanciaAtacante[i]=entrada.nextInt();
			}

			//for(int i=0;i < distanciaDefensor.length;i++){
			for(int i=0;i < qtdDefensor;i++){
				distanciaDefensor[i]=entrada.nextInt();
			}

			Arrays.sort(distanciaAtacante);
			Arrays.sort(distanciaDefensor);

			if(distanciaAtacante[0]<distanciaDefensor[1]){
				System.out.println("Y");
			}else{
				System.out.println("N");
			}

			qtdAtacante = entrada.nextInt();
			qtdDefensor = entrada.nextInt();

			distanciaAtacante = new int[qtdAtacante];
			distanciaDefensor = new int[qtdDefensor];

		}

	}
}
