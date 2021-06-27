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
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUF;
	private JTextField textFieldMF;
	private JTextField textFieldAF;
	private JTextField textFieldGE;
	private JTextField textFieldTotalEx;
	public JTextField textFieldSalary;
	public JTextField textFieldSales;
	private JTextField textFieldTE;
	private JTextField textFieldSalesss;
	private JTextField textFieldES;
	private JTextField textFieldNProfit;
	private static String result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					Finance frame = new Finance();
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
	public Finance() {//}
	//public Finance(String s) {
		//this.result = s;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.GRAY));
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 991, 658);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.GRAY));
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(27, 124, 372, 266);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Expenses");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 13, 104, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblUF = new JLabel("Utility fee (RM)");
		lblUF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUF.setBounds(12, 44, 130, 33);
		panel_1.add(lblUF);
		
		JLabel lblMaintenanceFeerm = new JLabel("Maintenance fee (RM)");
		lblMaintenanceFeerm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaintenanceFeerm.setBounds(12, 79, 173, 33);
		panel_1.add(lblMaintenanceFeerm);
		
		JLabel lblAdvertisementFeerm = new JLabel("Advertisement fee (RM)");
		lblAdvertisementFeerm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdvertisementFeerm.setBounds(12, 113, 187, 33);
		panel_1.add(lblAdvertisementFeerm);
		
		JLabel lblGeneraltFeerm = new JLabel("General expenses (RM)");
		lblGeneraltFeerm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGeneraltFeerm.setBounds(12, 147, 187, 33);
		panel_1.add(lblGeneraltFeerm);
		
		JButton btnNewButton = new JButton("Total Expenses (RM)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double uf,mf,af,ge, totalE;
				//2.2 Exception Handling
				try {
					    uf = Double.parseDouble(textFieldUF.getText());
					    mf = Double.parseDouble(textFieldMF.getText());
					    af = Double.parseDouble(textFieldAF.getText());
					    ge = Double.parseDouble(textFieldGE.getText());
					  
					    totalE = uf+mf+af+ge;
					    textFieldTotalEx.setText(Double.toString(totalE));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the number correctly");
				}
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(70, 178, 232, 41);
		panel_1.add(btnNewButton);
		
		textFieldUF = new JTextField();
		textFieldUF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldUF.setBounds(218, 51, 124, 22);
		panel_1.add(textFieldUF);
		textFieldUF.setColumns(10);
		
		textFieldMF = new JTextField();
		textFieldMF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMF.setColumns(10);
		textFieldMF.setBounds(218, 86, 124, 22);
		panel_1.add(textFieldMF);
		
		textFieldAF = new JTextField();
		textFieldAF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldAF.setColumns(10);
		textFieldAF.setBounds(218, 120, 124, 22);
		panel_1.add(textFieldAF);
		
		textFieldGE = new JTextField();
		textFieldGE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldGE.setColumns(10);
		textFieldGE.setBounds(218, 154, 124, 22);
		panel_1.add(textFieldGE);
		
		textFieldTotalEx = new JTextField();
		textFieldTotalEx.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldTotalEx.setBounds(78, 224, 217, 33);
		panel_1.add(textFieldTotalEx);
		textFieldTotalEx.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Financial Report");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(324, 31, 300, 80);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.GRAY));
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(27, 392, 372, 95);
		panel.add(panel_2);
		
		JLabel lblEmployeeSalary = new JLabel("Employee Salary (RM)");
		lblEmployeeSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmployeeSalary.setBounds(12, 13, 231, 33);
		panel_2.add(lblEmployeeSalary);
		
		textFieldSalary = new JTextField();
		JTable t = Employee.getTablesalary();
		String salary="";
				for(int i = 0; i<t.getRowCount(); i++) { 
				salary= String.valueOf(t.getValueAt(i, 0));}
				textFieldSalary.setText(salary);
		textFieldSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(12, 46, 124, 33);
		panel_2.add(textFieldSalary);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.GRAY));
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(27, 490, 372, 95);
		panel.add(panel_3);
		
		JLabel lblSalesrm = new JLabel("Sales (RM)");
		lblSalesrm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSalesrm.setBounds(12, 13, 124, 33);
		panel_3.add(lblSalesrm);
		
		textFieldSales = new JTextField();
		JTable t1 = CustomerRegistration.getTablesales();
		String sales="";
				for(int i = 0; i<t.getRowCount(); i++) { 
				sales= String.valueOf(t1.getValueAt(i, 0));}
				textFieldSales.setText(sales);
		textFieldSales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldSales.setColumns(10);
		textFieldSales.setBounds(12, 46, 124, 33);
		panel_3.add(textFieldSales);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.GRAY));
		panel_4.setBackground(SystemColor.activeCaption);
		panel_4.setBounds(517, 124, 395, 285);
		panel.add(panel_4);
		
		JLabel lblF = new JLabel("Financial Statement");
		lblF.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblF.setBounds(12, 13, 283, 33);
		panel_4.add(lblF);
		
		textFieldTE = new JTextField();
		textFieldTE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTE.setColumns(10);
		textFieldTE.setBounds(259, 102, 124, 33);
		panel_4.add(textFieldTE);
		
		JLabel lblTotalExpensesrm = new JLabel("Total Expenses (RM)");
		lblTotalExpensesrm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalExpensesrm.setBounds(12, 102, 214, 33);
		panel_4.add(lblTotalExpensesrm);
		
		JLabel lblSalesrm_1 = new JLabel("Total Sales (RM)");
		lblSalesrm_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSalesrm_1.setBounds(12, 59, 214, 33);
		panel_4.add(lblSalesrm_1);
		
		textFieldSalesss = new JTextField();
		textFieldSalesss.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldSalesss.setColumns(10);
		textFieldSalesss.setBounds(259, 59, 124, 33);
		panel_4.add(textFieldSalesss);
		
		JLabel lblEmployeeSalaryrm = new JLabel("Employee Salary (RM)");
		lblEmployeeSalaryrm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmployeeSalaryrm.setBounds(12, 148, 225, 33);
		panel_4.add(lblEmployeeSalaryrm);
		
		textFieldES = new JTextField();
		textFieldES.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldES.setColumns(10);
		textFieldES.setBounds(259, 148, 124, 33);
		panel_4.add(textFieldES);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(12, 191, 371, 10);
		panel_4.add(panel_5);
		
		JLabel lblNetProfitrm = new JLabel("Net Profit (RM)");
		lblNetProfitrm.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNetProfitrm.setBounds(12, 222, 165, 33);
		panel_4.add(lblNetProfitrm);
		
		textFieldNProfit = new JTextField();
		textFieldNProfit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNProfit.setColumns(10);
		textFieldNProfit.setBounds(259, 222, 124, 33);
		panel_4.add(textFieldNProfit);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.GRAY));
		panel_6.setBackground(SystemColor.activeCaption);
		panel_6.setBounds(517, 422, 395, 80);
		panel.add(panel_6);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(57, 13, 139, 55);
		panel_6.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//2.2 Exception handling
				try {
				textFieldSalesss.setText(textFieldSales.getText());
				textFieldTE.setText(textFieldTotalEx.getText());
				textFieldES.setText(textFieldSalary.getText());
				
				double Sales = Double.parseDouble(textFieldSalesss.getText());
				double Exp = Double.parseDouble(textFieldTE.getText());
				double salary = Double.parseDouble(textFieldES.getText());
				
				double netprofit = Sales - Exp - salary;
				textFieldNProfit.setText(Double.toString(netprofit));
				
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the data correctly", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton buttonReset = new JButton("Reset");
		buttonReset.setBounds(208, 13, 99, 55);
		panel_6.add(buttonReset);
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUF.setText("");
				textFieldMF.setText("");
				textFieldAF.setText("");
				textFieldGE.setText("");
				textFieldTotalEx.setText("");
				textFieldSalesss.setText("");
				textFieldTE.setText("");
				textFieldES.setText("");
				textFieldNProfit.setText("");
			}
		});
		buttonReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit_1.setBounds(868, 38, 99, 55);
		panel.add(btnExit_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 991, 26);
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
	}
}
