package Recursion;

public class Binary {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};
        int target = 5;

        int result = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        // Base case
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, end);
    }
}