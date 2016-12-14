/*
371. Sum of Two Integers  QuestionEditorial Solution  My Submissions
Total Accepted: 39211
Total Submissions: 75695
Difficulty: Easy
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
*/
public class Solution {
    public int getSum(int a, int b) {
         while(b != 0){ 
             int sum = a ^ b; 
             int carry = (a & b) << 1; 
             a = sum; b = carry; 
         }
         return a; 
    }
}