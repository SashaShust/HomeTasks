package com.epam.calculator.main;

public class Main {

	public static final String PLUS = "+";
	public static final String MINUS = "-";
	public static final String MULTIPLY = "x";
	public static final String DIVIDE = "/";

	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("You must enter three parameters");
		} else {
			try {
				double numOne = Double.parseDouble(args[0]);
				String operation = args[1];
				double numTwo = Double.parseDouble(args[2]);

				switch (operation) {
				case PLUS:
					System.out.println(numOne + numTwo);
					break;
				case MINUS:
					System.out.println(numOne - numTwo);
					break;
				case MULTIPLY:
					System.out.println(numOne * numTwo);
					break;
				case DIVIDE:
					if (numTwo == 0) {
						System.out.println("It is not possible divide by ZERO!");
					} else {
						System.out.println(numOne / numTwo);
					}
					break;
				default:
					System.out.println("Please enter correct operation: '+' '-' 'x' '/' ");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("It is incorrect format, please enter correct number");
			}
		}
	}
}
