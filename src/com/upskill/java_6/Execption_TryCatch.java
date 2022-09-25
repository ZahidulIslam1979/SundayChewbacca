 package com.upskill.java_6;

import java.rmi.AccessException;

public class Execption_TryCatch {

	public static void main(String[] args) {
		
		// Built-in Exceptions- ArrayIndexOutOfBoundsException
		//
		
		try{
		int[] ageChewbacca = new int[]{25, 26, 60, 45, 55,35};
		System.out.println("Student Age :" + ageChewbacca[6]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index not available");
			e.printStackTrace();
		}
		finally{
			System.out.println("Test1 Execution completed");
		}
		
		//Specific Built-in Exceptions - NumberFormatExceptions
		
		try{
			int num = Integer.parseInt("Test");
			System.out.println("Value of num int =" + num);
			}catch (Exception e){
				System.out.println("Please enter a valid number");
				e.printStackTrace();
			}
		
		//User Define Exceptions
		
		try{
			throw new myException("Test");
		}catch(myException e){
			System.out.println("User Defined Exceptions");
			e.printStackTrace();
						
		}
		
		finally{
			System.out.println("Test Execution completed");
		}
		
		}

	}


