1.Find the Frequency in Array
  code
  class Solution{
    int findFrequency(int Arr[], int X){
        int count =0;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]==X){
                count++;
            }
        }
        return count;
    }
}

2.MaxSum Array
   Code
  class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currtSum =0;
        for(int i=0;i<nums.length;i++){
            currtSum = Math.max(currtSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currtSum);
        }
        return maxSum;
    }
}
