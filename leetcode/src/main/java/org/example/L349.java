package org.example;

import java.util.*;

public class L349 {
    public static void main(String[] args) {

    }
    public static int[] Intersection(int[] num1,int[] num2){
        //先进行一个健壮性判断
        if (num1.length==0||num1==null||num2.length==0||num2==null){
            return new int[0];
        }
        //将数组1的值用来创建一个hash表
        Set<Integer> set =  new HashSet();
        Set<Integer> resultSet =  new HashSet();
        //遍历第一个数组将元素全部传进去
        for (int i = 0; i < num1.length; i++) {
            set.add(num1[i]);
        }
        //遍历数组二 然后将数组二每个元素与数组一进行比对
        for (int i = 0; i < num2.length; i++) {
            if (set.contains(num2[i])){
                resultSet.add(num2[i]);
            }
        }
        //将result set中的元素转到数组当中
        int[] res = new int[resultSet.size()];
        int i=0;
        for (Integer integer : resultSet) {
            res[i++]=integer;
        }
        return res;
    }


    /**
     * lilst集合做hash表
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] Intersection1(int[] nums1,int[] nums2){

        //将list集合作为hash表
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }

        //遍历nums2 判断数组的数据是否在集合里面
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i])){
                res.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));
            }
        }
        int i=0;
        int[] resArr = new int[res.size()];
        for (Integer re : res) {
            resArr[i++]=re;
        }
        return resArr;
    }
}
