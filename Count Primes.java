class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        boolean[] a = new boolean[n];
        for(int i=2;i<n;i++)
        {
            a[i] = false;
        }
        for(int i=2;i*i<n;i++)
        {
            for(int j=i*i;j<n;j=j+i)
            {
                if(a[j]== false)
                {
                    a[j]= true;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++)
        {
           if(a[i]== false)
                {
                    count++;
                } 
        }

        return count;
    }
}

class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        ob.countPrimes(10);
    }
}