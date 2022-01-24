package SUL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Study03 {
	public static void main(String[] args) {
		System.out.println("메인메소드가 시작되었습니다");
		//키보드로 부터 입력 받을수 있는 객체의 참조값을 kbd 라는 이름의 지역 변수에 담기
		InputStream kbd= System.in;
		InputStreamReader isr=new InputStreamReader(kbd);
		BufferedReader br= new BufferedReader(isr);
		
		try {
			System.out.print("문자열 (아무거나 여러글자 가능):");
			String line=br.readLine();
			System.out.println("line:"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인메소드가 종료됩니다.");
	}
}
