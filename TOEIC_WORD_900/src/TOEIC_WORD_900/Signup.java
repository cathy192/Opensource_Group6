package TOEIC_WORD_900;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JFrame {

	private JPanel SignupPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	static Signup signup_f = new Signup();
	/**
	 * Create the frame.
	 */
	public Signup() {
		setTitle("TOEIC_900");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		SignupPane = new JPanel();
		SignupPane.setBackground(Color.WHITE);
		SignupPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SignupPane);
		SignupPane.setLayout(null);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setBounds(208, 158, 49, 18);
		SignupPane.add(lblName);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(234, 188, 23, 18);
		SignupPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(182, 218, 75, 18);
		SignupPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(271, 155, 116, 24);
		SignupPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(271, 185, 116, 24);
		SignupPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(271, 215, 116, 24);
		SignupPane.add(passwordField);
		
		Button button = new Button("\uC644\uB8CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signup_f.setVisible(false);
				Login.login_f.setVisible(true);
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(300, 245, 87, 25);
		SignupPane.add(button);
		
		JLabel label = new JLabel("\uD68C\uC6D0 \uAC00\uC785");
		label.setForeground(Color.PINK);
		label.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 40));
		label.setBounds(204, 75, 216, 68);
		SignupPane.add(label);
	}

}
