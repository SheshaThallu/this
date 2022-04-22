package Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentData {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "Shesha@98";
		String query = "select * from student where grade='A' or grade = 'B'";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {

			String name = rs.getString("name");
			int rollno = rs.getInt("rollno");
			String grade = rs.getString("grade");

			System.out.println("Name: " + name + " RollNo: " + rollno + " Grade: " + grade);

		}

	}
}
