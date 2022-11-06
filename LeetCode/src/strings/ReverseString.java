package strings;

public class ReverseString {

	 public static String reverseString(String s) {
	        char[] letters = new char[s.length()];
	        
	        int lettersIndex = 0;
	        for (int i = s.length() - 1; i >= 0; i--) {
	        	letters[lettersIndex] = s.charAt(i);
	        	lettersIndex++;
	        }

	        String reverse = "";	
	        for (int i = 0; i < s.length(); i++) {
	        	reverse = reverse  + letters[i];
	        }
	        
	        return reverse;
	    }
	 
	 public static void main(String[] args) {
		 
		String r = reverseString("Antoan");
		System.out.println(r);
	}
}
