package com.java.concepts;

public class VariablesTypes {
	int a=90;
	static int c=80;
	
	public void test() {
		int b = 30;
		System.out.println(b);
	}
public static void main(String[] args) {
	VariablesTypes v = new VariablesTypes();
	v.test();
	System.out.println(v.a);
	System.out.println(c);
	
}
}
