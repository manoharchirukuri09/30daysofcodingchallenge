1.Common Subsequence
   code
  class Sol
{
    Boolean commonSubseq (String a, String b)
    {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<a.length();i++) {
        list.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++) {
        if(list.contains(b.charAt(i))){ 
        return true;
        }
        }return false;      
    }
}

2.Remove Duplicates
  code
  class Solution {
    String removeDups(String str) {
         int n = str.length();
        String ans = "";
        String temp = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            String t = ch + "";

            if (!ans.contains(t)) {
                ans += ch;
            }
        }
        return ans;
    }
}
