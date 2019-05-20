package JavaPackage;

import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int m = scan.nextInt();
		int n, sum = 0;
		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		System.out.println("The sum of the digits of the no is " + sum);
	}

}
