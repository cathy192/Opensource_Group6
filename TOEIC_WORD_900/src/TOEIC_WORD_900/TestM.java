package TOEIC_WORD_900;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestM extends JFrame {

	private JPanel TestmPane;
	static TestM testm_f=new TestM();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TestM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		TestmPane = new JPanel();
		TestmPane.setBackground(Color.WHITE);
		TestmPane.setForeground(Color.BLACK);
		TestmPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TestmPane);
		TestmPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOEIC 900");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblNewLabel.setBounds(178, 85, 227, 46);
		TestmPane.add(lblNewLabel);
		
		Button button = new Button("\uC2DC\uD5D81");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				testm_f.setVisible(false);
				word_test_1.study1_f.setVisible(true);
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(232, 162, 87, 25);
		TestmPane.add(button);
		
		Button button_1 = new Button("\uC2DC\uD5D82");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(232, 193, 87, 25);
		TestmPane.add(button_1);
		
		Button button_2 = new Button("Main Menu");
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				testm_f.setVisible(false);
				Menu.menu_f.setVisible(true);
			}
		});
		button_2.setBounds(232, 256, 87, 25);
		TestmPane.add(button_2);
	}

}
