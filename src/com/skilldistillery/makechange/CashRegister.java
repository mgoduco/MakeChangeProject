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

		}

	}

	private static void change() {

	}

}
