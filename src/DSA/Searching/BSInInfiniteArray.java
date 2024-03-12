package DSA.Searching;

public class BSInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,20,122,344,566,777,8888,98988};
        System.out.println(ans(arr, 6));
    }
    public static int ans(int[] arr, int t){
        int s = 0;
        int e = 1;
        while (t > arr[e]){
            int tmp = e;
            e = e + (e - s + 1) * 2;
            s = tmp;
        }
        return bs(arr, t, s, e);
    }
    public static int bs(int[] arr, int t, int s, int e){
        while (s <= e){
            int m = s + (e - s) / 2;
            if(t > arr[m]){
                s = m + 1;
            } else if (t < arr[m]) {
                e = m - 1;
            }else {
                return m;
            }
        }
        return -1;
    }
}
