package Study;

import test.mypac.Weapon;

public class Study03 {
	public static void main(String[] args) {
		//Anonymous inner Class 
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("공격해!");
			}
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("1회성 공격");
			}
		});
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
