import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferingApp {
	public static void main(String a[]) throws IOException {
		
		FileReader fis = new FileReader("start.txt");
		BufferedReader bis = new BufferedReader(fis);
		FileWriter fos = new FileWriter("star2.txt");
		BufferedWriter bos = new BufferedWriter(fos);
		String data = null;
		while((data=bis.readLine())!=null) {
			bos.write(data+"\n");
			System.out.print(data);			
		}

	bis.close();
	bos.close();
	fis.close();
	fos.close();
}

}
