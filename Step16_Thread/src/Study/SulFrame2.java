package Study;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SulFrame2 extends JFrame implements ActionListener{

	public SulFrame2(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn= new JButton("알림");
		btn.addActionListener(this);
		add(btn, BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "Two threads are started");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					for (int i = 0; i < 20; i++) {
						System.out.println("안녕하세요");
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO: handle exception
				}	
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					for (int i = 0; i < 4; i++) {
						System.out.println("반갑습니다");
						Thread.sleep(5000);
					}	
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}
	public static void main(String[] args) {
		SulFrame2 f= new SulFrame2("Sul's Frame");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
