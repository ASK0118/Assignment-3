package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	public static JTable table;
	private JTextField textFieldDiscount;
	private JTextField textFieldDis;
	private JTextField textFieldName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(0, 0, 1047, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnConform = new JButton("Confirm");
		btnConform.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//2.2 Exception handling
				try {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldDiscount.getText(),	
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Discount Update confirmed", "Advertisement",
								JOptionPane.OK_OPTION);
					}
				}
				textFieldDis.setText(textFieldDiscount.getText());
				
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		btnConform.setBounds(822, 177, 119, 44);
		panel.add(btnConform);
		
		JLabel lblTheBestCar = new JLabel("AFFORDABLE CAR RENTAL !!!");
		lblTheBestCar.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 28));
		lblTheBestCar.setBounds(256, 109, 449, 55);
		panel.add(lblTheBestCar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\image\\Advertise1.jpg"));
		lblNewLabel.setBounds(328, 159, 300, 168);
		panel.add(lblNewLabel);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDiscount.setBounds(795, 131, 101, 33);
		panel.add(lblDiscount);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldDiscount.setBounds(898, 128, 67, 38);
		panel.add(textFieldDiscount);
		textFieldDiscount.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(925, 199, 10, 14);
		panel.add(scrollPane);
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Discount"
			}
		));
		scrollPane.setViewportView(table);
		
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
		btnExit.setBounds(948, 26, 99, 55);
		panel.add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1047, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProfile);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			public void actionPerformed(ActionEvent e) {
				Finance F = new Finance();
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setForeground(Color.BLACK);
		mntmFinance.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnFinance.add(mntmFinance);
		
		textFieldName = new JTextField();
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		JTable t = AdminCompanyBack.getTable();
		String n="";

				for(int i = 0; i<t.getRowCount(); i++) { 
				n= String.valueOf(t.getValueAt(i, 0));}
				textFieldName.setText(n);
		textFieldName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		textFieldName.setBounds(204, 31, 558, 84);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(0, 387, 1047, 255);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\image\\Almera.PNG"));
		lblNewLabel_2.setBounds(330, 33, 358, 155);
		panel_1.add(lblNewLabel_2);
		
		JButton btnForMoreInformation = new JButton("For more information, please visit: https://www.facebook.com/keretasewamias");
		btnForMoreInformation.addActionListener(new ActionListener() {
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
		btnForMoreInformation.setBackground(new Color(245, 255, 250));
		btnForMoreInformation.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnForMoreInformation.setBounds(0, 230, 1047, 25);
		panel_1.add(btnForMoreInformation);
		
		JLabel lblLowestPriceRm = new JLabel("Lowest Price Car Rental in Malaysia");
		lblLowestPriceRm.setForeground(Color.WHITE);
		lblLowestPriceRm.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		lblLowestPriceRm.setBounds(330, 188, 358, 25);
		panel_1.add(lblLowestPriceRm);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 0));
		panel_2.setBounds(0, 338, 1047, 50);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("% Discount if Rent more than 7 DAYS!!!");
		lblNewLabel_1.setBounds(271, 13, 392, 25);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		
		textFieldDis = new JTextField();
		textFieldDis.setBackground(Color.RED);
		textFieldDis.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		textFieldDis.setBounds(217, 6, 50, 38);
		panel_2.add(textFieldDis);
		textFieldDis.setColumns(10);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		Advertisement.table = table;
	}
}
