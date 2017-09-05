package tom;

public class Jack {
	public static void main(String a[]) {
		A obj = new A();
		try {
			obj.m1(16);
		}
		catch(MyException me) {
			System.out.println(me.getMessage());
			
		}
	}

}
