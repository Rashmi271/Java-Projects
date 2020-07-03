package com.java.concepts;

import java.util.Scanner;

public class Scanner_Concepts {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full name/sentence");
		String fullname = sc.nextLine();
		System.out.println(fullname);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("You have entered the number " +number);
		
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("You have entered the name " +name);
	}

}
