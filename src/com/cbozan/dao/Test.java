package com.cbozan.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Person> student = new ArrayList<Person>();
		student.add(new Person(101, "Vishal", 2000, "Mumbai"));
		student.add(new Person(102, "Aniket", 3000, "Pune"));
		student.add(new Person(103, "Rohit", 4000, "Nagpur"));
		

		Iterator<Person> itr = student.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());	
		}
		
	}		
}