class Solution {
    public int[] searchRange(int[] nums, int target)
     {
       List<Integer> n = new ArrayList<>();
       List<Integer> m = new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]== target)
           {
                 n.add(i);
           }
       } 
      if (!n.isEmpty()) {
            m.add(n.get(0));
            m.add(n.get(n.size() - 1));
        } else {
            m.add(-1);
            m.add(-1);
        }
        return m.stream().mapToInt(Integer::intValue).toArray();
     }
}
class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int[] digits = {5,7,7,8,8,10};
       int[] r =  ob.searchRange(digits,8);
        System.out.print(r);
    }
}