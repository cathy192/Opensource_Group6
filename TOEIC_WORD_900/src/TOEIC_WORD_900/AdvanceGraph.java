package TOEIC_WORD_900;

import java.awt.*;

import javax.swing.*;

import java.awt.geom.*;

 

 

public class AdvanceGraph {

	 public static void main(String[] arg) {
	
		 MyFrame f = new MyFrame("선끝 조절");
		 AdvanceReq advanceReq= new AdvanceReq();
		 advanceReq.insertInfo("r", 1, 80, true, "000000000000000000000000000000");
	 }
	
	} 
	
	 
	
	class MyFrame extends JFrame {
	
		 MyFrame(String title) {
		
		 super(title);
		
		 setSize(500,500);
		
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		 makeUI();
		
		 setVisible(true);
	
	 }
	
		 private void makeUI() {
		
			 MyPanel p = new MyPanel();
			
			 add(p, BorderLayout.CENTER);
		
		 }
	
	}
	
	
	class MyPanel extends JPanel {
	
	 protected void paintComponent(Graphics g) {
	
	
	    Graphics2D g2=(Graphics2D)g;
	 
	 
	  // CAP_ROUND를 사용한 직선 그리기
	
	    //g.setFont(new Font("CAP_ROUND", Font.BOLD, 30));
	    //g.drawString("CAP_ROUND", 50, 160);

	    g2.setStroke(new BasicStroke(10,BasicStroke.CAP_ROUND,0));
	     g2.draw(new Line2D.Double(50,200,200,200));
	
	 }

}


