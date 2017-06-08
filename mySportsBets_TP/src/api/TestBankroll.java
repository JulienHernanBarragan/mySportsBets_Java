package api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class TestBankroll extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestBankroll frame = new TestBankroll();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestBankroll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		DefaultPieDataset pieDataset1 = new DefaultPieDataset();
		pieDataset1.setValue("Valeur1", new Integer(27));
		pieDataset1.setValue("Valeur2", new Integer(10));
		pieDataset1.setValue("Valeur3", new Integer(50));
		pieDataset1.setValue("Valeur4", new Integer(5));
		
		JFreeChart pieChart1 = ChartFactory.createPieChart("Test camembert",
		pieDataset1, true, true, true);
		ChartPanel c1Panel = new ChartPanel(pieChart1);
		panel.add(c1Panel, BorderLayout.CENTER);
		c1Panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		c1Panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		panel_2.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		DefaultPieDataset pieDataset = new DefaultPieDataset();
		pieDataset.setValue("Valeur1", new Integer(27));
		pieDataset.setValue("Valeur2", new Integer(10));
		pieDataset.setValue("Valeur3", new Integer(50));
		pieDataset.setValue("Valeur4", new Integer(5));
		
		JFreeChart pieChart = ChartFactory.createPieChart("Test camembert",
		pieDataset, true, true, true);
		ChartPanel cPanel = new ChartPanel(pieChart);
		panel_1.add(cPanel);
		
		DefaultPieDataset pieDataset2 = new DefaultPieDataset();
		pieDataset2.setValue("Valeur1", new Integer(27));
		pieDataset2.setValue("Valeur2", new Integer(10));
		pieDataset2.setValue("Valeur3", new Integer(50));
		pieDataset2.setValue("Valeur4", new Integer(5));
		
		JFreeChart pieChart2 = ChartFactory.createPieChart("Test camembert",
		pieDataset2, true, true, true);
		ChartPanel cPanel2 = new ChartPanel(pieChart2);
		panel_1.add(cPanel2);
		
		JLabel lblLeMontantDe = new JLabel("<html><p style='text-align:center;'>Pour ce mois, Votre Bankroll<br> est de <br> 250 €</html> ");
		lblLeMontantDe.setBackground(new Color(135, 206, 235));
		lblLeMontantDe.setFont(new Font("Roboto", Font.PLAIN, 50));
        lblLeMontantDe.setHorizontalAlignment(SwingConstants.CENTER); 
        lblLeMontantDe.setVerticalAlignment(SwingConstants.CENTER); 
		panel_1.add(lblLeMontantDe);

	}

}
