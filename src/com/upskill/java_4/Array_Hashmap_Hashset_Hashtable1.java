package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable1 {





	public static void main(String[] args) {
	
		int [] agegroup = new int [] {20,25,30,35,40,45,50} ;
		System.out.println("Groupage:"+agegroup[3] );
		
		String [] namegroup =  new String [] {"Zahid","Nirob","Rushdi","Toza"};
		System.out.println("GroupName:" + namegroup [2]);
		System.out.println("Total Student:" +namegroup.length );
		
		int [][] agegroup2d = {{20,25,30,35,40,45,50},
				                {20,25,30}};
		System.out.println("Total Group Age:" +agegroup2d[1][2] );
		
		HashMap<Integer,String> Group = new HashMap<Integer,String>();
		Group.put(20,"Zohir");
		Group.put(25,"Zahir");
		Group.put(30,"Zuhir");
		Group.put(35,"Zomir");
		Group.put(40,"Zobir");
		Group.put(50,"Zohar");
		System.out.println("Total Group:"+ Group.get(20));
		
		HashSet<String> Bus = new HashSet<String>();
		Bus.add("Scania");
		Bus.add("Hundai");
		Bus.add("Nissan");
		Bus.add("Daewoo");
		Bus.add("Isuzu");
		System.out.println("Bus:"+ Bus);
		
		Hashtable<String,String> Country = new Hashtable<String,String>();
		Country.put("Asia","BD");
		Country.put("Africa","Kongo");
		Country.put("Europe","Paris");
		Country.put("Australia","Auckland");
		Country.put("Oceania","Antartica");
		System.out.println("Country:" + Country.get("Asia"));
		
         
			

		}		                         
									
		
		

	}


