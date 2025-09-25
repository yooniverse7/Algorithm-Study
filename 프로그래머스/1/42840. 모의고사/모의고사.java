import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] result = new int[3];
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0; i<answers.length; i++) {
            if(answers[i] == p1[i%5]) {
                result[0] ++;
            }
            if(answers[i] == p2[i%8]) {
                result[1] ++;
            }
            if(answers[i] == p3[i%10]) {
                result[2] ++;
            }
        }
        
        int max = 0;
        int maxCnt = 0;
        
        for(int i = 0; i<3; i++) {
            max = Math.max(max, result[i]);
        }
        
        for(int i = 0; i<3; i++) {
            if(max == result[i]) maxCnt++;
        }
        
        answer = new int[maxCnt];
        
        int j = 0;
        for(int i = 0; i<3; i++) {
            if(max == result[i]) {
                answer[j] = i+1;
                j++;
            }
        }
        
        
        return answer;
    }
}