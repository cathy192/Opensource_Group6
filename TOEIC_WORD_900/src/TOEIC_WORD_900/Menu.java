package TOEIC_WORD_900;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel MenuPane;
	static Menu menu_f=new Menu();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("TOEIC_900");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		MenuPane = new JPanel();
		MenuPane.setBackground(Color.WHITE);
		MenuPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MenuPane);
		MenuPane.setLayout(null);
		
		JLabel label = new JLabel("TOEIC 900");
		label.setForeground(Color.PINK);
		label.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		label.setBounds(183, 73, 238, 46);
		MenuPane.add(label);
		
		Button study_btn = new Button("\uACF5\uBD80\uD558\uAE30");
		study_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				menu_f.setVisible(false);
				StudyM.studym_f.setVisible(true);
			}
		});
		study_btn.setBackground(Color.WHITE);
		study_btn.setBounds(236, 142, 87, 25);
		MenuPane.add(study_btn);
		
		Button exam_btn = new Button("\uC2DC\uD5D8\uBCF4\uAE30");
		exam_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				menu_f.setVisible(false);
				TestM.testm_f.setVisible(true);
			}
		});
		exam_btn.setBackground(Color.WHITE);
		exam_btn.setBounds(236, 191, 87, 25);
		MenuPane.add(exam_btn);
		
		Button Log_btn = new Button("\uC9C4\uCC99\uB3C4 \uBCF4\uAE30");
		Log_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				menu_f.setVisible(false);
				LogM.logm_f.setVisible(true);
			}
		});
		Log_btn.setBackground(Color.WHITE);
		Log_btn.setBounds(236, 245, 87, 25);
		MenuPane.add(Log_btn);
		
		Button exit_btn = new Button("\uB098\uAC00\uAE30");
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				menu_f.setVisible(false);
				Login.login_f.setVisible(true);
			}
		});
		exit_btn.setBackground(Color.WHITE);
		exit_btn.setBounds(236, 293, 87, 25);
		MenuPane.add(exit_btn);
	}
}
