package Sul;

import java.util.ArrayList;
import java.util.List;


public class Study02 {
	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		String n1=names.get(0);
		String n2=names.get(1);
		String n3=names.get(2);
		
		System.out.println(n1+n2+n3);
		
		
	}
}
