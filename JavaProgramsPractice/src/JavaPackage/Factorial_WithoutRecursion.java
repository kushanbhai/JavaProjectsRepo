package JavaPackage;

import java.util.Scanner;

public class Factorial_WithoutRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the factorial of a no.");
		int num = scan.nextInt();
		int factorial = fact(num);
		System.out.println("The factorial of a no is "+factorial);
	}

	public static int fact(int n) {
		int output;
		if(n==1) {
			return 1;
		}
		else {
			output = fact(n-1)*n;
			return output;
		}
	}

}
