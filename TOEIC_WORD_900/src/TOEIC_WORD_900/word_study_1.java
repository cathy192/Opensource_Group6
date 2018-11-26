package TOEIC_WORD_900;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class word_study_1 extends JFrame {

	private JPanel contentPane;
	private JTextField wordField;
	public static File file;
	public static FileReader filereader;
	public static BufferedReader bufReader;
	
	
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					word_study_1 frame = new word_study_1();
					frame.setVisible(true);
					file =new File("C:\\Users\\rkdal\\Desktop\\수업자료\\2-2\\오픈소스 개발프로젝트\\9Team Project\\단어암기장 900개단어.txt");
					filereader = new FileReader(file);
					bufReader = new BufferedReader(filereader);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	*/
	public String ReadNextword()  {
		
		String line= "";
		
		try {
			line=bufReader.readLine();
			if(line!=null) {
				return line;
					
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	

	
	
	public word_study_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uB2E4\uC74C \uB2E8\uC5B4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String line="";	
				line=ReadNextword();
				wordField.setText(line);
			
				
			}
		});
		btnNewButton_1.setBounds(133, 301, 387, 27);
		contentPane.add(btnNewButton_1);
		
		wordField = new JTextField();
		wordField.setBounds(133, 97, 387, 162);
		contentPane.add(wordField);
		wordField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7", "Day 8", "Day 9", "Day 10", "Day 11", "Day 12", "Day 13", "Day 14", "Day 15", "Day 16", "Day 17", "Day 18", "Day 19", "Day 20", "Day 21", "Day 22", "Day 23", "Day 24", "Day 25", "Day 26", "Day 27", "Day 28", "Day 29", "Day 30"}));
		comboBox.setBounds(133, 61, 94, 24);
		contentPane.add(comboBox);
		
		JButton button = new JButton("\uB098\uAC00\uAE30");
		button.setBounds(415, 58, 105, 27);
		contentPane.add(button);
	}
}
