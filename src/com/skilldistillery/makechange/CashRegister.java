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

		if (price > tender) { // error message
			System.out.println("Error: Come back when you get some more money buddy!");
		} else { // this is where it will give you the change
			change(price, tender);
		}
		sc.close();

	}

	// method for calculating change
	private static double change(double price, double tender) {

		int change = conversion(price, tender);
		double exactChange = ((double) change) / 100;
		System.out.println(exactChange);
		int twenty = 0, ten = 0, five = 0, one = 0, quarter = 0, dime = 0, nickel = 0, penny = 0;

		while (change != 0) {
			while (change >= 2000) {
				change -= 2000;
				twenty++;
				System.out.println(change);
			}
			if (twenty > 0) {
				System.out.println(twenty + " twenties");
			}
			while (change >= 1000) {
				change -= 1000;
				ten++;
			}
			if (ten > 0) {
				System.out.println(ten + " tens");
			}
			while (change >= 500) {
				change -= 500;
				five++;
			}
			if (five > 0) {
				System.out.println(five + " fives");
			}
			while (change >= 100) {
				change -= 100;
				one++;
			}
			if (one > 0) {
				System.out.println(one + " ones");
			}
			while (change >= 25) {
				change -= 25;
				quarter++;
			}
			if (quarter > 0) {
				System.out.println(quarter + " quarters");
			}
			while (change >= 10) {
				change -= 10;
				dime++;
			}
			if (dime > 0) {
				System.out.println(dime + " dimes");
			}
			while (change >= 5) {
				change -= 5;
				nickel++;
			}
			if (nickel > 0) {
				System.out.println(nickel + " nickels");
			}
			while (change >= 1) {
				change -= 1;
				penny++;
			}
			if (penny > 0) {
				System.out.println(penny + " pennies");
			}
		}
		return change;
	}
	

	// method for casting original scanner input doubles to ints to remove decimals
	private static int conversion(double price, double tender) {
		int value = (int) ((tender * 100) - (price * 100));
		return value;
	}
}

//	User Story #1
//	The user is prompted asking for the price of the item. CW
//	
//	User Story #2
//	The user is then prompted asking how much money was tendered by the customer. CW
//	
//	User Story #3
//	Display an appropriate message if the customer provided too little money or the exact amount. CW
//	
//	User Story #4
//	If the amount tendered is more than the cost of the item, display the number 
//	of bills and coins that should be given to the customer.
