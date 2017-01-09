/*
用1，2，3，…，9组成3个三位数abc，def和ghi，每个数字恰好使用一次，要
求abc：def：ghi＝1：2：3。按照“abc def ghi”的格式输出所有解，每行一个解。提示：不必
太动脑筋
*/

#include<stdio.h>
int getSumAndMulti(int num, int &sum, int &multi)
{
	int i = num % 10;
	int j = num / 10 % 10;
	int k = num / 100 % 10;
	sum += i + j + k;
	multi *= i * j * k;
	return 0;
}

int main()
{
	int i, j, k;
	for(i = 123; i <= 329; i++)
	{
		j = 2 * i;
		k = 3 * i;
		int sum  = 0;
		int multi = 1;
		getSumAndMulti(i, sum, multi);
		getSumAndMulti(j, sum, multi);
		getSumAndMulti(k, sum, multi);
		if(sum == 45 && multi == 362880)
			printf("%d %d %d\n", i, j, k);
	}
	
	return 0;
}