package Study.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;
import test.mypac.MemberDto;
import test.war.Marine;
import test.war.Pentagon;

public class Study3 {
	public static void main(String[] args) {
		//MemberDto 객체 생성해서 참조값을 dto1 이라는 이름의 지역변수에 담기 
		MemberDto dto1=new MemberDto(1,"김구라","노량진");
		
		MemberDto dto2=new MemberDto();
		dto2.setNum(2);
		dto2.setName("이슬");
		dto2.setAddr("위례");
	
		/*
		 *  [ 프로그래밍의 목적 ]
		 *  
		 *  1. 사령부에서 전쟁을 선언하고
		 *  2. 마린을 움직여서
		 *  3. 마린으로 공격하고
		 *  4. 사령부에서 전쟁을 종료 
		 */
		
		Pentagon.startWar();
		Marine m1 = new Marine();
		m1.move();
		m1.attack();
		Pentagon.endWar();
		
		/*
		 *  [ 프로그래밍의 목적 ]
		 *  
		 *  test.mart 페키지 안에 있는 클래스를 활용해서...
		 *  
		 *  1. 게임을 한다.
		 *  2. oli999@naver.com 으로 이메일을 보낸다.
		 */
		Computer c1=new Computer(new Cpu(), new Memory(), new HardDisk());
		c1.playGame();
		c1.sendEmail("oli999@naver.com");
		
		Cpu c= new Cpu();
		Memory m=new Memory();
		HardDisk h=new HardDisk();
		
		Computer c2=new Computer(c,m,h);
		c2.playGame();
		c2.sendEmail("ini2854@naver.com");
		
		
	}
}
