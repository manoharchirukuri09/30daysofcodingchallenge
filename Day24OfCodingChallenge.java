1.Find and Replace in String
    Code
  class Solution {
    static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
        StringBuilder ans = new StringBuilder();
        int j = 0;

        for (int i = 0; i < S.length(); ) {
            if (j < index.length && i == index[j]) {  
                String h = sources[j];
                int size = h.length();
                String h1 = S.substring(i, i + size);

                if (h.equals(h1)) {
                    ans.append(targets[j]);
                    i += size;
                } else {
                    ans.append(S.charAt(i++));
                }

                j++;  
            } else {
                ans.append(S.charAt(i++));
            }
        }

        return ans.toString();
    }
}

2.Replace a word
   code
  class Solution {
    static String replaceAll(String str, String oldW, String newW) {
         str = str.replace(oldW,newW);
        return str;
    }
}
