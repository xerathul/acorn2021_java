package Sul;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Study06 {
	public static void main(String[] args) {
		Set<Integer> set1= new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(40);
		System.out.println(set1);
		
		boolean isContain1 =set1.contains(10);
		boolean isContain2 = set1.contains(20);
		
		boolean isEmpty= set1.isEmpty();
		
		int size= set1.size();
		
		
		Iterator<Integer> it = set1.iterator();
		System.out.println(it);
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			
		List<String> list1= new ArrayList<>();
		list1.iterator();
		}
	}
}
