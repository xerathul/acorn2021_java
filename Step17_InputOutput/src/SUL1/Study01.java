package SUL1;

import java.io.IOException;
import java.io.InputStream;

public class Study01 {
	public static void main(String[] args) {
		System.out.println("메인메소드가 시작되었습니다");
		
		
		try {
			InputStream kbd=System.in;
			System.out.println("문자 1개 입력:");
			int code= kbd.read();
			
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인메소드가 종료됩니다.");
		
	}
}
