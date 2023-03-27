import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        HashMap<Character, Integer> keyStore = new HashMap<>();
        
        for(String k : keymap){
            for(int i=0; i<k.length(); i++){
                
                char c = k.charAt(i);
                int click = keyStore.getOrDefault(c,i+1);
                keyStore.put(c,Math.min(click,i+1));
            }
        }
        int i = 0;
        for(String t : targets){
            
            for(char ct : t.toCharArray()){
                if(keyStore.containsKey(ct)){
                    answer[i] += keyStore.get(ct);
                    
                }else{
                    answer[i] = -1;
                    break;
                }
                
            }i++;
        }
     
        
        return answer;
    }
}