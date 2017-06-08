package api;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import databaseProcessing.Connect_DB;

public class Login extends JFrame {
	private JPanel pan;
	private JLabel LPassword, Llog, Llogo;
	private JTextField Tlog;
	private JPasswordField TPassword;
	private JButton Bconnect;
	private String user, password;
		
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setResizable(false);
		pan = new JPanel();
		pan.setBackground(new Color(102, 204, 153));
		pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan);
		pan.setLayout(null);
		
		Llog = new JLabel("Login :");
		Llog.setForeground(Color.WHITE);
		Llog.setFont(new Font("Roboto", Font.PLAIN, 60));
		Llog.setBounds(275, 342, 221, 110);
		pan.add(Llog);
		
		LPassword = new JLabel("Password :");
		LPassword.setForeground(Color.WHITE);
		LPassword.setFont(new Font("Roboto", Font.PLAIN, 60));
		LPassword.setBounds(158, 468, 313, 110);
		pan.add(LPassword);
		
		Llogo = new JLabel("Logo");
		Llogo.setBounds(106, 65, 956, 219);
		pan.add(Llogo);
		
		Tlog = new JTextField();
		Tlog.setFont(new Font("Tahoma", Font.PLAIN, 28));
		Tlog.setBounds(523, 380, 420, 47);
		pan.add(Tlog);
		Tlog.setColumns(10);
		
		TPassword = new JPasswordField();
		TPassword.setColumns(10);
		TPassword.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					user = Tlog.getText();
		    		password = TPassword.getText();
		    		String admin = new Connect_DB().connectAPI(user, password);
		    		String[] adminData = admin.split(";");
		    			if (admin.indexOf("accept") >= 0) {
		    				Home session = new Home(Integer.parseInt(adminData[1]), adminData[2]);
		    				session.setVisible(true);
		    				dispose();
		    			}
				}
			}
		});
		TPassword.setBounds(523, 506, 420, 47);
		pan.add(TPassword);
		
		Bconnect = new JButton("Connexion");
		Bconnect.setFont(new Font("Roboto", Font.BOLD, 44));
		Bconnect.setForeground(new Color(0, 250, 154));
		Bconnect.setBackground(Color.WHITE);
		Bconnect.addActionListener(new ActionListener()  {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)  {
				user = Tlog.getText();
	    		password = TPassword.getText();
	    		String admin = new Connect_DB().connectAPI(user, password);
	    		String[] adminData = admin.split(";");
	    			if (admin.indexOf("accept") >= 0) {
	    				Home session = new Home(Integer.parseInt(adminData[1]), adminData[2]);
	    				session.setVisible(true);
	    				dispose();
	    			}
		    	}
			});
		Bconnect.setBounds(381, 635, 449, 69);
		pan.add(Bconnect);
	}
}
