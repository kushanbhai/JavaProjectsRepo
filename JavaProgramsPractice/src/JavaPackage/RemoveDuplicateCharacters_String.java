package JavaPackage;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters_String {

	public static void main(String[] args) {
		String str = "Sandeep";
		System.out.println("The string without duplicate characters is " + RemoveDuplicateCharacters(str));

	}

	public static String RemoveDuplicateCharacters(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}

}
