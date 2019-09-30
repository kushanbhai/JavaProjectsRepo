package AlgorithmsinJava;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 5, 1, 6 };
		int max = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println("The max value from an array " + max);
	}

}
