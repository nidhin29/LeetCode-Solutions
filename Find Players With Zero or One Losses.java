import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int length = matches.length;
        int winCount =0;
        List<Integer> con1 = new ArrayList<>();
        List<Integer> con2 = new ArrayList<>();
        List<Integer> con3 = new ArrayList<>();
        int losecount = 0;

        for (int i = 0; i < length; i++) {
            int winner = matches[i][0];
            for (int j = 0; j < length; j++) 
            {  
                if (winner != matches[j][1])
                 {
                   winCount++;
                 } 
                else 
                {
                  losecount++;
                }
            }
           if(winCount== (length)&& losecount == 0)
           {
              con1.add(winner);
           }
           else if(losecount == 1 && winCount>0)
           {
              con2.add(winner);
           }
           winCount=0;
           losecount=0;
        }
         for (int i = 0; i < length; i++) 
         {
             con3.add(matches[i][1]);
         }


        int len2 = con3.size();
        int len = con1.size();
        int len1 = con2.size();
        List<List<Integer>> corr = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
         List<Integer> x = new ArrayList<>();
         con1.sort(null);
         con2.sort(null);
        for (int i = 0; i < len; i++)
         {
            if (!h.contains(con1.get(i))) {
                h.add(con1.get(i));
            }
        }

        for (int i = 0; i < len1; i++) {
            if (!l.contains(con2.get(i))) {
                l.add(con2.get(i));
            }
        } 
       
         for (int i = 0; i < len2; i++)
         {  int c=0;
            int num = con3.get(i);
            for (int j=0;j<len2;j++)
            {
                 if(num == con3.get(j))
                 {
                      c++;
                 }

            }
            if(c==1)
            {
                l.add(con3.get(i));
            }
         }
           int len3 = l.size();
          for (int i = 0; i < len3; i++) {
            if (!x.contains(l.get(i))) {
                x.add(l.get(i));
            }
        } 
        x.sort(null);
        corr.add(h);
        corr.add(x);
        return corr;
    }
}

class Main 
{
    public static void main(String args[])
     {
        Solution ob = new Solution();
        int[][] matches = {{1, 2}, {2, 3}, {3, 4}, {4, 1}};
        List<List<Integer>> result = ob.findWinners(matches);
        System.out.println(result);
    }
}
