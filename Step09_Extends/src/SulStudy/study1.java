package SulStudy;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class study1 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 참조값을 부모type 지역변수에 대입
		Object p1= new HandPhone();
		
		// 대입연산자의 우측을 Phone type 으로 casting(형변환) 해서
		// p1 안에 있는 참조값을 Phone type 변수 p2 에 대입하기
		Phone p2= (Phone)p1;
		
		// p1 에 있는 값을 HandPhone type  으로 casting 해서
		// HandPhone type  변수 p3 에 대입
		HandPhone p3= (HandPhone)p1;
		p3.takePicture();
	}
}
