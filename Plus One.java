class Solution 
{
    public int[] plusOne(int[] digits)
     {
      for (int i = digits.length - 1; i >= 0; i--) 
      {
	      if (digits[i] < 9) 
          {
		    digits[i]++;
		   return digits;
	      }
	digits[i] = 0;
      }

         digits = new int[digits.length + 1];
         digits[0] = 1;
         return digits;
     }
}

class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int[] digits = {1,2,3};
       int[] r =  ob.plusOne(digits);
        System.out.print(r);
    }
}