import java.io.*;

public class MyStudentApp {
	static int ip;
	public static void main(String a[]) throws IOException {
		HashMapEx hme = new HashMapEx();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("\nEnter your choice: \n1:Add\t2:Delete \t3:Edit\t4:View\t5:Save\t6:Exit");
		ip = Integer.parseInt(br.readLine());
		if(ip==1){
			hme.add();
		}
		if(ip==2) {
			hme.delete();
		}
		if(ip==3) {
			hme.edit();
		}
		if(ip==4) {
			hme.view();
		}
		if(ip==5) {
			hme.save();
			
		}
		if(ip==6) {
			System.out.println("Thank You");

			System.exit(0);

		}
	}
}

}