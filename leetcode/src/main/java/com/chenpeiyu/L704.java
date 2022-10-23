package com.chenpeiyu;

//leetcode704 关于二分查找的题目
public class L704 {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }
    public static int search(int[] nums, int target) {
        //使用左闭右闭的方式
        int left = 0;
        int right = nums.length-1;
        int mid;
        while (left<=right){
            mid=(left+right)/2;
            if (nums[mid]>target){
                //改变右区间
                right=mid-1;
            }else if (nums[mid]<target){
                //改变左区间
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}