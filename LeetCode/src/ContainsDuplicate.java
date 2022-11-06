import java.util.HashSet;

public class ContainsDuplicate {
	 public static boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> hash = new HashSet<>();
	        int i = 0;
	        while(i < nums.length){
	            if(hash.contains(nums[i])){
	                return true;
	            }
	            hash.add(nums[i]);
	            i++;
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		
		System.out.println(containsDuplicate(nums));
	}
}
