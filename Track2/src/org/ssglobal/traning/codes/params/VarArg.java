package org.ssglobal.traning.codes.params;

public class VarArg {

	public void printNums(int... nums) {
		if (nums.length == 0) {
			System.out.println("Empty list");
		} else {
			for (int lookup: nums) {
				System.out.println(lookup);
			}
		}
	}
	
	public void acceptComplexData(int x, float... y) {
		
	}

}
