/**
不用判断语句选出两数中最大的值
*/
public int maxNum(int x, int y){
	int buf[2] = {x, y};
	unsigned int z = x - y;
	z >>= 31;
	return buf[z];
}