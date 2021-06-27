package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 977, 641);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "LOGIN", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnExit.setBackground(Color.GRAY);
		btnExit.setBounds(326, 538, 249, 76);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Please Select the Type of User");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(159, 79, 657, 76);
		panel.add(lblNewLabel);
		
		JButton btnAdminButton = new JButton("Admin");
		btnAdminButton.setBackground(Color.GRAY);
		btnAdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin AL = new AdminLogin();
				AL.setModalExclusionType(null);
				AL.setVisible(true);
				dispose();
			}
		});
		btnAdminButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAdminButton.setBounds(130, 375, 249, 76);
		panel.add(btnAdminButton);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setBackground(Color.GRAY);
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustLogin CL = new CustLogin();
				CL.setModalExclusionType(null);
				CL.setVisible(true);
				dispose();
			}
		});
		btnCustomer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCustomer.setBounds(538, 375, 249, 76);
		panel.add(btnCustomer);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\JAVA\\Programming 2 Assignment\\image\\LoginBG.jpg"));
		lblNewLabel_1.setBounds(0, 0, 977, 641);
		panel.add(lblNewLabel_1);
	}
}
