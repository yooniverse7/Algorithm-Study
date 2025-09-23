import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        
        for(int i = 0; i<clothes.length; i++) {
            hmap.put(clothes[i][1], hmap.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        int n = 1;
        for(String key : hmap.keySet()) {
            n *= (hmap.get(key)+1);
        }
        
        answer = n - 1;
        
        return answer;
    }
}