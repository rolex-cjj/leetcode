/*
338. Counting Bits  QuestionEditorial Solution  My Submissions
Total Accepted: 44297
Total Submissions: 75837
Difficulty: Medium
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
*/
public class Solution {
    public int[] countBits(int num) {
        int [] countBits =  new int [num];
		for(int i = 0; i < num; i++){
			if(i <= 1){
			countBits[i] == i;
			}			
			else {
l1:				int n,k;
				n = num;
				k = 0;
				n = n / 2;
				while( n > 0){
					k++;
					n = n / 2;
					
				}
				if(num >=  Math.pow(2,k) && num < Math.pow(2,k+1)){
					countBits[num] = 1 + countBits[(num - Math.pow(2,k))];
				goto l1;
			}
		}
		return countBits;
    }
}