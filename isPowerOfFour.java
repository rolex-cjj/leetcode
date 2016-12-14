/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
*/
/*
这个问题的关键思路和上一道题类似，先考虑“4”的幂的二进制表示：

40 = 1B
41 = 100B
42 = 10000B
43 = 1000000B
……
也就是每个数比上一个数的二进制后面多两个零嘛。最重要的是，“4”的幂的二进制数只有 1 个“1”。如果仔细阅读过上一篇，你就会知道，判断一个二进制数只有 1 个“1”，只需要：
(num & num - 1) === 0
但是，二进制数只有 1 个“1”只是“4”的幂的必要非充分条件，因为“2”的奇数次幂也只有 1 个“1”。所以，我们还需要附加的判断：
(num & num - 1) === 0 && (num & 0xAAAAAAAA) === 0
num & 0xAAAAAAAA === 0 这个确保 num 的二进制的那个 “1” 出现在“奇数位”上，也就确保了这个数确实是“4”的幂，而不仅仅只是“2”的幂。

*/
public class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num-1)) == 0 
                   && (num & 0xAAAAAAAA) == 0;
    }
}