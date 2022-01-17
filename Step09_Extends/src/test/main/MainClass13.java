package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass13 {
	public static void main(String[] args) {
		usePhone(new SmartPhone());
		
		HandPhone p1=new HandPhone() {
			@Override
			public void takePicture() {
				System.out.println("taking a picture");
			}
		};
		p1.takePicture();
	}
	public static void usePhone(Phone p) {
		p.call();
	}
}
