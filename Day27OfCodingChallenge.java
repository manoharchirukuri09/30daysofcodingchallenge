1.Count the characters
  code
  class Sol {
    int getCount(String S, int N) {
        int[] freq = new int[26]; 
        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i) - 'a']++;
            if (i > 0 && S.charAt(i) == S.charAt(i - 1)) {
                freq[S.charAt(i) - 'a']--;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == N) {
                count++;
            }
        }
        return count;
    }
}

2.Permutations of a given string
  code
  class Solution {
    public List<String> find_permutation(String S) {
        char ch[]=S.toCharArray();
        Arrays.sort(ch);
        String ss=new String(ch);
        StringBuilder s=new StringBuilder();
        List <String> ans=new ArrayList<>();
        boolean map[]=new boolean[S.length()];
    
        
        helper(ss,ans,s,map);
        return ans;
    }
    public void helper(String S,List <String> ans,StringBuilder s,boolean map[]){
        if(s.length() == S.length()){
            if(!ans.contains(s.toString())){
            ans.add(s.toString());}
            
            return;
        }
        for(int i=0;i<S.length();i++){
            if(!map[i]){
                map[i]=true;
                s.append(S.charAt(i));
                helper(S,ans,s,map);
                s.deleteCharAt(s.length()-1);
                map[i]=false;
            }
        }
    }


    }
