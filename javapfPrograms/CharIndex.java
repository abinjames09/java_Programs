import java.util.Scanner;

public class CharIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		int ind=sc.nextInt();
		if(ind<0||ind>50)
		{
			System.out.println("Invalid");
			System.exit(0);
		}
		String res="";
		
		for(int i=0;i<50;i++)
		{
			res=res+s;
		}
		char c='c';
		//System.out.println(res);
		for(int i=0;i<res.length();i++)
		{
			c=res.charAt(ind);
		}
		System.out.println(c);
	}

}
