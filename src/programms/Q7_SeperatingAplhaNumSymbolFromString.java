package programms;

public class Q7_SeperatingAplhaNumSymbolFromString {
	
	public static void main(String[] args) {
		
		String str = "Test@#$For1234Here987&";
		
		String alpha = str.replaceAll("[^A-Za-z]", "");
		String num = str.replaceAll("[^0-9]", "");
		String specialChar = str.replaceAll("[A-Za-z0-9]", "");
		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(specialChar);
		
		
		extractorFromString("Test@#$For1234Here987&");
	}
	
	
	
	public static void extractorFromString(String str) {
		
		StringBuffer alpha = new StringBuffer() ;
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer();
		
		for(int i =0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			}else if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}else {
				special.append(str.charAt(i));
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
		
	}

}
