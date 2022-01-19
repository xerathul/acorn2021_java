package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StudyFrame3 extends JFrame{
	 ActionListener listener=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String command=e.getActionCommand();
			if(command.equals("send")) {
				
			}
			
			
		}
	};

	public StudyFrame3(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		JButton sendBtn=new JButton("전송");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");
		
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);
		
		sendBtn.addActionListener(listener);
		updateBtn.addActionListener(listener);
		deleteBtn.addActionListener(listener);
		
	}

	public static void main(String[] args) {
		StudyFrame3 f= new StudyFrame3("MainFrame");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
