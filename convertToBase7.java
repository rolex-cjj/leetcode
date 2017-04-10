/*
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
Example 2:
Input: -7
Output: "-10"
Note: The input will be in range of [-1e7, 1e7].
*/
public class Solution {
    public String convertToBase7(int num) {
        boolean neg = false;
        if(num < 0){
            neg = true;
            num = 0 - num;
        }
        if(num == 0)
             return "0";
        StringBuilder s = new StringBuilder();
        int mod;
        while(num > 0){
            mod = num % 7;
            num = num / 7;
            s.insert(0, mod);
        }
        if(neg)
            s.insert(0,"-");
        return s.toString();
    }
}