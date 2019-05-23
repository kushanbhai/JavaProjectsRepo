package JavaPackage;

import java.util.Scanner;

public class Percentage_Number {

	public static void main(String[] args) {
		int total, score;
		int percentage;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total amount of score: ");
		total = scan.nextInt();
		System.out.println("Enter the score: ");
		score = scan.nextInt();
		percentage = (score * 100 / total);
		System.out.println("The percentage of the number is " + percentage + " %");

	}

}
