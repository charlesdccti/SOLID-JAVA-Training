package com.udemy.solid.srp.models;

public class Painter extends Employee {
	
	private void paint() {
		System.out.println(super.getName() + " is painting.");
	}

}
