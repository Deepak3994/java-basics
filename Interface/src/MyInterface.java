
public class MyInterface {
	public static void main(String a[]) {
		Switch s = null;
		if(a[0].equals("L")) {
			s = new Light();
		}
		if(a[0].equals("F")) {
			s = new Fan();
		}
		s.on();
		s.off();
	}

}
