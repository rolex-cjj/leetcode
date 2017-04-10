/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/
public class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, int[]> map = new LinkedHashMap<Character, int[]>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int[] arr = map.get(c);
                map.put(c,new int[]{arr[0], ++arr[1]});
            }
            else{
                map.put(c,new int[]{i, 0});
            }
        }
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Object ob = it.next();
            int arr[] = map.get(ob);
            if(arr[1] == 0)
                return arr[0];
        }
        return -1;
    }
}



/*
public class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
*/