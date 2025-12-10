package com.cbozan.dao;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(101, "Vishal", 2000, "Mumbai"));
		list.add(new Person(102, "Aniket", 3000, "Pune"));
		list.add(new Person(103, "Rohit", 4000, "Nagpur"));
		
		System.out.println(list); 
		
	}

}
