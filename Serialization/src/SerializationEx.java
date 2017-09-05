import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String a[]) throws IOException{
		Student s = new Student(100,"john");
		FileOutputStream fos = new FileOutputStream("StudentData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		FileInputStream fis = new FileInputStream("StudentData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			Student s1 = (Student) ois.readObject();
			System.out.println(s1);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
