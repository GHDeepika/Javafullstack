/* import java.util.*;

public class Fifth {
    public static void main(String[] args) {
        myFifth();
    }
    public static void myFifth(){
       /* int[][] arr={
                {1,2,3,},
                {3,4,5},
                {5,6,7}
    };
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr[1]));
*/
        /*Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        arr[0]=new int[3];
        arr[1]=new int[2];//  jack code
        arr[2]=new int[1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        sc.close();
    }
}
*/
//sum of all elements in array

/*
public class Fifth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
*/
// sum of matrix by skipping one row
/*
public class Fifth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 1) { // Skip 2nd row
                continue;
            }

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}*/


