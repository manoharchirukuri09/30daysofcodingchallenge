1.Check perfect square

  class Solution {
    static long isPerfectSquare(long n){
        for(int i =1 ; i <= n ; i++){
            if(i*i == n)
            return 1;
        }
        return 0;
    }
}

2.Automorphic Number

  class Solution
{
    public String is_AutomorphicNumber(int n)
    {
         
        int last = n%10;
        int ans = (int) Math.pow(n, 2);    
        int temp = ans%10;
        
        if(last == temp){
            return "Automorphic";
        }else{
            return "Not Automorphic";
        }
    }
}
