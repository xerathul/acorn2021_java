package Sul;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Study1_1 {
public static void main(String[] args) {
	/*
	 *  키보드로 부터 문자열을 입력 받기 위한 Scanner 객체를 생성한다.
	 *  생성자의 인자로는 키보드로 부터 입력 받을수 있는 InputStream type 
	 *  객체를 전달해 주어야 한다. 
	 *  해당객체는 System 클래스에 static final 상수 in 이라는 필드에
	 *  참조값이 미리 준비 되어 있으므로 그값을 생성자에 전달하면 된다. 
	 */
//	Scanner scan= new Scanner(System.in);
//	System.out.println("문자열 입력:");
//	
//	String line=scan.nextLine();
//	System.out.println("입력한 내용: "+line);
//	
	//MainClass02 HashMap
	
	Map<String, Object> map1= new HashMap<>();
	
	map1.put("num", 1);
	map1.put("name", "김구라");
	map1.put("addr", "노량진");
	map1.put("isMan", true);
	
	int num= (int)map1.get("num");
	String name=(String)map1.get("name");
	System.out.println(num+name);
	
	//MainClass03 ArrayList
	List<String> list= new ArrayList<>();
	list.add("sul");
	list.add("minsu");
	list.add("ujin");
	
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	
	//MainClass05 ArrayList활용
	/*  1. 문자열을 저장할수 있는 ArrayList 객체를 생성하고
	 *  2. Scanner 객체를 이용해서 친구 이름을 반복문 돌면서 5개 입력 받아서 
	 *     위에서 생성한 ArrayList 객체에 순서대로 저장을 하세요.
	 *  3. ArrayList 객체에 저장된 내용을 반복문 돌면서 순서대로 아래와 같은 형식으로 
	 *     콘솔창에 출력해 보세요.
	 *     
	 *  0 번째 친구 이름 : 김구라
	 *  1 번째 친구 이름 : 해골
	 *  2 번째 친구 이름 : 원숭이
	 *  3  .
	 *  4  .
	 */
	List<String> friends=new ArrayList<>();
	
	Scanner scan= new Scanner(System.in);
	
	for (int i = 0; i < 5; i++) {
		System.out.println("친구이름을 입력하세요");
		String add= scan.nextLine();
		friends.add(add);
	}
	for (int i = 0; i < friends.size(); i++) {
		System.out.println(i+"번째 친구 이름 : "+friends.get(i));
	}
	

	
	
	
	
	}
}
