package DSA.Searching;

import java.util.Arrays;

public class linearSrchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 23, 54},
                {4, 5},
                {0, -2, 34, 54, -5}
        };
        int[] result = srch(arr, -5);
        System.out.println(result);
    }

    public static int[] srch(int arr[][], int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (target == arr[r][c]) {
                    return new int[]{r, c};
                }
            }
        }
        return null;
    }
}





