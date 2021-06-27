package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AdminVehicleInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPlate;
	private JTextField textFieldPrice;
	public static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					AdminVehicleInfo frame = new AdminVehicleInfo();
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
	public AdminVehicleInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 751, 670);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(144, 35, 444, 74);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Vehicle Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(140, 13, 226, 48);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(12, 122, 372, 197);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblTypeOfCar = new JLabel("Type of car");
		lblTypeOfCar.setBounds(12, 18, 106, 37);
		lblTypeOfCar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1_1.add(lblTypeOfCar);
		
		JLabel lblBrandOfCar = new JLabel("Brand and model");
		lblBrandOfCar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBrandOfCar.setBounds(12, 60, 157, 37);
		panel_1_1.add(lblBrandOfCar);
		
		JLabel lblPriceday = new JLabel("Price/Day(RM)");
		lblPriceday.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPriceday.setBounds(12, 144, 143, 37);
		panel_1_1.add(lblPriceday);
		
		JLabel lblPlate = new JLabel("Plate Number");
		lblPlate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPlate.setBounds(12, 105, 128, 31);
		panel_1_1.add(lblPlate);
		
		textFieldPlate = new JTextField();
		textFieldPlate.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldPlate.setColumns(10);
		textFieldPlate.setBounds(175, 105, 155, 31);
		panel_1_1.add(textFieldPlate);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(175, 144, 155, 31);
		panel_1_1.add(textFieldPrice);
		
		JComboBox comboBoxType = new JComboBox();
		
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Select the type", "Sedan", "SUV", "MPV"}));
		comboBoxType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxType.setBounds(173, 22, 157, 28);
		panel_1_1.add(comboBoxType);
		
		JComboBox comboBoxBrandModel = new JComboBox();
		
		comboBoxType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxType.getSelectedItem().equals("Sedan")) {
					comboBoxBrandModel.removeAllItems();
					comboBoxBrandModel.setSelectedItem(null);
					comboBoxBrandModel.addItem("Toyota, Vios");
					comboBoxBrandModel.addItem("Honda, Civic");
					comboBoxBrandModel.addItem("Nissan, Almera");
				}
				
				else 
					if(comboBoxType.getSelectedItem().equals("SUV")) {
						comboBoxBrandModel.removeAllItems();
						comboBoxBrandModel.setSelectedItem(null);
						comboBoxBrandModel.addItem("Toyota, Harrier");
						comboBoxBrandModel.addItem("Honda, CR-V");
						comboBoxBrandModel.addItem("Nissan, Rogue");
				}
				
					else 
						if(comboBoxType.getSelectedItem().equals("MPV")) {
							comboBoxBrandModel.removeAllItems();
							comboBoxBrandModel.setSelectedItem(null);
							comboBoxBrandModel.addItem("Toyota, Vellfire");
							comboBoxBrandModel.addItem("Honda, Odssey");
							comboBoxBrandModel.addItem("Nissan, Serena");
						}
					
				}
			
		});
		
		comboBoxBrandModel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxBrandModel.setBounds(173, 64, 157, 28);
		panel_1_1.add(comboBoxBrandModel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 362, 727, 282);
		panel.add(scrollPane);
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Type of Car", "Brand and Model", "Plate", "Price(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Type = (String) comboBoxType.getSelectedItem();
				String Model = (String) comboBoxBrandModel.getSelectedItem();
				String Plate = textFieldPlate.getText();
				String Price = textFieldPrice.getText();
				//2.2 Exception handling
				try {
				if(Plate.equals("")) 
					JOptionPane.showMessageDialog(null, "Plate number cannot be empty\nConfirm unsuccessful");
				
				else if(Price.equals(""))
					JOptionPane.showMessageDialog(null, "Price cannot be empty\nConfirm unsuccessful");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Confirm successful");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
						Type,
						Model,
						Plate,
						Price
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update confirmed", "Vehicle Info",
								JOptionPane.OK_OPTION);
					}
				}
			}
		  } catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter info correctly", "Error", JOptionPane.ERROR_MESSAGE);
				}
		}
		
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnConfirm.setBounds(396, 151, 137, 46);
		panel.add(btnConfirm);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Vehicle Info", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Vehicle Info", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnDelete.setBounds(553, 151, 137, 46);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(comboBoxType.getSelectedItem(),i,0);
			    	model.setValueAt(comboBoxBrandModel.getSelectedItem(),i,1);
			    	model.setValueAt(textFieldPlate.getText(),i,3);
			    	model.setValueAt(textFieldPrice.getText(),i,4);

					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnUpdate.setBounds(396, 210, 137, 46);
		panel.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxType.setSelectedItem("Select the type");
				//textFieldBrandCar.setText("");
				comboBoxBrandModel.setSelectedItem(null);
				textFieldPlate.setText("");
				textFieldPrice.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnReset.setBounds(553, 210, 137, 46);
		panel.add(btnReset);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Assignment3\\VehicleInfo.txt");
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
		btnUpload.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnUpload.setBounds(396, 273, 137, 46);
		panel.add(btnUpload);
		
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
		btnExit.setBounds(640, 32, 99, 55);
		panel.add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 751, 26);
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
	}
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		AdminVehicleInfo.table = table;
	}
}
