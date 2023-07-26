import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EvenSumRemoveDupicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter limit");
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Set<Integer> uniqueNo = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			uniqueNo.add(arr[i]);
		}
		Integer[] narr= uniqueNo.toArray(new Integer[0]);
		int sum=0;
//		System.out.println(narr.toString());
		for(int i=0;i<narr.length;i++)
		{
			if(narr[i]%2==0)
			{
				sum=sum+narr[i];
			}
		}
		
		if(sum!=0)
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println("-1");
		}
	}
//	2 3 54 1 6 7 7
}
