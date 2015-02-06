
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Numbers {

	private JFrame frame;
	private JTextField firstNumber;
	private JTextField secondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numbers window = new Numbers();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void subirane(JTextField firstNumber2, JTextField secondNumber2) {

		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber + secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!", "Внимание", 2);
		}
	}

	private void izvajdane(JTextField firstNumber2, JTextField secondNumber2) {
		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber - secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!", "Внимание", 2);
		}
	}

	private void delenie(JTextField firstNumber2, JTextField secondNumber2) {

		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber / secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!\nCannot devide by 0!",
					"Внимание", 2);
		}

	}

	private void umnojenie(JTextField firstNumber2, JTextField secondNumber2) {

		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber * secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!", "Внимание", 2);
		}

	}

	/**
	 * Create the application.
	 */
	public Numbers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton sbor = new JButton("\u0421\u0411\u041E\u0420\r\n");
		sbor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				subirane(firstNumber, secondNumber);
			}
		});
		sbor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sbor.setForeground(Color.BLACK);
		sbor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		sbor.setBounds(7, 100, 164, 40);
		frame.getContentPane().add(sbor);

		firstNumber = new JTextField();
		firstNumber.setBounds(7, 36, 164, 20);
		frame.getContentPane().add(firstNumber);
		firstNumber.setColumns(10);

		secondNumber = new JTextField();
		secondNumber.setToolTipText("");
		secondNumber.setBounds(233, 36, 174, 20);
		frame.getContentPane().add(secondNumber);
		secondNumber.setColumns(10);

		JLabel label = new JLabel(
				"\u041F\u044A\u0440\u0432\u043E \u0427\u0438\u0441\u043B\u043E");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(7, 11, 81, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel(
				"\u0412\u0442\u043E\u0440\u043E \u0427\u0438\u0441\u043B\u043E");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(233, 11, 81, 14);
		frame.getContentPane().add(label_1);

		JButton umnojenie = new JButton(
				"\u0423\u041C\u041D\u041E\u0416\u0415\u041D\u0418\u0415\r\n");
		umnojenie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				umnojenie(firstNumber, secondNumber);
			}
		});
		umnojenie.setFont(new Font("Tahoma", Font.PLAIN, 20));
		umnojenie.setBounds(10, 172, 161, 40);
		frame.getContentPane().add(umnojenie);

		JButton delenie = new JButton(
				"\u0414\u0415\u041B\u0415\u041D\u0418\u0415");
		delenie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				delenie(firstNumber, secondNumber);
			}
		});
		delenie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		delenie.setFont(new Font("Tahoma", Font.PLAIN, 20));
		delenie.setBounds(237, 172, 161, 40);
		frame.getContentPane().add(delenie);

		JButton razlika = new JButton(
				"\u0420\u0410\u0417\u041B\u0418\u041A\u0410\r\n");
		razlika.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				izvajdane(firstNumber, secondNumber);
			}
		});
		razlika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		razlika.setFont(new Font("Tahoma", Font.PLAIN, 20));
		razlika.setBounds(237, 100, 161, 40);
		frame.getContentPane().add(razlika);
	}
}
