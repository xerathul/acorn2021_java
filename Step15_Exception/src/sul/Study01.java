package sul;

import java.util.Scanner;

public class Study01 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자 입력:");
		
		String inputNum=scan.nextLine();
		try {
			double num= Double.parseDouble(inputNum);
			double result= num+100;
			
			System.out.println("입력한 숫자+100 : "+result);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자로 입력하라규");
			String error=e.getMessage();
			System.out.println(error);
			e.printStackTrace();
		}
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
