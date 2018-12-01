package TOEIC_WORD_900;

import java.awt.*;

import javax.swing.*;

import java.awt.geom.*;

 

 

public class AdvanceGraph {

	 public static void main(String[] arg) {
	
		 MyFrame f = new MyFrame("선끝 조절");



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
	   
	    LoginReq loginReq=new LoginReq();
	    AdvanceUserArray aua = loginReq.getAllUser();
	    for(int i=0;i<aua.getCnt();i++) {
	    	System.out.println(aua.getUser(i));
	    }
	    
		 AdvanceReq advanceReq= new AdvanceReq();
		 int nowChap=advanceReq.getNowChap("r");
		 
		 g2.setStroke(new BasicStroke(3,BasicStroke.CAP_ROUND,0));
		 int tempX;
		 int tempY;
		 if(nowChap!=0) {
			 int firans=advanceReq.getAnsRatio("r", 1);
			 tempX=100;
			 tempY=200+firans;
			 g2.fillOval(tempX,tempY, 10, 10);
			
			 for(int i=1; i<nowChap;i++) {		 
				 int ans=advanceReq.getAnsRatio("r", i+1);
				 int x=100+i*50;
				 int y=200+ans;
				 g2.fillOval(x,y, 10, 10);
				 g2.draw(new Line2D.Double(tempX+5,tempY+5,x+5,y+5));			 
				 tempX=x;	tempY=y;
			 }
		 }
		 
	  
	    //g2.draw(new Line2D.Double(50,200,200,200));
	
	 }

}


