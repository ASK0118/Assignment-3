package Assignment3;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class Employee extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable model;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNume;
	private JTextField textFieldSalary;
	private JTextField textFieldNetSalary;
	private JTextField textFieldDay;
	private JTextField textFieldTotSalary;
	private JFrame frame;
	protected double total;
	private static JTable tablesalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					Employee frame = new Employee();
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
	public Employee() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 866);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.light"));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel.setBounds(0, 0, 1282, 819);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) UIManager.getColor("CheckBox.darkShadow")));
		panel_1.setBounds(42, 194, 1182, 292);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(12, 13, 126, 37);
		panel_1.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setBounds(12, 54, 126, 37);
		panel_1.add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge.setBounds(12, 98, 126, 37);
		panel_1.add(lblAge);
		
		JLabel lblPhoneNum = new JLabel("Phone Num");
		lblPhoneNum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhoneNum.setBounds(12, 190, 126, 37);
		panel_1.add(lblPhoneNum);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPosition.setBounds(12, 230, 126, 37);
		panel_1.add(lblPosition);
		
		JLabel lblDay = new JLabel("Day(part-timer only)");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDay.setBounds(447, 64, 212, 37);
		panel_1.add(lblDay);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddress.setBounds(12, 146, 126, 37);
		panel_1.add(lblAddress);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldName.setBounds(195, 13, 189, 37);
		panel_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		JComboBox ComboBoxGender = new JComboBox();
		ComboBoxGender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		ComboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Please select the gender", "Male", "Female"}));
		ComboBoxGender.setBounds(195, 64, 189, 21);
		panel_1.add(ComboBoxGender);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(195, 101, 189, 37);
		panel_1.add(textFieldAge);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(195, 145, 189, 37);
		panel_1.add(textFieldAddress);
		
		textFieldPhoneNume = new JTextField();
		textFieldPhoneNume.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldPhoneNume.setColumns(10);
		textFieldPhoneNume.setBounds(195, 190, 189, 37);
		panel_1.add(textFieldPhoneNume);
		
		JComboBox comboPosition = new JComboBox();
		comboPosition.setModel(new DefaultComboBoxModel(new String[] {"Please select the position", "Clerk", "Supervisor", "Manager"}));
		comboPosition.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		comboPosition.setBounds(195, 240, 189, 27);
		panel_1.add(comboPosition);
		
		JComboBox comboTypeJob = new JComboBox();
		comboTypeJob.setModel(new DefaultComboBoxModel(new String[] {"Please select the type", "Part Time", "Full Time"}));
		comboTypeJob.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		comboTypeJob.setBounds(680, 30, 189, 27);
		panel_1.add(comboTypeJob);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(680, 109, 189, 37);
		panel_1.add(textFieldSalary);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldNetSalary.setColumns(10);
		textFieldNetSalary.setBounds(680, 156, 189, 37);
		panel_1.add(textFieldNetSalary);
		
		textFieldDay = new JTextField();
		textFieldDay.setBounds(680, 64, 189, 37);
		panel_1.add(textFieldDay);
		textFieldDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldDay.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int day = 0;
				double Rsalary=0;
				double NetSalary;
				double epf;
				String selection = (String) comboPosition.getSelectedItem();
				String choose = (String) comboTypeJob.getSelectedItem();
				//2.2 Exception handling
				try {
				if (selection.equals("Clerk")){
					
					if(choose.equals("Part Time")) {
						Payment clerk = new totalSalary(); //2.5 Interface
						Rsalary = clerk.Rentprice(selection, choose, day);//salary for part time clerk
						textFieldSalary.setText(Double.toString(Rsalary));
						day = Integer.parseInt(textFieldDay.getText());
						NetSalary = clerk.getPayment(selection, choose, day);
						textFieldNetSalary.setText(Double.toString(NetSalary));}
					
					else {
					  		Payment clerk = new totalSalary();  //2.5 Interface
							Rsalary = clerk.Rentprice(selection, choose, day);
					  		textFieldSalary.setText(Double.toString(Rsalary));
					  		epf = clerk.discount();
					  		NetSalary = clerk.getPayment(selection, choose, day, epf);
					  		textFieldNetSalary.setText(Double.toString(NetSalary));}
					}
				
				if (selection.equals("Supervisor")){

					if(choose.equals("Part Time")) {
						Payment supervisor = new totalSalary(); //2.5 Interface
						Rsalary = supervisor.Rentprice(selection, choose, day);//salary for part time clerk
						textFieldSalary.setText(Double.toString(Rsalary));
						day = Integer.parseInt(textFieldDay.getText());
						NetSalary = supervisor.getPayment(selection, choose, day);
						textFieldNetSalary.setText(Double.toString(NetSalary));}
					
					  else {
						  	Payment supervisor = new totalSalary();  //2.5 Interface
							Rsalary = supervisor.Rentprice(selection, choose, day);
					  		textFieldSalary.setText(Double.toString(Rsalary));
					  		epf = supervisor.discount();
					  		NetSalary = supervisor.getPayment(selection, choose, day, epf);
					  		textFieldNetSalary.setText(Double.toString(NetSalary));}
				}
				
				if (selection.equals("Manager")){

					if(choose.equals("Part Time")) {
						Payment manager = new totalSalary(); //2.5 Interface
						Rsalary = manager.Rentprice(selection, choose, day);//salary for part time clerk
						textFieldSalary.setText(Double.toString(Rsalary));
						day = Integer.parseInt(textFieldDay.getText());
						NetSalary = manager.getPayment(selection, choose, day);
						textFieldNetSalary.setText(Double.toString(NetSalary));}
					
					  else {
						  	Payment manager = new totalSalary();  //2.5 Interface
							Rsalary = manager.Rentprice(selection, choose, day);
					  		textFieldSalary.setText(Double.toString(Rsalary));
					  		epf = manager.discount();
					  		NetSalary = manager.getPayment(selection, choose, day, epf);
					  		textFieldNetSalary.setText(Double.toString(NetSalary));}
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right info", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		btnConfirm.setBounds(447, 230, 113, 37);
		panel_1.add(btnConfirm);
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNetSalary = new JLabel("Net Salary (RM)");
		lblNetSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNetSalary.setBounds(447, 156, 176, 37);
		panel_1.add(lblNetSalary);
		
		textFieldTotSalary = new JTextField();
		textFieldTotSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldTotSalary.setColumns(10);
		textFieldTotSalary.setBounds(933, 146, 189, 37);
		panel_1.add(textFieldTotSalary);
		
		JButton btnTotalSalary = new JButton("Total Salary (RM)");
		btnTotalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 9));
			        
			        total += Double.parseDouble(s);
			    }
				String result=String.valueOf(total);  
				textFieldTotSalary.setText(result); 
				
				DefaultTableModel model1 = (DefaultTableModel)getTablesalary().getModel();
				model1.addRow(new Object[]{
						textFieldTotSalary.getText(),
				});
			}
		});
		btnTotalSalary.setBounds(917, 98, 225, 37);
		panel_1.add(btnTotalSalary);
		btnTotalSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblTypeOfJob = new JLabel("Type of job");
		lblTypeOfJob.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTypeOfJob.setBounds(447, 25, 126, 37);
		panel_1.add(lblTypeOfJob);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(917, 106, 15, 21);
		panel_1.add(scrollPane_1);
		
		//2.3 File IO
		tablesalary = new JTable();
		tablesalary.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Salary"
			}
		));
		scrollPane_1.setViewportView(tablesalary);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSalary.setBounds(447, 113, 119, 35);
		panel_1.add(lblSalary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 224));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) UIManager.getColor("CheckBox.darkShadow")));
		panel_2.setBounds(218, 81, 787, 100);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Recruitment");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 40));
		lblNewLabel.setBounds(112, 13, 585, 74);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) UIManager.getColor("CheckBox.darkShadow")));
		panel_3.setBackground(new Color(255, 255, 224));
		panel_3.setBounds(42, 499, 1182, 81);
		panel.add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Add Record");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldName.getText(),
						ComboBoxGender.getSelectedItem(),
						textFieldAge.getText(),
						textFieldAddress.getText(),
						textFieldPhoneNume.getText(),
						comboPosition.getSelectedItem(),
						comboTypeJob.getSelectedItem(),
						textFieldDay.getText(),
						textFieldSalary.getText(),
						textFieldNetSalary.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Information Update confirmed", "Employee Recruitment",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(12, 13, 152, 55);
		panel_3.add(btnNewButton_1);
		
		JButton button = new JButton("Update");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(),i,0);
			    	model.setValueAt(ComboBoxGender.getSelectedItem(),i,1);
			    	model.setValueAt(textFieldAge.getText(),i,2);
			    	model.setValueAt(textFieldAddress.getText(),i,3);
			    	model.setValueAt(textFieldPhoneNume.getText(),i,4);
			    	model.setValueAt(comboPosition.getSelectedItem(),i,5);
			    	model.setValueAt(comboTypeJob.getSelectedItem(),i,6);
			    	model.setValueAt(textFieldDay.getText(),i,7);
			    	model.setValueAt(textFieldSalary.getText(),i,8);
			    	model.setValueAt(textFieldNetSalary.getText(),i,9);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(176, 13, 152, 55);
		panel_3.add(button);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldName.setText("");
				ComboBoxGender.setSelectedItem("Please select the gender");
				textFieldAge.setText("");
				textFieldAddress.setText("");
				textFieldPhoneNume.setText("");
				comboPosition.setSelectedItem("Please select the position");
				comboTypeJob.setSelectedItem("Please select the type");
				textFieldDay.setText("");
				textFieldSalary.setText("");
				textFieldNetSalary.setText("");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(340, 13, 99, 55);
		panel_3.add(button_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Recruitment", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Recruitment", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(450, 13, 152, 55);
		panel_3.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBounds(614, 13, 99, 55);
		panel_3.add(btnPrint);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception Handling
				try {
					File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Assignment3\\EmployeeList.txt");
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
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpload.setBounds(725, 13, 152, 55);
		panel_3.add(btnUpload);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) UIManager.getColor("CheckBox.darkShadow")));
		panel_4.setBackground(new Color(240, 255, 255));
		panel_4.setBounds(42, 593, 1182, 206);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 1158, 180);
		panel_4.add(scrollPane);
		
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldName.setText(model.getValueAt(i,0).toString());
					ComboBoxGender.setSelectedItem(model.getValueAt(i,1).toString());
					textFieldAge.setText(model.getValueAt(i,2).toString());
					textFieldAddress.setText(model.getValueAt(i,3).toString());
					textFieldPhoneNume.setText(model.getValueAt(i,4).toString());
					comboPosition.setSelectedItem(model.getValueAt(i,5).toString());
					comboTypeJob.setSelectedItem(model.getValueAt(i,6).toString());  
					textFieldDay.setText(model.getValueAt(i,7).toString());
					JOptionPane.showMessageDialog(null, "Update Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
				
			}
		});
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Gender", "Age", "Address", "Phone Num", "Position", "Type of Job", "Day(Part-timer)", "Rough Salary(RM)", "Net Salary(RM)"
				}
			));
		scrollPane.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1282, 26);
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
		btnExit.setBounds(1171, 27, 99, 55);
		panel.add(btnExit);
	}
	public static void AddRowToJtablesalary(Object[] dataRow) {
		DefaultTableModel model1 = (DefaultTableModel)getTablesalary().getModel();
		model1.addRow(dataRow);
	}

	public static JTable getTablesalary() {
		return tablesalary;
	}

	public static void setTablesalary(JTable tablesalary) {
		Employee.tablesalary = tablesalary;
	}
}

