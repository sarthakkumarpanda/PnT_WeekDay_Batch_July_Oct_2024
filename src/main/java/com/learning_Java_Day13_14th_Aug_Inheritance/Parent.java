package com.learning_Java_Day13_14th_Aug_Inheritance;

public class Parent extends GrandParent{
	
	private String name = "SecretSanta";
	
	public Parent() {
		int i = 100;
		int j = 200;
		int k = 300;
		System.out.println(i + j + k);
	}
	
	
	public void bungalow() {
		System.out.println("Parent's bungalow");
	}
	
	public void shares() {
		System.out.println("Parent's shares");
	}
	
	public void farmhouse() {
		System.out.println("Parent's farmhouse");
	}
}
