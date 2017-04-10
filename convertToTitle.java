/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.
For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
*/
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        int p, q;
        char[] c = {'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
        while(n > 26){
            p = (n - 1) / 26;
            q = n % 26;
            n =  p;
            s.insert(0,c[q]);
        }
        q = n % 26;
        s.append(c[q]);
        s.reverse();
        return s.toString();
    }
}

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        int p, q;
        while(n > 0){
            n--;
            p = n / 26;
            q = n % 26;
            n =  p;
            s.insert(0, (char)('A'+q));
        }
        return s.toString();
    }
}