package Sul;

import test.mypac.Calculator;

public class Study02 {
	public static void main(String[] args) {
		Calculator c1= new Calculator() {
			@Override
			public double exec(double a, double b) {
				return a+b;
			}
		};
		
		Calculator add=(double a, double b)->{
			return a+b; 
		};
		Calculator add2=(a,b)->a+b;
		Calculator multi=(a,b)->a*b;
		
		useCalculator(add);
		useCalculator(multi);
	}
	public static void useCalculator(Calculator cal) {
		double result= cal.exec(10, 20);
		System.out.println(result);
	}
}
