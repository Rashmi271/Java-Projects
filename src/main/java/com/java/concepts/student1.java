package com.java.concepts;

public class student1 {

	public void student(int id) {
		
		System.out.println("Student id is "+id);		
	}

	public void student(String name,char grade) {
		
		System.out.println("Student grade and name are "+name + "." +grade);
		
	}
	public static void main(String[] args) {
		 student1 st = new student1();
		 st.student(111);
		 st.student('G',"Rashmi");
		}

	private void student(char grade, String name) {
		
		System.out.println("Student grade and name are "+grade + "." +name);
	}

}
