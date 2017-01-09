/*
13. Roman to Integer 
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/
import java.util.Map;
public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		int size = s.length();
		for(int i = 0; i < size; i++)
		{
			int val = map.get((s.charAt(i)+""));
			if(i == size-1)
				sum += val;
			else if(val < map.get((s.charAt(i+1)+"")))
				sum -= val;
			else sum += val;
				
		}
		return sum;
    }
}