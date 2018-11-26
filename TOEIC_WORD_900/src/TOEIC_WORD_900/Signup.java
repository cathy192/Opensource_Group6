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
	private JTextField Naem_Field;
	private JTextField ID_Field;
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
		
		JLabel SignupName = new JLabel("NAME :");
		SignupName.setBounds(208, 158, 49, 18);
		SignupPane.add(SignupName);
		
		JLabel SignupID = new JLabel("ID :");
		SignupID.setBounds(234, 188, 23, 18);
		SignupPane.add(SignupID);
		
		JLabel SignupPwd = new JLabel("Password :");
		SignupPwd.setBounds(182, 218, 75, 18);
		SignupPane.add(SignupPwd);
		
		Naem_Field = new JTextField();
		Naem_Field.setBounds(271, 155, 116, 24);
		SignupPane.add(Naem_Field);
		Naem_Field.setColumns(10);
		
		ID_Field = new JTextField();
		ID_Field.setBounds(271, 185, 116, 24);
		SignupPane.add(ID_Field);
		ID_Field.setColumns(10);
		
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
