package AlgorithmsinJava;

public class Linear_Search_Integer {

	public static void main(String[] args) {
		int []arr = {5,3,6,1,4,2};
		int item = 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				System.out.println("Item is present at "+i+" position");
			}
		}

	}

}
