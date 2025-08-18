class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int num = 0;
        
        for(int i = 0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) {
                num++;
            }
        }
        
        answer = new int[num];
        
        int j = 0;
        for(int i = 0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[j] = numlist[i];
                j++;
            }
        }
        
        return answer;
    }
}