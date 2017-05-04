package databaseProcessing;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
// Liste des paris de l'utilisateur
    public DefaultTableModel tablePariList(int ID_user){
 		
 		DefaultTableModel dt = new DefaultTableModel();
 		ResultSet rset;
 		try{
 			dt.addColumn("ID");
 			dt.addColumn("date du Pari");
 			dt.addColumn("nmb de match");
 			dt.addColumn("nmb de match Gagnant");
 			dt.addColumn("Mises");
 			dt.addColumn("Cote totale");
 			dt.addColumn("Gains");
 	    	Statement st = new databaseProcessing.Connect_DB().connexion.createStatement();
 			String query="SELECT ID, datePari, nmbMatch, nmbMatchGagnant, cotesTotale, mises, gains FROM pari WHERE ID_user="+ID_user+" GROUP BY ID";
 			rset=st.executeQuery(query);

 			while(rset.next()) {
 				Object []tableau={rset.getInt("ID"),rset.getString("datePari"),rset.getString("nmbMatch"),rset.getString("nmbMatchGagnant"),
 						rset.getString("mises"), rset.getString("cotesTotale"), rset.getString("gains")};
 				dt.addRow(tableau);
 			}
 			rset.close();
 			
 	    } catch(SQLException ex){
 			ex.printStackTrace();
 			JOptionPane.showMessageDialog(null,"Not Found","Message d’avertissement",JOptionPane.ERROR_MESSAGE);			
 		}	
 		return dt;
 	}


}
