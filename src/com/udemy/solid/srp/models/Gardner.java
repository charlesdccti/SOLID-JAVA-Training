package com.udemy.solid.srp.models;

public class Gardner extends Employee {

	private void prune() {
		System.out.println(super.getName() + " is pruning.");
	}
}
