package JavaPackage;

import java.util.Scanner;

public class Pattern_Rectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int rows = scan.nextInt();
		System.out.println("Enter the no of columns");
		int cols = scan.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.print("*");
			}
				if (i != rows) {
					System.out.println();
				}
			}
			scan.close();
		}

	}


