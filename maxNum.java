/**
�����ж����ѡ������������ֵ
*/
public int maxNum(int x, int y){
	int buf[2] = {x, y};
	unsigned int z = x - y;
	z >>= 31;
	return buf[z];
}