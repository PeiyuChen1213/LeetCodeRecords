package org.example;

public class L209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArray(nums, 7));
    }

    /**
     * 采取滑动窗口的方式去解决问题
     *
     * @param nums
     * @param val
     * @return
     */
    public static int minSubArray(int[] nums, int val) {
        int result = Integer.MAX_VALUE;
        int j = 0;//子数组的终止位置
        int i = 0;//子数组的起始位置
        int sum = 0;
        int subLen = 0;
        for (j = 0; j < nums.length; j++) {
            //开始遍历数组获取子数组的和，这个过程要不断的移动子数组的起始位置
            sum += nums[j];

            //开始变更子序列的起始位置
            while (sum >= val) {
                //记录下此时子数组的长度
                subLen = j - i + 1;
                //更新此时最小的字串长度
                result = Integer.min(result, subLen);
                //开始移动起始位置
                sum -= nums[i++];
            }

        }
        return  result ==Integer.MAX_VALUE ? 0: result;
    }


}
