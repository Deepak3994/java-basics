

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//When we have the oracle server
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//System.out.println("Driver Loaded");
		try {
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.154.140.54:1521/ORCL","system","Arunkumar123");
			
			//for remote server connection
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.154.143.123:1521:XE","system","password");
			Statement query = con.createStatement();
			//int nra = query.executeUpdate("create table emp(empno number(4)primary key,ename varchar(20),sal number(7))");
			//int nsa = query.executeUpdate("insert into emp values(100,'arun',50000)");
			ResultSet res = query.executeQuery("select * from emp");
			while(res.next()){
				System.out.println(res.getInt(1)+","+res.getString(2));
			}
			res.close();
			query.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connected");
	}

}
