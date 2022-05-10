package com.udemy.solid.srp.models;

import com.udemy.solid.srp.interfaces.Debreavel;
import com.udemy.solid.srp.interfaces.Drivable;

public class Drive extends Employee implements Drivable, Debreavel {

	private void drive() {
		System.out.println(super.getName() + " is driving.");
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakDrivable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debrear() {
		// TODO Auto-generated method stub
		
	}

}
