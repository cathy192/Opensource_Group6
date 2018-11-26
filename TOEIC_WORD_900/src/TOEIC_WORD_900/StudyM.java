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

public class StudyM extends JFrame {

	private JPanel StudymPane;
	static StudyM studym_f=new StudyM();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudyM frame = new StudyM();
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
	public StudyM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		StudymPane = new JPanel();
		StudymPane.setBackground(Color.WHITE);
		StudymPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(StudymPane);
		StudymPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOEIC 900");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBounds(177, 50, 232, 58);
		StudymPane.add(lblNewLabel);
		
		Button button = new Button("\uACF5\uBD801");
		button.setBackground(Color.WHITE);
		button.setBounds(233, 144, 87, 25);
		StudymPane.add(button);
		
		Button button_1 = new Button("\uACF5\uBD802");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(233, 175, 87, 25);
		StudymPane.add(button_1);
		
		Button button_2 = new Button("\uACF5\uBD803");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(233, 206, 87, 25);
		StudymPane.add(button_2);
		
		Button button_3 = new Button("Main Menu");
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				studym_f.setVisible(false);
				Menu.menu_f.setVisible(true);
			}
		});
		button_3.setBounds(233, 267, 87, 25);
		StudymPane.add(button_3);
	}
}
