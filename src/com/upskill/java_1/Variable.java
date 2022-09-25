package com.upskill.java_1;

public class Variable {
	
	// Variables in Java
	
	public String country = "USA";
	
	public int a = 2;
	
	public static String region = "America";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int b =2;
				String city = "Nyc";  	
				System.out.println(region);// Local variable -  variables declared in methods
				
				Variable obj = new Variable();
				System.out.println(obj.a);
				obj.method("");
			}
			
		    public void method(String county) {		    	// Method parameter - variables used as method parameter
		    	String myCounty = county;
		 }
		
	}


