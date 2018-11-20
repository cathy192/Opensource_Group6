package 암기장테스트;

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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField IDField;
	private JTextField PWField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("TOEIC 900");
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 416);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(null);
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		IDField = new JTextField();
		IDField.setBounds(259, 180, 116, 24);
		contentPane.add(IDField);
		IDField.setColumns(10);
		
		PWField = new JTextField();
		PWField.setBounds(259, 238, 116, 24);
		contentPane.add(PWField);
		PWField.setColumns(10);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(228, 183, 23, 18);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(176, 241, 75, 18);
		contentPane.add(lblPassword);
		
		JLabel lblToeic = new JLabel("TOEIC 900");
		lblToeic.setForeground(Color.PINK);
		lblToeic.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
		lblToeic.setBounds(176, 66, 194, 46);
		contentPane.add(lblToeic);
		
		Button button = new Button("Login");
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(320, 268, 49, 25);
		contentPane.add(button);
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
