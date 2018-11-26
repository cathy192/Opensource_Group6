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

public class LogM extends JFrame {

	private JPanel LogmPane;
	static LogM logm_f=new LogM();
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public LogM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		LogmPane = new JPanel();
		LogmPane.setBackground(Color.WHITE);
		LogmPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(LogmPane);
		LogmPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOEIC 900");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBounds(162, 59, 231, 66);
		LogmPane.add(lblNewLabel);
		
		Button button = new Button("\uB85C\uADF81");
		button.setBackground(Color.WHITE);
		button.setBounds(224, 153, 87, 25);
		LogmPane.add(button);
		
		Button button_1 = new Button("\uB85C\uADF82");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(224, 184, 87, 25);
		LogmPane.add(button_1);
		
		Button button_2 = new Button("Main Menu");
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				logm_f.setVisible(false);
				Menu.menu_f.setVisible(true);
			}
		});
		button_2.setBounds(224, 244, 87, 25);
		LogmPane.add(button_2);
	}

}
