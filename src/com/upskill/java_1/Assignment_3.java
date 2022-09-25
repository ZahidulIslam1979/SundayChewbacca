package com.upskill.java_1;

public class Assignment_3 {

	public static void main(String[] args) {
		int a =9;
		int b =11;
		int c = returns();
		System.out.println("The function return value is="+(a+b+c));
		
		int a1=5;
		int b1=9;
		int c1 =returns1();
		
		System.out.println("The function return value is="+(a1+b1+c1));
		
	}
	public static int returns(){
		int a =9;
		int b =11;
		int c= (a*b);
		return c;
		
			
			
	}
	
	public static int returns1(){
		int a=5;
		int b=9;
		int c=(a*b);
		return c;
		
		
					
	}
	

}
