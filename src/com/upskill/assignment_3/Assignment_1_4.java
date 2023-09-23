package com.upskill.assignment_3;

public class Assignment_1_4 {

	public static void main(String[] args) {
	
		int car=();
		v1.wheels();
		System.out.println("Run-Time PolyMorphism ->");
		 v2=new Truck();
		v2.wheels();
		v3=new Car(v3);
		v3.wheels();
		 v4=new Bike();
		v4.wheels();
		 v5=new BiCycle(); //BiCycle doesn't have wheel class so its upper class method is invoked!
		v5.wheels();
	}
	
	void wheels(){
		System.out.println("Every Vehicle have some wheels!");
	}
}

class Truck  {
	void wheels(){
		System.out.println("Trucks have 6 wheels!");
	}
}

class Car  {
	void wheels(){
		System.out.println("Cars have 4 wheels!");
	}
}

class Bike  {
	void wheels(){
		System.out.println("Bikes have 2 wheels!");
	}
}



