package JavaPackage;

public class Factors_Number {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("Factors of the the no " + num + " is: ");
		for (int i = 1; i <= num; i++) {
			
				if (num %i == 0) {
					System.out.println(i+" ");
				}
				
			}
		}
}

