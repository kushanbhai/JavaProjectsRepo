package JavaPackage;

import java.util.HashMap;

public class HashMap_AddremoveMembers {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(20, "abhishek");
		hm.put(25, "rahul");
		hm.put(30, "rajesh");
		String str1 = hm.get(30);
		System.out.println("The key value is "+str1);
	}

}
