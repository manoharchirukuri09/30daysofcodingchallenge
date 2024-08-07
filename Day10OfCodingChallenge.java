1.Prime Number or not

  code
  class Solution{
    static int isPrime(int N){
        // code here
        if( N<=1){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                return 0;
            }
        }
        return 1;
    }
}

2.Find Prime numbers in a range

  Code

  class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> list=new  ArrayList<Integer>();
        int value=0;
        int count=0;
        for(int i=M;i<=N;i++){
            count=0;
            // value=(int)Math.sqrt(i);
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                
                if(i%j==0){
                  count++;
                  if(count>0){
                      break;
                  }
                }
            }
            if(count==0 && i!=1){
                list.add(i);
            }
        }
        return list;
    }
}
        
        

