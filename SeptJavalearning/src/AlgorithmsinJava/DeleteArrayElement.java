package AlgorithmsinJava;

public class DeleteArrayElement {
public static void main(String[] args) {
	int []arr = {10, 40, 30, 80, 60};
	int delele = 30;
	for(int i=0 ; i<arr.length; i++ ) {
		if(delele==arr[i]){
			for(int j=i ; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			break;
		}
	}
	for(int i=0 ; i<arr.length-1; i++) {
		System.out.print(arr[i] + " ");
	}
}
	
}
