/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
*/
public class Solution {
    public boolean isPowerOfThree(int n) {
        int max = 1162261467;
        return n>0 && (max%n == 0);
    }
}