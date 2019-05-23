package JavaPackage;

import java.util.Scanner;

public class SquareNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = scan.nextInt();
		System.out.println("The square of a num is "+square(num));
	}

	public static int square(int num) {
		
		return num*num;
	}
}


