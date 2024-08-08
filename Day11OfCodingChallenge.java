1. Nth Fibonacci Number
      code
  class Solution {
    static int nthFibonacci(int n){
         int a=0,b=1,c=0 ;
        for( int i=1;i<n;i++)
        {
              c=(a+b)%1000000007;
            a=b;
            b=c;    
        }
        return c;
    }
}

2.Number of factors
    code
   class Solution{
    static int countFactors(int N) {
        int count =0;
        for(int i=1;i<=N;i++)
        {
            if(N%i == 0)
            {
                count++;
            }
        }
        return count;
        
    }
}

3. Print 1 To N Without Loop
      code
  class Solution{
 public void printNos(int N){
        if(N==1){
            System.out.print(1 +" ");
            return;
        }
          printNos (N-1);
          System.out.print(N +" ");
       
       
    }
}

