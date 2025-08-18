class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder stb = new StringBuilder();
    
        for(int i = 0; i<n/2; i++) {
            stb.append("수박");
        }
        
        if(n%2!=0) {
            stb.append("수");
        }
        
        answer = stb.toString();
        
        return answer;
    }
}