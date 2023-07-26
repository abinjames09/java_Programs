import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String date=sc.next();
		
		StringTokenizer st=new StringTokenizer(date,"/");
		boolean flag=false;
		while(st.hasMoreTokens())
		{
			int day=Integer.parseInt(st.nextToken());
			int mon=Integer.parseInt(st.nextToken());
			int year=Integer.parseInt(st.nextToken());
			
			GregorianCalendar gc = new GregorianCalendar();
			flag=gc.isLeapYear(year);
			System.out.println(flag);
		}
	}

}
