/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
*/
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        String result[] = new String[len];
        int temp[][] = new int[len][2];
        for(int i = 0; i < len; i++){
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }
        Arrays.sort(temp, (a,b)->(b[0]-a[0]));
        for(int i = 0; i < len; i++){
            if(i == 0){
                result[temp[i][1]] = "Gold Medal";
            }
            else if(i == 1){
                result[temp[i][1]] = "Silver Medal";
            }
            else if(i == 2){
                result[temp[i][1]] = "Bronze Medal";
            }
            else
                result[temp[i][1]] = (i+1)+"";
        }
        return result;
    }
}


/*
Arrays.sort();用法
*/