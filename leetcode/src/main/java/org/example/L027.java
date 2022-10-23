package org.example;

/**
 * 数组的移除元素
 */
public class L027 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 3, 0, 4, 2, 2};
        System.out.println(remove(nums, 2));
        System.out.println(remove1(nums, 2));

    }

    /**
     * 暴力解决这个问题
     *
     * @param nums
     * @param val
     * @return
     */
    public static int remove(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            //外层循环用来找元素
            if (nums[i] == val) {
                //找到元素之后 将后面的元素前移覆盖
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                //更新数组长度
                size--;
                //因为i后面的元素前移了一位，所以i也要向前1位 否则会导致跳过一个元素
                i--;
            }
        }
        return size;
    }

    /**
     * 双指针法解决这个问题
     * 大概的思路：
     * 通过一个快指针，指向的是新元素的下标，这个新元素不包括需要移除的元素
     * 慢指针只想新元素新的下标，剔除掉需要删除的元素之后的下标
     *
     * @param nums
     * @param val
     * @return
     */
    public static int remove1(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                //如果快指针，指向的元素不是val，那么就将这个元素赋值给slow下标对应的位置
                //同时，慢指针也要指向下一位
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
