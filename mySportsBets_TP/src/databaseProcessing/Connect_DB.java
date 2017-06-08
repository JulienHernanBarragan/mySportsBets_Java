package databaseProcessing;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Connect_DB {

	Connection connexion;
		String url;
		
		public Connect_DB()	{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				url = new String("jdbc:mysql://localhost:3306/mysportbets_2");
				connexion = (Connection) DriverManager.getConnection(url,"root","");
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
}