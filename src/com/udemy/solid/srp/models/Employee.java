package com.udemy.solid.srp.models;

public class Employee {
	private String name;
	private String age;
	
	private void cook() {
		System.out.println(name + " is cooking.");
	}
	
	private void paint() {
		System.out.println(name + " is painting.");
	}
	
	private void drive() {
		System.out.println(name + " is driving.");
	}
	
	private void prune() {
		System.out.println(name + " is pruning.");
	}

}
