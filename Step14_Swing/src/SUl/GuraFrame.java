package SUl;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GuraFrame extends JFrame implements ActionListener{
	//Strinf type 을 인자로 전달받는 생성자
	public GuraFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		JButton runBtn = new JButton("달리기");
		
		this.add(runBtn);
		
		runBtn.addActionListener (this);
	}

	public static void main(String[] args) {
		GuraFrame f= new GuraFrame("Teacher's Frame");
		f.setBounds(100, 100, 500, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "달려달려!");
		
	}
}
