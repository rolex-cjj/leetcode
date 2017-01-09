/*
输入正整数a，b，c，输出a/b的小数形式，精确到小数点后c位。a，b≤10^6，c≤100。输
入包含多组数据，结束标记为a＝b＝c＝0。
样例输入：
1 6 4
0 0 0
样例输出：
Case 1: 0.1667
*/

#include<stdio.h>
int main()
{
	int a, b, c, num = 0;
	int array[101] = {0};
	while(scanf("%d%d%d",&a,&b,&c)==3 && a && b && c)
	{
		int result = a/b;
		int remainder = a%b;
		printf("Case %d:%d.",++num,result);
		for(int i = 0; i <= c;i++)
		{
			remainder *= 10;
			array[i] = remainder/b;
			remainder = remainder%b;
			if(i < c-1)
				printf("%d",array[i]);
		}
		if(array[c]>4)
			printf("%d",array[c-1]+1);
		else
			printf("%d",array[c-1]);
		printf("\n");
	}
	return 0;
}