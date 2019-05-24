package JavaPackage;

public class DuplicateWords_String {

	public static void main(String[] args) {
		String str = "Big black bug bit a big black dog on his big black nose";
		int cnt;
		str = str.toLowerCase();
		String words[] = str.split(" ");
		System.out.println("Duplicate words of the string is: ");
		for (int i = 0; i < words.length; i++) {
			cnt = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					cnt++;
					words[j] = "0";
				}
			}
			if (cnt > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}
	}

}
