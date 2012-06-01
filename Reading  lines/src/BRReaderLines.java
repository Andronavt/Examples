import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class BRReaderLines {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines text");
		System.out.println("Enter 'stop' for completed");
		do{
			str=br.readLine();
			System.out.println(str);
		}while(!str.equals("stop"));
		
	}

}
