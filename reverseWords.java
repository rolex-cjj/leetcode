/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string. 
*/
public class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return s;
        int len = s.length();
        StringBuilder str = new StringBuilder();
        int pos = 0, temp = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            pos++;
            if(ch == ' '){
                str.append(ch);
                temp = pos;
            }
            else{
                str.insert(temp, ch);
            }
        }
        return str.toString();
    }
}