import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VowelInterChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=s.toLowerCase();
		List<Integer> sindex=new ArrayList<>();
		List<Character> svow=new ArrayList<>();
		for(int i=0;i<s1.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				sindex.add(i);
				svow.add(s1.charAt(i));
			}
		}
		Collections.reverse(svow);
		System.out.println(sindex);
		System.out.println(svow);
		
		List<Character>  schar=new ArrayList<>();
		for(int i=0;i<s1.length();i++)
		{
			schar.add(s1.charAt(i));
		}
		
		System.out.println(schar);
		for(int i=0;i<s1.length();i++)
		{
			
		}
	}

}
