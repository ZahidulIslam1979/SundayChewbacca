package com.upskill.java_2;



public class MymethodType {

	public static int  hourlyIncome = 60;
	
	public static void main(String[] args) {
		
		MymethodType obj = new MymethodType();
		obj. annualIncomeVoid1();
		weeklyIncomeStatic1();
		System.out.println("My monthlyIncomeReturn="+ obj.monthlyIncomeReturn1());
		
	}
		public void annualIncomeVoid1(){
			int annualIncome = hourlyIncome* 2400;
			System.out.println("My annualIncome="+ annualIncome);
			
		}

		public static void weeklyIncomeStatic1(){
			int weeklyIncome = hourlyIncome * 240;
			System.out.println("My weeklyIncome="+ weeklyIncome);
			
		}
		
		public int monthlyIncomeReturn1(){
			int monthlyIncome = hourlyIncome * 200;
			return monthlyIncome;
			
		}
}
