package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass04 {
	public static void main(String[] args) {
		//정수를 저장할 ArrayList 객체를 생성해서 참조값을 nums 라는 지역변수에 담아 보셈
		List<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		nums.get(0);
		//실수를 저장할 ArrayList 객체를 생성해서 참조값을 nums2 라는 지역변수에 담아 보셈
		List<Double> nums2= new ArrayList<Double>();
		nums2.add(1.0);
		nums2.add(1.1);
		nums2.add(1.2);
		
		List<String> s1= new ArrayList<>();
		s1.add("원숭이");
		
	}
}






