1. Second largest element in Array 
      Code
     class Solution {
    public int print2largest(List<Integer> arr) {
        int n = arr.size();
        if (n < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int current = arr.get(i);
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current < largest) {
                secondLargest = current;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }
}

2. Check if Array Is Sorted and Rotated
      code
  class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
