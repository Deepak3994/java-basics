import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String a[]) {
		
		ArrayList al = new ArrayList();
		Plane pl = new Plane();
		Student s = new Student();
		al.add(pl);
		al.add(s);
		al.add(new Integer(10));
		al.add("deepak");
		System.out.println(al.size());
		for(int i=0; i<al.size(); i++) {
			Object obj = al.get(i);
			if(obj instanceof String) {
				String s1 = ((String) obj).toUpperCase();
				System.out.println("String to upper case:"+s1);
			}
			
			if(obj instanceof Integer) {
				Integer x = ((Integer) obj);
				System.out.println("Integer:"+x);
			}
			
			if( obj instanceof Plane) {
				((Plane) obj).fly();
			}
			
			if(obj instanceof Student) {
				System.out.println("Upper case:"+((Student) obj).name.toUpperCase());
			}
		}
	}
}
