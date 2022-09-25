package com.upskillloops;

public class Constructorpractice {
	
	String studentname;
	int studentage;
	
	public Constructorpractice(String name, int age){
		studentname = name;
		studentage = age;
				
	}
	
		public static void main(String[] args) {
			Constructorpractice obj = new Constructorpractice  ("Zahid",42);
			System.out.println(obj.studentname);
			System.out.println(obj.studentage);
		
				

			

			
		
	}

}
