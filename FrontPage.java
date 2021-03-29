
package javaapplication1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrontPage extends JFrame {

	private Container c;
	private JButton jbt1,jbt2;

	FrontPage() {
		
		c = new Container();
		c = this.getContentPane();
		c.setBackground(Color.green);
		c.setLayout(null);

		Font f = new Font("ARIAL", Font.BOLD, 22);
		Font f1 = new Font("ELEPHANT", Font.ITALIC, 18);
		Cursor cu = new Cursor(Cursor.HAND_CURSOR);

		JPanel jp1=new JPanel();
		jp1.setBounds(180,150,450,40);
		jp1.setBackground(Color.green);
		c.add(jp1);
		
		
		JPanel jp2=new JPanel();
		jp2.setBounds(250,220,300,80);
		jp2.setBackground(Color.BLUE);
		c.add(jp2);
		
		
		
		JLabel jl = new JLabel();
		jl.setOpaque(true);
		jl.setBounds(0, 0, 500, 200);
		jl.setText("STUDENT HEALTH AND FITNESS TEST");
		jl.setFont(f);
		jl.setForeground(Color.BLUE);
		jl.setBackground(Color.green);
		jp1.add(jl);
		//c.add(jl);

		ImageIcon im=new ImageIcon(getClass().getResource("Webp.net-resizeimage.jpg"));
		JLabel j2 = new JLabel(im);
		//j2.setOpaque(true);
		//System.out.println(im.getIconWidth()+" "+im.getIconHeight());
		j2.setBounds(0,0, im.getIconWidth(), im.getIconHeight());
		
		c.add(j2);
		
		
		jbt1 = new JButton();
		jbt1.setBounds(0, 0, 400, 100);
		jbt1.setText("Cick Here To Test Yourself");
		jbt1.setFont(f1);
		jbt1.setCursor(cu);
		jbt1.setForeground(Color.magenta);
		jp2.add(jbt1);
		
		//c.add(jbt1);

	
		jbt1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
		InputDataPage inp2 = new InputDataPage();
		inp2.setVisible(true);
		//dispose();
		}
		});
		 	
		
		jbt2 = new JButton();
		jbt2.setBounds(0, 0, 300, 50);
		jbt2.setText("Health tips");
		jbt2.setFont(f1);
		jbt2.setCursor(cu);
		jbt2.setForeground(Color.magenta);
		jp2.add(jbt2);
		//c.add(jbt2);
		
		jbt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
		healthTips ht1=new healthTips();
		ht1.setVisible(true);
		//dispose();
		}
		});
	
	}

	public static void main(String[] args) {
		FrontPage nc = new FrontPage();
		nc.setVisible(true);
	nc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBackground(Color.yellow);
		nc.setBounds(100, 100, 800, 534);
	}
}