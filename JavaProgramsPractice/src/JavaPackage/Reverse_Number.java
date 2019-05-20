package JavaPackage;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no ");
		int n = scan.nextInt();
		int rev_num = 0;
		while (n != 0) {
			int digit = n % 10;
			rev_num = rev_num * 10 + digit;
			n = n / 10;
		}
		System.out.println("The reverse of the no is " + rev_num);
	}

}
