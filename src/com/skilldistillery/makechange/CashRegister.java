package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double price = 0;
		double tender = 0;
		System.out.println("Please enter the price of the item purchased: ");
		price = sc.nextDouble();
		System.out.println("Please enter the amount tendered: ");
		tender = sc.nextDouble();

		if (price > tender) {
			System.out.println("Error: Come back when you get some more money buddy!");
		} else {

		}
		sc.close();
	}

	private static double change(double price, double tender) {
		double change = 0;

		return change;

	}

}

//	User Story #1
//	The user is prompted asking for the price of the item. CW
//	
//	User Story #2
//	The user is then prompted asking how much money was tendered by the customer.
//	
//	User Story #3
//	Display an appropriate message if the customer provided too little money or the exact amount.
//	
//	User Story #4
//	If the amount tendered is more than the cost of the item, display the number 
//	of bills and coins that should be given to the customer.
