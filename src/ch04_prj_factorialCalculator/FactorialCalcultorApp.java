package ch04_prj_factorialCalculator;

import java.util.Scanner;

public class FactorialCalcultorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the factorial calculator");
		Scanner sc = new Scanner(System.in);
		// variables
		String choice = "y";
		int factor = 0;
		int displayProduct = 1;
		// while loop
		while (!choice.equalsIgnoreCase("n")) {
			System.out.println("Enter a number that's greater than 0 and less than 10\t");
			factor = sc.nextInt();
			// for loop
			for (int i = 2; i <= factor; i++) {
				displayProduct = displayProduct * i;
				// user output
			}
			System.out.println("The factorial of " + factor + " is " + displayProduct + ".");
			System.out.println("Continue:\t(y/n)");
			choice = sc.next();
		}
		// goodbye, scanner close.
		System.out.println("Goodbye");
		sc.close();
	}

}
