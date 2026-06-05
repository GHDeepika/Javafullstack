//left right sum difference
/*import java.util.*;
public class Day2
{
    public static void main(String[] args) {

        int arr[]={10,4,8,3};

        int left[]=new int[arr.length];

        int right[]=new int[arr.length];

        left[0]=0;
        right[arr.length-1]=0;

        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]+arr[i-1];
        }

        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(left[i]-right[i]);
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(arr));

    }
}
*/
 // IBM problem buying and selling
/*import java.util.*;
public class Day2
{
    public static void main(String[] args) {

        int prices[] = {100,180,260,310,40,5,695};

        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] > prices[i - 1]) {

                profit = profit + (prices[i] - prices[i - 1]);
            }
        }

        System.out.println(profit);
    }
}
*/
/*
/*import java.util.*; -------------->running sum
public class Day2
{
    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    }
 */

/*
import java.util.*;

public class Day2
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            arr[i] = sum;
        }

        System.out.println(Arrays.toString(arr));
    }
}


*/




/*

//left sum and right sum difference
import java.util.*;
public class second
{
    public static void main(String[] args) {

        int arr[]={10,4,8,3};

        int left[]=new int[arr.length];

        int right[]=new int[arr.length];

        left[0]=0;
        right[arr.length-1]=0;

        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]+arr[i-1];
        }

        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(left[i]-right[i]);
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(arr));

    }
}

*/



//move zeros to end
/*
import java.util.*;

public class second
{
    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};

        int index = 0;

        // move non-zero elements
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {

                arr[index] = arr[i];
                index++;
            }
        }

        // fill remaining with zeros
        for(int i = index; i < arr.length; i++) {

            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
 */

/*
public class Day2{
    public static void main(String[] args){
        int arr[]={100,180,260,310,40,535,695};

        int profit=0;
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + (arr[i] - arr[i - 1]);

            }
        }


        System.out.println(profit);

    }
}
*/