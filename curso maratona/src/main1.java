import java.util.Scanner;

public class main1 {
public static void main(String[] args) {
	
	// entrada 24 15
	
	Scanner teclado = new Scanner(System.in);
	int valorA = teclado.nextInt();
	int valorB = teclado.nextInt();
	int resultado = CalcMDC(valorA,valorB);
	System.out.println("O MDC entre"+ valorA+" e "+valorB+":" +resultado);
	
	
}
public static int CalcMDC(int PA, int PB){
	int MDC = PB;
	if(PA<PB)
		MDC=PA;
	while(MDC >=1){
		if(PA%MDC==0&&PB%MDC==0)
			return MDC;
		MDC--;
	}
	return MDC;
}
}
