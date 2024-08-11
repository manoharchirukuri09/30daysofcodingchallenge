1.Power of a number
   code
  import java.util.* ;
import java.io.*; 

class Solution {

	public static long Pow(int X, int N) {
		 if(N == 0){
            return 1;
        } else if (X == 0) {
            return 0;
        } else if (N < 0) {
            return 1 / Pow(X, -N); 
        } else {
            return X * Pow(X, N-1);
        }
    }
}

2. Largest Element in the Array
   code
  import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;

    }
}
