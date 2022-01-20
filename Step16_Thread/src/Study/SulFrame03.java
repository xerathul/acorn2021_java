package Study;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SulFrame03 extends JFrame implements ActionListener{

	public SulFrame03(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn =new JButton("알림!");
		btn.addActionListener(this);
		add(btn, BorderLayout.NORTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "알림이지롱");
		
		Thread t=new Thread() {
			@Override
			public void run() {
				try {
					System.out.println("오래걸리는 작업 시작");
					Thread.sleep(5000);
					System.out.println("작업끝");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t.start();
		
	}
	public static void main(String[] args) {
		SulFrame03 f= new SulFrame03("Sul's Frame03");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		SulFrame03 f2= new SulFrame03("Sul's Second Frame03");
		f2.setBounds(100, 100, 500, 300);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setVisible(true);
	}
}
