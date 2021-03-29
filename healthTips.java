package javaapplication1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class healthTips extends JFrame {

	healthTips() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(650, 150, 800, 800);

		Container c1 = new Container();
		c1 = this.getContentPane();
		c1.setBackground(Color.green);
		c1.setLayout(null);

		Font bangla = new Font("Kalpurush", Font.BOLD, 25);
		Font bangla1 = new Font("Kalpurush", Font.BOLD, 20);
		Font bangla3 = new Font("Kalpurush", Font.BOLD, 20);
		
		JLabel jb1=new JLabel();
	jb1.setBounds(170,10,400,50);
	
	jb1.setOpaque(true);
	jb1.setText("স্বাস্থ্য ভালো রাখার কয়েকটি সহজ টিপস");;
	jb1.setFont(bangla);
	jb1.setBackground(Color.MAGENTA);
	c1.add(jb1);

		JTextArea jt = new JTextArea();
		jt.setBounds(30, 70, 700, 600);
		jt.setFont(bangla1);
		jt.setBackground(Color.green);
		jt.setLineWrap(true);
		jt.setWrapStyleWord(true);
		jt .setText("স্বাস্থ্যই সকল সুখের মূল। সেই স্বাস্থ্য যদি ভালো না থাকে তাহলে আপনি কি সুখে থাকবেন? আপনার শরীর যদি ভালো না থাকে তাহলে কোন কিছুতেই ভালো থাকা যায় না। তাই শরীর সবসময় সুস্থ রাখার জন্য আমাদের অনেক নিয়ম মেনে চলতে হয়। যা স্বাস্থ্য রক্ষায় খুব প্রয়োজনীয়।\n" +
"\n" +
"স্বাস্থ্য ভালো রাখার কয়েকটি সহজ টিপস।\n" +
"যখন আপনি খেতে বসবেন কখনোই একবারে বেশি খাবেন না। অল্প করে খান, তবে একটু পর পর। প্রতিদিন ৮ গ্লাস পানি পান করুন।\n" +
"অফিসে সবসময় ঘরের তৈরী খাবার খান। কাজের মঝে অবশ্যই টি ব্রেক নিন। কারণ একটানা কাজ করতে গেলে কিছুটা হলেও শরীরে চাপ পড়ে।\n" +
"জায়গায় লিফট ব্যাবহার করা থেকে বিরত থাকুন। চেষ্টা করুন সিঁড়ি বেয়ে উঠতে।\n" +
"সবসময় রান্না করার সময় খাবারে লবণের ব্যবহার কম করুন।\n" +
"প্রতিদিন নির্দিষ্ট টাইমে ঘুমাতে যান এবং সকাল সকাল ঘুম থেকে উঠুন।\n" +
"সলিড ফ্যাট খাবার, যেমন- ফাস্টফুড, ঘি, মাখন, চিজ ইত্যাদি খাবার থেকে নিজেকে দূরে রাখুন।\n" +
"প্রতিদিন খাবারের মেনুতে সবজি ও মাছ রাখুন। এবং ফল খেতে ভুলবেন না।\n" +
"নিয়মিত ব্যায়াম করুন। বাইরে সম্ভব না হলে বাসাতেই ১৫ থকে ২০ মিনিট নিজে নিজে ব্যায়াম করুন। তাহলে আপনার ওজন নিয়ন্ত্রনে থাকবে।");;
		c1.add(jt);

		/*
                      
		 */
	}

	public static void main(String[] args) {
		healthTips ht = new healthTips();
		ht.setVisible(true);
		
	}

}
