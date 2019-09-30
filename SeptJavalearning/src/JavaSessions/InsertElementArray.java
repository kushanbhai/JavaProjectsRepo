package JavaSessions;

public class InsertElementArray {
	public static void main(String[] args) {
		int []arr = {10, 40, 30, 80, 60};
		int insertele = 50;
		int pos = 3;
		for(int i = arr.length-1; i>pos-1; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1] = insertele;
	

for(int i=0 ; i<arr.length; i++) {
	System.out.print(arr[i] + " ");
}
	}
}
	
