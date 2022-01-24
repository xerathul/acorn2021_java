package Study;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SulFrame extends JFrame implements ActionListener{

	public SulFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn= new JButton("알림띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "알립입니당");
		try {
			System.out.println("10초가 걸리는 작업 시작");
			Thread.sleep(10000);
			System.out.println("작업 끝");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("actionPerformed() returned");
	}
	
	public static void main(String[] args) {
		SulFrame f=new SulFrame("Main Frame");
		f.setBounds(100,100,500,300);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
