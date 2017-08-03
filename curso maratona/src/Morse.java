import java.io.IOException;
import java.util.Scanner;




public class Morse {


	public static void morse(String codigo){

		int tamC;
		tamC = codigo.length();

		if(tamC < 10){
			if(tamC < 9){
				if(tamC < 7){
					if(tamC < 5){
						if(tamC < 3){
							if(codigo == "="){

								System.out.print("e");
							}
						}else{
							if(codigo == "=.="){

								System.out.print("i");
							}else if(codigo == "==="){

								System.out.print("t");
							}
						}
					}else{
						if(codigo == "=.==="){

							System.out.print("a");
						}else if(codigo == "===.="){

							System.out.print("n");
						}else if(codigo == "=.=.="){

							System.out.print("s");
						}
					}
				}else{
					if(codigo == "===.=.="){

						System.out.print("d");
					}else if(codigo == "=.=.=.="){

						System.out.print("h");
					}else if(codigo == "===.==="){

						System.out.print("m");
					}else if(codigo == "=.===.="){

						System.out.print("r");
					}else if(codigo == "=.=.==="){

						System.out.print("u");
					}else if(codigo == "......."){

						System.out.print(" ");
					}
				}
			}else{
				if(codigo == "===.=.=.="){

					System.out.print("b");
				}else if(codigo == "=.=.===.="){

					System.out.print("f");
				}else if(codigo == "===.===.="){

					System.out.print("g");
				}else if(codigo == "===.=.==="){

					System.out.print("k");
				}else if(codigo == "=.===.=.="){

					System.out.print("l");
				}else if(codigo == "=.=.=.==="){

					System.out.print("v");
				}else if(codigo == "=.===.==="){

					System.out.print("w");
				}else if(codigo == "=.=.=.=.="){

					System.out.print("s");
				}
			}
		}else{
			if(tamC > 11){
				if(tamC > 13){
					if(tamC > 15){
						if(tamC > 17){
							if(codigo == "===.===.===.===.==="){

								System.out.print("0");
							}
						}else{
							if(codigo == "=.===.===.===.==="){

								System.out.print("1");
							}else if(codigo == "===.===.===.===.="){

								System.out.print("9");
							}
						}
					}else{
						if(codigo == "=.=.===.===.==="){

							System.out.print("2");
						}else if(codigo == "===.===.===.=.="){

							System.out.println("8");
						}
					}
				}else{
					if(codigo == "=.===.===.==="){

						System.out.print("j");
					}else if(codigo == "===.===.=.==="){

						System.out.print("q");
					}else if(codigo == "===.=.===.==="){

						System.out.print("y");
					}else if(codigo == "=.=.=.===.==="){

						System.out.print("3");
					}else if(codigo == "===.===.=.=.="){

						System.out.print("7");
					}
				}
			}else{
				if(codigo == "===.=.===.="){

					System.out.print("c");
				}else if(codigo == "===.===.==="){

					System.out.print("0");
				}else if(codigo == "=.===.===.="){

					System.out.print("p");
				}else if(codigo == "===.=.=.==="){

					System.out.print("x");
				}else if(codigo == "===.===.=.="){

					System.out.print("z");
				}if(codigo == "=.=.=.=.==="){

					System.out.print("4");
				}else if(codigo == "===.=.=.=.="){

					System.out.print("6");
				}
			}
		}
	}



	public static void main(String[] args) throws IOException{

		Scanner entrada = new Scanner(System.in);


		int caso = entrada.nextInt();

		for(int i=0; i < caso; i++){

			String linha;
			String valor;
			int tam, pos = 0;

			linha = entrada.nextLine();

			tam = linha.length();
			for(int x = 0; x < tam; x++){


				if(linha.substring(x,7) == "......."){


					valor = linha.substring(pos,(x-pos));

					morse(valor);

					morse(linha.substring(x,7));
					x = x+6;
					pos = x+1;

				}else if(linha.substring(x,3) == "..."){

					valor = linha.substring(pos, (x-pos));
					morse(valor);
					x = x+2;
					pos = x+1;
				}else if(x+1 == tam){
					valor = linha.substring(pos, x);
					morse(valor);
				}
			}

			System.out.println();

		}
	}

}
