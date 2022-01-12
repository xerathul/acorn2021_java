package Study.main;

import test.mypac.Car;

public class study {
	public static void main(String[] args) {
		//Car type 의 참조값을 담을수 있는 빈 지역 변수 car1 만들기 
		Car car1=null;
		//Car 클래스로 객체를 생성(new)하고 그 생성된 객체의 참조값을 car1 에  대입하기
		car1=new Car();
		//car1 지역 변수에 있는 참조값을 이용해서 메소드 호출하기 
		car1.drive();
		car1.hotHip();
		
		//MainClass02
		
		//Car 객체를 생성해서 참조값을 car1 이라는 지역 변수에 담기
		Car car2=new Car();
		//car1 안에 들어있는 참조값을 이용해서 drive() 메소드 호출하기
		car2.drive();
		//car1 안에 들어있는 참조값을 이용해서 name 이라는 필드에 String type 참조값 넣어주기
		car2.name="mustang";
		//car1 안에 들어있는 참조값을 이용해서 cc 라는 필드에 int type value 넣어주기
		car2.cc=10;
		
		
	}
}
