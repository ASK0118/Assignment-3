package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FirstTimeRegister extends JFrame {

	private JPanel contentPane;
	protected JTextField Unametxt;
	private JTextField Emailtxt;
	protected JTextField Passtxt;
	private JTextField ConPasstxt;
	public static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					FirstTimeRegister frame = new FirstTimeRegister();
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
	public FirstTimeRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 979, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(109, 109, 109)));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 961, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(109, 109, 109)));
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(362, 25, 226, 78);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(17, 0, 197, 75);
		panel_1.add(lblNewLabel);
		
		JLabel lblFname = new JLabel("User Name");
		lblFname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFname.setBounds(12, 127, 163, 41);
		panel.add(lblFname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmail.setBounds(12, 181, 163, 41);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(12, 233, 163, 41);
		panel.add(lblPassword);
		
		JLabel lblConformPassword = new JLabel("Conform Password");
		lblConformPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblConformPassword.setBounds(12, 287, 189, 41);
		panel.add(lblConformPassword);
		
		Unametxt = new JTextField();
		Unametxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Unametxt.setBounds(244, 127, 201, 41);
		panel.add(Unametxt);
		Unametxt.setColumns(10);
		
		Emailtxt = new JTextField();
		Emailtxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Emailtxt.setColumns(10);
		Emailtxt.setBounds(244, 181, 201, 41);
		panel.add(Emailtxt);
		
		Passtxt = new JTextField();
		Passtxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Passtxt.setColumns(10);
		Passtxt.setBounds(244, 233, 201, 41);
		panel.add(Passtxt);
		
		ConPasstxt = new JTextField();
		ConPasstxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		ConPasstxt.setColumns(10);
		ConPasstxt.setBounds(244, 287, 201, 41);
		panel.add(ConPasstxt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(519, 127, 370, 201);
		panel.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"User Name", "Email", "Password"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception handling
				try {
				String Fname = Unametxt.getText();
				String Email = Emailtxt.getText();
				String Password = Passtxt.getText();
				String Cpassword = ConPasstxt.getText();
				
				if(Fname.equals("")) 
					JOptionPane.showMessageDialog(null, "User name cannot be empty\nRegistration unsuccessful");
				
				else if(Email.equals("")) 
					JOptionPane.showMessageDialog(null, "Enter your email\nRegistration unsuccessful");
				
				else if(Password.equals("")) 
					JOptionPane.showMessageDialog(null, "Enter your password\nRegistration unsuccessful");
				
				else if(!Cpassword.equals(Password)) 
					JOptionPane.showMessageDialog(null, "Password is not same!!!\nRegistration unsuccessful");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Registration is successful");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
						Unametxt.getText(),
						Emailtxt.getText(),
						Passtxt.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Information Update confirmed", "Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		  } catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
		}
		});
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setBounds(58, 353, 129, 41);
		panel.add(btnSubmit);
		
		JButton ResetBtn = new JButton("Reset");
		ResetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unametxt.setText("");
				Emailtxt.setText("");
				Passtxt.setText("");
				ConPasstxt.setText("");
			}
		});
		
		ResetBtn.setForeground(Color.BLACK);
		ResetBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		ResetBtn.setBounds(368, 353, 129, 41);
		panel.add(ResetBtn);
		
		JButton btnBackToLogin = new JButton("Back to login");
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CustLogin CL = new CustLogin();
				CL.setModalExclusionType(null);
				CL.setVisible(true);
				dispose();
			}
		});
		btnBackToLogin.setForeground(Color.BLACK);
		btnBackToLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackToLogin.setBounds(518, 353, 178, 41);
		panel.add(btnBackToLogin);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//2.2 Exception Handling
				try {
					File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Assignment3\\NewReg.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpload.setBounds(213, 353, 129, 41);
		panel.add(btnUpload);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		FirstTimeRegister.table = table;
	}
}
