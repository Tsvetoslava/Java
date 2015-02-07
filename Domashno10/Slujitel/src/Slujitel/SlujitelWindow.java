package Slujitel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.ArrayList;

public class SlujitelWindow extends JFrame {
	public JButton calculate;
	public JButton okButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public JButton btnCalculateSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SlujitelWindow frame = new SlujitelWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Slujitel getSlujitel() {
		int age = Integer.parseInt(this.textField_3.getText());
		int salary = Integer.parseInt(this.textField_4.getText());
		int phoneNumber = Integer.parseInt(this.textField_2.getText());
		Slujitel employee = new Slujitel(this.textField.getText(),
				this.textField_1.getText(), phoneNumber, age, salary);
		return employee;
	}

	/**
	 * Create the frame.
	 */
	public SlujitelWindow() {
		getContentPane().setBackground(new Color(152, 251, 152));
		setBounds(100, 100, 450, 300);

		this.okButton = new JButton("\u041E\u041A");
		okButton.setBounds(321, 196, 89, 23);
		okButton.setBackground(Color.GRAY);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(okButton);

		this.calculate = new JButton("\r\nAge");
		calculate.setBounds(308, 35, 116, 23);
		calculate.setBackground(Color.GRAY);
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(calculate);

		textField = new JTextField();
		textField.setBounds(93, 8, 205, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 57, 205, 20);
		getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(96, 107, 205, 20);
		getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(93, 147, 205, 20);
		getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(93, 196, 205, 20);
		getContentPane().add(textField_4);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 11, 89, 14);
		getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 60, 89, 14);
		getContentPane().add(lblLastName);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(10, 110, 89, 14);
		getContentPane().add(lblPhoneNumber);

		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 150, 89, 14);
		getContentPane().add(lblAge);

		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(10, 200, 89, 14);
		getContentPane().add(lblSalary);

		btnCalculateSalary = new JButton("Salary");
		btnCalculateSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCalculateSalary.setBackground(Color.GRAY);
		btnCalculateSalary.setBounds(308, 72, 116, 23);
		getContentPane().add(btnCalculateSalary);
	}
}