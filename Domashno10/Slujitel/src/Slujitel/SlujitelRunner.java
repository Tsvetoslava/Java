package Slujitel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SlujitelRunner{
	private ArrayList<Slujitel> list = new ArrayList<Slujitel>();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SlujitelRunner window = new SlujitelRunner();
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
	public SlujitelRunner() {
		initialize();
	}
	
	public void showPersonWindow(){
		final SlujitelWindow employee = new SlujitelWindow();
		employee.setVisible(true);
	
		employee.okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Slujitel currentEmployee = employee.getSlujitel();
				list.add(currentEmployee);
				employee.setVisible(false);
				JOptionPane.showMessageDialog(null, "Готово!");
				
			
			}
		});
		employee.calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int oldest = 0;
				int youngest =Integer.MAX_VALUE;
				
			       for (int i = 0; i < list.size(); i++) {
			            if (list.get(i). getGodini() > oldest) {
			                oldest = list.get(i). getGodini();
			            } else if (list.get(i). getGodini() < youngest) {
			                youngest = list.get(i). getGodini();
			            }
			        }

				 JOptionPane.showMessageDialog(null, "Nai-mladiqt slujitel: "+youngest);
				 JOptionPane.showMessageDialog(null, "Nai-vuzrastniqt slujitel: "+oldest);
				 employee.setVisible(false);
			
			}
		});
		
		employee.btnCalculateSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int sum = 0;
				    for (int i = 0; i < list.size(); i++){
				      sum = sum + list.get(i).getZaplata();
				    }
				
				    double average = sum /list.size();

				 JOptionPane.showMessageDialog(null, "Sredna zaplata "+average);
			
				 employee.setVisible(false);
			
			}
		});
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(152, 251, 152));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddPerson = new JButton("Add Employee");
		btnAddPerson.setForeground(SystemColor.activeCaptionText);
		btnAddPerson.setBackground(SystemColor.textHighlight);
		btnAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPersonWindow();
			}
		});
		btnAddPerson.setFont(new Font("Copperplate Gothic Light", Font.BOLD | Font.ITALIC, 20));
		btnAddPerson.setBounds(10, 122, 414, 109);
		frame.getContentPane().add(btnAddPerson);
	}

}