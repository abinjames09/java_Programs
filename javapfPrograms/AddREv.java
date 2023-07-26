import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddREv {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	       System.out.println("enter limit");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int no=sc.nextInt();
	        int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>no)
				{
					sum+=arr[i];
				}
				
			}
			int tsum=0;
			while(sum>0)
			{
				int r=sum%10;
				tsum=(tsum*10)+r;
				sum=sum/10;
			}
			System.out.println(tsum);
	        
	       
	        
	}

}
