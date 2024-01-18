import java.util.ArrayList;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len3 = len1 + len2;
        List<Integer> nums3 = new ArrayList<>();

        for (int i = 0; i < len1; i++) {
            nums3.add(nums1[i]);
        }

        for (int j = 0; j < len2; j++) {
            nums3.add(nums2[j]);
        }

        nums3.sort(null);

        int mid = len3 / 2;
        double median;

        if (len3 % 2 == 0) {
            median = (nums3.get(mid - 1) + nums3.get(mid)) / 2.0;
        } else {
            median = nums3.get(mid);
        }

        return median;
    }
}

class Main {
    public static void main(String args[]) {
        Solution ob = new Solution();
        int[] num = { 2, 3 };
        int[] num1 = { 1, 4 };
        double r = ob.findMedianSortedArrays(num, num1);
        System.out.println(r);
    }
}
