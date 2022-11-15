package com.chenpeiyu;

import java.util.Arrays;

public class jianzhi56_1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(singleNumbers(a)));

    }

    public static int[] singleNumbers(int[] nums) {

        //先将数组的所有值进行异或操作，结果是只出现一次的两个数的二进制结果
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            z = z ^ nums[i];
        }

        //当异或结果比如是01010 说明两个数的bit1不同，根据这一发现，将数组分成两个不同的子数组
        //可以肯定的是，如果一个数出现过两次，那么这两次都会在同一个子数组中，也就是只有出现过一次的会被区分
        // 在分别对子数组的所有值进行异或运算 得到最后的结果
        int m = 1;
        while ((m & z) == 0) {
            m = m << 1;
        }

        int x = 0, y = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & m) == 0) {
                //结果为 0 的子数组，一边统计用异或统计x
                x = x ^ nums[i];
            } else {
                //结果为 1 的子数组，一边统计用异或统计y
                y = y ^ nums[i];
            }
        }
        return new int[]{x, y};
    }
}
