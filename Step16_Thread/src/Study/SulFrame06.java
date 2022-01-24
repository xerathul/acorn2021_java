package Study;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.main.MainFrame06;

public class SulFrame06 extends JFrame implements ActionListener{
	public SulFrame06(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "알림!");
		Runnable downTask =new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					for (int i = 0; i <= 100; i++) {
						System.out.println(i+"%");
						Thread.sleep(100);
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		new Thread(downTask).start();
	}
	public static void main(String[] args) {
		SulFrame06 f=new SulFrame06("메인 프레임02");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
