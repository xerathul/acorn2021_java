package Sul.study;

import test.mypac.House;
import test.mypac.MyObject;
import test.mypac.Phone;

public class Study2 {
	public static void main(String[] args) {
		//1. MyObject 객체를 생성해서 참조값을 m1 이라는 지역 변수에 담아 보세요.
		MyObject m1=new MyObject();
		//2. m1 안에 들어 있는 참조값을 이용해서 3 개의 메소드를 모두 호출해 보세요.
		m1.walk();
		m1.getNumber();
		m1.getGreeting();
		//3. m1 안에 들어 있는 참조값을 이용해서 getNumber() 메소드를 다시 호출하고
		// 리턴되는 값을 a 라는 이름의 지역 변수에 담아 보세요.
		int a=m1.getNumber();
		System.out.println(a);
		//4. m1 안에 들어 있는 참조값을 이용해서 getGreegint() 메소드를 다시 호출하고
	    //리턴되는 값을 b 라는 이름의 지역 변수에 담아 보세요.
		String b=m1.getGreeting();
		System.out.println(b);
		//House 클래스를 이용해서 여러분들이 집에서 편한하게 3번 쉬어 보세요.
		//집에서 100번 쉬어 보세요.
		House h1=new House();
		h1.relax("sul");
		for (int i = 0; i < 100; i++) {
			h1.relax("sul");
		}
		
		//MyObject 객체를 생성해서 참조값을 m1  이라는 이름의 지역변수에 대입해 보세요.
		//m1 에 있는 참조값을 이용해서 House 객체의 참조값을 얻어와서 myHome 이라는
		//이름의 지역변수에 담아 보세요.
		House myHome=m1.getHouse();
		System.out.println(myHome);
		//myHome 안에 있는 참조값을 이용해서 집에서 3번 쉬어 보세요.
		myHome.relax("Sul");
		//MyObject 클래스에 있는 usePhone() 메소드를 호출해 보세요.
		m1.usePhone(new Phone());
		//1. MyObject 클래스의 callPhone()  메소드를 호출해 보세요.
		m1.callPhone(new Phone());
		//2. MyObject  클래스의 buyHouse() 메소드를 호출하고 
		// 리턴되는 참조값을 myHome 이라는 이름의 지역 변수에 담아 보세요.
		House myHome1=m1.buyHouse();
	}
}
