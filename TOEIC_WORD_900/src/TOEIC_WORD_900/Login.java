package TOEIC_WORD_900;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Scrollbar;
import java.awt.Window.Type;
import javax.swing.JPasswordField;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class Login extends JFrame {

	private JPanel LoginPane;
	private JTextField IDField;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	
	static Login login_f = new Login();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("TOEIC 900");
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		LoginPane = new JPanel();
		LoginPane.setForeground(Color.BLACK);
		LoginPane.setBorder(null);
		LoginPane.setBackground(Color.WHITE);
		setContentPane(LoginPane);
		LoginPane.setLayout(null);
		
		IDField = new JTextField();
		IDField.setBounds(254, 144, 116, 24);
		LoginPane.add(IDField);
		IDField.setColumns(10);
		
		JLabel LoginID = new JLabel("ID :");
		LoginID.setBounds(223, 147, 23, 18);
		LoginPane.add(LoginID);
		
		JLabel LoginPwd = new JLabel("Password :");
		LoginPwd.setBounds(171, 205, 75, 18);
		LoginPane.add(LoginPwd);
		
		JLabel lblToeic = new JLabel("TOEIC 900");
		lblToeic.setForeground(Color.PINK);
		lblToeic.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblToeic.setBounds(176, 66, 220, 46);
		LoginPane.add(lblToeic);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login_f.setVisible(false);
				Menu.menu_f.setVisible(true);
			}
		});
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(321, 243, 49, 25);
		LoginPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(254, 202, 116, 24);
		LoginPane.add(passwordField);
		
		Button button_1 = new Button("\uD68C\uC6D0\uAC00\uC785");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login_f.setVisible(false);
				Signup.signup_f.setVisible(true);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(290, 277, 80, 25);
		LoginPane.add(button_1);
		
		JPanel SignupPane = new JPanel();
		SignupPane.setLayout(null);
		SignupPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		SignupPane.setBackground(Color.WHITE);
		SignupPane.setBounds(0, 0, 582, 369);
		
		
		
		JLabel label = new JLabel("NAME :");
		label.setBounds(208, 158, 49, 18);
		SignupPane.add(label);
		
		JLabel label_1 = new JLabel("ID :");
		label_1.setBounds(234, 188, 23, 18);
		SignupPane.add(label_1);
		
		JLabel label_2 = new JLabel("Password :");
		label_2.setBounds(182, 218, 75, 18);
		SignupPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(271, 155, 116, 24);
		SignupPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(271, 185, 116, 24);
		SignupPane.add(textField_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(271, 215, 116, 24);
		SignupPane.add(passwordField_1);
		
		Button button_2 = new Button("\uC644\uB8CC");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(300, 245, 87, 25);
		SignupPane.add(button_2);
		
		JLabel label_3 = new JLabel("\uD68C\uC6D0 \uAC00\uC785");
		label_3.setForeground(Color.PINK);
		label_3.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 40));
		label_3.setBounds(204, 75, 168, 68);
		SignupPane.add(label_3);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{LoginPane, IDField, LoginID, LoginPwd, lblToeic, button, passwordField, button_1}));
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
