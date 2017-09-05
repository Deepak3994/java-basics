import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashMapEx {
	HashMap<Integer, GetStudentDetails> hm = new HashMap<Integer, GetStudentDetails>();
	Admin ad = new Admin();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void add() throws IOException{
		// TODO Auto-generated method stub
		GetStudentDetails s = new GetStudentDetails();

			ad.getDetails(s);
			Random rand = new Random();
			int key = rand.nextInt(20);
			hm.put(key, s);	
			System.out.println(hm.size());
			save();
      }

	public void view() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("StudentData.txt");
		if(f.exists()) {
			FileInputStream fis = new FileInputStream("StudentData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
			 hm = (HashMap) ois.readObject();
				System.out.println(hm);
				//ois.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();
			}
		
		else {
		System.out.println("Empty File");
}
	}
	public void delete() throws IOException{
		// TODO Auto-generated method stub
		view();
		System.out.println("Enter the key to be deleted:");
		int keys = Integer.parseInt(br.readLine());
		hm.remove(keys);
		save();
		
	}

	public void edit() throws IOException {
		// TODO Auto-generated method stub
		GetStudentDetails s = new GetStudentDetails();

		view();
		System.out.println("Enter the key to be edited:");
		int keys = Integer.parseInt(br.readLine());
			ad.getDetails(s);
			hm.put(keys,s);
			//view();
			save();
	}

	public void save() {
		// TODO Auto-generated method stub
		try {
			SerializableEx se = new SerializableEx(hm);
			se.insert();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


