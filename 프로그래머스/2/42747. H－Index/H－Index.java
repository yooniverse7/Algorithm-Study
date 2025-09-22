import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        int n = citations.length;
        for(int i = 0; i<n; i++) {
            int h = n - i; // i번째 요소를 포함해 뒤에 남아있는 원소 개수
            
            if( citations[i] >= h) { // 원소값이 h 이상
                answer = h;
                break;
            }
        }
        
        
        return answer;
    }
}