/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/
public class Solution {
    public boolean isVowels(char c){
        String s = "aeiouAEIOU";
        if(s.indexOf(c) != -1)
            return true;
        return false;
    }
    public String reverseVowels(String s) {
        if(s == null)
            return s;
        int len = s.length();
        char[] c = s.toCharArray();
        int low = 0, high = len-1;
        while(low < high){
            while((!isVowels(c[low])) && (low < high))
                low++;
            while((!isVowels(c[high])) && (low < high)) 
                high--;
            char tmp = c[low];
            c[low] = c[high];
            c[high] = tmp;
            low++;
            high--;
        }
        return new String(c);
    }
    
}