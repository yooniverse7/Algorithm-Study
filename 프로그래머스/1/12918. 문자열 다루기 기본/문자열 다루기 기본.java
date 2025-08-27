class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        int[] num = new int[arr.length];
        
        
        if(arr.length == 4 || arr.length == 6) {
                    
            for(int i=0; i<arr.length; i++) {
                num[i] = arr[i];
            }


            for(int i = 0; i<num.length; i++) {
                if(num[i] < 48 || num[i] > 57) {
                    answer = false;
                    break;
                }

            } 

        } else {
            answer = false;
        }
        

        return answer;
    }
}