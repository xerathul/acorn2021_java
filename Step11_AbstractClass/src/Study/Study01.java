package Study;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class Study01 {
	public static void main(String[] args) {
		Weapon w1= new MyWeapon();
		w1.prepare();
		w1.attack();
		
		Weapon w=null;
		w.attack();
	}
}
