package com.chenpeiyu;

import java.util.ArrayList;
import java.util.List;

public class L383 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        System.out.println(list.remove("2"));
    }
    public static boolean canConstruct(String ransomNote, String magazine){
        //将所有的字母存到一个链表当中去
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            list.add(ransomNote.charAt(i));
        }
        //开始遍历第二个字符串
        for (int i = 0; i <magazine.length() ; i++) {
            //没遍历一次就在链表中删除掉这个字符，如果字符不存在，则说明无法构成
            if (!list.remove(Character.valueOf(magazine.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
