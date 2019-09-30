package JavaSessions;

public class MinARRAY {

	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 5, 1, 6 };
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("The MIN ELEMENT FROM D ARRAY IS: " + min);
	}

}
