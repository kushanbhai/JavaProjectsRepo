package JavaPackage;

public class BiggestWordString {

	public static void main(String[] args) {
		String str = "Testing Time";
		String[] str1 = str.split(" ");
		String temp = null;
		if (str1[1].length() > str1[0].length()) {
			temp = str1[1];

		}
		if (str1[0].length() > str1[1].length()) {
			temp = str1[0];

		}
		if (temp != null) {
			System.out.println("the biggest word is " + temp);
		} else {
			System.out.println("Many words of the same length");
		}

	}

}
