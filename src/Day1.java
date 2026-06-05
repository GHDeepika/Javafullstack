/* import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length-1; i++) {
            arr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
*/
/*
import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i+=2) {  //to print even index
       //for(int i=1;i<arr.length;i+=2){  //to print odd index
        System.out.println(arr[i]);

    }
    */

//without using function
   /* public class Day1 {
    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 5, 7, 4, 1, 2};
        int r = 7;
        int unit = 2;
        int sum = 0;
        int total = r * unit;

        if(arr.length == 0){
           System.out.println("-1");
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= total) {
                System.out.println(i + 1);break;
            }
        }
        if(sum<total){
            System.out.println("0");
        }

    }
}
*/

//using function
/*
```java
public class Day1 {

    // Function to find minimum houses needed
    public static int foodHouse(int r, int unit, int arr[]) {

        int totalFood = r * unit;
        int sum = 0;

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum >= totalFood) {
                return i + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int arr[] = {2, 8, 3, 5, 7, 4, 1, 2};
        int r = 7;
        int unit = 2;

        int result = foodHouse(r, unit, arr);

        System.out.println(result);
    }
}
```

 */
