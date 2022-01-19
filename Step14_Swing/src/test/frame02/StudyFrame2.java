package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudyFrame2 extends JFrame{
	 ActionListener Listener1= new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(StudyFrame2.this, "ㅠㅠ");
		}
	
	};
	ActionListener Listener2= (e)->{
		JOptionPane.showMessageDialog(StudyFrame2.this, "공부더 해야게따");
	};

	public StudyFrame2(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		JButton btn1= new JButton("자바 어렵니?");
		JButton btn2= new JButton("자바스크립트는?");
		
		add(btn1);
		add(btn2);
		
		btn1.addActionListener(this.Listener1);
		btn2.addActionListener(this.Listener2);
	}

	public static void main(String[] args) {
		StudyFrame2 f= new StudyFrame2("Main Frame");
		f.setBounds(100,100,500,300);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
