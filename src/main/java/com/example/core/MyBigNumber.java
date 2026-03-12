package com.example.core;

public class MyBigNumber {
    public static String sum(String str1,String str2){

        StringBuilder stringBuilder = new StringBuilder();
        int a  = str1.length()-1;
        int b = str2.length()-1;
        int carry =0;
        while(a>=0||b>=0||carry >0){
            int digitA = (a>=0) ? str1.charAt(a) -'0':0;
            int digitB = (b>=0)? str2.charAt(b)-'0':0;
            int sum = digitA+digitB+carry;

            stringBuilder.append(sum % 10);
            carry = sum/10;
            a--;
            b--;

        }

       return stringBuilder.toString();
    }
}
