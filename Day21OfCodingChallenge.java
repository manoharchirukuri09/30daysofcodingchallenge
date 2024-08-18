1.Sum of numbers in string
      code
  class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        long ans = 0; 
        int temp = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i); 

            if (ch >= '0' && ch <= '9')
            {
                temp = temp * 10 + (ch - '0');
            }
            else
            {
                ans += temp;
                temp = 0;
            }
        }
        
        ans += temp;

        return ans;
    }
    
}


2.Upper case conversion
  code
  
class Solution
{
    public String transform(String s)
    {
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
     result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }

        return result.trim();

    }
}
