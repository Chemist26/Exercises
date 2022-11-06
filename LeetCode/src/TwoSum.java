import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {
	        
	        Map<Integer, Integer> numbersMap = new HashMap<>();
	        
	        // Using for loop to add each element's value and index (key, value)
	        for(int i = 0; i < nums.length; i++) {
	        	numbersMap.put(nums[i], i);
	        }
	        // Using second loop to check if numbers exist in hash table
	        for (int i = 0; i < nums.length; i++) {
	        	int complete = target - nums[i];
	        	if (numbersMap.containsKey(complete) && numbersMap.get(complete) != i) {
	        		return new int[] {i, numbersMap.get(complete)};
	        	}
	        }
	        
			return null;
	    }
	 
	 public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		
		System.out.println("Sum of these index: " + Arrays.toString(twoSum(nums, target)));
		System.out.println("Gives target: " + target);
     }
}