import java.text.ParseException;
import java.util.*;

public class PassWdValidation 
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.matches("((?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$!]).{8,})")) 
		{
			System.out.println("valid");
		} 
		else
		{
			System.out.println("Not Valid");
		}
	}
}
//The regular expression "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#%])(?=\\S+$).{8,}$" consists of the following:
//
//^ - start of the string
//(?=.*[0-9]) - at least one digit
//(?=.*[a-zA-Z]) - at least one letter
//(?=.*[@#%]) - at least one special character
//(?=\\S+$) - no whitespace allowed
//.{8,} - at least 8 characters
//$ - end of the string
//Validation Rule:
//
//Atleast 8 characters
//
//Atleast 1 number(1,2,3...)
//
//Atleast 1 special character(@,#,%...)
//
//Atleast 1 alphabet(a,B...)