package JavaPackage;

public class MissingNumber_Array {

	public static void main(String[] args) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		System.out.println("Missing number from the arr1 " + missingNumber(arr1));
	}

	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int restsum = 0;
		for (int i = 0; i < arr.length; i++) {
			restsum += arr[i];

		}
		int missingnumber = sum - restsum;
		return missingnumber;
	}
}
