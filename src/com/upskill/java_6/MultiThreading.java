package com.upskill.java_6;

public class MultiThreading {

	public static void main(String[] args) {

		int n = 5 ;
		
		for(int i = 0; i < n; i++){
			MultithreadingDemo obj = new MultithreadingDemo();
			obj.start();
			
			Thread obj2 = new Thread(new MultiThreadingDemo2());
			obj2.start();
		}

	}
	
	

}

class MultithreadingDemo extends Thread{
	public void run (){
		try{
			System.out.println("Thread" + Thread.currentThread().getId()+"is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
	
}
class MultiThreadingDemo2 implements Runnable{
	public void run (){
		try{
			System.out.println("Thread" + Thread.currentThread().getId()+"is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
	
}
	}
}

