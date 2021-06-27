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

public class CustAdvertisement extends JFrame {

	private static JTable table;
	private JPanel contentPane;
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
					CustAdvertisement frame = new CustAdvertisement();
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
	public CustAdvertisement() {
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
		
		JLabel lblTheBestCar = new JLabel("AFFORDABLE CAR RENTAL !!!");
		lblTheBestCar.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 28));
		lblTheBestCar.setBounds(256, 94, 449, 55);
		panel.add(lblTheBestCar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\image\\Advertise1.jpg"));
		lblNewLabel.setBounds(328, 159, 300, 168);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1047, 36);
		panel.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Profile");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Profile");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground CB = new CompanyBackground();
				CB.setModalExclusionType(null);
				CB.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Vehicle Info");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Vehicle Info");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustVehicleType CVT = new CustVehicleType();
				CVT.setModalExclusionType(null);
				CVT.setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnAdvertisement = new JMenu("Advertisement");
		mnAdvertisement.setForeground(Color.BLACK);
		mnAdvertisement.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAdvertisement);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustAdvertisement CA = new CustAdvertisement();
				CA.setModalExclusionType(null);
				CA.setVisible(true);
				dispose();
			}
		});
		mntmAdvertisement.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAdvertisement.add(mntmAdvertisement);
		
		JMenu mnRegistration = new JMenu("Registration");
		mnRegistration.setForeground(Color.BLACK);
		mnRegistration.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnRegistration);
		
		JMenuItem mntmRegistration = new JMenuItem("Registration");
		mntmRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration CR = new CustomerRegistration();
				CR.setModalExclusionType(null);
				CR.setVisible(true);
				dispose();
			}
		});
		mntmRegistration.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnRegistration.add(mntmRegistration);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(946, 36, 101, 59);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldName = new JTextField();
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		JTable t = AdminCompanyBack.getTable();
		String n="";

				for(int i = 0; i<t.getRowCount(); i++) { 
				n= String.valueOf(t.getValueAt(i, 0));}
				textFieldName.setText(n);
		textFieldName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		textFieldName.setBounds(223, 36, 522, 59);
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
		JTable t1 = Advertisement.getTable();
		String discount="";

				for(int i = 0; i<t1.getRowCount(); i++) { 
				discount= String.valueOf(t1.getValueAt(i, 0));}
				textFieldDis.setText(discount);
				
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