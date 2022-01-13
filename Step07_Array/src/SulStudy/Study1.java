package SulStudy;

import test.mypac.Car;
import test.mypac.Rect;

public class Study1 {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50,60,70,80,90,100};
		//배열에 저장된 item 을 순서대로 하나씩 콘솔창에 모두 출력해 보세요.
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		String[] names= {"김구라","해골","원숭이","주뎅이","덩어리"};
		//names 배열에 저장된 문자열을 순서대로 콘솔창에 출력하기
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//1. Car type 을 담을수 있는 방3개짜리 배열객체를 생성한다음 
		//참조값을 cars 라는 지역 변수에 담아 보세요.
		Car[] cars=new Car[3];
		//2. cars  배열에 Car 객체를 생성해서 순서대로 담아 보세요. (총3개)
		/*
		cars[0]=new Car();
		cars[1]=new Car();
		cars[2]=new Car();
		*/
		for (int i = 0; i < cars.length; i++) {
			cars[i]=new Car();
		}
		
		//3. cars  배열에 저장된 Car 객체의 참조값을 순서대로 참조해서 
		//.drive() 메소드를 호출해 보세요. (저는 콘솔창에 무언가 출력하라고 하지 않았습니다)
		/*
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		*/
		for (int i = 0; i < cars.length; i++) {
			cars[i].drive();
		}
		
		/* 1. 
		 *  가로 세로의 길이가  100 과 100
		 *  가로 세로의 길이가  200 과 100
		 *  가로 세로의 길이가  300 과 200
		 *  인 사각형 3개가 있다. 
		 *  
		 *  각각에 대응되는 Rect 객체를 3개 생성해서 참조값을
		 *  rect1, rect2, rect3 라는 지역 변수에 담아 보세요.
		 */
		Rect rect1=new Rect(100,100);
		Rect rect2=new Rect(200,100);
		Rect rect3=new Rect(300,200);
		
		
		//2. rect1, rect2, rect3 에 담긴 참조값을 배열에 순서대로 담아 보세요.
		// 배열의 참조값이 담길 지역 변수의 이름은 rects 로 선언하세요.
		//Rect[] rects= {rect1, rect2, rect3}; or
		Rect[] rects= {rect1,rect2,rect3};
		
		//3. rects 배열에 담긴 값을 순서대로 참조해서 .getArea() 메소드를 호출한다음
		// 리턴되는 값을 이용해서 사각형의 넓이를 순서대로 콘솔창에 출력해 보세요.
		int a=rects[0].getArea();
		System.out.println(rects[0]);
		System.out.println(a);
		
		for (int i = 0; i < rects.length; i++) {
			System.out.println(rects[i].getArea());
		}
		
		
	}
}
