/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
*/
/*
�������Ĺؼ�˼·����һ�������ƣ��ȿ��ǡ�4�����ݵĶ����Ʊ�ʾ��

40 = 1B
41 = 100B
42 = 10000B
43 = 1000000B
����
Ҳ����ÿ��������һ�����Ķ����ƺ���������������Ҫ���ǣ���4�����ݵĶ�������ֻ�� 1 ����1���������ϸ�Ķ�����һƪ����ͻ�֪�����ж�һ����������ֻ�� 1 ����1����ֻ��Ҫ��
(num & num - 1) === 0
���ǣ���������ֻ�� 1 ����1��ֻ�ǡ�4�����ݵı�Ҫ�ǳ����������Ϊ��2������������Ҳֻ�� 1 ����1�������ԣ����ǻ���Ҫ���ӵ��жϣ�
(num & num - 1) === 0 && (num & 0xAAAAAAAA) === 0
num & 0xAAAAAAAA === 0 ���ȷ�� num �Ķ����Ƶ��Ǹ� ��1�� �����ڡ�����λ���ϣ�Ҳ��ȷ���������ȷʵ�ǡ�4�����ݣ���������ֻ�ǡ�2�����ݡ�

*/
public class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num-1)) == 0 
                   && (num & 0xAAAAAAAA) == 0;
    }
}