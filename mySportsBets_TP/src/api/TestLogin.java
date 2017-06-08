package api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TestLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLogin frame = new TestLogin();
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
	public TestLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Roboto", Font.PLAIN, 60));
		lblLogin.setBounds(275, 342, 221, 110);
		contentPane.add(lblLogin);
		
		JLabel lblMotDePasse = new JLabel("Password :");
		lblMotDePasse.setForeground(Color.WHITE);
		lblMotDePasse.setFont(new Font("Roboto", Font.PLAIN, 60));
		lblMotDePasse.setBounds(158, 468, 313, 110);
		contentPane.add(lblMotDePasse);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setBounds(106, 65, 956, 219);
		contentPane.add(lblLogo);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField.setBounds(523, 380, 420, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(523, 506, 420, 47);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 44));
		btnNewButton.setForeground(new Color(0, 250, 154));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(381, 635, 449, 69);
		contentPane.add(btnNewButton);
	}
}
