package JavaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringtoArrayList {
	public static void main(String[] args) {
		String str = "99,89,79,69,59";
		String str1[] = str.split(",");
		List<String> nl = new ArrayList<String>();
		nl = Arrays.asList(str1);
		for (String s : nl) {
			System.out.println(s);
		}
	}
}
