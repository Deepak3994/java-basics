import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileApp {
	public static void main(String a[]) throws IOException {
		
			FileInputStream fis = new FileInputStream("star.txt");
			FileOutputStream fos = new FileOutputStream("star2.txt");
		
		int c;
		while((c=fis.read())!=-1) {
			fos.write(c);
	}
		fis.close();
		fos.close();
  }
}
