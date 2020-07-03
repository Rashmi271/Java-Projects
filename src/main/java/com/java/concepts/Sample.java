package com.java.concepts;

public class Sample {

	public Sample() {
		System.out.println("default constructor");
	}
	
	public Sample(int id) {
		System.out.println("parametrized constructor");
		System.out.println("Student id is " + id);
	}
	
public static void main(String[] args) {
	
	Sample sd = new Sample();
	Sample sd1 = new Sample(27);
	
     }

}
