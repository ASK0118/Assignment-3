package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CustVehicleType extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPlate;
	private JTextField textFieldprice;
	public JComboBox<String> comboBoxBrand;
	public JComboBox<String> comboBoxModel;
	private String brand;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					CustVehicleType frame = new CustVehicleType();
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
	public CustVehicleType() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 1049, 667);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(937, 36, 101, 59);
		panel.add(btnExit);

		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel_1.setBackground((new Color(1.0f,1.0f,1.0f,0.5f)));
		panel_1.setBounds(126, 36, 799, 113);
		panel.add(panel_1);
		
		JLabel lbTypeVLabel = new JLabel("Information of Vehicle");
		lbTypeVLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lbTypeVLabel.setBounds(156, 13, 491, 87);
		panel_1.add(lbTypeVLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel_3.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		panel_3.setBounds(211, 197, 571, 288);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblType_1 = new JLabel("Type");
		lblType_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblType_1.setBounds(12, 23, 144, 42);
		panel_3.add(lblType_1);
		
		JLabel lblBrand = new JLabel("Brand and Model");
		lblBrand.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblBrand.setBounds(12, 93, 266, 42);
		panel_3.add(lblBrand);
		
		JLabel lblPlateNumber = new JLabel("Plate Number");
		lblPlateNumber.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPlateNumber.setBounds(12, 149, 207, 42);
		panel_3.add(lblPlateNumber);
		
		JLabel lblPricedayrm = new JLabel("Price/day(RM)");
		lblPricedayrm.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPricedayrm.setBounds(12, 208, 224, 42);
		panel_3.add(lblPricedayrm);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Please select the type", "Sedan", "SUV", "MPV"}));
		comboBoxType.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JTable t = AdminVehicleInfo.getTable();
				//comboBoxBrand.removeAllItems();
				//comboBoxBrand.setSelectedItem(null);
				if(comboBoxType.getSelectedItem().equals("Sedan")) {
					//comboBoxBrand.removeAllItems();
					//comboBoxBrand.setSelectedItem(null);
					comboBoxBrand.addItem("Toyota, Vios");
					comboBoxBrand.addItem("Honda, Civic");
					comboBoxBrand.addItem("Nissan, Almera");
					
					comboBoxBrand.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String plate,price;
								for(int i=0; i<t.getRowCount(); i++) {
									if(comboBoxBrand.getSelectedItem().equals(t.getValueAt(i, 1))) {
										plate = String.valueOf(t.getValueAt(i, 2));
										price = String.valueOf(t.getValueAt(i, 3));
										textFieldPlate.setText(plate);
										textFieldprice.setText(price);
									}
								}
						}
					});
				}
				
						else 
							if(comboBoxType.getSelectedItem().equals("SUV")) {
								//comboBoxBrand.removeAllItems();
								//comboBoxBrand.setSelectedItem(null);
								comboBoxBrand.addItem("Toyota, Harrier");
								comboBoxBrand.addItem("Honda, CR-V");
								comboBoxBrand.addItem("Nissan, Rogue");
								
								comboBoxBrand.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String plate,price;
										//comboBoxModel.removeAllItems();
											for(int i=0; i<t.getRowCount(); i++) {
												if(comboBoxBrand.getSelectedItem().equals(t.getValueAt(i, 1))) {
													plate = String.valueOf(t.getValueAt(i, 2));
													price = String.valueOf(t.getValueAt(i, 3));
													textFieldPlate.setText(plate);
													textFieldprice.setText(price);
												} 
											}
									}
								});
						}
				
								else 
									/*if(comboBoxType.getSelectedItem().equals("MPV"))*/ {
										//comboBoxBrand.removeAllItems();
										//comboBoxBrand.setSelectedItem(null);
										comboBoxBrand.addItem("Toyota, Vellfire");
										comboBoxBrand.addItem("Honda, Odssey");
										comboBoxBrand.addItem("Nissan, Serena");
										
										comboBoxBrand.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												//JTable t = VehicleInfo.getTable();
												String plate,price;
													for(int i=0; i<t.getRowCount(); i++) {
														if(comboBoxBrand.getSelectedItem().equals(t.getValueAt(i, 1))) {
															plate = String.valueOf(t.getValueAt(i, 2));
															price = String.valueOf(t.getValueAt(i, 3));
															textFieldPlate.setText(plate);
															textFieldprice.setText(price);
														}
													}
											}
										});
									}
			}
			
		});
		comboBoxType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxType.setBounds(279, 30, 280, 48);
		panel_3.add(comboBoxType);
		
		comboBoxBrand = new JComboBox();
		comboBoxBrand.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBoxBrand.setBounds(279, 99, 280, 36);
		panel_3.add(comboBoxBrand);
		
		textFieldPlate = new JTextField();
		textFieldPlate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldPlate.setBounds(280, 151, 279, 40);
		panel_3.add(textFieldPlate);
		textFieldPlate.setColumns(10);
		
		textFieldprice = new JTextField();
		textFieldprice.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldprice.setColumns(10);
		textFieldprice.setBounds(279, 210, 280, 40);
		panel_3.add(textFieldprice);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\image\\BG.jpg"));
		lblNewLabel_1.setBounds(-1, 36, 1050, 631);
		panel.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(-4, 0, 1053, 36);
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
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Vehicle Info");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustVehicleType CVT = new CustVehicleType();
				CVT.setModalExclusionType(null);
				CVT.setVisible(true);
				dispose();
			}
		});
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
	}
}
