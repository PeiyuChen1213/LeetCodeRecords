package com.chenpeiyu;

import java.util.Arrays;

public class L151 {
    public static void main(String[] args) {
        StringBuilder sb = removeSpace("the sky is blue");
        System.out.println(sb);

        reverseString(sb,0, sb.length()-1);

        System.out.println(sb);
        reverseEachWord(sb);
        System.out.println(sb);




    }

    public static StringBuilder removeSpace(String s){
        int start = 0;
        int end = s.length()-1;

        //先去除首尾的空格

        while (s.charAt(start)==' ') start++;
        while (s.charAt(end)==' ') end--;

        //创建一个新的字符串 用于保存去除空格后的字符串

        StringBuilder sb = new StringBuilder();

        //将原来的字符串中的数据，进行处理再存入sb

        while (start<=end){
            char c = s.charAt(start);
            //必须同时满足当前的字符不是空格和sb当中的组后一个元素不是加空格才可以继续添加
            if (c!=' '||sb.charAt(sb.length()-1)!=' '){
                sb.append(c);
            }
            start++;
        }

        return sb;
    }


    //反转指定区间的字符串
    public static void reverseString(StringBuilder sb ,int start, int end){
        //双指针法解决元素反转问题
        while(start<end){
            char temp  = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }

    //反转每一个单词
    public static void reverseEachWord(StringBuilder sb){
        //开始判定每一个单词的初始位置，和结束位置
        int start =0;
        int end = 1;
        int n = sb.length();
        //外层循环固定单词的初始位置，内层循环寻找单词的结束位置
        while (start<n){
            while (end<n && sb.charAt(end)!=' '){
                end++;
            }
            //通过上述的步骤，已经找到了单词的初始和结束位置
            // 开始反转
            reverseString(sb,start,end-1);

            //移动到下一个单词继续判定
            start = end +1;
            end = start+1;

        }
    }


    public static String reverseWords(String s){
        //首先先去除掉空格
        StringBuilder sb = removeSpace(s);
        //反转整个字符串
        reverseString(sb,0,sb.length()-1);

        //反转每一个单词
        reverseEachWord(sb);
        return sb.toString();
    }


}
