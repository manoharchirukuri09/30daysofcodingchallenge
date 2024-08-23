1.Find the ASCII value of a character
   code
  // Update the '_' below to solve this problem
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    String a= read.next();
		    for(int j=0; j<a.length(); j++){
		        // To find ASCII value, store the character in an integer variable.
		        int ascii = a.charAt(j);
		        System.out.print(ascii + " ");
		    }
		    System.out.print("\n");
		}
	}
}

2.String length
  code
  class Codechef
{
    public static void main (String[] args)
    {
        String txt = "NumeroTres";
        int length = 0;
        for(char c : txt.toCharArray()) {
            length++;
        }

        System.out.println("The length of the word is: " + length);
    }
}
