1.Reverse The Array
    code
    class Get {
    public static void reverseArray(int arr[],int n) {
        int first =0;
        int last =n-1;
        while(first<=last){
            int temp = arr[last];
            arr[last]= arr[first];
            arr[first]= temp;
            first++;
            last--;
        }
}
}

2.Sum of Array
   code
   class Solution {
    int sum(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
