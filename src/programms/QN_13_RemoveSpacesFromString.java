package programms;

public class QN_13_RemoveSpacesFromString {
	
	public static void main(String[] args) {
		
		String str = "The given string has spaces   ";
		
		// str = str.replaceAll("\\s", "");
		
		str = str.replace(" ", "");
		
		System.out.println(str);
		
	}

}
