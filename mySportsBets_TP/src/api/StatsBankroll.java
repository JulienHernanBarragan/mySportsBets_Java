package api;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
	int DBnmbpari, DBmisestotale, DBgainstotal, DBnmbMatchTotal, DBnmbMPTotal, DBnmbMGTotal, DBbankroll;
	String datepari = "'2017/01/01' and '2017/12/31'";
	String resultBankroll, resultBankrollArray [] ;
	DefaultPieDataset dataPieforMatch;
	JFreeChart pieChartRatioMatch;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public StatsBankroll() {
		
		pan = new JPanel();
    	pan.setLayout(null);
    	pan.setBackground(new Color(0, 0, 128));
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
		DBbankroll = DBgainstotal - DBmisestotale;
		
		// Pan North
		panNorth = new JPanel();
		pan.add(panNorth);
		panNorth.setLayout(new BorderLayout(0, 0));
		
		DefaultPieDataset pieDataset1 = new DefaultPieDataset();
		pieDataset1.setValue("Valeur1", new Integer(27));
		pieDataset1.setValue("Valeur2", new Integer(10));
		pieDataset1.setValue("Valeur3", new Integer(50));
		pieDataset1.setValue("Valeur4", new Integer(5));
		
		JFreeChart pieChart1 = ChartFactory.createPieChart("Bankroll",
		pieDataset1, true, true, true);
		Plot plot2 = pieChart1.getPlot();
		plot2.setBackgroundPaint(Color.white);
		pieChart1.setBackgroundPaint(new Color(102, 204, 153));
		ChartPanel c1Panel = new ChartPanel(pieChart1);
		panNorth.add(c1Panel, BorderLayout.CENTER);
		c1Panel.setLayout(new BorderLayout(0, 0));
		
		// Panel Chart South
		panChartSouth = new JPanel();
		c1Panel.add(panChartSouth, BorderLayout.SOUTH);
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
				DBbankroll = DBgainstotal - DBmisestotale;
				
				if (datepari == "'2017/01/01' and '2017/12/31'") {
					
				} else {
					
				}
				
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
		DBnmbMPTotal = DBnmbMatchTotal - DBnmbMGTotal;
		dataPieforMatch.setValue(DBnmbMPTotal+" Match Perdant", DBnmbMPTotal);
		dataPieforMatch.setValue(DBnmbMGTotal+" Match Gagnant", DBnmbMGTotal);
	
		pieChartRatioMatch = ChartFactory.createPieChart("Ratio des Paris de Match Gagnant/Perdant",
		dataPieforMatch, true, true, true);
		pieChartRatioMatch.setBackgroundPaint(new Color(102, 204, 153));
		Plot plot1 = pieChartRatioMatch.getPlot();
		plot1.setBackgroundPaint(Color.white);
		ChartPanel cPanel = new ChartPanel(pieChartRatioMatch);
		cPanel.setBounds(100, 252, 343, 28);
		cPanel.setBackground(new Color(102, 204, 153));
		panSouth.add(cPanel);
		
		// BarChart for Gains and Mises
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(DBmisestotale, "Mises = " + DBmisestotale, "");
		dataset.addValue(DBgainstotal, "Gains = " + DBgainstotal, "");
		
		JFreeChart barChart = ChartFactory.createBarChart("Mises/Gains", "",
		"Montant en Euros", dataset, PlotOrientation.VERTICAL, true, true, false);
		Plot plot = barChart.getPlot();
		plot.setBackgroundPaint(Color.white);
		barChart.setBackgroundPaint(new Color(102, 204, 153));
		ChartPanel cPanel2 = new ChartPanel(barChart);
		panSouth.add(cPanel2);
	}
}

