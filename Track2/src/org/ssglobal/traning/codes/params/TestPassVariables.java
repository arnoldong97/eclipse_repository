package org.ssglobal.traning.codes.params;

public class TestPassVariables {

	public static void main(String[] args) {

		PassVariables pv = new PassVariables();
		
		// Primitive Var
		int testX = 10;
		System.out.format("This is the original num: %d. \n", testX);
		pv.passPrimitive(testX);
		System.out.format("This is new num: %d. \n", testX);
		
		// [0000555FFAB]testSb -> [123456644ABCD] ==> 123456644ABCD("Manila")
		// Reference Var
		StringBuilder testsb = new StringBuilder("Manila"); // [123456644ABCD]("Manila")
		System.out.format("This is the original sb is %s. \n", testsb);
		pv.passRefVar(testsb);
		System.out.format("This is the new sb is %s. \n", testsb);
		
		String testStr = new String("Manila");
		System.out.format("This is the original testStr is %s. \n", testStr);
		pv.passStrVal(testStr); // no passing of address
		System.out.format("This is the new sb is %s. \n", testStr);		
		
	}

}
