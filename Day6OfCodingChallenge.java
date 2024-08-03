1. Reverse Integer
  
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21

  Code
  class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int digit = x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=(rev*10) + digit;
             x=x/10;
        }
        return rev;
    }
}


2. Armstrong Number 
  Code
  class Solution {
    static String armstrongNumber(int n) {
        // code here
        int temp=n;
        int sum=0;
        while(n>0){
            int r = n%10;
            n=n/10;
            sum +=(r*r*r);
        }
        if(temp==sum){
            return "true";
        }else{
            return "false";
        }
    }
}
