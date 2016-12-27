/*
9.Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
*/
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
			return false;
		
		int temp = x, high = 1, low = 1, len = 0;

		while(temp > 9)
		{
			temp /= 10;
			high *= 10;
			len ++;
		}
		len++;
		for(int i = 0; i < len/2; i++)
		{
			if((x/low%10) != (x/high%10))
				return false;
			low *= 10;
			high /= 10;
		}
		return true;
    }
}


//题意判断数字是否是回文串，只能用常数空间，不能转换成字符串，不能反转数字
