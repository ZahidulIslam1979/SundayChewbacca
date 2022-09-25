package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
	//Aray store multiple data using index
	
     int age =30;                                         //Variable
     int[] agechewbacca = new int[]{24,45,29,35,33,28};
     //Array Index                  0  1  2  3  4  5      // Array
     
     int [] ZahidOshin = new int [] {25, 29,33,37,41,45};
     System.out.println("Student Age:" + ZahidOshin[4]);
     									
     
     System.out.println("Student Age :" + agechewbacca[5]);
     
     String [] namechewbacca = new String[]{"Zahid","Rushdi","Nirob","Pappu","Mamun", "Omor"};
     System.out.println("Student Name :" +namechewbacca[4] );
     System.out.println("Total Student:"+ namechewbacca.length);
     
     // Multi-Dimentional Array
     
     int[][] agechewbacca2D = {{24,45,29,35,33,28}, // [0][0]   [1][1]    [2][2] [3][3]  [4][4]  [5][5]
    		                   {24, 45, 29}};       //  [1][0]   [1][1]   [1][2]
     System.out.println("Student Age 2D:" +agechewbacca2D[1][2]);
     
      String[][] OshinZahid2D = {{"Razzak", "Faruk", "Bulbul","Salman","Riaz"},
    		                    {"Bobita",  "Shabana","Rozina"}};
      System.out.println("Team Name 2D:"+ OshinZahid2D[0][1]);
	

      
     // Hashmap store multiple data using Key-Value pair, Implementation of Map interface
     
         HashMap<String, Integer> Student = new HashMap<String, Integer>();
         Student.put("Zahid",24);
         Student.put("Rushdi",45);
         Student.put("Nirob",29);
         Student.put("Pappu",35);
         Student.put("Mamun",33);
         Student.put("Omor",28);
         System.out.println("Student Name;"+ Student.get("Zahid"));
         
         HashMap<String,String > Capital = new HashMap<String, String>();
         
         Capital.put("BD","Dhaka");
         Capital.put("USA","Washington DC");
         System.out.println("Capital City" + Capital.get("USA"));
         
         //Hashset store unordered collection containing unique value, Implementation of set interface
         
         HashSet<String>  car = new HashSet<String>();
         car.add("BMW");
         car.add("Audi");
         car.add("Toyota");
         System.out.println("Car:" + car);
         
         //HashTable store  multiple data using Key-value pair, but is synchronized (only one thread can be modified)
         
         Hashtable<String,String>  Region = new Hashtable<String,String>();
         Region.put("BD","Asia");
         Region.put("USA","North America");
         System.out.println("Region:" + Region.get("USA"));
         
  
         
       
         
         
         
         
     
     
     
     
     
     
     
     }
}    
   
    
     
     
     
	
    
	

