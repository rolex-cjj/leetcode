/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
American keyboard

Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
*/
public class Solution {
    public String[] findWords(String[] words) {
        String a1 = "QWERTYUIOP";
		String a2 = "ASDFGHJKL";
		String a3 = "ZXCVBNM";
		ArrayList<String> arr = new ArrayList<String>();
		for(String str : words){
		    int index = 0;
			String s = str.toUpperCase();
			int len = s.length();
			boolean bool = true;
			for(int i = 0; i < len; i++){
			    int temp;
				if(a1.indexOf(s.charAt(i)) != -1)
					temp = 1;
				else if(a2.indexOf(s.charAt(i)) != -1)
					temp = 2;
				else temp = 3;
				if(index != 0){
					if(index != temp){
						bool = false;
						break;
					}
				}
				else{
					index = temp;
				}
			}
			if(bool)
				arr.add(str);
			
		}
		String [] result = (String[])arr.toArray(new String[arr.size()]);
		return result;
    }
}