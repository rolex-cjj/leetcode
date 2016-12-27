/*
8.Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
*/
public class Solution {
    public int myAtoi(String str) {
        if(str == null)
		{
			return 0;
		}
		str = str.trim();
		int len = str.length();
		if(len == 0)
		{
			return 0;
		}
		int i = 0;
		int isNeg = 1;
		if(str.charAt(i) == '-' || str.charAt(i) == '+')
		{
			if(str.charAt(i) == '-')
			{
				isNeg = -1;
			}
			i++;
		}
		int result = 0, temp = 0;
		for(; i < len; i++)
		{
			char character = str.charAt(i);
			if(character > '9' || character < '0')
			{
				break;
			}
			int digit = (character - '0') * isNeg;
			temp = result * 10 + digit;
			if(temp / 10 != result)
			{
				if(isNeg == -1)
					return Integer.MIN_VALUE;
				return Integer.MAX_VALUE;
			}
			result = temp;
		}
		
		return result;
    }
}


/*
*整数需要考虑正负数问题，是否越界问题
*/