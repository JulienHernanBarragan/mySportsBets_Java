package api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Test_Add extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_Add frame = new Test_Add();
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
	public Test_Add() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSiteDuPari = new JLabel("Site du pari :");
		lblSiteDuPari.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSiteDuPari.setBounds(29, 43, 134, 28);
		contentPane.add(lblSiteDuPari);
		
		textField_3 = new JTextField();
		textField_3.setBounds(164, 49, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNombresDeMatch = new JLabel("Nombres de Match :");
		lblNombresDeMatch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombresDeMatch.setBounds(29, 136, 191, 28);
		contentPane.add(lblNombresDeMatch);
		
		JLabel lblNombresDeMatch_1 = new JLabel("Nombres de Match gagnant :");
		lblNombresDeMatch_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombresDeMatch_1.setBounds(371, 134, 265, 33);
		contentPane.add(lblNombresDeMatch_1);
		
		JLabel lblMise = new JLabel("Mise :");
		lblMise.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMise.setBounds(29, 211, 93, 22);
		contentPane.add(lblMise);
		
		JLabel lblCteTotale = new JLabel("C\u00F4te totale :");
		lblCteTotale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCteTotale.setBounds(216, 208, 129, 28);
		contentPane.add(lblCteTotale);
		
		JLabel lblGains = new JLabel("Gains :");
		lblGains.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGains.setBounds(472, 208, 129, 28);
		contentPane.add(lblGains);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(232, 136, 48, 28);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spinner_1.setBounds(648, 136, 48, 28);
		contentPane.add(spinner_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 214, 81, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(339, 214, 81, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(568, 214, 81, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(460, 280, 236, 60);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(84, 280, 236, 60);
		contentPane.add(button);
		
		JLabel lblDateDuPari = new JLabel("Date du Pari :");
		lblDateDuPari.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDateDuPari.setBounds(391, 43, 134, 28);
		contentPane.add(lblDateDuPari);
		
		textField_7 = new JTextField();
		textField_7.setBounds(537, 49, 116, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
	}
}
