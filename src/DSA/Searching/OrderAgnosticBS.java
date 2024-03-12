package DSA.Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {24,12,11,10,7,4,2,0};

        int ans = srch(arr, 0);
        System.out.println(ans);
    }
    public static int srch(int[] arr, int target){
        int s = 0;
        int e = arr.length -1;

        boolean Asc = (arr[s] < arr[e]);

        while(s <= e){
            int m = (s + e) / 2;
            if (arr[m] == target){
                return m;
            }
            if (Asc){
                if(target > arr[m]){
                    s = m + 1;
                }else {
                    e = m - 1;
                }
            }else {
                if (target > arr[m]){
                    e = m - 1;
                }else {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}

