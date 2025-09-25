import java.util.*;

class Solution {
    public static HashSet<Integer> hset;
    public int solution(String numbers) {
        int answer = 0;
        
        char[] arr = numbers.toCharArray();
        char[] output = new char[arr.length];
        boolean[] visited = new boolean[arr.length];
        hset = new HashSet<Integer>();
        
        for(int i = 0; i<arr.length; i++ ){
            permutation(arr, output, visited, 0, i+1);
        }
        answer = hset.size();
        
        return answer;
    }
    public static void permutation(char[] arr, char[] output, boolean[] visited, int depth, int r) {
        
        if(depth==r) {
            StringBuilder stb = new StringBuilder();
            for(int i = 0; i<r; i++) {
                stb.append(output[i]);
            }
            int num = Integer.parseInt(stb.toString());
            
            if(isPrime(num)) {
                hset.add(num);
            }
            return;
             
        }
        
        for(int i = 0; i<arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth+1, r);
                visited[i]=false;
            }
        }
    }
    
    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
    
}