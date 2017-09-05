import java.io.*;

public class Admin {
	public int total;
	public void getDetails(GetStudentDetails s) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the name of the student");
	String name1 = br.readLine();
	if((name1.matches("[a-zA-Z]*"))) {
	s.name=name1;	
	System.out.println("Enter the student id:");
	s.id = Integer.parseInt(br.readLine().trim());
	System.out.println("Enter the marks1:");
	s.marks1 = Integer.parseInt(br.readLine().trim());
	System.out.println("Enter the marks2:");
	s.marks2 = Integer.parseInt(br.readLine().trim());
	total = total(s.marks1,s.marks2);
	if(total<50) {
		s.status = "Fail";
	}
	else {
		s.status = "Pass";
	}
	  System.out.print(s);  
	
	}
	else {
		System.out.println("Enter a valid name!");
		getDetails(s);
	}
    }
	public int total(int a, int b) {
		return a+b;
	}
		
	}

