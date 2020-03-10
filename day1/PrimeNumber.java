package com.capgemini.assesments.day1;
public class PrimeNumber {
	public static void checkPrimeNumber(int number) {
		int flag = 0;
		for (int i = 2; i <= number/2 ; i++) {
			if (number % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(number + " is prime number");
		} else {
			System.out.println(number + " is not prime number");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrimeNumber(4);

	}

}
