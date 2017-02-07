/*例题6-4　破损的键盘（又名：悲剧文本）（Broken Keyboard（a.k.a. Beiju Text）,
UVa 11988）
你有一个破损的键盘。键盘上的所有键都可以正常工作，但有时Home键或者End键会自
动按下。你并不知道键盘存在这一问题，而是专心地打稿子，甚至连显示器都没打开。当你
打开显示器之后，展现在你面前的是一段悲剧的文本。你的任务是在打开显示器之前计算出
这段悲剧文本。
输入包含多组数据。每组数据占一行，包含不超过100000个字母、下划线、字符“[”或
者“]”。其中字符“[”表示Home键，“]”表示End键。输入结束标志为文件结束符（EOF）。输
入文件不超过5MB。对于每组数据，输出一行，即屏幕上的悲剧文本。
样例输入：
This_is_a_[Beiju]_text
[[]][][]Happy_Birthday_to_Tsinghua_University
样例输出：
BeijuThis_is_a__text
Happy_Birthday_to_Tsinghua_University
*/


#include<stdio.h>
#include<string.h>


int main()
{
	const int maxn = 10000 + 5;
	int last, cur, next[maxn];
	char s[maxn];
	
	while(scanf("%s", s+1) == 1)
	{
		int n = strlen(s+1);
		last = cur = 0;
		next[0] = 0;
		for(int i = 1; i <= n; i++)
		{
			char ch = s[i];
			if(ch == '[')
				cur = 0;
			else if(ch == ']')
				cur = last;
			else{
				next[i] = next[cur];
				next[cur] = i;
				if(cur == last)
					last = i;
				cur = i;				
			}
		}
	}
	for(int i = next[0]; i != 0; i = next[i])
	{
		printf("%c", s[i]);
	}
	printf("\n");
	
	return 0;
}