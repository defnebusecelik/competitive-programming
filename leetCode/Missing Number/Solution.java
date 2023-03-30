class Solution {
    public int missingNumber(int[] nums) {
      int sum =0;
      int an = nums.length;
      int n = nums.length+1;

      for (int num:nums) 
        sum+=num;
      return (n*(0+an)/2)-sum;  
    }
}
