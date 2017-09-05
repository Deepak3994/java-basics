
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
		s.length();
		}
		catch(NullPointerException npe) {
			System.out.print(npe.getMessage());
		}


	}

}
