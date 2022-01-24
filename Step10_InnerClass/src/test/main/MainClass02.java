package test.main;

import test.mypac.MyUtil;
import test.mypac.MyUtil.User;

public class MainClass02 {
	public static void main(String[] args) {
		MyUtil mu= new MyUtil();
		User u= mu.new User();
		u.doSomething();
	}
}
