1.Prime Factors
    Code
  class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> al=new ArrayList<>();
        
        int index = 0;
        for(int i = 2; i <= N; i++){
            
            if(N % i == 0 && checkPRime(i)){
                al.add(i);  
                index++;
            }
        }
        int[] inL =new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            inL[i] = al.get(i);
            
        }
        return inL;
    }
    
    static boolean checkPRime(int n){
        if(n == 2)
            return true;
        else{
        
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    
    }
}

2.Friendly Pairs
    code
  import java.util.Scanner;
    public class FriendlyPairs {
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();  
        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);
        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are Friendly Pairs.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not Friendly Pairs.");
        }
        sc.close();
    }
}
