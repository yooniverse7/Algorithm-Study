import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < participant.length; i++) {
            if(hm.containsKey(participant[i])) {
                hm.put(participant[i], hm.get(participant[i]) + 1);
            } else {
                hm.put(participant[i], 1);
            }
        }

        for(int i = 0; i < completion.length; i++) {
            // 완주자가 있다면 키값을 -1
            if(hm.containsKey(completion[i])) {
                hm.put(completion[i], hm.get(completion[i]) - 1);
            }
        }

        for(Map.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > 0) {
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    } 
}