package com.upskillloops;

public class Loops {
	
	/*
	Type of Loops
		1. For Loop
		2. While Loop
		3. Do While LOOP
		4. Infinite Loop
	 */

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
		practiceDoWhileLoop();
//		practiceInfiniteeLoop();
//		practiceNestedLoop();
	}

	public static void practiceForLoop(){						// For Loop - Do again and again upto upper limit
		int i;													//Initialize the variable	
		for (i = 1; i<=10; i++){								//Setting lower limit, Upper limit, Increment or decrement
			System.out.println("For Loops Number = "+ i);		//Statement
						
		}
	}
	
	public static void practiceWhileLoop(){						//	While Loop - Do again and again upto condition match
		int i = 1;												//	Initializing variables
		while (i<=10){											// Statement
			System.out.println("While Loops Number =" + i);		//Increment or decrement
			i++;												//Setting condition				
																
		}
	}
	
	public static void practiceDoWhileLoop(){					//Do While Loop - Do action then match condition
		int i = 1;												//Initialize the variables
		do{														//Statement
			System.out.println("Do While Loops Number = " + i); //Increment or decrement
			i++;												//Checking Condition
		}while (i<=10);
	}
	
	public static void practiceInfiniteeLoop(){					//Infinite Loop - Never Ending Loop
		int i;													//Initialize the variable	
		for (i = 1; ;i++){										//Setting No Upper Limit
			System.out.println("For Loops Number =" + i);		//Statement	
		}
	}
	
	public static void practiceNestedLoop(){					//Nested Loop - Loop inside another Loop
		int i;													//Initializing variable i
		int j;													//Initializing variable j
		for (i = 1; i <=10; i++){								//First Loop for i
			for(j = 1; j <=10; j++){							//First Loop for j			
				int multipicationTable = i * j;					//Statement for j Loop
				System.out.print(multipicationTable + " ");	
			}													
			System.out.println(" ");							//Statement for i Loop
								
			}									
		}
}

