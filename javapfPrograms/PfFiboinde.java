import java.util.*;

public class PfFiboinde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int i= 1;
        while (true) {
            c = a + b;
            if (Digits(n,c)) {
                System.out.println(i+1);
                break;
            }
            a = b;
            b = c;
            i++;
        }
    }
    
    static boolean Digits(int n, int num) {
        if (num == 0 && n == 1) {
            return true;
        }
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count == n;
    }
}
