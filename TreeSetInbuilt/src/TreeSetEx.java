import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {  
		    HashSet<String> set = new HashSet<String>();
		    set.add("Hello");
		    set.add("Arun");
		    set.add("Soumya");
		    set.add("Deepak");
		    set.add("Morning");
		    TreeSet<String> ts = new TreeSet<String>(set);
		    Iterator<String> itr = ts.iterator();
		    //System.out.print(set);
		    System.out.println("Size before removal:"+set.size());
		    
		    while (itr.hasNext()) {	
		    	String s = (String) itr.next();
		    	System.out.println(s);
	}		   
}
}
