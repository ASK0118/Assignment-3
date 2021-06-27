package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AdminCompanyBack extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					AdminCompanyBack frame = new AdminCompanyBack();
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
	public AdminCompanyBack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 100, 0));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 128, 128)));
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 1064, 558);
		contentPane.add(panel);
		panel.setLayout(null);;
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 128, 128)));
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBounds(12, 146, 1040, 308);
		panel.add(panel_2);
		
		JLabel lblAddress = new JLabel("Company Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddress.setBounds(12, 75, 255, 49);
		panel_2.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Company Phone Number");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhone.setBounds(12, 131, 255, 49);
		panel_2.add(lblPhone);
		
		JLabel lblCompanyWebsite = new JLabel("Company Website");
		lblCompanyWebsite.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompanyWebsite.setBounds(12, 182, 255, 49);
		panel_2.add(lblCompanyWebsite);
		
		JButton btnNewButton = new JButton("https://www.facebook.com/keretasewamias");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				//2.2 Exception Handling
				try {
					browser.browse(new URI("https://www.facebook.com/keretasewamias"));
				}
				
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(293, 194, 497, 25);
		panel_2.add(btnNewButton);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(12, 236, 130, 59);
		panel_2.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception handling
				try {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldName.getText(),	
						textFieldAddress.getText(),
						textFieldPhone.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Discount Update confirmed", "Advertisement",
								JOptionPane.OK_OPTION);
					}
				}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompanyName.setBounds(12, 13, 255, 49);
		panel_2.add(lblCompanyName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldName.setBounds(293, 18, 349, 40);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(293, 80, 349, 40);
		panel_2.add(textFieldAddress);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(293, 136, 349, 40);
		panel_2.add(textFieldPhone);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 467, 1030, 78);
		panel.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "Phone"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 128, 128)));
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(199, 56, 629, 72);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Company Background");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(62, 13, 457, 46);
		panel_1.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1064, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProfile);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminCompanyBack ACB = new AdminCompanyBack();
				ACB.setModalExclusionType(null);
				ACB.setVisible(true);
				dispose();
			}
		});
		mntmProfile.setForeground(Color.BLACK);
		mntmProfile.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnProfile.add(mntmProfile);
		
		JMenu mnAdvertise = new JMenu("Advertisement");
		mnAdvertise.setForeground(Color.BLACK);
		mnAdvertise.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAdvertise);
		
		JMenuItem mntmAdvertise = new JMenuItem("Advertisement");
		mntmAdvertise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement A = new Advertisement();
				A.setModalExclusionType(null);
				A.setVisible(true);
				dispose();
			}
		});
		mntmAdvertise.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAdvertise.add(mntmAdvertise);
		
		JMenu mnVehicle = new JMenu("Vehicle Info");
		mnVehicle.setForeground(Color.BLACK);
		mnVehicle.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnVehicle);
		
		JMenuItem mntmVehicle = new JMenuItem("Vehicle Info");
		mntmVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminVehicleInfo AVI = new AdminVehicleInfo();
				AVI.setModalExclusionType(null);
				AVI.setVisible(true);
				dispose();
			}
		});
		mntmVehicle.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnVehicle.add(mntmVehicle);
		
		JMenu mnEmployee = new JMenu("Employee");
		mnEmployee.setForeground(Color.BLACK);
		mnEmployee.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnEmployee);
		
		JMenuItem mntnEmployee = new JMenuItem("Employee");
		mntnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee E = new Employee();
				E.setModalExclusionType(null);
				E.setVisible(true);
				dispose();
			}
		});
		mntnEmployee.setForeground(Color.BLACK);
		mntnEmployee.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnEmployee.add(mntnEmployee);
		
		JMenu mnFinance = new JMenu("Finance");
		mnFinance.setForeground(Color.BLACK);
		mnFinance.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnFinance);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Finance F = new Finance();
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setForeground(Color.BLACK);
		mntmFinance.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnFinance.add(mntmFinance);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(953, 27, 99, 55);
		panel.add(btnExit);
	}
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		AdminCompanyBack.table = table;
	}
}