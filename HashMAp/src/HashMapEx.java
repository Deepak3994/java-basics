import java.util.*;

public class HashMapEx {
	public static void main(String a[]) {
	HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
	
	Student s1 = new Student(100,"ram");
	Student s2 = new Student(200,"xxx");
	Student s3 = new Student(300,"rrr");
	hm.put(10,s1);
	hm.put(15,s2);
	hm.put(20,s3);
	printHm(hm);
	find(10,hm);
	
	}

	private static void find(int i, HashMap<Integer, Student> hm) {
		// TODO Auto-generated method stub
		Student v = (Student)hm.get(i);
		System.out.println(v);
		
	}

	private static void printHm(HashMap<Integer, Student> hm) {
		// TODO Auto-generated method stub
		//TreeMap is used just to sort the output
		TreeMap<Integer, Student> tm = new TreeMap<Integer, Student>(hm);
		Set<Integer> sk = tm.keySet();
		Iterator<Integer> keys = sk.iterator();
		while(keys.hasNext()) {
			Student s = (Student)hm.get(keys.next());
			System.out.println("name:"+s.name);
			System.out.println("id:"+s.id);
			
		}
	}
}
