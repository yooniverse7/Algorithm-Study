class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = a>b? a : b;
        long min = a>b? b : a;
        
        for(long i = min; i<=max; i++ ) {
            answer += i;
        }
        
        return answer;
    }
}