import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		
		int result=getVowels(s);
		if(result==1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	static int getVowels(String s) {
		// TODO Auto-generated method stub
		
		String str=s.toLowerCase();
		String v="aeiou";
		boolean flag= true;
        for (char vowels : v.toCharArray()) {
            if (!str.contains(String.valueOf(vowels))) {
                flag = false;
                break;
            }
        }
        int output=0;
		if(flag)
		{
			output=1;
		}
		else
		{
			output=-1;
		}
		
		return output;
	}

}
