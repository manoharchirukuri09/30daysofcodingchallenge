1.Square star pattern
  code
  public class Solution {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
        }
    }
        public static void main(String[] args){
            nForest(3);
        
    }
}

2.Hollow Square Star Pattern
  code
  public class Solution {
    public static void getStarPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args){
        getStarPattern(4);
    }
}
