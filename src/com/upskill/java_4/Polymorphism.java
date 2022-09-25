package com.upskill.java_4;

import com.upskill.java_2.MymethodType;

public class Polymorphism extends  MymethodType{

	public static void main(String[] args) {
	
		car();
		car(4);
		car(2,4);
		car("Red");
		weeklyIncomeStatic1();
		bus();
		
	}

		public static void car(){
		System.out.println("My car is Audi !");
		}
		
		public static void bus(){
		System.out.println("My bus is Scania  !");	
		}
		
		
		public static void car(int door){
		System.out.println("My car is Audi, it has door:"+ door);
		}
		
		public static void car(int door,int wheel){
		System.out.println("My car is Audi, it has door:"+ door+ "it has wheel:" +wheel);
		}
			
		public static void car(String color){		
		System.out.println("My car is Audi, it has door:"+ color);
		}

		public static void weeklyIncomeStatic1(){
		int weeklyIncome = hourlyIncome * 240 + 100;
		System.out.println("My weeklyIncome="+ weeklyIncome);
			
		
		}
			
			
		
}
