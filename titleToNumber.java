/*
Given a column title as appear in an Excel sheet, return its corresponding column number.
For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/
public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            num *= 26;
            num += c - 'A' + 1;
        }
        return num;
    }
}