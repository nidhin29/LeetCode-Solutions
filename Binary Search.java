class Solution {
    public int search(int[] nums, int target) {
        int top, bot, mid;
        int n= nums.length;
        top=0;
        bot=n-1;
        while(top<=bot) 
        {
          mid=(top+bot) /2;
          if(target==nums[mid])
          {
            return mid;
          }
          else{
                  if(target<nums[mid])
                  {
                    bot=mid-1;
                  }
                  else
                  {
                    top=mid+1;
                   }
             }}
     return -1;

    }
}
class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int [] nums = {1,2,3,1};
       int r =ob.search(nums,1);
       System.out.print(r);
    }
}