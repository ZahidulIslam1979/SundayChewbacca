package com.upskill.java_3;

public class Switchcase1 {
	
	public static int day = 7;
	public int month = 12;
	public static void main(String[] args) {
				weekDay();
		Switchcase1 obj = new Switchcase1();
			obj.year();
		
			
	}
	public static void weekDay() {
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:	
			System.out.println("Tuesday");
			break;
		case 3:					
			System.out.println("Wednesday");
			break;
		case 4:	
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:	
			System.out.println("Sunday");				
			break;
			
			
		}
	
	}
		
	public void year(){
		switch(month){
		case 1: 
			System.out.println("January");
			break;
		case 2: 
			System.out.println("February");
			break;
		case 3: 
			System.out.println("March");
			break;
		case 4: 
			System.out.println("April");
			break;
		case 5: 
			System.out.println("May");
			break;
		case 6: 
			System.out.println("Jun");
			break;
		case 7: 
			System.out.println("July");
			break;
		case 8: 
			System.out.println("August");
			break;
		case 9: 
			System.out.println("September");
			break;
		case 10: 
			System.out.println("October");
			break;
		case 11: 
			System.out.println("November");
			break;
		case 12: 
			System.out.println("December");
			break;
		
		}
		
	}
	
	}