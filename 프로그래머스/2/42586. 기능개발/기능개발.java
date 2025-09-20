import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        
        int[] day = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++) {
            int n = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                n++;
            }
            day[i] = n;
        }
        
        int n = 1;
        int max = day[0];
        for(int i = 1; i< day.length; i++) {
            if(max < day[i]) {
                max = day[i];
                list.add(n);
                n = 1;
            } else {
                n++;
            }
        }
        list.add(n);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}