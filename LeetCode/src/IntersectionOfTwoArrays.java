import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
	 static int[] intersect(int[] nums1, int[] nums2) {
	    	Arrays.sort(nums1);
	    	Arrays.sort(nums2);
	    	
	    	ArrayList<Integer> array = new ArrayList<>();
	    	
	    	int i = 0;
	    	int j = 0;
	    	
	    	while(i < nums1.length && j < nums2.length) {
	    		// if nums1[i] is smaller then we go to next element
	    		if (nums1[i] < nums2[j]) {
	    			i++;
	    		}
	    		// if nums1[i] is greater then we go to next element in nums2 
	    		else if (nums1[i] > nums2[j]) {
	    			j++;
	    		}
	    		// If both elements intersect we add them to array and ++
	    		else {
	    			array.add(nums1[i]);
	    			i++;
	    			j++;
	    		}
	    	}
	    	
	    	// Creating output list array
	    	int[] outputResult = new int[array.size()];
	    	int k = 0;
	    	while (k < array.size()) {
	    		outputResult[k] = array.get(k);
	    		k++;
	    	}
			return outputResult;
	    }
    	
    
    public static void main(String[] args) {
		int nums1[] = {4,9,5};
		int nums2[] = {9,4,9,8,4};
		
	  System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}
}
