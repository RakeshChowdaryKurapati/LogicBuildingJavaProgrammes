package programms;

public class QN_Anagram {
	
	public static void main(String[] args) {
		
		String str = "poemm";
		
		String str2 = "empo";
		
		char[] ch =  str2.toCharArray();
		
		boolean flag = false;
		
	if(str.length()==str2.length()) {	for(char fl : ch) {
			if(str.contains(Character.toString(fl))) {
				
				flag = true;
				
			}
			else {
				flag = false;
			}
		}
	
	}
		
		if(flag == true) {
			System.out.println("The given String is an anagram ");
		}
		else System.out.println("The given String is not an anagram ");
		
	}
	
	public static void approach2() {
		
		
	String str = "empo";
	
	String str2 = "poem";
	
	
		
		
	}

}
