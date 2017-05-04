package api;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
	
	private JPanel pan;
	private JLabel search;
	private JTextField TFsearch;
	private JTable pari;
	private JButton add, returnMenu, validsearch;
	
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 800);
		setTitle("MySportsBets : Home");
		pan = new JPanel();
		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(new BorderLayout(0, 0));
		
		// Center panel
		pari = new JTable(new DataforPari().tablePariList(1));
		pari.setAutoCreateRowSorter(true);
		pari.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		pari.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		pari.setRowHeight(30);
		JScrollPane SCtable = new JScrollPane(pari);		
		pan.add(SCtable, BorderLayout.CENTER);
		
	}
}
