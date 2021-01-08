package three;

import java.util.Scanner;

public class nine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int total = 0;
		int number11,number12;
		String number;

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		number = input.next();
		int number1 = Integer.parseInt(number);

		for (int i = 9; i >= 1; i--) {
			number11 = number1 % 10;
			total += number11 * i;
			number1 /= 10;
		}
		number12 = total % 11;

		if (number12 == 10)
			System.out.println("The ISBN-10 number is " + number + "X");
		else
			System.out.println("The ISBN-10 number is " + number + number12);	
	}
}
