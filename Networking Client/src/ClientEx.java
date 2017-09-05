import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket soc = new Socket("LOCALHOST",5001);
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(soc.getOutputStream()),true);
		//pw.println("Hi from the client");
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		String data = br.readLine();
		System.out.println(data);
	}
}
