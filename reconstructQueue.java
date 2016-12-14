/*
406. Queue Reconstruction by Height  QuestionEditorial Solution  My Submissions
Total Accepted: 4379
Total Submissions: 8074
Difficulty: Medium
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

Example
Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
*/
public class Solution {
	 public static void sort(int[][] ob) {    
          Arrays.sort(ob, new Comparator<Object>() {    
              public int compare(Object o1, Object o2) {    
                  int[] one = (int[]) o1;    
                  int[] two = (int[]) o2;       
                      if (one[0] > two[0]) {    
                          return 1;    
                      } else if (one[0] < two[0]) {    
                          return -1;    
                      }   
                  return 0;    
              }    
          });   
      } 
    public int[][] reconstructQueue(int[][] people) {
        int num = people.length;
		int [][] result = new int [num][2];
		int [][] temp1 = new int [num][2];//中间数组
		
		sort(people);
		for(int i = 0; i < num; i++){
			System.arraycopy(people[i], 0, temp1[i], 0, 2);
			temp1[i][1] = 0;
		}
		for(int i = 0; i < num; i++){
			int k = 0;
			for (int j = 0; j < num; j++){
				if(temp1[j][1] == people[j][1]){
					System.arraycopy(people[j], 0, result[i], 0, 2);
					k = people[j][0];
					temp1[j][0] = 0;
					break;
				}
			}
			int j = 0;
			while((j < num) && (temp1[j][0] <= k)){
				temp1[j][1]++;
				j++;
			}
		}
		
		return result;
    }
}