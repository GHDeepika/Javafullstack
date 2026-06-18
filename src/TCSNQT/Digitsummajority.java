package TCSNQT;
import java.util.*;
public class Digitsummajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Digit sums
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int num = arr[i];
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            res[i] = sum;
        }
        int maxCount = 0;
        // Frequency check using nested loops
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(res[i] == res[j]) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}