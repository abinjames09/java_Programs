import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WAterTAnk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		
		    String patt=sc.nextLine();
		   
	        int minvalue=Integer.MAX_VALUE;
		    for (int i = 0; i < str.length(); i++) {
		    	
	            if (patt.indexOf(str.charAt(i))!=-1) 
	            {
	            	
	               int a=i;
	                System.out.println(a);
	                if(a<minvalue)
		            {
		            	minvalue=a;
		            }
	            }
	            
	            
	        }
		    System.out.println(minvalue);
	      

	}

}
