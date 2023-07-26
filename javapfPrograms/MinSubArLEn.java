import java.util.Scanner;

public class MinSubArLEn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enyer limit");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enyer elemnts");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enyer sum");
		int x=sc.nextInt();	
		
		int sum=0;
		int minlen=Integer.MAX_VALUE;
		int count=0;
		for(int i=0;i<n;i++)
		{
			sum +=arr[i];
			
			while(sum>=x)
			{
				minlen=count;
				count++;
				
			}
		}
		if(count<minlen)
		{
			count=minlen;
			
		}
		System.out.println(minlen);
	}

}
