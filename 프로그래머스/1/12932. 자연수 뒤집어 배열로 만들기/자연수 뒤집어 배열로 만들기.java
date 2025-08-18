import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        List<Long> list = new ArrayList<>();
        
        while(n>0) {
            list.add(n%10);
            n /= 10;
        }
        
        answer = new int[list.size()];
        int j = 0;
        for(int i = 0;i<list.size(); i++) {
            answer[i] = list.get(i).intValue(); 
        }
        
        
        return answer;
    }
}