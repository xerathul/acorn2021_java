package SUL1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Study04 {
	public static void main(String[] args) {
		//콘솔창에 출력할수 있는 객체의 참조값을 ps 라는 지역 변수에 담기
		PrintStream ps=System.out;
		//학습을 위해서 PrintStream 객체를 부모type OutputStream 변수에 담기
		OutputStream os=ps;
		OutputStream os1=System.out;
		
		try {
			os.write(65);
			os1.write(66);
			os.write(67);
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
