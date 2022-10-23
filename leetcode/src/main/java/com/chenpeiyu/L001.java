package com.chenpeiyu;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class L001 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums,int target){

        // 设置一个结果集用于封装结果
        int[] res = new int[2];
        //创建一个hash表来将结果保存至一个map集合当中
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //计算出两个数的差值，得到结果，然后在hashMap中找这个差值
            int diff = target-nums[i];
            if (map.containsKey(diff)) {
                res[1]=i;
                res[0]=map.get(diff);
            }
            //将之前遍历的元素加入到map集合里面
            map.put(nums[i],i);
        }

        return res;
    }
}
