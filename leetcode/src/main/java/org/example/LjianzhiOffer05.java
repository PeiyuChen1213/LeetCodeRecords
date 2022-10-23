package org.example;

public class LjianzhiOffer05 {
    public static void main(String[] args) {
    }

    public static String replaceSpace(String s){
        //技术的使用：利用stringBuilder的特点完成

        //创建一个string

        StringBuilder sb = new StringBuilder();
        //开始替换字符串
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' '){
                //一个一个字符进行拼接，如果发现字符是空格，就只拼接%20
                sb.append("%20");
            }else {
                //否则就正常拼接原来字符串里面的数据
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}

