package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
//import java.io;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class window3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtLastName;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void new1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window3 window = new window3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGetANew = new JLabel("Get a new license");
		lblGetANew.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGetANew.setBounds(139, 0, 177, 29);
		frame.getContentPane().add(lblGetANew);
		
		JLabel lblFirstName = new JLabel("First name ");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstName.setBounds(94, 81, 87, 14);
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(197, 80, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name ");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(94, 123, 74, 14);
		frame.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(197, 122, 86, 20);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAge.setBounds(25, 184, 54, 29);
		frame.getContentPane().add(lblAge);
		
		textField_2 = new JTextField();
		textField_2.setBounds(69, 190, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(new Color(102, 153, 102));
		rdbtnMale.setForeground(new Color(0, 0, 0));
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMale.setBounds(256, 189, 62, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(new Color(102, 153, 102));
		rdbtnNewRadioButton.setBounds(319, 189, 109, 23);
		
		ButtonGroup G = new ButtonGroup();
		G.add(rdbtnMale);		
		G.add(rdbtnNewRadioButton);		
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(DataManager.AddLicence(textField.getText(), txtLastName.getText(), rdbtnMale.isSelected() ?"Male":"Female",textField_2.getText()))
				{
					window4 b=new window4();
				}
				FileWriter fw = null;
				BufferedWriter bw = null;
				try {
					//fw = new FileWriter(textField.getText() +" "+txtLastName.getText()+ ".txt");
					 bw = new BufferedWriter(new FileWriter("JavaFinal.txt"));
					//fw = new FileWriter( "JavaFinal.txt");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//bw.write(textField.getText());
				//bw.write(txtLastName.getText());
				//PrintWriter pw=new PrintWriter(bw);
				//pw.println(textField.getText());
				//pw.println(txtLastName.getText());
				//pw.close();
				//PrintWriter pw=new PrintWriter(fw);
				//pw.println(textField.getText());
				//pw.println(txtLastName.getText());
				//pw.close();
				
				//b.fw=fw;
				//b.new2();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(339, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
