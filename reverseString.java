/*
344. Reverse String  QuestionEditorial Solution  My Submissions
Total Accepted: 84474
Total Submissions: 145106
Difficulty: Easy
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/
public class Solution {
    public String reverseString(String s) {
        String str1 = "";
        String str2 = "";
        String str = "";
        int len = s.length();
        if(len==1){
            return s;
        }
        else if(len>1){
            int mid = len/2;
            int left = 0;
            int right = 0;
            left = mid;
            if(len%2==0){
                right = mid;
                str1 = reverseString(s.substring(0,left));
                str2 = reverseString(s.substring(right,len));
                str = str2 + str1;
            }
            else{
                right = mid+1;
                str1 = reverseString(s.substring(0,left));
                str2 = reverseString(s.substring(right,len));
                str = str2 + s.substring(mid,mid+1) + str1;
            }
            
            return str;
        }
        return s;
    }
}