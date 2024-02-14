import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> nums2 = new ArrayList<>();
        for(int i=0;i<(nums.length);i++)
        {
             if(nums[i]!=val)
             {
                 nums2.add(nums[i]);
             }
        }
         for(int i=0;i<(nums2.size());i++)
        {
           nums[i] = nums2.get(i);
        }
    int k = nums2.size();
    return k;
    }
    
}

class Main {
    public static void main(String args[]) {
        Solution ob = new Solution();
        int[] b = {0,1,0,2,1,0,1,3,2,1,2,1};
        int a = ob.removeElement(b,2);
        System.out.println(a);
    }
}