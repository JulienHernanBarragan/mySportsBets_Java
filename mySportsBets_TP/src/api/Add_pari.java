package api;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import databaseProcessing.DataforPari;

public class Add_pari extends JFrame {
	
	JPanel pan;
	JLabel sitePari, datePari, nmbMatch, nmbMatchGagnant, mise, coteTotale, gains;
	JTextField TFsitePari, TFdatePari, TFmise, TFcoteTotale, TFgains;
	JSpinner SnmbMatch, SnmbMatchGagnant;
	JButton Breturn, BaddPari;
	String RdatePari, RmaisonPari;
	int RnmbMatch, RnmbMatchGagnant;
	float Rmise, RcoteTotale;
	
	public Add_pari () {
		setBounds(100, 100, 800, 400);
		pan = new JPanel();
		pan.setBackground(new Color(102, 204, 153));
		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(pan);
		pan.setLayout(null);
		
		sitePari = new JLabel("Site du pari :");
		sitePari.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sitePari.setBounds(29, 43, 134, 28);
		pan.add(sitePari);
		
		TFsitePari = new JTextField();
		TFsitePari.setBounds(164, 49, 116, 22);
		pan.add(TFsitePari);
		TFsitePari.setColumns(10);
		
		nmbMatch = new JLabel("Nombres de Match :");
		nmbMatch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nmbMatch.setBounds(29, 136, 191, 28);
		pan.add(nmbMatch);
		
		SnmbMatch = new JSpinner();
		SnmbMatch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SnmbMatch.setBounds(232, 136, 48, 28);
		pan.add(SnmbMatch);
		
		nmbMatchGagnant = new JLabel("Nombres de Match gagnant :");
		nmbMatchGagnant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nmbMatchGagnant.setBounds(371, 134, 265, 33);
		pan.add(nmbMatchGagnant);
		
		SnmbMatchGagnant = new JSpinner();
		SnmbMatchGagnant.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SnmbMatchGagnant.setBounds(648, 136, 48, 28);
		pan.add(SnmbMatchGagnant);
		
		mise = new JLabel("Mise :");
		mise.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mise.setBounds(29, 211, 93, 22);
		pan.add(mise);
		
		coteTotale = new JLabel("C\u00F4te totale :");
		coteTotale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		coteTotale.setBounds(216, 208, 129, 28);
		pan.add(coteTotale);
		
		gains = new JLabel("Gains :");
		gains.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gains.setBounds(472, 208, 129, 28);
		pan.add(gains);
		
		TFmise = new JTextField();
		TFmise.setBounds(104, 214, 81, 22);
		pan.add(TFmise);
		TFmise.setColumns(10);
		
		TFcoteTotale = new JTextField();
		TFcoteTotale.setBounds(339, 214, 81, 22);
		pan.add(TFcoteTotale);
		TFcoteTotale.setColumns(10);
		
		TFgains = new JTextField();
		TFgains.setBounds(568, 214, 81, 22);
		pan.add(TFgains);
		TFgains.setColumns(10);
		
		datePari = new JLabel("Date du Pari :");
		datePari.setFont(new Font("Tahoma", Font.PLAIN, 20));
		datePari.setBounds(391, 43, 134, 28);
		pan.add(datePari);
		
		TFdatePari = new JTextField();
		TFdatePari.setBounds(537, 49, 116, 22);
		pan.add(TFdatePari);
		TFdatePari.setColumns(10);
		
		BaddPari = new JButton("Ajouter le Pari");
		BaddPari.setBounds(460, 280, 236, 60);
		BaddPari.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e)  {
    		// r�cup des donn�es
				RmaisonPari = TFsitePari.getText();
				Rmise = Float.parseFloat(TFmise.getText());
				RcoteTotale = Float.parseFloat(TFcoteTotale.getText());
				RdatePari = TFdatePari.getText();
				RnmbMatch = Integer.parseInt(SnmbMatch.getValue().toString());
				RnmbMatchGagnant = Integer.parseInt(SnmbMatchGagnant.getValue().toString());
				System.out.println(RnmbMatch);
				
			// insert BDD
				new DataforPari().addPari(1,RmaisonPari, RdatePari, RnmbMatch, RnmbMatchGagnant, Rmise, RcoteTotale);
				dispose();
			}
		});
		pan.add(BaddPari);
		
		Breturn = new JButton("Retour Home");
		Breturn.setBounds(84, 280, 236, 60);
		pan.add(Breturn);

	}
}
