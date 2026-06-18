package TCSNQT;
import java.util.*;
public class Tableconference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 2;
        for(int i=1;i<n;i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }
}