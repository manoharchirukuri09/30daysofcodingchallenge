1.Harshad Number

  code

  class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int N=x;
        int sum=0;
        while(x!=0){
            int digit= x%10;
            sum += digit;
            x = x/10;
        }
        return N%sum ==0 ? sum : -1;
    }
}

2.Abundant Number

  code

  package ConditionalStatements;
import java.util.*;
public class AbundantNumber {
    public static boolean isAbundantNumber(int n)
    {
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum>n){
            return true;
        }else{
            return false;
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isAbundantNumber(n)){
            System.out.println(  "abundant number");
    } else{
        System.out.println("not abundant number");
    }
}
}
