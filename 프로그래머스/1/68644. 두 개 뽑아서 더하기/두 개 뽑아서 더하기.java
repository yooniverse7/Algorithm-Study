import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i = 0; i<numbers.length -1; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                hset.add(numbers[i] + numbers[j]);
            }
        }
        
        
        Integer[] tmp = hset.toArray(new Integer[0]);
            answer = new int[tmp.length];
            for(int i = 0; i < tmp.length; i++) {
                answer[i] = tmp[i];
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}