import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder stb = new StringBuilder();
        
        String num = age+"";
        
        char[] ageArr = num.toCharArray();
        
        for(int i = 0; i<ageArr.length; i++) {
            
            
            int ch1 = (ageArr[i] - '0') + 97;
            
            char ch2 = (char)ch1;
            
            stb.append(ch2);
        }
        answer = stb.toString();
        
        return answer;
    }
}