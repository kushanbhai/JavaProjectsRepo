package JavaPackage;

public class Palindrome_String {

	public static void main(String[] args) {
		String str = "amadama";
		int j = str.length() - 1;
		int size = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(j)) {
				--j;
				if (i == size) {
					System.out.println("String is Palindrome");
				} 
			}else {
					System.out.println("String is not palindrome");
					break;
				}
			}
		}

	}


