package Sul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Study05 {
	private static final int String = 0;

	public static void main(String[] args) {
		/*
		 *  1. 3명의 회원 정보를 HashMap 객체를 3개 생성해서 각각 담아 보세요.
		 *     번호 => "num"  이라는 키값 으로 정수 저장
		 *     이름 => "name" 이라는 키값 으로 문자열 저장
		 *     주소 => "addr" 이라는 키값 으로  문자열 저장
		 *     
		 *  2. 위에서 생성한 Map 을 담을 ArrayList 객체를 생성하고 생성된 참조값을
		 *     members 라는 이름의 지역 변수에 담아 보세요.
		 *     
		 *  3. members 에 회원 정보가 담긴 Map 객체의 참조값을 순서대로 담아 보세요.
		 *  4. 반복문 돌면서 members 에 담긴 내용을 아래와 같은 형식으로 출력해 보세요.
		 *  
		 *  번호 : 1, 이름 : 김구라, 주소 : 노량진
		 *  번호 : 2, 이름 : 해골, 주소 : 행신동
		 *  .
		 */
		HashMap<String, Object> Map= new HashMap<String, Object>();
		Map.put("num", 1);
		Map.put("name", "김구라");
		Map.put("addr", "행신동");
		
		HashMap<String, Object> Map2= new HashMap<String, Object>();
		Map2.put("num", 2);
		Map2.put("name", "해골");
		Map2.put("addr", "노량진");
		
		List<HashMap<String, Object>> members=new ArrayList<>();
		
		members.add(Map);
		members.add(Map2);
		
		for(HashMap<String, Object> tmp:members) {
			int num=(int)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			System.out.println("번호: "+num+" 이름: "+name+" 주소: "+addr);
		}
		
	}
}
