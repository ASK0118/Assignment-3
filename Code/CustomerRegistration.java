package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomerRegistration extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTable model;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNume;
	private JTextField textFieldPrice;
	private JTextField textFieldAmount;
	private JTextField textFieldDay;
	private JTextField textFieldTotAmount;
	private JFrame frame;
	protected double total;
	private static JTable tablesales;
	private JTextField textFieldPlate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 866);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel.setBounds(0, 0, 1282, 819);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_1.setBounds(44, 126, 1182, 292);
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
		
		JLabel lblTypeOfCar = new JLabel("Type of car");
		lblTypeOfCar.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTypeOfCar.setBounds(12, 230, 126, 37);
		panel_1.add(lblTypeOfCar);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblModel.setBounds(465, 13, 126, 37);
		panel_1.add(lblModel);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDay.setBounds(465, 98, 126, 37);
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
		ComboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		ComboBoxGender.setBounds(195, 54, 189, 31);
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
		
		JComboBox comboBoxModel = new JComboBox();
		comboBoxModel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		comboBoxModel.setBounds(648, 19, 189, 27);
		panel_1.add(comboBoxModel);
		
		JComboBox comboBoxTypecar = new JComboBox();
		comboBoxTypecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxTypecar.getSelectedItem().equals("Sedan")) {
					comboBoxModel.removeAllItems();
					comboBoxModel.setSelectedItem(null);
					comboBoxModel.addItem("Toyota, Vios");
					comboBoxModel.addItem("Honda, Civic");
					comboBoxModel.addItem("Nissan, Almera");
				}
				
				else 
					if(comboBoxTypecar.getSelectedItem().equals("SUV")) {
						comboBoxModel.removeAllItems();
						comboBoxModel.setSelectedItem(null);
						comboBoxModel.addItem("Toyota, Harrier");
						comboBoxModel.addItem("Honda, CR-V");
						comboBoxModel.addItem("Nissan, Rogue");
				}
				
					else 
						if(comboBoxTypecar.getSelectedItem().equals("MPV")) {
							comboBoxModel.removeAllItems();
							comboBoxModel.setSelectedItem(null);
							comboBoxModel.addItem("Toyota, Vellfire");
							comboBoxModel.addItem("Honda, Odssey");
							comboBoxModel.addItem("Nissan, Serena");
					}
			}
		});
		comboBoxTypecar.setModel(new DefaultComboBoxModel(new String[] {"Sedan", "SUV", "MPV"}));
		comboBoxTypecar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		comboBoxTypecar.setBounds(195, 240, 189, 27);
		panel_1.add(comboBoxTypecar);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(648, 190, 189, 37);
		panel_1.add(textFieldPrice);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAmount.setColumns(10);
		textFieldAmount.setBounds(648, 237, 189, 37);
		panel_1.add(textFieldAmount);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 20));
		dateChooser.setBounds(648, 59, 189, 37);
		panel_1.add(dateChooser);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(465, 59, 126, 37);
		panel_1.add(lblDate);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textFieldDay = new JTextField();
		textFieldDay.setBounds(648, 103, 189, 37);
		panel_1.add(textFieldDay);
		textFieldDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldDay.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int day = 0;
				double price=0;
				double amount;
				double discount;
				String selection = (String)comboBoxTypecar.getSelectedItem();
				String choose = (String)comboBoxModel.getSelectedItem();
				
				day = Integer.parseInt(textFieldDay.getText());
				//2.2 Exception handling
				try {
				if (selection.equals("Sedan")) {
					
					if (choose.equals("Toyota, Vios")){
						  
						  if (day<=7) {
							  Payment vios = new totalRentPrice();
							  price = vios.Rentprice(selection, choose, day);
							  textFieldPrice.setText(Double.toString(price));
							  amount = vios.getPayment(selection, choose, day);
							  textFieldAmount.setText(Double.toString(amount));}
						  
						  else {
							    Payment vios = new totalRentPrice();
							    discount = vios.discount();
							    price = vios.Rentprice(selection, choose, day);
							    textFieldPrice.setText(Double.toString(price));
								amount = vios.getPayment(selection, choose, day, discount);
							    textFieldAmount.setText(Double.toString(amount));}
					}
					
							if (choose.equals("Honda, Civic")){
								  
								  if (day<=7) {
									  Payment Civic = new totalRentPrice();
									  price = Civic.Rentprice(selection, choose, day);
									  textFieldPrice.setText(Double.toString(price));
									  amount = Civic.getPayment(selection, choose, day);
									  textFieldAmount.setText(Double.toString(amount));}
								  
								  else {
									    Payment Civic = new totalRentPrice();
									    discount = Civic.discount();
									    price = Civic.Rentprice(selection, choose, day);
									    textFieldPrice.setText(Double.toString(price));
										amount = Civic.getPayment(selection, choose, day, discount);
									    textFieldAmount.setText(Double.toString(amount));}
							}
					
									if (choose.equals("Nissan, Almera")){
										  
										  if (day<=7) {
											  Payment Almera = new totalRentPrice();
											  price = Almera.Rentprice(selection, choose, day);
											  textFieldPrice.setText(Double.toString(price));
											  amount = Almera.getPayment(selection, choose, day);
											  textFieldAmount.setText(Double.toString(amount));}
										  
										  else {
											    Payment Almera = new totalRentPrice();
											    discount = Almera.discount();
											    price = Almera.Rentprice(selection, choose, day);
											    textFieldPrice.setText(Double.toString(price));
												amount = Almera.getPayment(selection, choose, day, discount);
											    textFieldAmount.setText(Double.toString(amount));}
									}
				}//end of sedan
									
									if (selection.equals("SUV")) {
										
										if (choose.equals("Toyota, Harrier")){
											  
											  if (day<=7) {
												  Payment Harrier = new totalRentPrice();
												  price = Harrier.Rentprice(selection, choose, day);
												  textFieldPrice.setText(Double.toString(price));
												  amount = Harrier.getPayment(selection, choose, day);
												  textFieldAmount.setText(Double.toString(amount));}
											  
											  else {
												    Payment Harrier = new totalRentPrice();
												    discount = Harrier.discount();
												    price = Harrier.Rentprice(selection, choose, day);
												    textFieldPrice.setText(Double.toString(price));
													amount = Harrier.getPayment(selection, choose, day, discount);
												    textFieldAmount.setText(Double.toString(amount));}
										}
										
												if (choose.equals("Honda, CR-V")){
													  
													  if (day<=7) {
														  Payment CRV = new totalRentPrice();
														  price = CRV.Rentprice(selection, choose, day);
														  textFieldPrice.setText(Double.toString(price));
														  amount = CRV.getPayment(selection, choose, day);
														  textFieldAmount.setText(Double.toString(amount));}
													  
													  else {
														    Payment CRV = new totalRentPrice();
														    discount = CRV.discount();
														    price = CRV.Rentprice(selection, choose, day);
														    textFieldPrice.setText(Double.toString(price));
															amount = CRV.getPayment(selection, choose, day, discount);
														    textFieldAmount.setText(Double.toString(amount));}
												}
										
														if (choose.equals("Nissan, Rogue")){
															  
															  if (day<=7) {
																  Payment Rogue = new totalRentPrice();
																  price = Rogue.Rentprice(selection, choose, day);
																  textFieldPrice.setText(Double.toString(price));
																  amount = Rogue.getPayment(selection, choose, day);
																  textFieldAmount.setText(Double.toString(amount));}
															  
															  else {
																    Payment Rogue = new totalRentPrice();
																    discount = Rogue.discount();
																    price = Rogue.Rentprice(selection, choose, day);
																    textFieldPrice.setText(Double.toString(price));
																	amount = Rogue.getPayment(selection, choose, day, discount);
																    textFieldAmount.setText(Double.toString(amount));}
														}

									}//end of suv
									
												if (selection.equals("MPV")) {
													
													if (choose.equals("Toyota, Vellfire")){
														  
														  if (day<=7) {
															  Payment Vellfire = new totalRentPrice();
															  price = Vellfire.Rentprice(selection, choose, day);
															  textFieldPrice.setText(Double.toString(price));
															  amount = Vellfire.getPayment(selection, choose, day);
															  textFieldAmount.setText(Double.toString(amount));}
														  
														  else {
															    Payment Vellfire = new totalRentPrice();
															    discount = Vellfire.discount();
															    price = Vellfire.Rentprice(selection, choose, day);
															    textFieldPrice.setText(Double.toString(price));
																amount = Vellfire.getPayment(selection, choose, day, discount);
															    textFieldAmount.setText(Double.toString(amount));}
													}
													
															if (choose.equals("Honda, Odssey")){
																  
																  if (day<=7) {
																	  Payment Odssey = new totalRentPrice();
																	  price = Odssey.Rentprice(selection, choose, day);
																	  textFieldPrice.setText(Double.toString(price));
																	  amount = Odssey.getPayment(selection, choose, day);
																	  textFieldAmount.setText(Double.toString(amount));}
																  
																  else {
																	    Payment Odssey = new totalRentPrice();
																	    discount = Odssey.discount();
																	    price = Odssey.Rentprice(selection, choose, day);
																	    textFieldPrice.setText(Double.toString(price));
																		amount = Odssey.getPayment(selection, choose, day, discount);
																	    textFieldAmount.setText(Double.toString(amount));}
															}
													
																	if (choose.equals("Nissan, Serena")){
																		  
																		  if (day<=7) {
																			  Payment Serena = new totalRentPrice();
																			  price = Serena.Rentprice(selection, choose, day);
																			  textFieldPrice.setText(Double.toString(price));
																			  amount = Serena.getPayment(selection, choose, day);
																			  textFieldAmount.setText(Double.toString(amount));}
																		  
																		  else {
																			    Payment Serena = new totalRentPrice();
																			    discount = Serena.discount();
																			    price = Serena.Rentprice(selection, choose, day);
																			    textFieldPrice.setText(Double.toString(price));
																				amount = Serena.getPayment(selection, choose, day, discount);
																			    textFieldAmount.setText(Double.toString(amount));}
																	}
			
												}//end of mpv
												JTable t = AdminVehicleInfo.getTable();
												String plate="";
												for(int i = 0; i<t.getRowCount(); i++) { 
													if (selection.equals(t.getValueAt(i, 0))&&choose.equals(t.getValueAt(i, 1))) {
													plate= String.valueOf(t.getValueAt(i, 2));}
													}
												textFieldPlate.setText(plate);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		btnNewButton.setBounds(857, 242, 189, 37);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblAmountrm = new JLabel("Amount (RM)");
		lblAmountrm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAmountrm.setBounds(465, 242, 158, 37);
		panel_1.add(lblAmountrm);
		
		textFieldTotAmount = new JTextField();
		textFieldTotAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldTotAmount.setColumns(10);
		textFieldTotAmount.setBounds(933, 146, 189, 37);
		panel_1.add(textFieldTotAmount);
		
		JButton btnTotalAmountrm = new JButton("Total Amount (RM)");
		btnTotalAmountrm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 11)); 
			        total += Double.parseDouble(s);
			    } 
			    String result=String.valueOf(total);  
				textFieldTotAmount.setText(result); 
				
				DefaultTableModel model1 = (DefaultTableModel)getTablesales().getModel();
				model1.addRow(new Object[]{
						textFieldTotAmount.getText(),
				});
			}
		});
		
		btnTotalAmountrm.setBounds(895, 98, 261, 37);
		panel_1.add(btnTotalAmountrm);
		btnTotalAmountrm.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(895, 103, 17, 15);
		panel_1.add(scrollPane_1);
		
		//2.3 File IO
		tablesales = new JTable();
		tablesales.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Sales"
			}
		));
		scrollPane_1.setViewportView(tablesales);
		
		JLabel lblPlate = new JLabel("Plate");
		lblPlate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPlate.setBounds(465, 146, 126, 37);
		panel_1.add(lblPlate);
		
		textFieldPlate = new JTextField();
		textFieldPlate.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldPlate.setColumns(10);
		textFieldPlate.setBounds(648, 146, 189, 37);
		panel_1.add(textFieldPlate);
		
		JLabel lblPricedayrm = new JLabel("Price/day (RM)");
		lblPricedayrm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPricedayrm.setBounds(465, 196, 171, 37);
		panel_1.add(lblPricedayrm);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 255, 255));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_2.setBounds(223, 37, 787, 81);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Registration");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 40));
		lblNewLabel.setBounds(112, 13, 585, 74);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_3.setBackground(new Color(240, 255, 255));
		panel_3.setBounds(44, 431, 1182, 81);
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
						comboBoxTypecar.getSelectedItem(),
						comboBoxModel.getSelectedItem(),
						dateChooser.getDate(),
						textFieldDay.getText(),
						textFieldPlate.getText(),
						textFieldPrice.getText(),
						textFieldAmount.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Customer Information Update confirmed", "Customer Registration",
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
			    	model.setValueAt(comboBoxTypecar.getSelectedItem(),i,5);
			    	model.setValueAt(comboBoxModel.getSelectedItem(),i,6);
			    	model.setValueAt(dateChooser.getDate(),i,7);
			    	model.setValueAt(textFieldDay.getText(),i,8);
			    	model.setValueAt(textFieldPlate.getText(), i,9);
			    	model.setValueAt(textFieldPrice.getText(),i,10);
			    	model.setValueAt(textFieldAmount.getText(),i,11);
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
				ComboBoxGender.setSelectedItem("Male");
				textFieldAge.setText("");
				textFieldAddress.setText("");
				textFieldPhoneNume.setText("");
				comboBoxTypecar.setSelectedItem("Sedan");
				comboBoxModel.setSelectedItem("");
				dateChooser.setDate(null);
				textFieldDay.setText("");
				textFieldPlate.setText("");
				textFieldPrice.setText("");
				textFieldAmount.setText("");
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
								"Customer Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
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
					File file = new File("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\src\\Assignment3\\CustomerList.txt");
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
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_4.setBackground(new Color(240, 255, 255));
		panel_4.setBounds(44, 525, 1182, 281);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 1158, 255);
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
					comboBoxTypecar.setSelectedItem(model.getValueAt(i,5).toString());
					comboBoxModel.setSelectedItem(model.getValueAt(i,6).toString());  
					dateChooser.setDateFormatString(model.getValueAt(i,7).toString());
					textFieldDay.setText(model.getValueAt(i,8).toString());
					textFieldPlate.setText(model.getValueAt(i,9).toString());
					textFieldPrice.setText(model.getValueAt(i,10).toString());
					textFieldAmount.setText(model.getValueAt(i,11).toString());
					
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
					"Name", "Gender", "Age", "Address", "Phone Num", "Type", "Model", "Date", "Day", "Plate", "Price/day(RM)", "Amount(RM)"
				}
			));
		scrollPane.setViewportView(table);
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit_1.setBounds(1169, 36, 101, 59);
		panel.add(btnExit_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1282, 36);
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
	}
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		CustomerRegistration.table = table;
	}
	
	public static void AddRowToJtablesales(Object[] dataRow) {
		DefaultTableModel model1 = (DefaultTableModel)getTablesales().getModel();
		model1.addRow(dataRow);
	}

	public static JTable getTablesales() {
		return tablesales;
	}

	public static void setTable_1(JTable tablesales) {
		CustomerRegistration.tablesales = tablesales;
	}
}
