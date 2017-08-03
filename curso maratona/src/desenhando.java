import java.util.Scanner;
/*
 * Entrada
3
3 3
0 1
1 2
2 0

5 8
0 1
0 2
1 2
2 3
2 4
3 4
1 3
1 4

4 3
0 1
1 2
2 0

Saida
S
N
N
 */

public class desenhando {

	static Scanner entrada = new Scanner(System.in);
	static int matriz[][] = new int[1000][100000];
	static int encontrou[] = new int[1000];

	static int T,N,M,p,verifica_grafo = 0,encontrados;

	public static void preencherMatriz(int n){

		for(int i = 1; i<= n; i++){
			encontrou[i] =0;
			for(int j = 1; j <= n; j++){
				matriz[i][j] = 0;
			}
		}

	}

	public static void procurarMatriz(int x){
		encontrou[x]=1;
		encontrados++;

		for (int i=1; i<=N; i++) {

			if (matriz[x][i]==1 && encontrou[i]!=1) {

				matriz[x][i] =0;
				matriz[i][x] = 0;
				procurarMatriz(i);
			}
		}

	}

	static public void DesenhandoMapas(){

		//entrada de um numero inteiro quantidade de caso de teste
		T = entrada.nextInt();

		for(p = 0; p < T; p++){
			int q;

			//Cada caso de teste e formado por duas linha N e M
			//Indicando a quantidade de vertices e a quantidade de arestas do grafo
			N = entrada.nextInt();
			M = entrada.nextInt();
			encontrados = 0;
			preencherMatriz(N);

			for(q = 0; q < M; q++){

				//M linhas segue com dois inteiros aresta bidirecional entre os vertices i e j.
				int i,j;
				i = entrada.nextInt();
				j = entrada.nextInt();
				matriz[i+1][j+1] = 1;
				matriz[j+1][i+1] = 1;

			}

			int grau_grafo, k;
			for(q = 1; q <= N; q++){
				grau_grafo = 0;
				for(k = 1; k <= N; k++){
					if(matriz[q][k] == 1){
						grau_grafo++;
					}
				}

				//Se o grau do grafo for par
				if(grau_grafo % 2 != 0){
					verifica_grafo = 1;

				}
			}

			procurarMatriz(1);
			//Pula uma linha
			System.out.println();


			//Se o grau do grafo for par a resposta sera S se não sera N
			if(verifica_grafo!=1 && encontrados == N){

				System.out.println("S\n");

			}else{

				System.out.println("N\n");
			}

		}
	}

	public static void main(String[] args) {

		DesenhandoMapas();

	}

}
