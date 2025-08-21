import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        StringBuilder stb = new StringBuilder();
        
        while(n!= 0) {
            long num = n% 10;
            list.add(num);
            n /= 10;
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        
        for(long i:list) {
            stb.append(i);
        }
        
        answer = Long.parseLong(stb.toString());
        
        System.out.println(stb.toString());
        
        return answer;
    }
}