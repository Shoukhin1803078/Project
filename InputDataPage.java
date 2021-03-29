package javaapplication1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputDataPage extends JFrame {

	public static String s1 = "", s2 = "", s3 = "", s4 = "", s5;
	private Container c1;

	InputDataPage() {

		 // String s1 = "", s2 = "", s3 = "", s4 = "", s5;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 200, 600, 600);
		c1 = new Container();
		c1 = this.getContentPane();
		c1.setBackground(Color.green);
		c1.setLayout(null);

		Font f = new Font("ARIAL", Font.BOLD, 20);
		Font f1 = new Font("ELEPHANT", Font.ITALIC, 18);
		Font f2 = new Font("Gill Sans Ultra Bold Condensed", Font.ITALIC, 18);
		Font f3 = new Font("ELEPHANT", Font.ITALIC, 18);
		Font f4 = new Font("ELEPHANT", Font.ITALIC, 18);
		Cursor cu1 = new Cursor(Cursor.HAND_CURSOR);

		// 1st raw 
		JLabel jb1 = new JLabel();
		jb1.setOpaque(true);
		jb1.setBounds(10, 100, 200, 50);
		jb1.setText("Enter Your Name:");
		jb1.setFont(f1);
		jb1.setBackground(Color.yellow);
		c1.add(jb1);

		JTextField jf1 = new JTextField();
		jf1.setBounds(220, 100, 200, 50);
		jf1.setFont(f1);
		jf1.setBackground(Color.white);
		c1.add(jf1);

		jf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your name successfully saved");
				s1 = jf1.getText();
			}
		});

		JButton jbt1 = new JButton();
		jbt1.setBounds(430, 100, 75, 50);
		jbt1.setFont(f2);
		jbt1.setText("Ok");
		jbt1.setForeground(Color.BLUE);
		jbt1.setCursor(cu1);
		c1.add(jbt1);
		jbt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your name successfully saved");
				JOptionPane.showMessageDialog(null, "Your name successfully saved. Go to next step.", "Student Fitness Test ", JOptionPane.INFORMATION_MESSAGE);
				s1 = jf1.getText();
			}
		});

		// 2nd row
		JLabel jb2 = new JLabel();
		jb2.setOpaque(true);
		jb2.setBounds(10, 160, 200, 50);
		jb2.setText("Enter Your Age:");
		jb2.setFont(f1);
		jb2.setBackground(Color.yellow);
		c1.add(jb2);

		JTextField jf2 = new JTextField();
		jf2.setBounds(220, 160, 200, 50);
		jf2.setFont(f1);
		jf2.setToolTipText("years");
		jf2.setBackground(Color.white);
		c1.add(jf2);

		jf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your Age successfully saved");
				s2 = jf2.getText();
			}
		});

		JButton jbt2 = new JButton();
		jbt2.setBounds(430, 160, 75, 50);
		jbt2.setFont(f2);
		jbt2.setText("Ok");
		jbt2.setForeground(Color.BLUE);
		jbt2.setCursor(cu1);
		c1.add(jbt2);
		jbt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your age successfully saved");
				JOptionPane.showMessageDialog(null, "Your age successfully saved. Go to next step.", "Student Fitness Test ", JOptionPane.INFORMATION_MESSAGE);
				s2 = jf2.getText();
			}
		});

		//3rd row
		JLabel jb3 = new JLabel();
		jb3.setOpaque(true);
		jb3.setBounds(10, 220, 200, 50);
		jb3.setText("Enter Your Weight:");
		jb3.setFont(f1);
		jb3.setBackground(Color.yellow);
		c1.add(jb3);

		JTextField jf3 = new JTextField();
		jf3.setBounds(220, 220, 200, 50);
		jf3.setFont(f1);
		jf3.setToolTipText("kg");
		jf3.setBackground(Color.white);
		c1.add(jf3);

		jf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your Weight successfully saved");
				s3 = jf3.getText();
			}
		});

		JButton jbt3 = new JButton();
		jbt3.setBounds(430, 220, 75, 50);
		jbt3.setFont(f2);
		jbt3.setText("Ok");
		jbt3.setForeground(Color.BLUE);
		jbt3.setCursor(cu1);
		c1.add(jbt3);
		jbt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your Weight successfully saved");
				JOptionPane.showMessageDialog(null, "Your weight successfully saved. Go to next step.", "Student Fitness Test ", JOptionPane.INFORMATION_MESSAGE);
				s3 = jf3.getText();
			}
		});
		//4rth row

		JLabel jb4 = new JLabel();
		jb4.setOpaque(true);
		jb4.setBounds(10, 280, 200, 50);
		jb4.setText("Enter Your Height:");
		jb4.setFont(f1);
		jb4.setBackground(Color.yellow);
		c1.add(jb4);

		JTextField jf4 = new JTextField();
		jf4.setBounds(220, 280, 80, 50);
		jf4.setFont(f1);
		jf4.setToolTipText("feet");
		jf4.setBackground(Color.white);
		c1.add(jf4);

		JTextField jf5 = new JTextField();
		jf5.setBounds(330, 280, 90, 50);
		jf5.setFont(f1);
		jf5.setToolTipText("inch");
		jf5.setBackground(Color.white);
		c1.add(jf5);

		jf4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your Height in Feet successfully saved");
				s4 = jf4.getText();
			}
		});

		jf5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your Height in Inch  successfully saved");
				s5 = jf5.getText();
			}
		});

		JButton jbt4 = new JButton();
		jbt4.setBounds(430, 280, 75, 50);
		jbt4.setFont(f2);
		jbt4.setText("Ok");
		jbt4.setForeground(Color.BLUE);
		jbt4.setCursor(cu1);
		c1.add(jbt4);
		jbt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your Hight in Feet and Inch successfully saved");
				JOptionPane.showMessageDialog(null, "Your hight (feet  & inch ) successfully saved. Go to next step.", "Student Fitness Test ", JOptionPane.INFORMATION_MESSAGE);
				s4 = jf4.getText();
				s5 = jf5.getText();
			}
		});
		//5th raw

		JButton jbt5 = new JButton();
		jbt5.setBounds(150, 360, 300, 50);
		jbt5.setFont(f2);
		jbt5.setText("Saved My Data in File");
		jbt5.setForeground(Color.BLUE);
		jbt5.setCursor(cu1);
		c1.add(jbt5);
		
		
		jbt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Your all data successfully save on file ");
				try {
					
					File f1 = new File("DataSave.txt");
					f1.createNewFile();
					FileWriter fw = new FileWriter("C:/Users/User/Documents/NetBeansProjects/JavaApplication1/dist/DataSave.txt", true);
					BufferedWriter bf = new BufferedWriter(fw);
					bf.write("-------User Data------");
					bf.write("\n");
					bf.write("Name: " + s1);
					bf.write("\n");
					bf.write("Age: " + s2);
					bf.write("\n");
					bf.write("Weight: " + s3);
					bf.write("\n");
					bf.write("Hight(feet): " + s4);
					bf.write("\n");
					bf.write("Hight(inch): " + s5);
					bf.write("\n");
					//bf.write("BMI: " + bmiString);

					bf.write("\n\n");
					JOptionPane.showMessageDialog(null, "Your all data successfully saved on file. Go to next step.", "Student Fitness Test ", JOptionPane.INFORMATION_MESSAGE);
					bf.close();
				} catch (IOException ex) {

				}
			}
		});

		JButton jbt6 = new JButton();
		jbt6.setBounds(150, 420, 300, 50);
		jbt6.setFont(f2);
		jbt6.setText("Click Here to see Result");
		jbt6.setForeground(Color.BLUE);
		jbt6.setCursor(cu1);
		c1.add(jbt6);

		jbt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowData sd = new ShowData(s1, s2, s3, s4, s5);
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		InputDataPage inp1 = new InputDataPage();
		inp1.setVisible(true);

	}
}
