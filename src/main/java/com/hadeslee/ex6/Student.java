package com.hadeslee.ex6;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private double height;
	private double weight;
	
	public Student(String name, int age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
}
