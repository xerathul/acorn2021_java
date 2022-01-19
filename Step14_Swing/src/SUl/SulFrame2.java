package SUl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SulFrame2 extends JFrame implements ActionListener {
	
	JTextField inputText;
	
	public SulFrame2(String title) {
		super(title);
		//레이아웃 메니저 설정 
		setLayout(new BorderLayout());
		
		//텍스트필드와 버튼객체를 만들어서 
		
		this.inputText=new JTextField(10); //참조값을 필드에 저장 
		JButton sendBtn=new JButton("전송");
		
		//페널 객체 생성한 다음 
		JPanel topPanel=new JPanel();
		//페널에 텍스트필드와 버튼을 추가하고 
		topPanel.add(inputText);
		topPanel.add(sendBtn);
		//페널의 배경색지정
		
		
		//페널 째로 프레임의 북쪽에 배치하기
		add(topPanel, BorderLayout.NORTH);
		add(topPanel,"South");
		
		//버튼에 리스너 등록하기
		sendBtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
