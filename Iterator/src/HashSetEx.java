//This includes both hashset and tree set
//Hashset is used for just storing which has no order
//Treeset is used to sort the elements

import java.util.*;

public class HashSetEx {
	  
		public static void main(String[] args) {  
		    HashSet<Student> set = new HashSet<Student>();
		    Student s1 = new Student(100,"john");
		    Student s2 = new Student(50,"cena");
		    Student s3 = new Student(200,"rock");
		    Student s4 = new Student(150,"ram");
		    Student s5 = new Student(400,"sham");
		    
		    set.add(s1);
		    set.add(s2);
		    set.add(s3);
		    set.add(s4);
		    set.add(s5);
		    
		    TreeSet<Student> ts = new TreeSet<Student>(set);
		    Iterator<Student> itr = ts.iterator();
		    //System.out.print(set);
		    System.out.println("Size before removal:"+set.size());
		    while (itr.hasNext()) {
		    	
		    	Student s = (Student) itr.next();
		    	System.out.println("Name: "+s.name);
		    	System.out.println("Id: "+s.id);

		    	
		   // 	if(s.id==200) {
		 //   		itr.remove();
		  //  	}
		    	

	}		   
		    //System.out.println("Size after removal:"+set.size());
		    System.out.println(Student.ctr);

  }
}