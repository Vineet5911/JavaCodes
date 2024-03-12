package DSA.arrays;

public class rotateanArrayByKthPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

    }

    public static void rotationByk(int[] arr, int k) {
        int[] temp = arr;
        for(int i = 0; i < arr.length; i++){
            temp[(i+k)%arr.length] = arr[i];
        }
        arr = temp;
    }
}
