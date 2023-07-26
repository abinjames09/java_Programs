import java.util.*;

public class vowels {
    public static String interchangeVowels(String str) {
        char[] chars = str.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int i = 0, j = chars.length - 1;
        while (i < j) 
        {
            if (!vowels.contains(chars[i])) 
            {
                i++;
                continue;
            }
            if (!vowels.contains(chars[j])) 
            {
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return new String(chars);
        
    }
    public static void main( String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.next();
    	String output=interchangeVowels(str);
    	System.out.println(output);
    }
}
