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
	
	public void turnDrivableOn(Key key) {
		if( key instanceof PresencialKey) {
			turnDrivableOnWithPresentialKey();
		}else if( key instanceof PhisicalKey) {
			turnDrivableOnWithPhisicalKey();
		}
			
	}

	private void turnDrivableOnWithPresentialKey() {
		// open the car
		// put the key in the cockpit( compartment )
	}
	
	private void turnDrivableOnWithPhisicalKey() {
		// open the car
		// Insert the key and turn
	}
}
