class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
           for(int j=0;j<len;j++)
        {   
            if(nums[i]+nums[j]==target)
            {
                    System.out.print("hi");
                return new int[]{i,j};
            }   
        }  
        }
        return new int[]{};
    }
}
class Main {
    public static void main(String args[]) {
        Solution ob = new Solution();
        int[] num = { 2, 7 };
        int[] r = ob.twoSum(num, 9);
        System.out.println(r);
    }
}