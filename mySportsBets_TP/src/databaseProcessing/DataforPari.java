package databaseProcessing;

import java.sql.ResultSet;
import java.sql.Statement;

import databaseProcessing.Connect_DB;

public class DataforPari {

	//Fonction pour connexion à la base de données pour bankroll
    public String dataBankroll(String datepari) {	
    	int BDnmbpari = 0, BDmisestotale = 0, BDgainstotal = 0, BDnmbMatchTotal = 0, BDnmbMGTotal = 0;
    	
    	try 
	    {
	    	Statement st = new Connect_DB().connexion.createStatement();
	    	ResultSet requestPari = st.executeQuery("SELECT COUNT(ID) AS nmbpari, SUM(mises) AS misestotale, SUM(gains) AS gainstotal, "+
	    											"SUM(nmbMatch) AS nmbMatchTotal, SUM(nmbmatchGagnant) AS nmbMGTotal "+
	    											"FROM pari "+
	    											"WHERE datePari between "+datepari);
	    		while (requestPari.next()) {
	    			BDnmbpari = requestPari.getInt("nmbpari");
	    			BDmisestotale = requestPari.getInt("misestotale");
	    			BDgainstotal = requestPari.getInt("gainstotal");
	    			BDnmbMatchTotal = requestPari.getInt("nmbMatchTotal");
	    			BDnmbMGTotal = requestPari.getInt("nmbMGTotal");
	    		}
	    		requestPari.close();

	    }
	    catch (Exception e)
	    {
	    	System.out.println("Connexion impossible");
	    	e.printStackTrace();
	    }
	    return Integer.toString(BDnmbpari) +","+ Integer.toString(BDmisestotale) +","+ Integer.toString(BDgainstotal) +","+ Integer.toString(BDnmbMatchTotal) +","+ Integer.toString(BDnmbMGTotal);
    }

}
