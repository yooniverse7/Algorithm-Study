class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == 'p' || arr[i] == 'P') {
                pCnt++;
            } else if(arr[i] == 'y' || arr[i] == 'Y') {
                yCnt++;
            }
        }
        
        if(pCnt != yCnt) {
            answer = false;
        }


        return answer;
    }
}