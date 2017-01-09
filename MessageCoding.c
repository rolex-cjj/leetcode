/*
例题4-4　信息解码（Message Decoding, ACM/ICPC World Finals 1991, UVa 213）
考虑下面的01串序列：
0, 00, 01, 10, 000, 001, 010, 011, 100, 101, 110, 0000, 0001, …, 1101, 1110, 00000, …
首先是长度为1的串，然后是长度为2的串，依此类推。如果看成二进制，相同长度的后
一个串等于前一个串加1。注意上述序列中不存在全为1的串。
你的任务是编写一个解码程序。首先输入一个编码头（例如AB#TANCnrtXc），则上述
序列的每个串依次对应编码头的每个字符。例如，0对应A，00对应B，01对应#，…，110对
应X，0000对应c。接下来是编码文本（可能由多行组成，你应当把它们拼成一个长长的01
串）。编码文本由多个小节组成，每个小节的前3个数字代表小节中每个编码的长度（用二
进制表示，例如010代表长度为2），然后是各个字符的编码，以全1结束（例如，编码长度
为2的小节以11结束）。编码文本以编码长度为000的小节结束。
例如，编码头为$#**\，编码文本为0100000101101100011100101000，应这样解码：
010(编码长度为2)00(#)00(#)10(*)11(小节结束)011(编码长度为3)000(\)111(小节结束)001(编码
长度为1)0($)1(小节结束)000(编码结束)。
*/
#include<stdio.h>
#include<string.h>

char readChar()
{
	for (;;)
	{
		char ch = getchar();
		if (ch != '\n' && ch != '\r')
		{
			return ch;
		}
	}
}
int readInt(int c)
{
	int v = 0;
	while (c--)
	{
		char ch = readChar();
		v = 2 * v + ch - '0';
	}
	return v;
}
int readHead(int head[8][1 << 8])
{
	memset(head, 0, sizeof(int)* 8 * (1 << 8));
	head[1][0] = readChar();
	if(head[1][0] == EOF)
		return 0;
	for (int i = 2; i < 8; i++)
	{
		for (int j = 0; j < ((1 << i) - 1); j++)
		{
			char temp = getchar();
			if (temp == EOF)
				return 0;
			if (temp == '\n' || temp == '\r')
				return 1;
			head[i][j] = temp;
		}
	}
	return 0;
}
int printHead(int head[8][1 << 8])
{
	for (int i = 1; i < 8; i++)
	{
		for (int j = 0; j < (1 << i) - 1; j++)
		{
			if (head[i][j] == 0)
				return 0;
			printf("head[%d][%d] = %c\n", i, j, head[i][j]);
		}
	}
	return 0;
}

int main()
{
	int head[8][1<<8];
	while(readHead(head))
	{
		printHead(head);
		for(;;){
			int len = readInt(3);
			if(len == 0)
				break;
			else{
				for(;;){
					int c = readInt(len);
					if(c == ((1<<len) - 1))
						break;
					else 
					{
						printf("%c",head[len][c]);
					}
				}
					
			}
		}
		printf("\n");
	}	
	return 0;
}