package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudyFrame extends JFrame{
	public StudyFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		JButton menuBtn=new JButton("오늘뭐먹지?");
		JButton hungryBtn= new JButton("배고파?");
		
		add(menuBtn);
		add(hungryBtn);
		
		menuBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(StudyFrame.this, "나도 몰랑");
			}
		});
		hungryBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(StudyFrame.this, "나두!");
		});
	}

	public static void main(String[] args) {
		StudyFrame f= new StudyFrame("main");
		f.setBounds(100,100,500,300);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
