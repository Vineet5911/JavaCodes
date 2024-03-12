package DSA.arrays;

public class subarrays {
    public static void main(String[] args) {
        int[] arr = {2,3,4,57,8,90};
        subarrays(arr);
        System.out.println(sumOfSubarr(arr));
    }
    static void subarrays(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j <= arr.length; j++){
                for(int k = i; k < j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    static int sumOfSubarr(int arr[]){
        int s = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                s++;
            }
        }
        return s;
    }
}
