package strings;

import java.util.Arrays;

public class ReverseString2 {

    public static void reverseString(char[] s) {
    	   int i = 0;
           int j = s.length - 1;
           
           while(i <= j){
               char holder = s[i];
               s[i] = s[j];
               s[j] = holder;
               i++;
               j--;
           }
    }
    
    public static void main(String[] args) {
		char[] word = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(word);
		
		reverseString(word);
		System.out.println(word);
	}
}
