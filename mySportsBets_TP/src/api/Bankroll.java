package api;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Bankroll extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JPanel pan;
	JLabel titre, nmbpari, misestotale, gainstotale, bankroll;
	@SuppressWarnings("rawtypes")
	JComboBox CBdate;
	JButton validCB;
	int DBnmbpari, DBmisestotale, DBgainstotal, DBnmbMatchTotal, DBnmbMGTotal, DBbankroll;
	String datepari = "'2017/01/01' and '2017/12/31'";
	String resultBankroll, resultBankrollArray [] ;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Bankroll() {
		
		pan = new JPanel();
    	pan.setLayout(null);
    	pan.setBackground(new Color(0, 0, 128));
		setSize(700,400);
		setContentPane(pan);
		setLocationRelativeTo(null);
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll(datepari);
		resultBankrollArray = resultBankroll.split(",");
		DBnmbpari = Integer.parseInt(resultBankrollArray[0]);
		DBmisestotale = Integer.parseInt(resultBankrollArray[1]);
		DBgainstotal = Integer.parseInt(resultBankrollArray[2]);
		DBnmbMatchTotal = Integer.parseInt(resultBankrollArray[3]);
		DBnmbMGTotal = Integer.parseInt(resultBankrollArray[4]);
		DBbankroll = DBgainstotal - DBmisestotale;
		
		titre = new JLabel("Bilan");
		titre.setForeground(Color.WHITE);
		titre.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		titre.setBounds(289, 11, 154, 47);
		pan.add(titre);
		
		CBdate = new JComboBox();
		CBdate.setModel(new DefaultComboBoxModel(new String[] {"Année 2017", "Janvier 2017", "Février 2017", "Mars 2017", "Avril 2017", "Mai 2017", "Juin 2017", "Juillet 2017", "Août 2017", "Septembre 2017", "Octobre 2017", "Novembre 2017", "Décembre 2017"}));		
		CBdate.setBounds(522, 41, 120, 20);
		pan.add(CBdate);
		
		validCB = new JButton();
		validCB.addActionListener(new ActionListener()  {
	    	public void actionPerformed(ActionEvent e)  {
		    	if (CBdate.getSelectedItem() == "Année 2017") {
		    		datepari = "'2017/01/01' and '2017/12/31'";
		    	} else if (CBdate.getSelectedItem() == "Janvier 2017") {
		    		datepari = "'2017/01/01' and '2017/01/31'";
		    	} else if (CBdate.getSelectedItem() == "Février 2017") {
		    		datepari = "'2017/02/01' and '2017/02/29'";
		    	} else if (CBdate.getSelectedItem() == "Mars 2017") {
		    		datepari = "'2017/03/01' and '2017/03/31'";
		    	} else if (CBdate.getSelectedItem() == "Avril 2017") {
		    		datepari = "'2017/04/01' and '2017/04/30'";
		    	} else if (CBdate.getSelectedItem() == "Mai 2017") {
		    		datepari = "'2017/05/01' and '2017/05/31'";
		    	} else if (CBdate.getSelectedItem() == "Juin 2017") {
		    		datepari = "'2017/06/01' and '2017/06/30'";
		    	} else if (CBdate.getSelectedItem() == "Juillet 2017") {
		    		datepari = "'2017/07/01' and '2017/07/31'";
		    	} else if (CBdate.getSelectedItem() == "Août 2017") {
		    		datepari = "'2017/08/01' and '2017/08/31'";
		    	} else if (CBdate.getSelectedItem() == "Septembre 2017") {
		    		datepari = "'2017/09/01' and '2017/09/30'";
		    	} else if (CBdate.getSelectedItem() == "Octobre 2017") {
		    		datepari = "'2017/10/01' and '2017/10/31'";
		    	} else if (CBdate.getSelectedItem() == "Novembre 2017") {
		    		datepari = "'2017/11/01' and '2017/11/30'";
		    	} else if (CBdate.getSelectedItem() == "Décembre 2017") {
		    		datepari = "'2017/12/01' and '2017/12/31'";
		    	} 
 
		    	resultBankroll = new databaseProcessing.DataforPari().dataBankroll(datepari);
				resultBankrollArray = resultBankroll.split(",");
				DBnmbpari = Integer.parseInt(resultBankrollArray[0]);
				DBmisestotale = Integer.parseInt(resultBankrollArray[1]);
				DBgainstotal = Integer.parseInt(resultBankrollArray[2]);
				DBnmbMatchTotal = Integer.parseInt(resultBankrollArray[3]);
				DBnmbMGTotal = Integer.parseInt(resultBankrollArray[4]);
				DBbankroll = DBgainstotal - DBmisestotale;
				
				if (datepari == "'2017/01/01' and '2017/12/31'") {
					nmbpari.setText("Vous avez jouez un nombre de "+DBnmbpari+" paris.");
					misestotale.setText("Votre mise globale est de "+DBmisestotale+" Euros.");
					gainstotale.setText("Vos gains sont élevés à "+DBgainstotal+" Euros.");
					DBbankroll = DBgainstotal - DBmisestotale;
					bankroll.setText("Votre Bankroll est de "+DBbankroll+" Euros.");
				} else {
					nmbpari.setText("Vous avez jouez un nombre de "+DBnmbpari+" paris ce mois-ci.");
					misestotale.setText("Votre mise globale est de "+DBmisestotale+" Euros ce mois-ci.");
					gainstotale.setText("Vos gains sont élevés à "+DBgainstotal+" Euros ce mois-ci.");
					DBbankroll = DBgainstotal - DBmisestotale;
					bankroll.setText("Votre Bankroll est de "+DBbankroll+" Euros ce mois-ci.");
				}
				
			}
		});
		validCB.setBounds(648, 40, 26, 23);
		pan.add(validCB);
		
		nmbpari = new JLabel("Vous avez jouez un nombre de "+DBnmbpari+" paris.");
		nmbpari.setForeground(Color.WHITE);
		nmbpari.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		nmbpari.setBounds(100, 87, 464, 28);
		pan.add(nmbpari);
		
		misestotale = new JLabel("Votre mise globale est de "+DBmisestotale+" Euros.");
		misestotale.setForeground(Color.WHITE);
		misestotale.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		misestotale.setBounds(100, 137, 429, 28);
		pan.add(misestotale);
		
		gainstotale = new JLabel("Vos gains sont élevés à "+DBgainstotal+" Euros.");
		gainstotale.setForeground(Color.WHITE);
		gainstotale.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		gainstotale.setBounds(100, 192, 325, 28);
		pan.add(gainstotale);
		
		bankroll = new JLabel("Votre Bankroll est de "+DBbankroll+" Euros.");
		bankroll.setForeground(Color.WHITE);
		bankroll.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		bankroll.setBounds(100, 252, 343, 28);
		pan.add(bankroll);
	}

}