import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	
	 public static int singleNumber(int[] nums) {
	        List<Integer> listNumber = new ArrayList<>();
	        for (Integer number : nums) {
				if (listNumber.contains(number)) {
					listNumber.remove(number);
				} else {
					listNumber.add(number);
				}
			}
			return listNumber.get(0);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {4,1,2,1,2};
        
        System.out.println(singleNumber(nums));
	}
}
