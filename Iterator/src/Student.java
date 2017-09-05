
public class Student implements Comparable {
	int id;
	String name;
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	static int ctr=0;
	
	//This method is mandatory when we are using tree set.
	public int compareTo(Object obj) {
		ctr++;
		if(this.id > ((Student) obj).id) {
			return 1;
		}
		else {
			return -1;
		}
	}
}


