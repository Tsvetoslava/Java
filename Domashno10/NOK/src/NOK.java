import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class NOK {

	private JFrame frame;
	private JTextField number1;
	private JTextField number2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NOK window = new NOK();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void nok() {
		try {
			String firstNumberText = this.number1.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.number2.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			int rezult = firstNumber * secondNumber;
			int squared = (int) Math.sqrt(rezult);
			for (int i = squared; i <= rezult; i++) {
				if (i % firstNumber == 0 && i % secondNumber == 0) {
					JOptionPane.showMessageDialog(null, "Резултатът е: " + i);
					break;
				}

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Възникна грешка при изчислението!", "Внимание", 0);
		}

	}

	/**
	 * Create the application.
	 */
	public NOK() {
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

		JButton button = new JButton(
				"\u0418\u0437\u0447\u0438\u0441\u043B\u044F\u0432\u0430\u043D\u0435 \u043D\u0430 \u041D\u041E\u041A");
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nok();

			}
		});
		button.setBounds(119, 133, 183, 56);
		frame.getContentPane().add(button);

		JLabel fisrtNumber = new JLabel(
				"\u041F\u044A\u0440\u0432\u043E \u0447\u0438\u0441\u043B\u043E:");
		fisrtNumber.setForeground(Color.BLUE);
		fisrtNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fisrtNumber.setBounds(44, 38, 86, 27);
		frame.getContentPane().add(fisrtNumber);

		JLabel secondNumber = new JLabel(
				"\u0412\u0442\u043E\u0440\u043E \u0447\u0438\u0441\u043B\u043E");
		secondNumber.setForeground(Color.BLUE);
		secondNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		secondNumber.setBounds(300, 44, 96, 14);
		frame.getContentPane().add(secondNumber);

		number1 = new JTextField();
		number1.setBounds(44, 61, 86, 20);
		frame.getContentPane().add(number1);
		number1.setColumns(10);

		number2 = new JTextField();
		number2.setBounds(300, 61, 86, 20);
		frame.getContentPane().add(number2);
		number2.setColumns(10);
	}
}