package org.example;


import java.util.HashMap;
import java.util.Map;

//leetcode 454 四数相加
public class L454 {
    public static void main(String[] args) {

    }

    public static int fourSum(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // 思路就是：分别求出前两个数组的大小 和统计这个数组大小的次数
        Map<Integer, Integer> map1 = new HashMap<>();
        //分别前一半和后一半数组的和，并统计次数
        int sum1;
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                sum1 = nums1[i] + nums2[j];
                if (map1.containsKey(sum1)) {
                    map1.put(sum1, map1.get(sum1) + 1);
                } else {
                    map1.put(sum1, 1);
                }
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum2 = nums3[i] + nums4[j];
                //判断差值在不在上述的哈希表当中
                if (map1.containsKey(-sum2)) {
                    res += map1.get(-sum2);
                }
            }
        }
        return res;


    }
}
