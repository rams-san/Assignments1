package com.capgemini.assesments.day1;

public class Factorial {
	public static int factorialOfNumber(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of given number is: " + factorialOfNumber(5));
	}

}
