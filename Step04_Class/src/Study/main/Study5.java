package Study.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;
import test.mypac.Car;
import test.mypac.MemberDto;
import test.mypac.MyUtil;

public class Study5 {
	public static void main(String[] args) {
		//Car type 의 참조값을 담을수 있는 빈 지역 변수 car1 만들기 
		Car car1=new Car();
		//Car 클래스로 객체를 생성(new)하고 그 생성된 객체의 참조값을 car1 에  대입하기
		car1.name="mustang";
		car1.cc=1;
		//car1 지역 변수에 있는 참조값을 이용해서 메소드 호출하기
		car1.drive();
		car1.hotHip();
		
		//MyUtil 클래스에 정의된 static 메소드 호출하기
		MyUtil.playMusic();
		//MyUtil 클래스에 정의된 static 필드 참조해서 값 대입하기 
		MyUtil.owner="sul";
		System.out.println(MyUtil.owner);
		
		//MemberDto 객체 생성해서 참조값을 dto1 이라는 이름의 지역변수에 담기 
		MemberDto dto1= new MemberDto();
		dto1.setAddr("wire");
		dto1.setName("sul");
		dto1.setNum(1);
		
		MemberDto dto2= new MemberDto(2, "sul", "addr");
		
		/*
		 *  [ 프로그래밍의 목적 ]
		 *  
		 *  test.mart 페키지 안에 있는 클래스를 활용해서...
		 *  
		 *  1. 게임을 한다.
		 *  2. oli999@naver.com 으로 이메일을 보낸다.
		 */
		Computer c1= new Computer(new Cpu(), new Memory(), new HardDisk());
		c1.playGame();
		c1.sendEmail("oli999@naver.com");
		
	}
}

