/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/
public class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int i,j;
        StringBuilder str = new StringBuilder();
        int carry = 0;
        for(i = len1-1, j = len2-1; (i>=0 || j>=0) || carry == 1; i--,j--){
            int x = i>=0? num1.charAt(i)-'0':0;
            int y = j>=0? num2.charAt(j)-'0':0;
            int m = x+y+carry;
            carry = m/10;
            str.insert(0,Integer.toString(m%10));
        }
        return str.toString();
    }
}