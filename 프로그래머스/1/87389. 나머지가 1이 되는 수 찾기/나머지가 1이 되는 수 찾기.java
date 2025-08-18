class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = Integer.MAX_VALUE;
        
        for(int i = 1; i<n; i++) {
            if(n%i == 1 && answer > i) {
                answer = i;
            }
        }
        
        return answer;
    }
}