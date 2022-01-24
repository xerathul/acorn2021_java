package SUl;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class SulFrame extends JFrame{
	public SulFrame(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		JButton okBtn= new JButton("ok");
		JButton cancelBtn= new JButton("cancel");
		
		add(okBtn);
		add(cancelBtn);
		
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(SulFrame.this, "confirmed!");
				
			}
		});
		
		cancelBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(SulFrame.this, "Are you sure?");
		});
		
	}
	
	public static void main(String[] args) {
		SulFrame s= new SulFrame("Sul's Frame");
		s.setBounds(100,100,500,300);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setVisible(true);
	}
}
