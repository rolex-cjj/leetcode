/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2)
            return false;
        for(int i = 0; i < len1; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i : arr){
            if(i != 0)
                return false;
        }
        return true;
    }
}