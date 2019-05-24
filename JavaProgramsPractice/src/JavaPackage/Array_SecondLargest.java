package JavaPackage;

import java.util.Arrays;

public class Array_SecondLargest {

	public static void main(String[] args) {
		int arr[] = {2,3,7,9,1,5,4};
		Arrays.sort(arr);
		System.out.println("The second largest element of the array is: "+arr[arr.length-2]);

	}

}
