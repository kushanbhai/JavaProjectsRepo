package JavaPackage;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements_Array {

	public static void main(String[] args) {
		String []duplicates = new String[] {"java","java","spring","jsp"};
		Set Nonduplicatesset = new HashSet<>();
		Set duplicatesset = new HashSet<>();
		for(String string: duplicates) {
			if(!Nonduplicatesset.contains(string)) {
				System.out.println(Nonduplicatesset.add(string));
			}
			else {
				System.out.println(duplicatesset.add(string));
			}
		}
		System.out.println(duplicatesset);
	}

}
