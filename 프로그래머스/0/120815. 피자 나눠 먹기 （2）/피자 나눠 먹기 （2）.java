class Solution {
    public int solution(int n) {
        int answer = 1;
        int people = n;
        
        while((6*answer)%people!=0) {
            answer++;
        }
        
        
        return answer;
    }
}