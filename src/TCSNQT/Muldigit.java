package TCSNQT;
import java.util.*;
public class Muldigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        while(n!=0)
        {
            mul *= n % 10;
            n = n/10;
        }
        System.out.println(mul);
    }
}