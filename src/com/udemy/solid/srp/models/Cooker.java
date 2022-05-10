package com.udemy.solid.srp.models;

public class Cooker extends Employee {

	private void cook() {
		System.out.println(super.getName() + " is cooking.");
	}
}
