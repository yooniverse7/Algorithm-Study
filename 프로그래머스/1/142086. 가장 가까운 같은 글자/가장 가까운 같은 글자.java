import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        char[] arr = s.toCharArray();
        answer = new int[arr.length];
        int[] abc = new int[123]; // 알파벳 배열
        
        Arrays.fill(abc, -1);
        
        
        for(int i = 0; i<arr.length; i++) {
            int num = arr[i];
            if(abc[num] == -1 ){
                answer[i] = -1;
                abc[num] = 0;
            } else {
                answer[i] = abc[num];
                abc[num] = 0;
            }
            
            for(int j = 97; j<123; j++) {
                if(abc[j] != -1) abc[j] ++;
            }
        }
        
        return answer;
    }
}