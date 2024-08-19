Check String
   code    
class Sol
{
    Boolean check (String s)
    {
         boolean flag=true;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                flag=false;
            }
        }
        
        if(flag==true){
            return true;
        }else{
            return false;
        }     
    }
}

 2.Consonants and Vowels check 
    code
    class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
          for (char ch : s.toCharArray()) {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } 
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                c++;
            }
        }
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
