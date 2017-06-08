package databaseProcessing;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import api.Home;

public class Connect_DB {

	Connection connexion;
	String url;
		
	public Connect_DB()	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = new String("jdbc:mysql://localhost:3306/mysportbets_TP");
			connexion = (Connection) DriverManager.getConnection(url,"root","");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Login
	public String connectAPI(String user, String password) {	
	    String acceptConnecting ="";	
	    try 
	    {
		   	Statement st = new Connect_DB().connexion.createStatement();
		   	ResultSet request = st.executeQuery("SELECT * FROM user WHERE pseudo='"+user+"' AND password='"+password+"'");
		    	if (request.next()){
		    		acceptConnecting = "accept;"+ request.getInt("ID")+";"+request.getString("firstname")+" "+request.getString("lastname");
		    		//request.getString("ID");
		    	} else {
		    		JOptionPane.showMessageDialog(null,"Données Incorrect !");
		    	}
	    	request.close();
	    }
	    catch (Exception e)
	    {
			System.out.println("Connexion Impossible");
		    e.printStackTrace();
	    }
	    return acceptConnecting;
	}
			    
}