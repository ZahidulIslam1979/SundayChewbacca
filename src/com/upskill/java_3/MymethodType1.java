package com.upskill.java_3;

public class MymethodType1 {
	
	public static int  hourlyIncome = 65;

	public static void main(String[] args) {
		
		MymethodType1 obj = new MymethodType1 ();
		obj. annualIncomeVoid ();
		weeklyIncomeStatic();	
		System.out.println("monthlyIncomeReturn" + obj.monthlyIncomeReturn());
		}
				

	
	
	public void annualIncomeVoid(){
		int annualIncome = hourlyIncome * 2400;
				System.out.println("annualIncome" + annualIncome);
	}
	
	public static void weeklyIncomeStatic (){
		int weeklyIncome = hourlyIncome * 240;
		System.out.println("weeklyIncome" + weeklyIncome);
	}
	
	public int monthlyIncomeReturn(){
		int monthlyIncome = hourlyIncome * 480;
		return monthlyIncome;
		
	}

}
