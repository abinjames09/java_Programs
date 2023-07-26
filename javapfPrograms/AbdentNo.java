import java.util.Scanner;
public class AbdentNo {

	public static boolean abdNo(int i)
	{
		
			int sum=0;

			for(int j =1; j<i; j++) 
			{
		         if(i% j == 0) 
		         {
		            sum=sum+j;
		         }
			}
			return sum>i;
			
			
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting");
		int s=sc.nextInt();
		System.out.println("enter end");
		int e=sc.nextInt();
		boolean ss=false;
		for( int i=s;i<=e;i++)
		{
			if(abdNo(i))
			{
				System.out.println(i);
				ss=true;
			}
		}
		if(!ss)
		{
			System.out.println("-1");
		}
		
		
	}

}
