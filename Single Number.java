class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        for(int i=0;i<length;i++)
        {
            int n = nums[i];
            int count=0;
              for(int j=0;j<length;j++)
              {
                  if(n == nums[j])
                  {
                     count++;
                  }
              }
              if(count ==1)
              {
                  return n;
              }
        }
        return 0;
    }
}
class Main
{
     public static void main(String args[])
     {
        Solution ob = new Solution();
        int[] num = {2,2,1};
        int r = ob.singleNumber(num);
        System.out.println(r);
    }
}