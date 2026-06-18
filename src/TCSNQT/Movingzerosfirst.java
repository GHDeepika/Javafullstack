package TCSNQT;
import java.util.*;
public class Movingzerosfirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int index =n-1;
        for(i=n-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[index] = arr[i];
                index--;
            }
        }
        while(index>=0)
        {
            arr[index] = 0;
            index--;
        }
	    /*for(i=0;i<n;i++)
	    {System.out.print(arr[i] + " ");}*/
        System.out.print(Arrays.toString(arr));
    }
}