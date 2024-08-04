1.Strong Number
  Code
  
  class Solution {
    static int isStrong(int N) {
         int temp = N;
        int cal = 0;
        while(temp!=0)
        {
            cal += calculateFac(temp%10);
            temp /= 10;
        }
        return cal==N?1:0;
    }
    static int calculateFac(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        return fact;
    }
};

2.Perfect Number
Code
  class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1){
            return false;
        }
         int sum=1;
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    sum += i + num/i;
                }
            }
            return num==sum;
    }
}
