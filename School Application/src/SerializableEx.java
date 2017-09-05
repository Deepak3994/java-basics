import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializableEx {
     HashMap hm = null;
	public SerializableEx(HashMap<Integer, GetStudentDetails> hm) throws IOException{
		// TODO Auto-generated constructor stub
		this.hm=hm;
	}
	   public void insert() throws IOException {	
		FileOutputStream fos = new FileOutputStream("StudentData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hm);
		oos.close();
	}
}	


