package com.java.concepts;

public class BankDetails1 implements Bank1{

	public void HomeLoan() {
		
	     System.out.println("Home loan 6%");
			
	}

	public void PersonalLoan() {
		
		System.out.println("Personal Loan 16%");	
	}
	
	public static void main(String[] args) {
		
		BankDetails1 b = new BankDetails1();
		b.HomeLoan();
		//b.EducationLoan();
		b.PersonalLoan();
	}
	
}
