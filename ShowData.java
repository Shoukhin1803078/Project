
package javaapplication1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowData extends JFrame {

	ShowData(String s1, String s2, String s3, String s4,String s5) {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 300, 700, 600);

		Container c1 = new Container();
		c1 = this.getContentPane();
		c1.setBackground(Color.green);
		c1.setLayout(null);

		Font f = new Font("ARIAL", Font.BOLD, 20);
		// Font bangla=new Font ("Nirmala UI",Font.BOLD,20);
		Font bangla=new Font ("Kalpurush",Font.BOLD,25);
		Font bangla1=new Font ("Kalpurush",Font.BOLD,20);
		Font bangla2=new Font ("Kalpurush",Font.BOLD,23);
		Font bangla3=new Font ("Kalpurush",Font.BOLD,14);
		//Font bangla=new Font ("BenSenHandwriting",Font.BOLD,25);
		
		JLabel jb0 = new JLabel();
		jb0.setOpaque(true);
		jb0.setBounds(40, 20, 600, 40);
		jb0.setBackground(Color.yellow);
		jb0.setFont(bangla);
		jb0.setText("-------------------------আপনার ডাটা-------------------------" );
		c1.add(jb0);

		JLabel jb1 = new JLabel();
		jb1.setOpaque(true);
		jb1.setBounds(150, 70, 350, 25);
		jb1.setBackground(Color.yellow);
		jb1.setFont(bangla);
		jb1.setText("নাম : " + s1);
		c1.add(jb1);
		
		JLabel jb2 = new JLabel();
		jb2.setOpaque(true);
		jb2.setBounds(150, 100, 350, 25);
		jb2.setBackground(Color.yellow);
		jb2.setFont(bangla);
		jb2.setText("বয়স : " + s2);
		c1.add(jb2);
		
		
		JLabel jb3 = new JLabel();
		jb3.setOpaque(true);
		jb3.setBounds(150,130, 350, 25);
		jb3.setBackground(Color.yellow);
		jb3.setFont(bangla);
		jb3.setText("ওজন : " + s3);
		c1.add(jb3);
		double w=Double.parseDouble(s3);

		JLabel jb4 = new JLabel();
		jb4.setOpaque(true);
		jb4.setBounds(150,160, 350, 30);
		jb4.setBackground(Color.yellow);
		jb4.setFont(bangla);
		jb4.setText("উচ্চতা : " + s4+" ফুট "+s5+" ইঞ্চি" );
		c1.add(jb4);
		
		double h1=Double.parseDouble(s4);
		double h2=Double.parseDouble(s5);
		h1=h1*0.3048;//meter
		h2=h2*0.025;//meter
		double h=h1+h2;
		
		double bmi=w*(1.0)/(h*h);
		System.out.println("Your BMI="+bmi);
		
		
		//Folafol
		
		JLabel jb5 = new JLabel();
		jb5.setOpaque(true);
		jb5.setBounds(40,200, 600, 40);
		jb5.setBackground(Color.yellow);
		jb5.setFont(bangla);
		jb5.setText("-------------------------   ফলাফল   -------------------------");
		c1.add(jb5);
		
		if(bmi<18.5)
		{
			String bmiInString=String.valueOf(bmi);
			System.out.println("Result: underweight ");
			
	           	JLabel jb6 = new JLabel();
		jb6.setOpaque(true);
		jb6.setBounds(150,250, 350, 25);
		jb6.setBackground(Color.yellow);
		jb6.setFont(bangla2);
		jb6.setText("ফলাফল :"+" ওজনহীনতা (Underweight)");
		c1.add(jb6);
		
		JLabel jb7 = new JLabel();
		jb7.setOpaque(true);
		jb7.setBounds(150,280, 350, 25);
		jb7.setBackground(Color.yellow);
		jb7.setFont(bangla);
		jb7.setText("আপনার বি এম আই : "+bmiInString);
		c1.add(jb7);
		
		JLabel jb8 = new JLabel();
		jb8.setOpaque(true);
		jb8.setBounds(40,320, 600, 40);
		jb8.setBackground(Color.yellow);
		jb8.setFont(bangla);
		jb8.setText("--------------------   আপনার করণীয়   -----------------------" );
		c1.add(jb8);
		
		JLabel jb81 = new JLabel();
		jb81.setOpaque(true);
		jb81.setBounds(150,370, 350, 25);
		jb81.setBackground(Color.yellow);
		jb81.setFont(bangla);
		jb81.setText("আপনাকে এই রেঞ্জে রাখতে হবে.... ");
		c1.add(jb81);
		/*
		JLabel jb9= new JLabel();
		jb9.setOpaque(true);
		jb9.setBounds(150,400,350, 25);
		jb9.setBackground(Color.yellow);
		jb9.setFont(bangla);
		jb9.setText("ওজনের রেঞ্জ : "+" ");
		c1.add(jb9);
		*/
		JLabel jb10= new JLabel();
		jb10.setOpaque(true);
		jb10.setBounds(150,430, 350, 25);
		jb10.setBackground(Color.yellow);
		jb10.setFont(bangla);
		jb10.setText("বি এম আই রেঞ্জ : "+" 18.5 to 24.9");
		c1.add(jb10);
		
		
		}
	
		else if(bmi>=18.5&&bmi<=24.9)
		{
			String bmiInString=String.valueOf(bmi);
			System.out.println("Result: Normal ");
			
	           	JLabel jb6 = new JLabel();
		jb6.setOpaque(true);
		jb6.setBounds(150,250, 350, 25);
		jb6.setBackground(Color.yellow);
		jb6.setFont(bangla);
		jb6.setText("ফলাফল :"+" স্বাভাবিক(Normal)");
		c1.add(jb6);
		
		JLabel jb7 = new JLabel();
		jb7.setOpaque(true);
		jb7.setBounds(150,280, 350, 25);
		jb7.setBackground(Color.yellow);
		jb7.setFont(bangla);
		jb7.setText("আপনার বি এম আই : "+bmiInString);
		c1.add(jb7);
		
		JLabel jb8 = new JLabel();
		jb8.setOpaque(true);
		jb8.setBounds(40,320, 600, 40);
		jb8.setBackground(Color.yellow);
		jb8.setFont(bangla);
		jb8.setText("--------------------   আপনার করণীয়   -----------------------" );
		c1.add(jb8);
		
		JLabel jb81 = new JLabel();
		jb81.setOpaque(true);
		jb81.setBounds(150,370, 350, 25);
		jb81.setBackground(Color.yellow);
		jb81.setFont(bangla);
		jb81.setText("বেশি বেশি সুষম খাবার গ্রহন করুন.... ");
		c1.add(jb81);
		
		JLabel jb9= new JLabel();
		jb9.setOpaque(true);
		jb9.setBounds(150,400,350, 25);
		jb9.setBackground(Color.yellow);
		jb9.setFont(bangla);
		jb9.setText("পর্যপ্ত পরিমানে পানি পান করুন....");
		c1.add(jb9);
		
		/*
		JLabel jb10= new JLabel();
		jb10.setOpaque(true);
		jb10.setBounds(150,430, 350, 25);
		jb10.setBackground(Color.yellow);
		jb10.setFont(bangla);
		jb10.setText("বি এম আই রেঞ্জ : "+" 18.5 to 24.9");
		c1.add(jb10);
		*/
		
		}
		
		
		else if(bmi>=25&&bmi<=29.9)
		{
			String bmiInString=String.valueOf(bmi);
			System.out.println("Result: OverWeight ");
			
	           	JLabel jb6 = new JLabel();
		jb6.setOpaque(true);
		jb6.setBounds(150,250, 350, 25);
		jb6.setBackground(Color.yellow);
		jb6.setFont(bangla);
		jb6.setText("ফলাফল :"+"ওজনাধিক্য(Overweight)");
		c1.add(jb6);
		
		JLabel jb7 = new JLabel();
		jb7.setOpaque(true);
		jb7.setBounds(150,280, 350, 25);
		jb7.setBackground(Color.yellow);
		jb7.setFont(bangla);
		jb7.setText("আপনার বি এম আই : "+bmiInString);
		c1.add(jb7);
		
		JLabel jb8 = new JLabel();
		jb8.setOpaque(true);
		jb8.setBounds(40,320, 600, 40);
		jb8.setBackground(Color.yellow);
		jb8.setFont(bangla);
		jb8.setText("--------------------   আপনার করণীয়   -----------------------" );
		c1.add(jb8);
		
		JLabel jb81 = new JLabel();
		jb81.setOpaque(true);
		jb81.setBounds(150,370, 350, 25);
		jb81.setBackground(Color.yellow);
		jb81.setFont(bangla);
		jb81.setText("ওজন কমাতে হবে.... ");
		c1.add(jb81);
		
		JLabel jb9= new JLabel();
		jb9.setOpaque(true);
		jb9.setBounds(40,400,550, 30);
		jb9.setBackground(Color.yellow);
		jb9.setFont(bangla);
		jb9.setText("বি এম আই 18.5 থেকে 24.5 রেঞ্জে আনার চেস্টা করুন.......");
		c1.add(jb9);
		
		/*
		JLabel jb10= new JLabel();
		jb10.setOpaque(true);
		jb10.setBounds(150,430, 350, 25);
		jb10.setBackground(Color.yellow);
		jb10.setFont(bangla);
		jb10.setText("বি এম আই রেঞ্জ : "+" 18.5 to 24.9");
		c1.add(jb10);
		*/
		
		}
		else if(bmi>29.9&&bmi<=34.9)
		{
			String bmiInString=String.valueOf(bmi);
			System.out.println("Result: Obese (Level-1 ) ");
			
	           	JLabel jb6 = new JLabel();
		jb6.setOpaque(true);
		jb6.setBounds(150,250, 350, 25);
		jb6.setBackground(Color.yellow);
		jb6.setFont(bangla1);
		jb6.setText("ফলাফল :"+"গ্রেড-১ স্থুলতা(Obese Level-1)");
		c1.add(jb6);
		
		JLabel jb7 = new JLabel();
		jb7.setOpaque(true);
		jb7.setBounds(150,280, 350, 25);
		jb7.setBackground(Color.yellow);
		jb7.setFont(bangla);
		jb7.setText("আপনার বি এম আই : "+bmiInString);
		c1.add(jb7);
		
		JLabel jb8 = new JLabel();
		jb8.setOpaque(true);
		jb8.setBounds(40,320, 600, 40);
		jb8.setBackground(Color.yellow);
		jb8.setFont(bangla);
		jb8.setText("--------------------   আপনার করণীয়   -----------------------" );
		c1.add(jb8);
		
		JLabel jb81 = new JLabel();
		jb81.setOpaque(true);
		jb81.setBounds(150,370, 350, 25);
		jb81.setBackground(Color.yellow);
		jb81.setFont(bangla);
		jb81.setText("ওজন কমাতে হবে.... ");
		c1.add(jb81);
		
		JLabel jb9= new JLabel();
		jb9.setOpaque(true);
		jb9.setBounds(40,400,550, 30);
		jb9.setBackground(Color.yellow);
		jb9.setFont(bangla);
		jb9.setText("বি এম আই 18.5 থেকে 24.5 রেঞ্জে আনার চেস্টা করুন.......");
		c1.add(jb9);
		
		/*
		JLabel jb10= new JLabel();
		jb10.setOpaque(true);
		jb10.setBounds(150,430, 350, 25);
		jb10.setBackground(Color.yellow);
		jb10.setFont(bangla);
		jb10.setText("বি এম আই রেঞ্জ : "+" 18.5 to 24.9");
		c1.add(jb10);
		*/
		
		}
		else if(bmi>34.9&&bmi<=40)
		{
			String bmiInString=String.valueOf(bmi);
			System.out.println("Result: Obese (Level-2 ) ");
			
	           	JLabel jb6 = new JLabel();
		jb6.setOpaque(true);
		jb6.setBounds(150,250, 350, 25);
		jb6.setBackground(Color.yellow);
		jb6.setFont(bangla1);
		jb6.setText("ফলাফল :"+"গ্রেড-২ স্থুলতা(Obese Level-2)");
		c1.add(jb6);
		
		JLabel jb7 = new JLabel();
		jb7.setOpaque(true);
		jb7.setBounds(150,280, 350, 25);
		jb7.setBackground(Color.yellow);
		jb7.setFont(bangla);
		jb7.setText("আপনার বি এম আই : "+bmiInString);
		c1.add(jb7);
		
		JLabel jb8 = new JLabel();
		jb8.setOpaque(true);
		jb8.setBounds(40,320, 600, 40);
		jb8.setBackground(Color.yellow);
		jb8.setFont(bangla);
		jb8.setText("--------------------   আপনার করণীয়   -----------------------" );
		c1.add(jb8);
		
		JLabel jb81 = new JLabel();
		jb81.setOpaque(true);
		jb81.setBounds(150,370, 350, 25);
		jb81.setBackground(Color.yellow);
		jb81.setFont(bangla);
		jb81.setText("ওজন কমাতে হবে.... ");
		c1.add(jb81);
		
		JLabel jb9= new JLabel();
		jb9.setOpaque(true);
		jb9.setBounds(40,400,550, 30);
		jb9.setBackground(Color.yellow);
		jb9.setFont(bangla);
		jb9.setText("বি এম আই 18.5 থেকে 24.5 রেঞ্জে আনার চেস্টা করুন.......");
		c1.add(jb9);
		
		/*
		JLabel jb10= new JLabel();
		jb10.setOpaque(true);
		jb10.setBounds(150,430, 350, 25);
		jb10.setBackground(Color.yellow);
		jb10.setFont(bangla);
		jb10.setText("বি এম আই রেঞ্জ : "+" 18.5 to 24.9");
		c1.add(jb10);
		*/
		
		}
		else if(bmi>40)
		{
			String bmiInString=String.valueOf(bmi);
			System.out.println("Result: Obese (Level-3 ) ");
			
	           	JLabel jb6 = new JLabel();
		jb6.setOpaque(true);
		jb6.setBounds(150,250, 350, 25);
		jb6.setBackground(Color.yellow);
		jb6.setFont(bangla3);
		jb6.setText("ফলাফল :"+"রোগ গ্রস্থ চূড়ান্ত পর্যায়ের স্থুলতা(Obese Level-3)");
		c1.add(jb6);
		
		JLabel jb7 = new JLabel();
		jb7.setOpaque(true);
		jb7.setBounds(150,280, 350, 25);
		jb7.setBackground(Color.yellow);
		jb7.setFont(bangla);
		jb7.setText("আপনার বি এম আই : "+bmiInString);
		c1.add(jb7);
		
		JLabel jb8 = new JLabel();
		jb8.setOpaque(true);
		jb8.setBounds(40,320, 600, 40);
		jb8.setBackground(Color.yellow);
		jb8.setFont(bangla);
		jb8.setText("--------------------   আপনার করণীয়   -----------------------" );
		c1.add(jb8);
		
		JLabel jb81 = new JLabel();
		jb81.setOpaque(true);
		jb81.setBounds(150,370, 350, 25);
		jb81.setBackground(Color.yellow);
		jb81.setFont(bangla);
		jb81.setText("ওজন কমাতে হবে.... ");
		c1.add(jb81);
		
		JLabel jb9= new JLabel();
		jb9.setOpaque(true);
		jb9.setBounds(40,400,550, 30);
		jb9.setBackground(Color.yellow);
		jb9.setFont(bangla);
		jb9.setText("বি এম আই 18.5 থেকে 24.5 রেঞ্জে আনার চেস্টা করুন.......");
		c1.add(jb9);
		
		/*
		JLabel jb10= new JLabel();
		jb10.setOpaque(true);
		jb10.setBounds(150,430, 350, 25);
		jb10.setBackground(Color.yellow);
		jb10.setFont(bangla);
		jb10.setText("বি এম আই রেঞ্জ : "+" 18.5 to 24.9");
		c1.add(jb10);
		*/
		
		}
		
	}

	public static void main(String[] args) {

	}
}
