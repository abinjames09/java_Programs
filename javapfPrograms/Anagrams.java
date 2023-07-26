import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String s1=sc.nextLine();

		String s2=sc.nextLine();
		
		int result=getAnagram(s1,s2);
		if(result==1)
		{
		System.out.println("Anagrams");
		}
		else {
			System.out.println("not Anagram");
		}
		
	}

	private static int getAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		ArrayList<Character> list1=new ArrayList<>();
		ArrayList<Character> list2=new ArrayList<>();
		for(int i=0;i<s1.length();i++)
		{
			list1.add(s1.charAt(i));
		}
		
		for(int i=0;i<s2.length();i++)
		{
			list2.add(s2.charAt(i));
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		int result=0;
		if(list1.containsAll(list2))
		{
			result=1;
		}
		
		return result;
	}

}
