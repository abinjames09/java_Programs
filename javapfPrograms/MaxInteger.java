import java.util.Scanner;

public class MaxInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		int sum=0;
		while(sum<=n)
		{
			sum +=i*(i+1)/2;
			i++;
			
		}
		System.out.println(i-1);

	}

}
