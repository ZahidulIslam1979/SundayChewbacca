package com.upskillloops;

public class LoopsNested {

	public static void main(String[] args) {
		
	// practiceNestedLoop();
	 practiceNestedLoop1();

	}

	public static void practiceNestedLoop(){
		int i;
		int j;
		for (i = 3; i <=10; i++){
		for (j = 2; j <=10; j++){
		int multipicationTable = i * j;
		System.out.print(multipicationTable + " ");
		}
		System.out.println(" ");
		}
	}

		public static void practiceNestedLoop1(){
			int i;
			int j;
			for (i = 4; i <=10; i++){
			for (j = 2; j <=10; j++){
			int multipicationTable = i + j;
			System.out.print(multipicationTable + " ");
			}
			System.out.println(" ");
			}
	}
}
