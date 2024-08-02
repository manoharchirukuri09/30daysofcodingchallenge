1. Leap Year
  
  For an input year N, find whether the year is a leap or not. 
 
  Code
  class Solution{
    static int isLeap(int N){
         if(N%100!=0 && N%4==0){
            return 1;
        }else if(N%100==0 && N%400==0){
            return 1;
        }else{
            return 0;
        }
            
        }
    }

2.Greatest of three numbers

  Given 3 numbers A, B and C. Find the greatest number among them.

  class Solution {
    int greatestOfThree(int A, int B, int C) {
        // code here
        if(A>B && A>C){
            return A;
        }else if(B>C && B>A){
            return B;
        }else{
            return C;
        }
    }
}

  
