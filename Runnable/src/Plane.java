
public class Plane implements Runnable {
	Thread t1 = null;
	Thread t2 = null;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("one")) {
			m1();
		}
		else {
			m2();
		}
		
	}
	public void m2() {
		// TODO Auto-generated method stub
		for(int i=0;i<500;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public void m1() {
		// TODO Auto-generated method stub
		for(int i=0;i<500;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	void startThreadOp() {
		t1 = new Thread(this,"one");
		t2 = new Thread(this,"two");
		t1.start();
		t2.start();
		
	}
	
	

}
