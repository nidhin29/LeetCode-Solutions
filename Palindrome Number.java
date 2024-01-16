class Solution {
    public boolean isPalindrome(int x) {
        
        int sum=0;
        int k=x;
        while(x>0)
        {
            int r = x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(sum == k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int x= 121;
        ob.isPalindrome(x);
    }
}