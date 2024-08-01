1.Sum of First N natural numbers

Input: N = 10
Output: 4
Explanation: Sum of first 4 natural
number is 1 + 2 + 3 + 4 = 10.     

Input: N = 17
Output: -1
Explanaion: There is no such number.


code

class Solution
{
    public int find(int n)
    {
        
        int sum=0,i=1;
        while(sum<n)
        {
            sum=i*(i+1)/2;
            if(sum==n)
                return i;
            else
                i++;
        }
        return -1;
    }    
};
     












1. Sum of natural numbers

import java.util.*;

public class SumOfNatralNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        System.out.println("The sum of natural numbers is: " + sum);
    }
}
