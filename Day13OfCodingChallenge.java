1.HCF of two numbers
   code
    import java.util.*;
class HCF{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the number:");
        int num2 = sc.nextInt();
        int hcf=0;
        while(num1 != num2){
            if(num1 > num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }
            
        }
        System.out.println("The Hcf of numbers: "+ num1);
    }
}

2.LCM of Two Numbers
   code
  
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long gcd = gcd(A, B);
        Long lcm = (A * B) / gcd;
        return new Long[]{lcm, gcd};
    }
    
    static Long gcd(Long A, Long B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
        
        
    }
};
