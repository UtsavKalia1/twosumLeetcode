import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//
//                }
//            }
            //now doing this with hashmap as
            //it is much faster
          Integer complementindex =   complements.get(nums[i]);
          if (complementindex != null){
              return new int[]{i,complementindex};
          }
          complements.put(target-nums[i],i);
        }
        return nums;
    }
}
