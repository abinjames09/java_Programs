import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long result=convertDecimalToBinary(n);
		System.out.println(result);
	}

	 static long convertDecimalToBinary(int num) {
		 
		 String binary = "";
			while (num > 0) {
			    int remainder = num % 2;
			    binary = remainder + binary;
			    num = num / 2;
			}
			  long output=Long.parseLong(binary);

			return output;
		
		
	}

}
