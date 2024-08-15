1,Find the duplicate number in Array
    code
  class Solution {
    public int findDuplicate(int[] nums) {
        int s = nums[0];
        int f = nums[0];
        do{
            s= nums[s];
            f = nums[nums[f]];
        }
        while(s != f);
            s= nums[0];
            while(s != f){
                s = nums[s];
                f = nums[f];
            }
            return f;
    }
}

2.Single number
   code
   class Solution {
    public int singleNumber(int[] nums) {
        int value=0;
        for(int i=0;i<nums.length;i++){
            value = value^nums[i];
        }
        return value;
    }
}
