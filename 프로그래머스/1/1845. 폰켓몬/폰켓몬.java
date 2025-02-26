import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int answer = 0;
        int[] arr = nums;
        int N = arr.length; // 배열 길이
        
        for (int i = 0; i < N; i++) {
            hs.add(arr[i]);
        }
        answer = Math.min(hs.size(), N/2);
        
        return answer;                   
    }
}