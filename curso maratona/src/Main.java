import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main{

	int getBinary(String input)
	{
		int sum=0;
		for(int i =0;i<input.length();i++)
			if(input.charAt(i)=='O')
				sum+=1*Math.pow(2, i);
		return sum;
	}
	String getBinary(int input,int precision)
	{
		String resp = "";
		for(int i =0;i<precision;i++)
		{
			if(input%2==1)
				resp+='O';
			else
				resp+='X';
			input/=2;
		}
		return resp;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(in.readLine());//casos de teste

		String data[];
		Main main = new Main();
		BigInteger bigInteger1;
		for (int i = 0; i < n; i++){

			data = in.readLine().split(" ");// entrada de string
			int tam = data.length;
			if(tam<=60){

				bigInteger1 = new BigInteger(data[1]);
				bigInteger1 = bigInteger1.add(new BigInteger(""+main.getBinary(data[0])));
				bigInteger1 = bigInteger1.mod(new BigInteger("32"));
				out.write( main.getBinary( bigInteger1.intValue() ,5 ) + "\n" );
			}

		}
		out.close();
		in.close();
	}
}