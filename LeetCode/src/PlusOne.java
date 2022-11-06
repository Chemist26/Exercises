import java.util.Arrays;

public class PlusOne {
	 public static int[] plusOne(int[] digits) {
	        int n = digits.length;
	        // We start from right
	        for (int i = n - 1; i >= 0; i--) {
	        	// if array[i] is < 9 we add plus one
	        	if (digits[i] < 9) {
	        		digits[i]++;
                 return digits;
	        	} else {
	        		digits[i] = 0;
	        	}
	        }
   
	        // If all numbers inside array are 9 it will become [0,0,0,0]
	        // but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]
	        // We create new array with n length + 1 and set value to 1
	        digits = new int[n + 1];
	        digits[0] = 1;
			return digits;
	    }
	 
	 public static void main(String[] args) {
		int digits[] = {9};
		System.out.println("Original array: " + Arrays.toString(digits));
		System.out.println("Array after PlusOne(): " + Arrays.toString(plusOne(digits)));
	}
}
