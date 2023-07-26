import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class EmployeeBonus {
 static TreeMap<Integer, Integer> calculateRevisedSalary(
      HashMap<Integer, String>Map1, HashMap<Integer, Integer>Map2) {
    
    TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate ldate = LocalDate.parse("01-09-2014", formatter);
    
    for (Map.Entry<Integer, String> e :Map1.entrySet()) {
      int id = e.getKey();
      String dobS = e.getValue();
      int salary =Map2.get(id);
      LocalDate dob = LocalDate.parse(dobS, formatter);
      int age =ldate.getYear() - dob.getYear();
      
      int newslry;
      if(salary<5000) 
      {
        newslry=-100;
      }
      else if(age>=25&&age<=30)
      {
        newslry =(int)(salary * 0.2);
      }
      else if (age >= 31 && age <= 60)
      {
        newslry=(int) (salary * 0.3);
      } 
      else
      {
        newslry=-200;
      }
      if (newslry==-100&&(age<25||age>60))
      {
        newslry=-100;
      } 
      else if (newslry==-200&&(salary<5000)) 
      {
        newslry=-100;
      }
      result.put(id, newslry + salary);
    }
    
    return result;
  }



  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    HashMap<Integer, String> Map1 = new HashMap<Integer, String>();
    HashMap<Integer, Integer>Map2 = new HashMap<Integer, Integer>();
    
    for (int i = 0; i < n; i++) {
      int id = scanner.nextInt(); 
      String dob = scanner.next();
      int salary = scanner.nextInt();
      Map1.put(id, dob);
      Map2.put(id, salary);
    }
    
    TreeMap<Integer, Integer> result = calculateRevisedSalary(Map1,Map2);
    
    for (Map.Entry<Integer, Integer> entry :result.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
  }
}
