import java.util.*;  
import java.util.Map.*;  
  
class Solution {  
    public int majorityElement(int[] nums) {  
        Map<Integer, Integer> map = new TreeMap<>();  
        for (int num : nums) {  
            map.merge(num, 1, Integer::sum);  
        }  
        int maxKey = -1;  
        int maxValue = -1;  
        for (Entry<Integer, Integer> entry : map.entrySet()) {  
            if (maxValue < entry.getValue()) {  
                maxValue = entry.getValue();  
                maxKey = entry.getKey();  
            }  
        }  
        return maxKey;  
    }  
}