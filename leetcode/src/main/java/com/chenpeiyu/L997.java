package com.chenpeiyu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组专题的题目：977 有序数组的平方
 */
public class L997 {
    public static void main(String[] args) {
        int[] nums={-5,-1,0,1,3,10};
        System.out.println(Arrays.toString(sortSquare2(nums)));

    }

    /**
     * 暴力法解决这个问题
     * @param nums
     * @return
     */
    public static int[] sortSquare(int[] nums){
        //先将每个数先平方一下，然后直接排序
        for (int i = 0; i < nums.length; i++) {
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    /*
     * 使用双指针法解决这个问题
     * @param nums
     * @return
     */
    public static int[] sortSquare2(int[] nums){
        //传入的数组已经是有序的数组了,所以最大值一般是最左端或者最右端
        //新建一个结果集用于储存最后的结果
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k=j;
        while (i<=j){
            //当左边大于右边的时候
            if (nums[i]*nums[i]>=nums[j]*nums[j]){
                result[k--]=nums[i]*nums[i];
                //左边后移一位
                i++;
            }else {
                result[k--]=nums[j]*nums[j];
                //右边前移一位
                j--;
            }
        }

        return result;
    }
}
