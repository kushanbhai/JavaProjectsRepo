package JavaPackage;

public class Swap_Numbers {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Value of x before swap " + x);
		System.out.println("Value of x before swap " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Value of x after swap " + x);
		System.out.println("Value of x after swap " + y);
	}

}
