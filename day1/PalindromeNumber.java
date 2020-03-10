package com.capgemini.assesments.day1;

public class PalindromeNumber {
	public static void palindromeofno(int no) {
		int temp, rem, rev = 0;
		temp = no;
		while (no > 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reverse of " + temp + " is: " + rev);
		if (temp == rev) {
			System.out.println(temp + " is " + "palindrome number");
		} else {
			System.out.println(temp + " is " + "not palindrome number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeofno(343);
	}

}
