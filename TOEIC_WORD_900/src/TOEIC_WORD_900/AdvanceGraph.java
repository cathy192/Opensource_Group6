package TOEIC_WORD_900;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JFormattedTextField;
import java.awt.ScrollPane;
import java.awt.Point;
import java.awt.Scrollbar;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
class MyPanel extends JPanel{
	   
	   protected void paintComponent(Graphics g) {
	      

	       Graphics2D g2=(Graphics2D)g;
	    
	    
	       // CAP_ROUND를 사용한 직선 그리기
	   
	       //g.setFont(new Font("CAP_ROUND", Font.BOLD, 30));
	       //g.drawString("CAP_ROUND", 50, 160);
	      
	       LoginReq loginReq=new LoginReq();
	       AdvanceUserArray aua = loginReq.getAllUser();
	       for(int i=0;i<aua.getCnt();i++) {
	          System.out.println(aua.getUser(i));
	       }
	       
	       AdvanceReq advanceReq= new AdvanceReq();
	       int nowChap=advanceReq.getNowChap("r");

	       
	       //초기 x , y값 및 점과 점사이의 거리
	       final int firstX=100;
	       final int firstY=0;
	       final int distX=20;
	          
	       //그래프 밑에 선 그리기
	       //g2.setStroke(new BasicStroke(2,BasicStroke.CAP_ROUND,0));
	       //g2.draw(new Line2D.Double(firstX,firstY+200,firstX+distX*30,firstY+200));   
	   
	       g2.setStroke(new BasicStroke(3,BasicStroke.CAP_ROUND,0));
	       int tempX;
	       int tempY;
	       if(nowChap!=0) {
	          int firans=advanceReq.getAnsRatio("r", 1);
	          tempX=firstX;
	          tempY=firstY+firans;
	          g2.fillOval(tempX,tempY, 10, 10);
	         
	          for(int i=1; i<nowChap;i++) {                    
	             int ans=advanceReq.getAnsRatio("r", i+1);
	             int x=firstX+i*distX;
	             int y=firstY+ans;
	             g2.fillOval(x,y, 10, 10);
	             g2.draw(new Line2D.Double(tempX+5,tempY+5,x+5,y+5));          
	             tempX=x;   tempY=y;
	          }
	       }
	       
	     
	       //g2.draw(new Line2D.Double(50,200,200,200));
	   
	    }
	}
public class AdvanceGraph extends JFrame {

	private JPanel GraphPane;
	 private JLabel unitField;
	   private int unit=1;
	   private int cnt=0;
	   static AdvanceGraph adgp1_f=new AdvanceGraph();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvanceGraph frame = new AdvanceGraph();
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
	public AdvanceGraph() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		GraphPane = new JPanel();
		GraphPane.setBackground(Color.WHITE);
		GraphPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(GraphPane);
		GraphPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(46, 48, 491, 268);
		GraphPane.add(scrollPane);
	}
}
