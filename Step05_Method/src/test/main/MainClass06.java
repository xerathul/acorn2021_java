package test.main;

import java.util.Random;
import java.util.stream.IntStream;

public class MainClass06 {
	public static void main(String[] args) {
		Random ran=new Random();
		for (int i = 0; i < 100; i++) {
			int r1=ran.nextInt(45)+1;
			System.out.println(r1);
			
		}
	
	}
}
