package com.udemy.solid;

import com.udemy.solid.srp.models.Cooker;
import com.udemy.solid.srp.models.Dish;
import com.udemy.solid.srp.models.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee employee;
		employee = new Cooker();

		if (employee instanceof Cooker) {
			((Cooker) employee).cook(Dish.COOK_LASANHA);
			// Cooker cooker = (Cooker) new Employee();
			// cooker.cook(Dish.COOK_LASANHA);
		}
	  		
		returnCooker(new Cooker()).cook(Dish.COOK_LASANHA);
	}
	
	public static Cooker returnCooker(Employee employee) {
		if (employee instanceof Cooker) {
			return (Cooker) employee;
		}
		return null;
		
	}
}
