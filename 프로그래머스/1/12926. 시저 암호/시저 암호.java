import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder stb = new StringBuilder();
        
        char[] arr = s.toCharArray();
        
        
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == ' ') {
                stb.append(arr[i]);
            }
            int num = arr[i];
            if(65<= num && num <= 90) { // 대문자일 때
                if((num + n) > 90) { // 대문자 Z 넘어갔을 때
                    stb.append((char)(64+((num+n)-90)));
                } else {
                    stb.append((char)(num+n));
                }
            } else if(97<= num && num <= 122) { // 소문자일 때
                if((num + n) > 122) { // 소문자 z 넘어갔을 때
                    stb.append((char)(96+((num+n)-122)));
                } else {
                    stb.append((char)(num+n));
                }
            }
        }
        
        return stb.toString();
    }
}