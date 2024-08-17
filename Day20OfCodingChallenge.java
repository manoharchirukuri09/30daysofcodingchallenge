
1.Remove all characters other than alphabets
      Code
   class Solution{
    String removeSpecialCharacter(String s) {
         String str=s.replaceAll("[^a-zA-Z]","");
        if(str.length()==0){
            return "-1";
        }
        return str;
    }
}

2.Remove Spaces from string
    code
  class Solution
{
    String modify(String S)
    {
    return S.replace(" ","");
    }
}
