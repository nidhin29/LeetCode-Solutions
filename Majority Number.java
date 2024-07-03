class Solution {
    public int majorityElement(int[] nums) {
       int majority = nums[0];
       int votes = 1;

       for(int element : nums)
       {
           if(majority == element)
           {
            votes++;
           }
           else if(majority != element)
           {
            votes--;
           }

           if(votes == 0)
           {
            majority = element;
            votes++;
           }

       }
                     return majority;
    }
}