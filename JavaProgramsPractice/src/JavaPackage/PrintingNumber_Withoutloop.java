package JavaPackage;

public class PrintingNumber_Withoutloop {

	public static void main(String[] args) {
		printNumbers(1);

	}

	public static void printNumbers(int n) {
		
		if(n<10) {
			System.out.println("The no is "+n);
			printNumbers(n+1);
		}
		
	}

}
