package com.jit.recursivestringreverse;

public class RecursiveStringReverse {

	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {

		String s = "Ramesh";

		System.out.println(recursiveMethod(s));

	}

}
