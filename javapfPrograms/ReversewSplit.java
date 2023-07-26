import java.util.Scanner;

public class ReversewSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		
		char a=sc.next().charAt(0);
		
		
		StringBuilder st=new StringBuilder(s);
		StringBuilder sb=new StringBuilder();
		
		String newS=st.reverse().toString();
		String out="";
		
		for(int i=0;i<newS.length();i++)
		{
			sb.append(newS.charAt(i));
			sb.append(a);	
			
		}
		int n=sb.length();
		sb.replace(n-1,n,"");
		
		System.out.println(sb.toString());
	}

}
