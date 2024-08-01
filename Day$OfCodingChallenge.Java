1.Factorial number
  Given a positive integer, N. Find the factorial of N.
 Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
  
 CODE  
class Solution{
    static long factorial(int N){
        // code here
       if(N==0 || N==1){
           return 1;
       }
        return N*factorial(N-1);
    }
}

2.palindrome Number Check 

  class Solution {
    public boolean isPalindrome(int x) {
       int temp=x;
       int rev=0;
       while(x>0){
        int digit= x%10;
        rev = (rev*10) +  digit;
        x = x/10;
       } 
       if(rev==temp){
        return true;
       }else{
        return false;
       }
    }
}
  
