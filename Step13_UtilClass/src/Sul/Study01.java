package Sul;

import java.util.HashMap;
import java.util.Map;

public class Study01 {
	public static void main(String[] args) {
		//한명의 회원 정보라고 가정하자.
		int num=1;
		String name="김구라";
		String addr="노량진";
		boolean isMan=true;
		
		Map<String, Object> map1= new HashMap<String, Object>();
		map1.put("num", 1);
		map1.put("name","김구라");
		map1.put("addr", "노량진");
		map1.put("isMan", true);
		
		//map1  을 이용해서 "num" 이라는 키값으로 저장된 int 불러오기
		int a=(int)map1.get("num");
		int size=map1.size();
		map1.remove("addr");
		map1.clear();
		
	}
}
