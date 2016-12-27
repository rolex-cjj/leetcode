/*
2.Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution {
    public boolean isMatch(String s, String p) {
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(p);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(s);
        if (m.matches()) {
         return true;
        } else {
        return false;
        }
    }
}