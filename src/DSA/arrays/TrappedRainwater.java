package DSA.arrays;

public class TrappedRainwater {
    public static void main(String[] args) {
       int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedwtr(height));
    }
    public static int trappedwtr(int[] height){
        int n = height.length;
        // Left max
        int[] lm = new int[n];
        lm[0] = height[0];
        for (int i = 1; i < n; i++) {  // Fix the loop condition
            lm[i] = Math.max(height[i], lm[i-1]);
        }

        // Right max
        int[] rm = new int[n];
        rm[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rm[i] = Math.max(height[i], rm[i+1]);
        }

        // Water amount calculator
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(lm[i], rm[i]);
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;
    }
}
