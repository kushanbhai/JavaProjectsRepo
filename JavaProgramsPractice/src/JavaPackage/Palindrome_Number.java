package JavaPackage;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = scan.nextInt();
		int temp = n;
		int rev_num = 0;
		while(n>0) {
			int r = n%10;
			rev_num = rev_num*10 +r;
			n = n/10;
		}
		if(temp ==rev_num) {
			System.out.println("The no is palindrome");
		}
		else {
			System.out.println("The no is not a palindrome");
		}
	}

}
