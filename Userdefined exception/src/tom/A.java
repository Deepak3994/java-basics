package tom;

public class A {
	public void m1(int age) throws MyException{
		if(age<18) {
			throw new MyException("invalid age");
		}
	}
}