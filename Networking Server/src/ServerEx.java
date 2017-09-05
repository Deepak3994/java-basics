import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			ServerSocket soc = new ServerSocket(5001);
			Socket csoc = soc.accept();
			System.out.println("Client Connected");
			//BufferedReader br = new BufferedReader(new InputStreamReader(csoc.getInputStream()));
			//String data = br.readLine();
			//System.out.println(data);
			FileReader fr = new FileReader("server.txt");
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(csoc.getOutputStream()),true);
			String data=br.readLine();
			String key="";
			while(data!=null) {
				key+=data;
				data = br.readLine();
			}
			pw.println(key);
}

}
