import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] word = s.toCharArray();
        
        Arrays.sort(word);
        
        for(int i=word.length-1; i>=0; i--){
            answer += word[i];
        }
    
        return answer;
    }
}