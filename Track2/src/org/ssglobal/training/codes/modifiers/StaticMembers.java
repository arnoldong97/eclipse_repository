package org.ssglobal.training.codes.modifiers;

public class StaticMembers {

	public static double pie = 3.14;
	public double e = 2.17;
	
	public static boolean even(int value) {
		StaticMembers sm = new StaticMembers();
		sm.e = 5.17;
		
		int x = 0;
		
		if (true) {
			int y = 5;
		}
		return value % 2 == 0;
	}
	
	public boolean isZero(int value) {
		StaticMembers sm1 = new StaticMembers();
		StaticMembers sm2 = new StaticMembers();
		StaticMembers sm3 = new StaticMembers();
		sm1.even(9);
		sm2.even(10);
		sm3.even(12);
		return value == 0;
	}
}
