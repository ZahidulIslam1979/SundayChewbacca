package com.upskill.java_6;

public class Singleton {

	private Singleton(){
		
	}
	
	private static Singleton Singletonobj = new Singleton();
	
	public static Singleton getInstance(){
		return Singletonobj;
	}

	protected static void upskill(){
		System.out.println("Upskill method from Singleton class");
	}
}
 