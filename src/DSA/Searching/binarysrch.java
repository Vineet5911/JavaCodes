package DSA.Searching;

public class binarysrch {
    public static void main(String[] args) {
      //  int[] arr = {3,4,5,6,7,8,99};
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        System.out.println(Orderagnsticbsrch(arr, 88));
    }
    public static int Orderagnsticbsrch(int arr[], int target){
        int s = 0;
        int e = arr.length - 1;
        boolean isasc = arr[s] < arr[e];
        while(s <= e){
            int m = s + (e - s) / 2;
            if(arr[m] == target){
                return m;
            }
            if(isasc){
                if(target < arr[m]){
                    e = m - 1;
                }else{
                    s = m + 1;
                }
            }else{
                if(target < arr[m]){
                    s = m + 1;
                }else{
                    e = m - 1;
                }
            }
        }

        return -1;
    }
}
