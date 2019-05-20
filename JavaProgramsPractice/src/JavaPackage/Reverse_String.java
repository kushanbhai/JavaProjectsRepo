package JavaPackage;

public class Reverse_String {
	
	public static void main(String[] args) {
		String str = "Hello World";
		String  reversed = " ";
		for(int i=str.length()-1; i>=0; --i)	{
			reversed = reversed + str.charAt(i);
		}
		System.out.println("The revesered string is "+reversed);
	}

}
