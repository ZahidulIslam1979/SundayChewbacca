package com.upskill.java_1;

public class Assignment_7 {
	/* Problem2. A school conducts a 100 mark exam for its student and grades them as follows:  
	Grade:
		Grade A: Marks>=90
		Grade B: Marks>=80-89
		Grade C: Marks>=70-79
		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60
	Write a java program to calculate the grade for a student in a method passing parameter for grade 
	to display every grade type, using if..else statement. */

	public static int  Marks = 59;

	public static void main(String[] args) {
		ConditionalStatement1();

	}
	
	public static void ConditionalStatement1(){                

		if (Marks>=90 && Marks<=100){
			System.out.println("Grade A");}
		else if (Marks>=80 && Marks<=89){
			System.out.println("Grade B");}
		else if (Marks>=70 && Marks<=79){
			System.out.println("Grade C");}
		else if (Marks>=60 && Marks<=69){
			System.out.println("Grade D");}
		else if (Marks<60){
			System.out.println("Fail");}
		else {
			System.out.println("Invalid Marks");}


		

		
	}
	
	
	}

