import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int N = commands.length; // 결과 개수
        int[] answer = new int[N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int start = commands[i][0];
                int end = commands[i][1];
                int order = commands[i][2];
                int[] arr1 = new int[Math.abs(end - start)+1];

                int k = 0;
                for(int z = start-1; z <= end-1; z++) {
                   arr1[k++] = array[z];
                }

                Arrays.sort(arr1);
                answer[i] = arr1[order-1];

            }
        }
        
        return answer;
    }
}