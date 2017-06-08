package api;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class StatsBankroll extends JFrame {
	
	private static final long serialVersionUID = 1L;
	static JPanel pan, panNorth, panChartSouth, panSouth;
	@SuppressWarnings("rawtypes")
	JComboBox CBdate;
	JButton validCB;
	JLabel Bankroll;
	int DBnmbpari, DBmisestotale, DBgainstotal, DBnmbMatchTotal, DBnmbMPTotal, DBnmbMGTotal, DBbankroll;
	String datepari = "'2017/01/01' and '2017/12/31'";
	String resultBankroll, resultBankrollArray [] ;
	DefaultPieDataset dataPieforMatch;
	JFreeChart pieChartRatioMatch, barChartGainsMises, lineChartBankroll;
	ChartPanel cPanel, cPanel2, cPanel3;
	DefaultCategoryDataset datasetGainsMises, datasetBankroll;
	
	// Data for graph bankroll
	int misesJanvier, misesFevrier, misesMars, misesAvril, misesMai, misesJuin, misesJuillet, misesAout, misesSeptembre, misesOctobre, misesNovembre, misesDecembre;
	int gainsJanvier, gainsFevrier, gainsMars, gainsAvril, gainsMai, gainsJuin, gainsJuillet, gainsAout, gainsSeptembre, gainsOctobre, gainsNovembre, gainsDecembre;
	int bankrollJanvier, bankrollFevrier, bankrollMars, bankrollAvril, bankrollMai, bankrollJuin, bankrollJuillet, bankrollAout, bankrollSeptembre, bankrollOctobre, bankrollNovembre, bankrollDecembre;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public StatsBankroll() {
		
		pan = new JPanel();
    	pan.setLayout(null);
		setSize(1200,800);
		pan.setBackground(new Color(102, 204, 153));
		setContentPane(pan);
		pan.setLayout(new GridLayout(0, 1, 0, 0));
		setLocationRelativeTo(null);
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll(datepari);
		resultBankrollArray = resultBankroll.split(",");
		DBnmbpari = Integer.parseInt(resultBankrollArray[0]);
		DBmisestotale = Integer.parseInt(resultBankrollArray[1]);
		DBgainstotal = Integer.parseInt(resultBankrollArray[2]);
		DBnmbMatchTotal = Integer.parseInt(resultBankrollArray[3]);
		DBnmbMGTotal = Integer.parseInt(resultBankrollArray[4]);
		DBnmbMPTotal = DBnmbMatchTotal - DBnmbMGTotal;
		DBbankroll = DBgainstotal - DBmisestotale;
		
		// Pan North
		panNorth = new JPanel();
		pan.add(panNorth);
		panNorth.setLayout(new BorderLayout(0, 0));
		panNorth.setBorder(new EmptyBorder(0, 0, 25, 0));
		panNorth.setBackground(new Color(102, 204, 153));
		
		// Get data for Graph bankroll
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/01/31'");
		resultBankrollArray = resultBankroll.split(",");
		misesJanvier = Integer.parseInt(resultBankrollArray[1]);
		gainsJanvier = Integer.parseInt(resultBankrollArray[2]);
		bankrollJanvier = gainsJanvier - misesJanvier;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/02/28'");
		resultBankrollArray = resultBankroll.split(",");
		misesFevrier = Integer.parseInt(resultBankrollArray[1]);
		gainsFevrier = Integer.parseInt(resultBankrollArray[2]);
		bankrollFevrier = gainsFevrier - misesFevrier;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/03/31'");
		resultBankrollArray = resultBankroll.split(",");
		misesMars = Integer.parseInt(resultBankrollArray[1]);
		gainsMars = Integer.parseInt(resultBankrollArray[2]);
		bankrollMars = gainsMars - misesMars;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/04/30'");
		resultBankrollArray = resultBankroll.split(",");
		misesAvril = Integer.parseInt(resultBankrollArray[1]);
		gainsAvril = Integer.parseInt(resultBankrollArray[2]);
		bankrollAvril = gainsAvril - misesAvril;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/05/31'");
		resultBankrollArray = resultBankroll.split(",");
		misesMai = Integer.parseInt(resultBankrollArray[1]);
		gainsMai = Integer.parseInt(resultBankrollArray[2]);
		bankrollMai = gainsMai - misesMai;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/06/30'");
		resultBankrollArray = resultBankroll.split(",");
		misesJuin = Integer.parseInt(resultBankrollArray[1]);
		gainsJuin = Integer.parseInt(resultBankrollArray[2]);
		bankrollJuin = gainsJuin - misesJuin;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/07/31'");
		resultBankrollArray = resultBankroll.split(",");
		misesJuillet = Integer.parseInt(resultBankrollArray[1]);
		gainsJuillet = Integer.parseInt(resultBankrollArray[2]);
		bankrollJuillet = gainsJuillet - misesJuillet;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/08/31'");
		resultBankrollArray = resultBankroll.split(",");
		misesAout = Integer.parseInt(resultBankrollArray[1]);
		gainsAout = Integer.parseInt(resultBankrollArray[2]);
		bankrollAout = gainsAout - misesAout;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/09/30'");
		resultBankrollArray = resultBankroll.split(",");
		misesSeptembre = Integer.parseInt(resultBankrollArray[1]);
		gainsSeptembre = Integer.parseInt(resultBankrollArray[2]);
		bankrollSeptembre = gainsSeptembre - misesSeptembre;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/10/31'");
		resultBankrollArray = resultBankroll.split(",");
		misesOctobre = Integer.parseInt(resultBankrollArray[1]);
		gainsOctobre = Integer.parseInt(resultBankrollArray[2]);
		bankrollOctobre = gainsOctobre - misesOctobre;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/11/30'");
		resultBankrollArray = resultBankroll.split(",");
		misesNovembre = Integer.parseInt(resultBankrollArray[1]);
		gainsNovembre = Integer.parseInt(resultBankrollArray[2]);
		bankrollNovembre = gainsNovembre - misesNovembre;
		
		resultBankroll = new databaseProcessing.DataforPari().dataBankroll("'2017/01/01' and '2017/12/31'");
		resultBankrollArray = resultBankroll.split(",");
		misesDecembre = Integer.parseInt(resultBankrollArray[1]);
		gainsDecembre = Integer.parseInt(resultBankrollArray[2]);
		bankrollDecembre = gainsDecembre - misesDecembre;
		
		// Graph Bankroll
		datasetBankroll = new DefaultCategoryDataset( );
		datasetBankroll.addValue( bankrollJanvier, "bankroll" , "Janvier" );
	    datasetBankroll.addValue( bankrollFevrier, "bankroll" , "Février" );
	    datasetBankroll.addValue( bankrollMars, "bankroll" ,  "Mars" );
	    datasetBankroll.addValue( bankrollAvril , "bankroll" , "Avril" );
	    datasetBankroll.addValue( bankrollMai , "bankroll" , "Mai" );
	    datasetBankroll.addValue( bankrollJuin, "bankroll" , "Juin" );
	    datasetBankroll.addValue( bankrollJuillet , "bankroll" , "Juillet" );
	    datasetBankroll.addValue( bankrollAout , "bankroll" , "Août" );
	    datasetBankroll.addValue( bankrollSeptembre , "bankroll" , "Septembre" );
	    datasetBankroll.addValue( bankrollOctobre , "bankroll" , "Octobre" );
	    datasetBankroll.addValue( bankrollNovembre , "bankroll" , "Novembre" );
	    datasetBankroll.addValue( bankrollDecembre , "bankroll" , "Decembre" );
	    
	    
	    lineChartBankroll = ChartFactory.createLineChart(
		         "Bankroll de l'Année","Mois","Montant en Euros",datasetBankroll,PlotOrientation.VERTICAL,true,true,false);
		lineChartBankroll.setBackgroundPaint(new Color(102, 204, 153));
		Plot plot2 = lineChartBankroll.getPlot();
		plot2.setBackgroundPaint(Color.white);
		cPanel3 = new ChartPanel(lineChartBankroll);
		panNorth.add(cPanel3, BorderLayout.CENTER);
		cPanel3.setLayout(new BorderLayout(0, 0));
		
		// Panel Chart South
		panChartSouth = new JPanel();
		cPanel3.add(panChartSouth, BorderLayout.SOUTH);
		panChartSouth.setLayout(new GridLayout(1, 0, 0, 0));
		
		CBdate = new JComboBox();
		CBdate.setModel(new DefaultComboBoxModel(new String[] {"Année 2017", "Janvier 2017", "Février 2017", "Mars 2017", "Avril 2017", "Mai 2017", "Juin 2017", "Juillet 2017", "Août 2017", "Septembre 2017", "Octobre 2017", "Novembre 2017", "Décembre 2017"}));		
		CBdate.setBounds(522, 41, 120, 20);
		panChartSouth.add(CBdate);
		
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
				DBnmbMPTotal = DBnmbMatchTotal - DBnmbMGTotal;
				DBbankroll = DBgainstotal - DBmisestotale;
			
				// Change data for PieChart
				dataPieforMatch.clear();
				dataPieforMatch.setValue(DBnmbMPTotal+" Match Perdant", DBnmbMPTotal);
				dataPieforMatch.setValue(DBnmbMGTotal+" Match Gagnant", DBnmbMGTotal);
				
				// Change data for barChart
				datasetGainsMises.clear();
				datasetGainsMises.addValue(DBmisestotale, "Mises = " + DBmisestotale, "");
				datasetGainsMises.addValue(DBgainstotal, "Gains = " + DBgainstotal, "");
				
				// Change data for montantBankroll
				Bankroll.setText("<html><p style='text-align:center;'>Votre Bankroll<br> est de <br> "+DBbankroll+" €</html>");
				
			}
		});
		validCB.setBounds(648, 40, 26, 23);
		panChartSouth.add(validCB);
		
		// Pan South
		panSouth = new JPanel();
		pan.add(panSouth);
		panSouth.setLayout(new GridLayout(0, 3, 0, 0));
		
		// PieChart for ratio Match win / Match Loses
		dataPieforMatch = new DefaultPieDataset();
		dataPieforMatch.setValue(DBnmbMPTotal+" Match Perdant", DBnmbMPTotal);
		dataPieforMatch.setValue(DBnmbMGTotal+" Match Gagnant", DBnmbMGTotal);
	
		pieChartRatioMatch = ChartFactory.createPieChart("Ratio des Paris de Match Gagnant/Perdant",
		dataPieforMatch, true, true, true);
		pieChartRatioMatch.setBackgroundPaint(new Color(102, 204, 153));
		Plot plot1 = pieChartRatioMatch.getPlot();
		plot1.setBackgroundPaint(Color.white);
		cPanel = new ChartPanel(pieChartRatioMatch);
		cPanel.setBounds(100, 252, 343, 28);
		cPanel.setBackground(new Color(102, 204, 153));
		panSouth.add(cPanel);
		
		// BarChart for Gains and Mises
		datasetGainsMises = new DefaultCategoryDataset();
		datasetGainsMises.addValue(DBmisestotale, "Mises = " + DBmisestotale, "");
		datasetGainsMises.addValue(DBgainstotal, "Gains = " + DBgainstotal, "");
		
		barChartGainsMises = ChartFactory.createBarChart("Mises/Gains", "",
		"Montant en Euros", datasetGainsMises, PlotOrientation.VERTICAL, true, true, false);
		Plot plot = barChartGainsMises.getPlot();
		plot.setBackgroundPaint(Color.white);
		barChartGainsMises.setBackgroundPaint(new Color(102, 204, 153));
		cPanel2 = new ChartPanel(barChartGainsMises);
		panSouth.add(cPanel2);
		
		Bankroll = new JLabel("<html><p style='text-align:center;'>Votre Bankroll<br> est de <br> "+DBbankroll+" €</html>");
		Bankroll.setFont(new Font("Roboto", Font.PLAIN, 50));
		Bankroll.setBackground(new Color(102, 204, 153));
		Bankroll.setOpaque(true);
		Bankroll.setHorizontalAlignment(SwingConstants.CENTER); 
		Bankroll.setVerticalAlignment(SwingConstants.CENTER); 
		panSouth.add(Bankroll);
	}
	
}

