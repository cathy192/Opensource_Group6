package TOEIC_WORD_900;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ScrollPaneConstants;

public class word_test_1 extends JFrame {

   private JPanel studyt1;
   static word_test_1 study1_f=new word_test_1();
   private int unit=1;
   private String answer=null;
   //word_unit Unit1=wordDAO.getUnit(1);
   int[]Wrong_state= new int[100];

   int j=0;
   private word_unit Study_Unit=wordDAO.getUnit(unit);
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               word_test_1 frame = new word_test_1();
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
   public word_test_1() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 600, 400);
      studyt1 = new JPanel();
      studyt1.setBackground(Color.WHITE);
      studyt1.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(studyt1);
      studyt1.setLayout(null);
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scrollPane.setBounds(70, 100, 423, 228);
      studyt1.add(scrollPane);
      Scanner scanner=new Scanner(System.in);
      
      JTextArea wordArea = new JTextArea();
      wordArea.setWrapStyleWord(true);
      scrollPane.setViewportView(wordArea);
      for(int i=0;i<30;i++) {
          String line=Study_Unit.word[i]+"   "+Study_Unit.mean[i]+"\n";
          wordArea.append(line);  
       }
      
      JComboBox Unit = new JComboBox();
      Unit.setForeground(Color.BLACK);
      Unit.setBackground(UIManager.getColor("Button.disabledShadow"));
      Unit.setModel(new DefaultComboBoxModel(new String[] {"Unit 1", "Unit 2", "Unit 3", "Unit 4", "Unit 5", "Unit 6", "Unit 7", "Unit 8", "Unit 9", "Unit 10", "Unit 11", "Unit 12", "Unit 13", "Unit 14", "Unit 15", "Unit 16", "Unit 17", "Unit 18", "Unit 19", "Unit 20", "Unit 21", "Unit 22", "Unit 23", "Unit 24", "Unit 25", "Unit 26", "Unit 27", "Unit 28", "Unit 29", "Unit 30"}));
      Unit.setBounds(70, 47, 94, 24);
      studyt1.add(Unit);
      Unit.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ev) {
               Main.playSound(1.0f, false);
               wordArea.setText("");
               unit=Unit.getSelectedIndex()+1;
               Study_Unit=wordDAO.getUnit(unit);
               for(int i=0;i<30;i++) {
                  System.out.println(Study_Unit.mean[i]);
                 System.out.println("단어: ");
                 answer=scanner.next();
                 System.out.println("");
                 if(Study_Unit.word[i]==answer) {
                    System.out.println("맞췄습니다.");
                    continue;
                    
                 }
                 else {
                    System.out.println("틀렸습니다");
                    Wrong_state[j]=i;
                 j++;
                 }
                 
                  String line=Study_Unit.word[i]+"   "+Study_Unit.mean[i]+"\n";
                  wordArea.append(line);  

               }

            }
      });
      
      Button button_1 = new Button("\uB098\uAC00\uAE30");
      button_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            Main.playSound(1.0f, false);
            study1_f.setVisible(false);
            StudyM.studym_f.setVisible(true);
         }
      });
      button_1.setBackground(Color.WHITE);
      button_1.setBounds(406, 47, 87, 25);
      studyt1.add(button_1);
      
      
      
      
   }
}