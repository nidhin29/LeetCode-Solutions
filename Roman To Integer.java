class Solution {
    private int val(char ch)
    {
      switch(ch)
      {
        case 'I' : return 1;
        case 'V' : return 5;
        case 'X' : return 10;
        case 'L' : return 50;
        case 'C' : return 100;
        case 'D' : return 500;
        case 'M' : return 1000;
      }
     return 0;
    }
    public int romanToInt(String s) {
      int curr = val(s.charAt(0));
      int result=0;
      
      for(int i=1;i<s.length();i++)
      {
        int next = val(s.charAt(i));
        if(curr < next)
        {
           result-=curr;
        }
        else
          result+=curr;
        curr = next;
      }
      result += curr;
    return result;
    }
}