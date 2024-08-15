package com.learning_Java_Day13_14th_Aug_Inheritance;

public class Execution {

	public static void main(String[] args) {
	Child child = new Child();
	child.superBike();
	child.sportsCar();
	child.bungalow();
	child.shares();
	child.farmhouse();
	child.trustFund();
	child.commericalStores();
	
	Parent parent = new Parent();
	parent.bungalow();
	parent.shares();
	parent.farmhouse();
	parent.trustFund();
	parent.commericalStores();

	}

}
