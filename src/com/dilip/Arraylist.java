package com.dilip;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();

		a.add("Red");
		a.add("Blue");
		a.add("White");
		a.add(3, "Yellow");
		a.set(1, "Orange");
		
		ArrayList<String> newa1= (ArrayList<String>) ((ArrayList<String>) a).clone();

	}

}
