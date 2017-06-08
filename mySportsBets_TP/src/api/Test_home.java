package api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import databaseProcessing.DataforPari;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

public class Test_home extends JFrame {

	private JPanel contentPane;
	private JTable pari;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_home frame = new Test_home();
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
	public Test_home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(100, 100));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 153));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblBienvenueUtilisateur = new JLabel("Bienvenue Utilisateur !");
		lblBienvenueUtilisateur.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(lblBienvenueUtilisateur);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 153));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		pari = new JTable(new DataforPari().tablePariList(1));
		pari.setAutoCreateRowSorter(true);
		pari.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		pari.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		pari.setRowHeight(30);
		JScrollPane SCtable = new JScrollPane(pari);		
		panel_1.add(SCtable);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 204, 153));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_2.add(btnNewButton_3);
	}

}
