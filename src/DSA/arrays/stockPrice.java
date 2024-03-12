package DSA.arrays;
public class stockPrice {
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(stockPrice(price));
    }
    public static int stockPrice(int[] price){
        int bp = Integer.MAX_VALUE;
        int mp = 0;
        for(int i = 0; i < price.length; i++){
            if(bp < price[i]){
                int profit = price[i] - bp;
                mp = Math.max(mp, profit);
            }else{
                bp = price[i];
            }
        }
        return mp;
    }
}