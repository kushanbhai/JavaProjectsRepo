package JavaPackage;

import java.util.Scanner;

public class Check_Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scan.nextLine();
		char[] chars = str.toCharArray();
		int cnt = 0;
		for (char c : chars) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				cnt++;
				break;
			}

		}
		System.out.println("The vowels of the string is " + cnt);
	}

}
