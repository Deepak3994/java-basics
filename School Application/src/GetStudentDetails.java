import java.io.Serializable;

public class GetStudentDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int marks1,marks2;
	public String name;
	public String status;
	public int id;
	@Override
	public String toString() {
		return "GetStudentDetails [marks1=" + marks1 + ", marks2=" + marks2 + ", name=" + name + ", status=" + status
				+ ", id=" + id + "]";
	}
	
}
