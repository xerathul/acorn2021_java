package SUL1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Study02 {
	public static void main(String[] args) {
		System.out.println("메인메소드가 시작되었습니다");
		//키보드로 부터 입력 받을수 있는 객체의 참조값을 kbd 라는 이름의 지역 변수에 담기
		InputStream kbd=System.in;
		InputStreamReader isr= new InputStreamReader(kbd);
		
		try {
			System.out.println("1글자 입력(한글가능)");
			int code=isr.read();
			//code 값을 char을 이용해 문자열로 출력하기
			char ch=(char)code;
			System.out.println("char:"+ch);
			System.out.println("code:"+code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
