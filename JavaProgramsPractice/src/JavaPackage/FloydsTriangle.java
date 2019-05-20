package JavaPackage;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int rows = scan.nextInt();
		int number = 1;
		System.out.println("FLOYDS TRIANGLE!!");
		for (int row = 1; row <= rows; row++) {
			for (int numbercnt = 1; numbercnt <= row; numbercnt++) {

				System.out.print(number + " ");
				number = number + 1;
			}
			System.out.println();
		}
		scan.close();

	}

}
