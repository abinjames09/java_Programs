import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConcatLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		
		
		String result=concatCharacter(arr);
	      
			System.out.println(result);
		
}

	private static String concatCharacter(String[] arr) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			char[] car=new char[1000];
			car=arr[i].toCharArray();
			int l=car.length;
			char c=car[l-1];
			String result=c+"";
			s.add(result);
			
		}
		
		String[] res=s.toArray(new String[0]);
		String output="";
		for(int i=0;i<res.length;i++)
		{
			output +=res[i];
		}
		
		
		return output;
	}

}
