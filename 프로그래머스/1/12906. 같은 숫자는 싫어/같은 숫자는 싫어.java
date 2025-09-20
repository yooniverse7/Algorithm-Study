import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i = 1; i<arr.length; i++) {
            int num = stack.pop();
            if(num == arr[i]) {
                stack.push(num);
            } else {
                stack.push(num);
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        for(int i = 0; i<stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        

        return answer;
    }
}