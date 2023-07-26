import java.util.ArrayList;
import java.util.Scanner;

public class CommonEleLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		ArrayList<Integer> List1=new ArrayList<Integer>();

		ArrayList<Integer> List2=new ArrayList<Integer>();

		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{

		List1.add(sc.nextInt());

		}

		int m=sc.nextInt();

		for(int i=0;i<m;i++)
		{
			List1.add(sc.nextInt());
		}
		
		int a[]=arrayListSubtractor(List1, List2);

		for(int i=0;i<a.length;i++)
		{

		System.out.println(a[i]);
		}

	}

	private static int[] arrayListSubtractor(ArrayList<Integer> List1, ArrayList<Integer> List2)
	{
		
		// TODO Auto-generated method stub
		ArrayList<Integer> List3=new ArrayList<Integer>();
		List3.addAll(List1);

		List3.removeAll(List2);

		List2.removeAll(List1);

		List3.addAll(List1);

		int a[]=new int[List3.size()];

		for(int i=0;i<List3.size();i++){

		a[i]=List3.get(i);

		}
		return a;
	}
//	4 9 1 3 5 4 1 3 5 6
}
