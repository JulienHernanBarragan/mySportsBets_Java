package api;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import databaseProcessing.DataforPari;

public class Home extends JFrame {
	
	private JPanel pan, northPan, centerPan, southPan;
	private JLabel search, welcomeUser;
	private JTextField TFsearch;
	private JTable pari;
	private JButton addPari, updatePari, deletePari, Bankroll;
	private String datePari;
	private int pariID = 0, nmbMatch, nmbMatchGagnant = 0;
	private float mise, coteTotale, gain;
	
	public Home(int idUser, String nomUser) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setTitle("MySportsBets : Home");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/image/logo.png")));
		pan = new JPanel();
		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setBackground(new Color(102, 204, 153));
		pan.setLayout(new BorderLayout(70, 70));
		
		// North Panel
		northPan = new JPanel();
		northPan.setBackground(new Color(102, 204, 153));
		pan.add(northPan, BorderLayout.NORTH);
		
		welcomeUser = new JLabel("Bienvenue "+nomUser+" !");
		welcomeUser.setFont(new Font("Tahoma", Font.PLAIN, 22));
		northPan.add(welcomeUser);
		
		// Center panel
		pari = new JTable(new DataforPari().tablePariList(idUser));
		pari.setAutoCreateRowSorter(true);
		pari.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		pari.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		pari.setRowHeight(30);
		pari.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                Point p = e.getPoint(); 
                int row = pari.rowAtPoint(p);  
                	pariID = Integer.parseInt(pari.getValueAt(row,0).toString());
                	datePari = pari.getValueAt(row,1).toString();
                	nmbMatch = Integer.parseInt(pari.getValueAt(row,2).toString());
                	nmbMatchGagnant = Integer.parseInt(pari.getValueAt(row,3).toString());
                	mise = Float.parseFloat(pari.getValueAt(row,4).toString());
                	coteTotale = Float.parseFloat(pari.getValueAt(row,5).toString());
                	gain = Float.parseFloat(pari.getValueAt(row,6).toString());
            }	           
        });
		JScrollPane SCtable = new JScrollPane(pari);		
		pan.add(SCtable, BorderLayout.CENTER);
		
		// South panel 
		southPan = new JPanel();
		southPan.setBackground(new Color(102, 204, 153));
		pan.add(southPan, BorderLayout.SOUTH);
		southPan.setLayout(new GridLayout(0, 4, 0, 0));
		
		addPari = new JButton("Ajouter un pari");
		addPari.setFont(new Font("Tahoma", Font.PLAIN, 22));
		addPari.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				Add_pari session = new Add_pari(idUser, nomUser);
				session.setVisible(true);
				dispose();
			}
		});
		southPan.add(addPari);
		
		updatePari = new JButton("Modifier un pari");
		updatePari.setFont(new Font("Tahoma", Font.PLAIN, 22));
		updatePari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DataforPari().updatePari(pariID, datePari, nmbMatch, nmbMatchGagnant, mise, coteTotale, gain);
				new DataforPari().tablePariList(idUser).fireTableDataChanged();
                pari.setModel(new DataforPari().tablePariList(idUser));
                pariID = 0;
			}
		});

		southPan.add(updatePari);
		
		deletePari = new JButton("Supprimer un pari");
		deletePari.setFont(new Font("Tahoma", Font.PLAIN, 22));
		deletePari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new DataforPari().deletePari(pariID);
				// Update PariList
				new DataforPari().tablePariList(idUser).fireTableDataChanged();
				pari.setModel(new DataforPari().tablePariList(idUser));
                pariID = 0;
			}
		});
		southPan.add(deletePari);
		
		Bankroll = new JButton("Bankroll");
		Bankroll.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Bankroll.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				StatsBankroll session = new StatsBankroll(idUser, nomUser);
				session.setVisible(true);
			}
		});
		southPan.add(Bankroll);
	}
}
