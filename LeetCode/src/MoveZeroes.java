import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        
    	int snowBall = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 0) {
    			snowBall++;
    		}
    		else if (snowBall > 0) {
    			// prisvoqvame nums[i] na holder  , pravim nums[i] na 0
    			int holder = nums[i];
    			nums[i] = 0;
    			nums[i - snowBall] = holder;
    		}
    	}
    }


	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
	}
}