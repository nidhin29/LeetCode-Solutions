class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int maxArea=0;
        int right=(height.length)-1;
        while(left<right)
        {
            area = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(area,maxArea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            
        }
        return maxArea;
    }
}

class Main
{
    public static void main(String args[])
    {
        Solution ob = new Solution();
        int[] b= {1,2,3,4,5};
        int a = ob.maxArea(b);
        System.out.print(a);
    }
}
