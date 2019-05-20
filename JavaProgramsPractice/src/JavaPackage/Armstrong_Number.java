package JavaPackage;

public class Armstrong_Number {

	public static void main(String[] args) {
		int n = 153;
		int temp = n, sum = 0;

		while (n > 0) {
			int r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println("No is an armstrong no.");
		} else {
			System.out.println("No is not an armstrong no.");
		}

	}

}
