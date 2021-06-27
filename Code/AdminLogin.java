package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField UserNametextField;
	private JTextField PasswordtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 729, 502);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(12, 13, 101, 59);
		panel.add(button);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(372, 408, 219, 70);
		panel.add(btnReset);
		
		JLabel UserNameJLabel = new JLabel("User Name");
		UserNameJLabel.setBounds(48, 195, 247, 60);
		UserNameJLabel.setForeground(Color.WHITE);
		UserNameJLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(UserNameJLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(48, 282, 247, 60);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblPassword);
		
		UserNametextField = new JTextField();
		UserNametextField.setBounds(307, 205, 311, 50);
		UserNametextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setBounds(307, 292, 311, 50);
		PasswordtextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PasswordtextField.setColumns(10);
		panel.add(PasswordtextField);
		
		JButton btnLoginButton = new JButton("Login");
		btnLoginButton.setBounds(129, 408, 219, 70);
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {  
					if(UserNametextField.getText().equals("Ang Shu Khai")&& PasswordtextField.getText().equals("angsk")) {
						JOptionPane.showMessageDialog(null, "Login Succesfull");
						AdminCompanyBack ACB = new AdminCompanyBack();
						ACB.setModalExclusionType(null);
						ACB.setVisible(true);
						dispose();}
					
					else 
						JOptionPane.showMessageDialog(null, "Login UnSuccesfull");
						
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}
			}
		});
		btnLoginButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(btnLoginButton);
		
		JLabel lblAdminLoginPage = new JLabel("Admin Login Page");
		lblAdminLoginPage.setBounds(129, 27, 482, 60);
		lblAdminLoginPage.setForeground(Color.WHITE);
		lblAdminLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLoginPage.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblAdminLoginPage);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -64, 737, 629);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\image\\AdminLBG.PNG"));
		panel.add(lblNewLabel);
	}
}

