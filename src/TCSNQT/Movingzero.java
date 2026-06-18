package TCSNQT;
//TCS NQT coding question september dat 1- slot 1
//move zeroes to right end
/*
public class Movingzero {
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i <arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
import java.util.Scanner;
public class Movingzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        // Fill remaining positions with zeros
        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }
        System.out.println("Array after moving zeros to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}