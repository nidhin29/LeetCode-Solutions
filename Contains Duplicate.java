class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> n = new HashSet<>();
       int i=0;
       while(i<nums.length)
       {
          if(!n.contains(nums[i]))
          {
              n.add(nums[i]);
              i++;
          }
          else
          {
              return true;
          }
       }
       return false;
    }
}
class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int [] nums = {1,2,3,1};
       boolean r =ob.containsDuplicate(nums);
       System.out.print(r);
    }
}