package com.upskill.java_3;

import java.util.HashMap;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		
		// Array store multiple data using index
		int age = 30;                                        // variable
		int[] agevision = new int[] {21,26,28,30,35};         //Array
		
		//Array index           [0] [1] [2] [3] [4]
		
	System.out.println("Student Age :" + agevision [2])	;
	System.out.println("Total student :" + agevision.length);
	

	String [] nameVision = new String [] {"abi","aci","adi","afi"};
	
	System.out.println("Studend name " +nameVision[3]);
			
	// Hashmap store multipul data using key-value pair,Implementation of Map interface
	
	HashMap<String, Integer> Student = new HashMap<String , Integer>();
	
	Student.put("abi" , 21);
    Student.put("aci",26);
    Student.put("adi",28);
   Student.put("afi",24);
   
   System.out.println("Hashmap Student Age : " + Student.get("adi"));
   
   HashMap<String,String> Capital = new HashMap<String,String>();
   
   Capital.put("bd","Dhaka");
   Capital.put("india","Delhi");
   //HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)
		
		Hashtable <String ,String > Region = new  Hashtable <String,String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));

		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet < String > car = new HashSet < String >();
		
		car.add("Tesla");
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
	}
	}
