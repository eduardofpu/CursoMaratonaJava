import java.util.Scanner;
public class robos {
	/*
	Entrada
	4
	8   2   8   1   2   -1   2 5
	6   9   9   0   7   4   3  2
	1   8   4   8   4   3   1  4
    1   -5   1   -1   -7   -5   6   -5

    Saida
	H
	A
	H
	H
	 */
	public static void main(String[] args) {
		int n,i;

		Scanner entrada = new Scanner(System.in);

		n = entrada.nextInt();

		for(i = 0; i<n; i++){

			int[] ox= new int[2];
			int[] oy= new int[2];
			int[] dx= new int[2];
			int[] dy= new int[2];

			ox[0] = entrada.nextInt();oy[0] = entrada.nextInt();dx[0] = entrada.nextInt();dy[0] = entrada.nextInt();
			ox[1] = entrada.nextInt();oy[1] = entrada.nextInt();dx[1] = entrada.nextInt();dy[1] = entrada.nextInt();


			double d1 = Math.sqrt((Math.pow((dx[0] - ox[0]), 2)) + (Math.pow((dy[0] - oy[0]), 2)));
			double d2 = Math.sqrt((Math.pow((dx[1] - ox[1]), 2)) + (Math.pow((dy[1] - oy[1]), 2)));

			if(d1 > d2){
				System.out.println("A\n");
			}else if( d1 < d2){
				System.out.println("H\n");
			}




		}
	}

}
