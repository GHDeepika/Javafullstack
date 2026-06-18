package TCSNQT;
import java.util.*;
public class DigitsumAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int sum1 =0;
        int sum2 =0;
        while( n > 0)
        {
            sum1 += n % 10;
            n = n/10;
        }
        sum1 = sum1*r;
        int m = sum1;
        while(m > 0)
        {
            sum2 += m % 10;
            m = m/10;
        }
        System.out.println(sum2);
    }
}
