import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int num = n;
        
        while(num > 0) {
            list.add(num%3);
            num = num/3;
        }
        
        Collections.reverse(list);
        System.out.println(list);
        
        int j = 1;
        for(int i: list) {
            answer=answer + (i*j);
            j = j*3;
        }
        
        
        
        return answer;
    }
}