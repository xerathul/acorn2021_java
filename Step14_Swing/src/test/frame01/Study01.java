package test.frame01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Study01 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("Sul's Frame");
		f.setSize(600,400);
		f.setLocation(100, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		JButton btn= new JButton("눌러바");
		btn.setBounds(50,50,100,40);
		f.add(btn);
		
		f.setVisible(true);
		
		ActionListener listener =new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "왜눌러?");
			}
		};
		
		btn.addActionListener(listener);
		
		JButton btn2=new JButton("merong");
		
		btn2.setBounds(300,50,100,40);
		f.add(btn2);
		
		btn2.addActionListener((e)->{
			JOptionPane.showMessageDialog(f, "메렁");
		});
	}
}
