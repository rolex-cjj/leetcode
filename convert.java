/*
6.The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/
public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }
        String str = "";
        int len = s.length();
        int interval = (numRows << 1) - 2;
        
        for(int j = 0; j < len; j += interval)
        {
             str += s.charAt(j);
        }
        
        for(int i = 2; i < numRows; i++)
        {
            int j = i - 1;
            int inter = (i << 1) - 2;
            while(j < len)
            {
                str += s.charAt(j);
                inter = interval - inter;//(numRows << 1) - (i << 1);
                j += inter;
                // if(j < len)
                // {
                //     str += s.charAt(j);
                //     j += (i << 1) - 2;
                // }
                
            }
        }
        
         for(int j = numRows - 1; j < len; j += interval)
        {
             str += s.charAt(j);
        }
        return str;
    }
}