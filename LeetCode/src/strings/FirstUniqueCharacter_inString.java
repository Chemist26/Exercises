package strings;

import java.util.HashMap;

public class FirstUniqueCharacter_inString {

	public static void main(String[] args) {
		
		String s = "loveleetcode";
        System.out.println("Numbers of counts: " + firstUniqChar(s));
	}
	
	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> countCharacter = new HashMap<>();
		int n = s.length();
		
		for (int i = 0; i < n; i++) {
			char wordChar = s.charAt(i);
			countCharacter.put(wordChar, countCharacter.getOrDefault(wordChar, 0) + 1);
		}
		
		// finding index
		for (int i = 0; i < n; i++) {
			if (countCharacter.get(s.charAt(i)) == 1) {
				return i;				
			}
		}
		
		return -1;
	}
}
