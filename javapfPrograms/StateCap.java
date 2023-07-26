import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter limit");
		int n=sc.nextInt();
		
		Map<String,String> scap=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			scap.put(sc.next(),sc.next());
		}
		
		System.out.println("enter state:");
		String s=sc.next();
		
		for(Map.Entry e:scap.entrySet())
		{
			if(e.getKey().equals(s))
			{
				System.out.println(e.getKey()+"&"+e.getValue());
			}
		}
	}

}
