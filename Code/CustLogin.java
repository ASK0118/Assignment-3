package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
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
import javax.swing.ImageIcon;

public class CustLogin extends JFrame {

	private JPanel contentPane;
	protected JTextField UserNametextField;
	protected JTextField PasswordtextField;
	protected String Username;
	protected String Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					CustLogin frame = new CustLogin();
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
	public CustLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 1005, 643);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Reset");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserNametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		
		JButton btnRegister = new JButton("Register for first time user");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstTimeRegister FTR = new FirstTimeRegister();
			    FTR.setModalExclusionType(null);
				FTR.setVisible(true);
				dispose();
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnRegister.setBounds(472, 510, 445, 70);
		panel.add(btnRegister);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_1.setBounds(12, 13, 101, 59);
		panel.add(button_1);
		button.setFont(new Font("Tahoma", Font.BOLD, 30));
		button.setBounds(262, 510, 154, 70);
		panel.add(button);
		
		JLabel UserNameJLabel = new JLabel("User Name");
		UserNameJLabel.setForeground(Color.WHITE);
		UserNameJLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		UserNameJLabel.setBounds(144, 254, 247, 60);
		panel.add(UserNameJLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPassword.setBounds(144, 341, 247, 60);
		panel.add(lblPassword);
		
		UserNametextField = new JTextField();
		Username = UserNametextField.getText();
		UserNametextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		UserNametextField.setBounds(403, 264, 311, 50);
		panel.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PasswordtextField.setColumns(10);
		PasswordtextField.setBounds(403, 351, 311, 50);
		panel.add(PasswordtextField);
		
		JButton btnLoginButton = new JButton("Login");
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = FirstTimeRegister.getTable();
				String un;
				String pw;
				boolean login = false;
				//2.2 Exception Handling
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						un = String.valueOf(t.getValueAt(i, 0));
						pw = String.valueOf(t.getValueAt(i, 2));
						
						if(UserNametextField.getText().equals(un) && PasswordtextField.getText().equals(pw)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						CompanyBackground CB = new CompanyBackground();
						CB.setModalExclusionType(null);
						CB.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null, "Login unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
						
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLoginButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnLoginButton.setBounds(66, 510, 148, 70);
		panel.add(btnLoginButton);
		
		JLabel lblCustomerLoginPage = new JLabel("Customer Login Page");
		lblCustomerLoginPage.setForeground(Color.WHITE);
		lblCustomerLoginPage.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblCustomerLoginPage.setBounds(260, 72, 482, 60);
		panel.add(lblCustomerLoginPage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\image\\CustLBG.jpg"));
		lblNewLabel.setBounds(0, 0, 1005, 643);
		panel.add(lblNewLabel);
	}
}
