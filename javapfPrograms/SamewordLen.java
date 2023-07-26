import java.util.Scanner;

public class SamewordLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		System.out.println(compareLastWords(s));
	}

	static int compareLastWords(String s) {
		// TODO Auto-generated method stub
		
		int result=0;
		String[] str=s.split(" ");
		int n=str.length;
		String first=str[0];
		String last=str[n-1];
		
		if((first.equals(last)))
		{
			result=first.length();
		}
		else
		{
		result=first.length()+last.length();
		}
		return result;
	}

}
