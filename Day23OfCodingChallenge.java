1.First Unique Character in a String
    code
   class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        for(char c : ch){
            freq[c - 'a'] ++;
        }
        for(int i=0;i<ch.length;i++){
            if(freq[ch[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}

2.Check if two strings are Anagram or not 
     code
  class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] charcount = new int[26];
        for(char c : s.toCharArray()){
            charcount[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            charcount[c - 'a']--;
        }
        for(int count : charcount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
