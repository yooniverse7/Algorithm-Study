import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
 
        int max1 = 0;
        int max2 = 0;
        
        for(int i = 0; i<sizes.length; i++) {
            int n1 = sizes[i][0];
            int n2 = sizes[i][1];
            
            if(n1 < n2) {
                sizes[i][0] = n2;
                sizes[i][1] = n1;
            }
            
            max1 = Math.max(max1, sizes[i][0]);
            max2 = Math.max(max2, sizes[i][1]);
        }
        
        
        return max1 * max2;
    }
}