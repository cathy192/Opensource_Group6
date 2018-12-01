package TOEIC_WORD_900;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class word_study_3 extends JFrame {

	private JPanel study3;
	private JTextField wordField;
	int unit=1;
	int cnt=0;
	word_unit Wrong_word = new word_unit(unit);
	static word_study_3 study3_f=new word_study_3();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					word_study_3 frame = new word_study_3();
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
	public word_study_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		study3 = new JPanel();
		study3.setBackground(Color.WHITE);
		study3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(study3);
		study3.setLayout(null);
		
		JComboBox Unit = new JComboBox();
		Unit.setModel(new DefaultComboBoxModel(new String[] {"Unit 1~5", "Unit 6~10", "Unit 11~15", "Unit 16~20", "Unit 21~25", "Unit 26~30"}));
		Unit.setBounds(119, 53, 126, 24);
		study3.add(Unit);
		Unit.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ev) {
            	Main.playSound(1.0f, false);
            	wordField.setText("");
            	unit=(Unit.getSelectedIndex()*5)+1;
            	Wrong_word=wordDAO.getWrongUnit(unit);
            	wordField.setText("Unit "+unit+"~"+(int)(unit+4)+" 오답 정리");
            	cnt=0;
            }
		});
		
		Button button = new Button("\uB098\uAC00\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				study3_f.setVisible(false);
				StudyM.studym_f.setVisible(true);
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(379, 52, 87, 25);
		study3.add(button);
		
		wordField = new JTextField();
		wordField.setBounds(119, 108, 349, 144);
		study3.add(wordField);
		wordField.setColumns(10);
		wordField.setText("Unit "+unit+"~"+(int)(unit+4)+" 오답 정리");
		
		Button button_1 = new Button("\uB2E4\uC74C \uB2E8\uC5B4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.playSound(1.0f, false);
				String line;
				Main.playSound(1.0f, false);
				if(Wrong_word.word[cnt]==null&&cnt==0)
					line="오답 단어가 없습니다.";
				else if(Wrong_word.word[cnt]==null&&cnt!=0) {
					line="한번 더 누르면 처음부터";
					cnt=0;
				}
				else {
					line=Wrong_word.word[cnt]+"	"+Wrong_word.mean[cnt];	
					cnt++;
				}
				wordField.setText(line);
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(119, 278, 349, 24);
		study3.add(button_1);
	}
}
