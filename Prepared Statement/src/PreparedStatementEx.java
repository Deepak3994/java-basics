import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver loaded");
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LOCALHOST:1521:XE","system","password");
			System.out.println("Connected");
			
			java.sql.Statement query=(java.sql.Statement) con.createStatement();
		//	int size=((java.sql.Statement) query).executeUpdate("create table books(bname varchar(10) primary key, sales number(10))");
		//	int size1=((java.sql.Statement) query).executeUpdate("insert into books values(? ,? ,?)");
			/*int sales[]={1001,301,601};
			String bname[]={"java","C","oracle"};
			PreparedStatement ps=con.prepareStatement("insert into books values(?,?)");
			for(int i=0;i<sales.length;i++){
			ps.setString(1, bname[i]);
			ps.setInt(2, sales[i]);
			ps.executeUpdate();
		}*/
			
			PreparedStatement ps1=con.prepareStatement("Update books set sales=? where bname=?");
			int sales1[]={1,2,3};
			String bname1[]={"java","C","oracle"};
			for(int i=0;i<sales1.length;i++){
				ps1.setInt(1, sales1[i]);
				ps1.setString(2, bname1[i]);
				ps1.executeUpdate();
			
			}
			
			ResultSet res=((java.sql.Statement) query).executeQuery("Select * from books");
			while(res.next()){
				System.out.println(res.getString(1)+" "+res.getInt(2));
			}	
			res.close();
			((Connection) query).close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

