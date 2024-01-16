class Solution {
    public int searchInsert(int[] nums, int target) {

       int length = nums.length;
       int flag=0;
       for(int i=0;i<length;i++)
       {
           if(nums[i] == target)
           {
               flag=1;
               return i;
           }
       } 
       if(flag==0)
       {
           for(int i=0;i<length;i++)
       {
           if(target<nums[i])
           {
               return i;
           }
       } 
       }
       return length;
    } 
}
class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int[] num = {1,3,5,6};
        int s =ob.searchInsert(num,5);
        System.out.println(s);
    }
}