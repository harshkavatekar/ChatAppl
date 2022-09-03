package chatApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginPage {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(181, 11, 95, 29);
		lblLogin.setBackground(Color.LIGHT_GRAY);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(68, 57, 113, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(68, 113, 113, 29);
		panel.add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(248, 62, 144, 23);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setToolTipText("");
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(248, 118, 144, 23);
		panel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Create account");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(181, 247, 95, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Engravers MT", Font.BOLD, 15));
		btnNewButton.setBounds(54, 163, 127, 46);
		panel.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Engravers MT", Font.BOLD, 15));
		btnCancel.setBounds(251, 163, 130, 46);
		panel.add(btnCancel);
	}
}
