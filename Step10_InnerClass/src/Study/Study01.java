package Study;

import test.mypac.MyUtil;
import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;

public class Study01 {
	public static void main(String[] args) {
		/*
		 *  Zoo 클래스에 있는 getMonkey() 메소드를 호출해서
		 *  리턴되는 참조값을 m1 이라는 지역 변수에 담아 보세요.
		 */
		Zoo z=new Zoo();
		Monkey m1=z.getMonkey();
		MyUtil u=new MyUtil();
		
	}
}
