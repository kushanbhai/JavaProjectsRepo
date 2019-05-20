package JavaPackage;

public class SeparateAlphabetsDigits {

	public static void main(String[] args) {
		String str = "1a2b3c4d5e6f";
		SeparateAlphabetsDigits(str);

	}

	public static void SeparateAlphabetsDigits(String str) {
		String number = " ";
		String letter = " ";
		for(int i= 0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				number = number + c;
			}
			else {
				letter = letter + c;
			}
		}
		System.out.println("The numbers of the string is "+number);
		System.out.println("The numbers of the string is "+letter);
		
	}

}
