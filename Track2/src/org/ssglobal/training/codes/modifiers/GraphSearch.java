package org.ssglobal.training.codes.modifiers;

public class GraphSearch extends MyLog {

	public void plot() {
		GraphMe gm = new GraphMe();
		gm.scatter(); // using objects as utility
		//scatter(); // sharing or reusing method
		
		//MyLog log = new MyLog(); // cannot be instantiated because abstract
		
		computeLogBase10();
	}
	
}
