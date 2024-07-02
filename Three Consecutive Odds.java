class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<(arr.length - 2);i++)
        {
            if(arr[i] % 2 !=0 )
            {
                if(arr[i+1]%2!=0 && arr[i+2]%2!=0)
                {
                    return true;
                }
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
        int[] b= {1,2,3,4,5};
        boolean a = ob.threeConsecutiveOdds(b);
        System.out.print(a);
}
}