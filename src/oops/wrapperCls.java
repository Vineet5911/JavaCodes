package oops;

import java.util.Arrays;

public class wrapperCls {
    public static void main(String[] args) {
        String name = "vineet";
        int b = 10;
        int c = 15;

        int[] num3 = new int[]{11, 12, 13, 14};
        Integer num2 =  new Integer(12);
        Integer num = new Integer(12);
        System.out.println(num.equals(num2));
        System.out.println(Arrays.toString(num3));

    }
}

