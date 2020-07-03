package com.java.concepts;

public class BankDetails extends Bank {

	@Override
	public void HomeLoan() {
		
     System.out.println("Home loan 9%");
		
	}

	@Override
	public void PersonalLoan() {
		
		 System.out.println("Personal Loan 19%");	
		
	}
	
	public static void main(String[] args) {
		BankDetails b = new BankDetails();
		b.HomeLoan();
		b.EducationLoan();
		b.PersonalLoan();
		
	}

}
