package com.udemy.solid.srp.models;

public class Cooker extends Employee {

	private void cook(Dish dishType) {
		
		switch (dishType) {
		case COOK_LASANHA: {
			cookLasanha();
			break;
		}
		case COOK_PIZZA: {
			cookPizza();
			break;
		}
		default:
			System.out.println("Opção não encontrada.");
			break;
		}
	}

	private void cookLasanha() {
		System.out.println(super.getName() + " is cooking lazanha.");
	}

	private void cookPizza() {
		System.out.println(super.getName() + " is cooking pizza.");
	}
}
