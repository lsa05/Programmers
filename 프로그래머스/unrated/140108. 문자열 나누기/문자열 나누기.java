class Solution {
    public int solution(String s){ 
        int answer = 0, count = 0, diff = 0;
        char x = s.charAt(0);
        
        for(int i=0; i<s.length(); i++){
            if(count == diff){
                answer++;
                x = s.charAt(i);
            }
            
            if(x == s.charAt(i)){
                count++;
            }else{
                diff++;
            }
            
        }
        return answer;
    }
}
