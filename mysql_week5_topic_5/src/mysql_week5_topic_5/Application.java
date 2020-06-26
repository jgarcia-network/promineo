package mysql_week5_topic_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdbs:mysql://hostname:port/databasename
		//localhost 127.0.0.1
		String connectionString = "jdbc:mysql://localhost:3306/employees";
		//final = const
		//? = parameter
		final String SELECT_QUERY = "SELECT * FROM employees WHERE emp_no = ?";
		
		Scanner scanner = new Scanner(System.in);
		
		

		try {
		Connection conn = DriverManager.getConnection(connectionString, "root", "root");
		System.out.println("Connected successfully!");
		System.out.println("Enter employee number: ");
		String empNo = scanner.nextLine();
		PreparedStatement ps = conn.prepareStatement(SELECT_QUERY);
		ps.setString(1, empNo);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("emp:no " + rs.getInt(1) + " dob: " + rs.getString(2) + " first Name: " + rs.getString(3));
		}
		
		} catch (SQLException e) {
			System.out.println("Error connecting to database");
			e.printStackTrace();
		}
		
		
		
	}

}
