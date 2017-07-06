/*
You are given a string representing an attendance record for a student. The record only contains the following three characters: 

1.'A' : Absent. 
2.'L' : Late.
3. 'P' : Present. 

A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late). 

You need to return whether the student could be rewarded according to his attendance record.

Example 1:

Input: "PPALLP"
Output: True

Example 2:

Input: "PPALLL"
Output: False
*/
public class Solution {
    public boolean checkRecord(String s) {
        int aNum = 0;
        int lNum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'L'){
                if(lNum == 2)
                    return false;
                lNum++;
            }
            else{
                lNum = 0;
                if(c == 'A'){
                    if(aNum == 1)
                        return false;
                    aNum++;
                }
            }
        }
        return true;
    }
}

public boolean checkRecord(String s) {
	if(s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL"))
		return false;
	return true;
}

public boolean checkRecord(String s) {
    return !s.matches(".*LLL.*|.*A.*A.*");
}