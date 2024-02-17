class Solution {
    public int search(int[] num, int target) {
        int left =0, right = num.length - 1;
        int mid;
        while(left<=right)
        {
             mid =(left+right)/2;
            if(target == num[mid])
            {
                return mid;
            }
            else if(num[left] <= num[mid])
            {
               if(target > num[mid] || target < num[left])
               {
                   left=mid+1;
               }
               else
               {
                   right=mid-1;
               }
            }
             else if(num[right] >= num[mid])
            {
               if(target < num[mid] || target > num[right])
               {
                   right=mid-1;
               }
               else
               {
                   left=mid+1;
               }
            }
        }
        return -1;
    }
}

class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int[] b= {1,2,3,4,5};
        int a = ob.search(b,5);
        System.out.print(a);
    }
}