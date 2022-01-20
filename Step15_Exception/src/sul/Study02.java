package sul;

import java.util.Random;

public class Study02 extends RuntimeException{
	//MainClass07
	
	public Study02(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	public static void main(String[] args) {
		System.out.println("Main method is started");
		
		Random ran =new Random();
		int ranNum= ran.nextInt(3);
		
		if (ranNum==0) {
			throw new Study02("배고파ㅠ");
		}
		System.out.println("Main method is finished");
	}
}
