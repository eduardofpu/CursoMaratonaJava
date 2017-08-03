import java.util.Scanner;
public class robos1 {

	public static void Robos(){

		int n,i;

		Scanner entrada = new Scanner(System.in);

		n = entrada.nextInt();

		for(i = 0; i<n; i++){

			int ox,oy,dx,dy,ox2,oy2,dx2,dy2;

			ox = entrada.nextInt();oy = entrada.nextInt();dx = entrada.nextInt();dy = entrada.nextInt();
			ox2 = entrada.nextInt();oy2 = entrada.nextInt();dx2 = entrada.nextInt();dy2 = entrada.nextInt();

			double d1 = Math.sqrt((Math.pow((dx - ox), 2)) + (Math.pow((dy - oy), 2)));
			double d2 = Math.sqrt((Math.pow((dx2 - ox2), 2)) + (Math.pow((dy2 - oy2), 2)));

			if(d1 > d2){
				System.out.println("A\n");
			}else if( d1 < d2){
				System.out.println("H\n");
			}

		}
	}
	public static void main(String[] args) {

		Robos();

	}

}
