package strings;

public class ReverseInteger {

	 public static int reverse(int x) {
		  int result = 0;

		    while (x != 0) {
		        int tail = x % 10; // 123 % 10 = 3
		        int newResult = result * 10 + tail; // 0 * 10 + 3 = 3
                // (3 - 3) / 10 != 0  false
		        if ((newResult - tail) / 10 != result) {
		           return 0;
		        }
		        else {
		           result = newResult;  // result = 3
		           x = x / 10;		    // 123 / 10 = 12    	
		        }
		    }

		    return result;
	 }
	 
	 public static void main(String[] args) {
		int a = 123;
	    System.out.println("Numbere before reverse: " + a);
		System.out.println("Number after reverse: " + reverse(a));
	}
}
