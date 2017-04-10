/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
*/
public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder("");
        int len = s.length();
        int pos = 0;
        while(pos < len){
            if(pos+k <= len){
                str.append(new StringBuilder(s.substring(pos, pos+k)).reverse());
                if((pos+2*k) <= len){
                    str.append(s.substring(pos+k, pos+2*k));
                    pos += 2*k;
                }
                else{
                    str.append(s.substring(pos+k, len));
                    pos = len;
                }
            }
            else{
                str.append(new StringBuilder(s.substring(pos, len)).reverse());
                pos = len;
            }
        }
        return str.toString();
    }
}


public class Solution {     
	public String reverseStr(String s, int k) {         
		char[] ca = s.toCharArray();         
		for (int left = 0; left < ca.length; left += 2 * k) {             
			for (int i = left, j = Math.min(left + k - 1, ca.length - 1); i < j; i++, j--) {                
				char tmp = ca[i];
				ca[i] = ca[j]; 
				ca[j] = tmp; 
			} 
		}        
		return new String(ca);     
	 }
}