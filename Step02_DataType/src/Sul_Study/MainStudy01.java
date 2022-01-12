package Sul_Study;

public class MainStudy01 {
	public static void main(String[] args) {
		
		//MainClass04
		
		/*  1. 각각의 점수를 지역변수 eng, kor, math 에 대입해 보세요.
		 *  영어점수 : 100
		 *  국어점수 : 100
		 *  수학점수 : 90 
		 */
		
		int eng =100;
		int kor =100;
		int math =90;
		
		// 2. eng, kor, math 세 점수의 합을 구해서 sum 이라는 이름의 지역 변수에 담아 보세요.
		
		int sum = eng+kor+math;
		
		// 3. eng, kor, math 의 평균값을 구해서 ave  라는 이름의 지역 변수에 담아 보세요.
		// int type  과 int type 을 연산하면 결과는 int type 만 나온다.
		// 만일 정확한 실수 값을 얻어내고 싶으면 연산에 참여하는 데이터 중에 
		// 어느 하나가 실수 type 이 되어야 실수 type 이 결과로 나온다. 
		
		double ave = (double)sum/3;
		
		System.out.println(ave);
		
		
		//mainClass05
		//논리형 데이터
		
		boolean isRun=true;
		if(isRun) {
			System.out.println("running!");
		}
		// 10>1 의 결과값을 isGreater 라는 이름의 지역 변수에 담아 보세요.
		boolean isGreater = 10>1;
		// true || false 의 결과값을 result 라는 이름의 지역 변수에 담아 보세요.
		boolean result = true||false;
		
		//MainClass06-문자형(char) type
		
		char ch1='a';
		char ch2='b';
		char ch3='가';
		char ch4='나';
		char ch5='@';
		
		//정수값에 1:1로 대응되는 char 존재
		int c1=ch1;
		int c2=ch2;
		int c3=ch3;
		int c4=ch4;
		int c5=ch5;
		
		char result1=96;
		char result2=97;
		char result3=98;
		
		//MainClass07
		//String type 참조데이처 type 변수에는 참조값(id) 값이 들어있다
		
		// "김구라" 라는 String type 참조값을 name  이라는 지역변수에 대입 
		String name="김구라";
		// name 안에 들어 있는 참조값을 myName 이라는 새로운 변수에 대입
		String myName =name;
		// "원숭이" 라는 String type 참조값을 name 에 덮어쓰기(새로대입)
		name="원숭이";
		// String type 참조값이 들어 갈수 있는 지역변수 name 을 빈상태로 만들기 
		// null 은 참조 데이터 type 이 들어 갈수 있는 빈 공간을 의미한다. 
		name=null;
		
	}
}
