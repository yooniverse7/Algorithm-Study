import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        int N = arr.length;

        for (int i = 0; i < N; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                int num = stack.pop();
                if(num == arr[i]) { // 같다면
                    stack.push(num);
                } else { // 다르다면
                    stack.push(num);
                    stack.push(arr[i]);
                }
            }
        }

        int num = stack.size();
        int[] answer = new int[num];
       
        for (int i = 0; i < num; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}