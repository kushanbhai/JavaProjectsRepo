package JavaPackage;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		CheckPerfectNumber cp = new CheckPerfectNumber();
		System.out.println("isperfect number: " + cp.isperfectNumber(num));
	}

	public boolean isperfectNumber(int number) {
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number) {
			System.out.println("No is a perfect number");
			return true;
		} else {
			System.out.println("No is not a perfect number");
			return false;
		}
	}
}
