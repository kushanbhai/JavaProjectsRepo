package AlgorithmsinJava;

public class Linear_Search_String {

	public static void main(String[] args) {
		String []arr = {"deepak", "rohit", "rahul", "deepesh", "amit"};
		String item = "jatin";int temp = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(item)) {
				System.out.println("item present in "+i+" index position");
				temp = temp +1;
			}
		}
		if(temp==0) {
			System.out.println("item not found int the list");
		}

	}

}
